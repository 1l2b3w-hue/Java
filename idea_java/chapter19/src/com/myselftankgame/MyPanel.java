package com.myselftankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//画板
public class MyPanel extends JPanel implements KeyListener,Runnable {
    Hero hero;
    //开始准备存储敌方坦克，使用集合存放(考虑到多线程问题，使用 Vector 存放)
    Vector<Enemy> enemys = new Vector<>();

//    创建一个 存放炸弹 的集合属性，用来演示 爆照效果
    Vector<Bomb> bombs = new Vector<>();

//    创建三张图片对象，用来存放爆炸图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(5); // 调整己方坦克整体速度
//        设置坦克数量
        int enemyNum = 3;
        for(int i = 0; i < enemyNum; i++) {
            Enemy enemy = new Enemy(100 * (i + 1),0);
            enemy.setDirect(2); // 设置敌方坦克朝向己方
            enemys.add(enemy);
            new Thread(enemy).start();
        }
// 解决 第一次子弹击中坦克加载爆炸图片时，还未等图标被加载出来，坦克被炸毁导致没有图片显示问题
        MediaTracker tracker = new MediaTracker(this);
//        初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(com.tankgame05.MyPanel.class.getResource("/1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(com.tankgame05.MyPanel.class.getResource("/2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(com.tankgame05.MyPanel.class.getResource("/3.png"));
//
        tracker.addImage(image1, 0);
        tracker.addImage(image2, 1);
        tracker.addImage(image3, 2);
        try {
            tracker.waitForAll(); // 等待所有图片加载完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.fillRect(0,0,1000,750); // 背景图
        if(hero.live) {
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
            paintShots(hero,g);
        }


//      绘制敌人坦克
        for(int i = 0; i < enemys.size(); i++) {
            Enemy e = enemys.get(i);
            if(e.isLive()) { // 判断坦克是否还存活
                drawTank(e.getX(),e.getY(),g,e.getDirect(),1);
                e.setShot();
                paintShots(e,g);
            }
            else {
                enemys.remove(i);
            }

        }

        for(int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
//            根据炸弹生命去画出对应图片
            if(bomb.life > 6) {
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }
            else if(bomb.life > 3) {
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            }
            else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            bomb.lifeDown(); // 让生命值进行减少
//            如果 炸弹的生命为0，就移除他
            if(bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

    }
//    绘制子弹
    public void paintShots(Tank tank, Graphics g) {
        if(tank.shots != null) {
            for(int i = tank.shots.size() -1; i >= 0; i--) {
                Shot shot = tank.shots.get(i);
                if(shot.isLive()) {
                    g.fill3DRect(shot.getX(),shot.getY(),2,2,false);
                }
                else {
                    tank.shots.remove(i);
                }
            }
        }
    }

//    我方子弹击中敌方坦克使其消失
    public void hitEnemy() {
        for(int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);

            for(int j = enemys.size() - 1; j >= 0 ; j--) {
                Enemy e = enemys.get(j);
                if(shot.isHit(e)) {
                    bombs.add(new Bomb(e.getX(),e.getY())); // 增加炸弹对象
                    enemys.remove(j);
                    hero.shots.remove(i);
                }
            }
        }
    }

//    敌方子弹击中我方坦克
    public void hitHero() {
        for(int i = 0; i < enemys.size(); i++) {
            Enemy e = enemys.get(i);
            for(int j = 0; j < e.shots.size(); j++ ) {
                Shot shot = e.shots.get(j);
                if(shot.isHit(hero)) {
                    bombs.add(new Bomb(hero.getX(),hero.getY()));
                    hero.live = false;
                    e.shots.remove(j);
                }
            }
        }
    }



    /**
     *
     * @param x 坦克横坐标(左上角的坐标)
     * @param y 坦克纵坐标(左上角坐标)
     * @param g 绘画
     * @param direct 描述坦克方向
     * @param type 描述坦克类型，己方，敌方
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type) {
//        通过颜色区分坦克 ： yellow : 敌方， cyan : 己方
        switch(type) {
            case 0 : g.setColor(Color.cyan); // 己方坦克颜色
                    break;
            case 1: g.setColor(Color.yellow);// 敌方坦克颜色
        }

//        绘制坦克并决定坦克方向
//        0 上， 1 左，2 下，3 右
        switch(direct) {
            case 0 :
                g.fill3DRect(x,y,10,60,false); // 左轮
                g.fill3DRect(x + 30,y,10,60,false); // 右轮
                g.fill3DRect(x + 10,y + 10,20,40,false); // 坦克主体
                g.drawOval(x + 10,y + 20,20,20); // 炮塔
                g.drawLine(x + 20, y + 30 , x + 20, y); // 炮管
                break;
            case 1 :
                g.fill3DRect(x,y,60,10,false); // 左轮
                g.fill3DRect(x ,y + 30,60,10,false); // 右轮
                g.fill3DRect(x + 10,y + 10,40,20,false); // 坦克主体
                g.drawOval(x + 20,y + 10,20,20); // 炮塔
                g.drawLine(x + 30, y + 20 , x + 60, y + 20);
                break;
            case 2 :
                g.fill3DRect(x,y,10,60,false); // 左轮
                g.fill3DRect(x + 30,y,10,60,false); // 右轮
                g.fill3DRect(x + 10,y + 10,20,40,false); // 坦克主体
                g.drawOval(x + 10,y + 20,20,20); // 炮塔
                g.drawLine(x + 20, y + 30 , x + 20, y + 60);
                break;
            case 3 :
                g.fill3DRect(x,y,60,10,false); // 左轮
                g.fill3DRect(x ,y + 30,60,10,false); // 右轮
                g.fill3DRect(x + 10,y + 10,40,20,false); // 坦克主体
                g.drawOval(x + 20,y + 10,20,20); // 炮塔
                g.drawLine(x + 30, y + 20 , x , y + 20 );
                break;

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override // 控制坦克移动
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
//        switch(key) {
//            case 'w' : hero.setDirect(0);break;
//            case 'd' : hero.setDirect(1);break;
//            case 's' : hero.setDirect(2);break;
//            case 'a' : hero.setDirect(3);break;
//        }
        if(key == 'w') {
            hero.setDirect(0);
            hero.moveUp();
        }
        else if(key == 'd') {
            hero.setDirect(1);
            hero.moveRight();
        }
        else if(key == 's') {
            hero.setDirect(2);
            hero.moveDown();
        }
        else if(key == 'a') {
            hero.setDirect(3);
            hero.moveLeft();
        }
        else if(key == 'j') {
            hero.ShotEnemys();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void run() {
        while(true) {
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hitEnemy();
            for(int i = 0; i < enemys.size(); i++) {
                hitHero();
            }
        }
    }
}


