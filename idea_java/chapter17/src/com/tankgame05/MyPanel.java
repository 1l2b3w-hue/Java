package com.tankgame05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//坦克绘图区域
//为了使 paint 不停重绘子弹，将 MyPanel 使其实现 Runnable 接口
public class MyPanel extends JPanel implements KeyListener,Runnable {
    Hero hero = null;
//    Enemy enemy1 = null;
//    Enemy enemy2 = null;
//    Enemy enemy3 = null;
//    使用集合来存放坦克

    Vector<Enemy> enemys = new Vector<>();

//    定义一个 Vector 来存放炸弹
//    当子弹击中坦克时，加入一个 Bomb 对象
    Vector<Bomb> bombs = new Vector<>();// 本质还是图片
    int enemyNumber = 3; // 定义敌人坦克数量

//    定义三种图片，用于显示爆炸效果
    Image image1 =null;
    Image image2 =null;
    Image image3 =null;


    public MyPanel() {
        hero = new Hero(100,100);
        hero.setSpeed(2);
        for(int i = 0; i < enemyNumber; i++) {
            Enemy enemyTank = new Enemy(100 * (i + 1),0);
            enemyTank.setDirect(2); // 修改敌人坦克方向
            enemys.add(enemyTank);
//            创建坦克子弹
            Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
//            每创建一个坦克对象，就为坦克对象初始化一个子弹
            enemyTank.shots.add(shot);
//            立马启动坦克子弹线程
            new Thread(shot).start();
//            启动坦克自己移动线程(在创建敌人坦克时)
//            (我自己想的，存在一个问题，坦克自己移动时无法及时刷新画板)
            new Thread(enemyTank).start();



        }
        // 解决 第一次子弹击中坦克加载爆炸图片时，还未等图标被加载出来，坦克被炸毁导致没有图片显示问题
        MediaTracker tracker = new MediaTracker(this);
//        初始化图片对象
    image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/1.png"));
    image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/2.png"));
    image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/3.png"));
//
        tracker.addImage(image1, 0);
        tracker.addImage(image2, 1);
        tracker.addImage(image3, 2);
        try {
            tracker.waitForAll(); // 等待所有图片加载完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        enemy1 = new Enemy(100,0);
//        enemy2 = new Enemy(200,0);
//        enemy3 = new Enemy(300,0);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillRect(0,0,1000,750);
//        绘制自己坦克
        if(hero.isLive()) {// hero 还存活就绘画
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0 );

//        绘画出 hero 发射的子弹 (遍历集合，绘制子弹)
            for(int i = 0; i < hero.shots.size(); i++) {
                Shot shot = hero.shots.get(i);
                if(shot != null && shot.isLive() ) {
                    g.fill3DRect(shot.getX(),shot.getY(),2,2,false);
                }
                else { // 如果子弹消亡，就将子弹移除集合
                    hero.shots.remove(shot);
                }
            }
        }

//        if(hero.getShot() != null && hero.getShot().isLive() ) {
////            子弹重绘还是得做成一个线程，
////            drawBullet(hero.getShot().getX(),hero.getShot().getY(),g);
//            g.fill3DRect(hero.getShot().getX(),hero.getShot().getY(),2,2,false);
//
//        }
//        drawTank(enemy1.getX(),enemy1.getY(),g,enemy1.getDirect(),1 );
//        drawTank(enemy2.getX(),enemy2.getY(),g,enemy2.getDirect(),1 );
//        drawTank(enemy3.getX(),enemy3.getY(),g,enemy3.getDirect(),1 );

//        绘制敌方坦克
        for(Enemy e : enemys) {
            if(e.isLive()) { // 判断敌方坦克还是否存活，是就画出来
                drawTank(e.getX(),e.getY(),g,e.getDirect(),1 );

//            开始绘制坦克所有子弹
                for(int i = 0; i < e.shots.size(); i++) {
                    Shot shot = e.shots.get(i); // 取出子弹
//                开始绘制子弹 ： 判断子弹是否是存活的，是就绘制，不是就从集合中去除
                    if(shot.isLive()) {
                        g.fill3DRect(shot.getX(),shot.getY(),2,2,false);
                    }
                    else {
                        e.shots.remove(shot);
                    }
                }

            }
            else { // 坦克销毁后，也将发出坦克子弹销毁
                for(int i = 0; i < e.shots.size(); i++) {
                    e.shots.get(i).setLive(false);
                }
            }


        }

//        绘制炸弹 ： 如果 bombs 中有炸弹，就画出来
        for(int i = 0; i < bombs.size(); i++) {
//            取出炸弹
            Bomb bomb = bombs.get(i);
//            根据炸弹生命去画出对应图片
            if(bomb.getLife() > 6) {
                g.drawImage(image1,bomb.getX(),bomb.getY(),60,60,this);
            }
            else if(bomb.getLife() > 3) {
                g.drawImage(image2,bomb.getX(),bomb.getY(),60,60,this);
            }
            else {
                g.drawImage(image3,bomb.getX(),bomb.getY(),60,60,this);
            }
            bomb.lifeDown(); // 让生命值进行减少
//            如果 炸弹的生命为0，就移除他
            if(bomb.getLife() == 0) {
                bombs.remove(bomb);
            }
        }


    }
//    public void drawBullet(int x,int y,Graphics g) {
//        g.setColor(Color.white);
//        g.fill3DRect(x - 1,y -1 ,3,3,true);
//        repaint(); // 我这里试图这样重绘来实现子弹射击
//    }
    /**
     *
     * @param x 坦克横坐标
     * @param y 坦克纵坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        // 根据类型设置坦克颜色
        switch(type) {
            case 0 : g.setColor(Color.cyan); // 0 是我们的坦克
                break;
            case 1: g.setColor(Color.yellow);
                break;
        }

        // 根据坦克方向绘制坦克
//        0 : 上 ，1 ： 右，2 ： 向下，3 ： 向左
        switch(direct) {
            case 0 : // 坦克向上
                g.fill3DRect(x,y,10,60,false); // 坦克左侧轮子
                g.fill3DRect(x+10,y + 10,20,40,false); // 坦克主体
                g.fill3DRect(x+30,y,10,60,false); // 坦克右侧轮子
                g.fillOval(x + 10,y + 20,20,20); // 坦克炮塔
                g.drawLine(x + 20,y + 30,x + 20,y); // 坦克炮管
                break;
            case 1 : // 坦克向右
                g.fill3DRect(x,y,60,10,false); // 坦克左侧轮子
                g.fill3DRect(x + 10,y + 10,40,20,false); // 坦克主体
                g.fill3DRect(x,y + 30,60,10,false); // 坦克右侧轮子
                g.fillOval(x + 20,y + 10,20,20); // 坦克炮塔
                g.drawLine(x + 30,y + 20,x + 60,y + 20); // 坦克炮管
                break;
            case 2 : // 坦克向下
                g.fill3DRect(x,y,10,60,false); // 坦克左侧轮子
                g.fill3DRect(x+10,y + 10,20,40,false); // 坦克主体
                g.fill3DRect(x+30,y,10,60,false); // 坦克右侧轮子
                g.fillOval(x + 10,y + 20,20,20); // 坦克炮塔
                g.drawLine(x + 20,y + 30,x + 20,y + 60); // 坦克炮管
                break;
            case 3 : // 坦克向左
                g.fill3DRect(x,y,60,10,false); // 坦克左侧轮子
                g.fill3DRect(x + 10,y + 10,40,20,false); // 坦克主体
                g.fill3DRect(x,y + 30,60,10,false); // 坦克右侧轮子
                g.fillOval(x + 20,y + 10,20,20); // 坦克炮塔
                g.drawLine(x + 30,y + 20,x ,y + 20); // 坦克炮管
                break;
            default :
                System.out.println("其他情况先不做处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        if(key == 'w') {
            hero.setDirect(0);
//            hero.setY(hero.getY() - 5); // 这样是不是太麻烦了，应该写成方法
//            repaint();
            hero.moveUp();
        }
        else if(key == 'd') {
            hero.setDirect(1);
//            hero.setX(hero.getX() + 5);
//            repaint();
            hero.moveRight();
        }
        else if(key == 's') {
            hero.setDirect(2);
//            hero.setY(hero.getY() + 5);
//            repaint();
            hero.moveDown();
        }
        else if(key == 'a') {
            hero.setDirect(3);
//            hero.setX(hero.getX() - 5);
//            repaint();
            hero.moveLeft();
        }
        if(key == 'j') {
//            判断子弹是否存在 或者 子弹消亡后才能发射子弹 (使用在多次射击时存在无法发射多发子弹)
//            if(hero.getShot() == null || hero.getShot().isLive()) {
//                hero.shotEnemy();
//            }
            hero.shotEnemy();

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
//  编写方法，完成子弹击中坦克的功能
public  void hitTank(Vector<Shot> shots, Tank enemyTank) {
    //遍历所有子弹，解决多枚子弹可以穿过敌方坦克不炸毁坦克问题
        for(int i = 0; i < shots.size(); i++) {
            //      还需要知道坦克的方向来判断坦克范围
            Shot shot = shots.get(i);
            switch(enemyTank.getDirect()) {
                case 0:
                case 2:
                    if(shot.getX() >= enemyTank.getX() && shot.getX() <= enemyTank.getX() + 40 &&
                            shot.getY() >= enemyTank.getY() && shot.getY() <= enemyTank.getY() + 60) {
                        shot.setLive(false);
                        enemyTank.setLive(false);
//                    从集合中去除坦克
                        enemys.remove(enemyTank);
//                    添加 Bomb 对象
                        Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                        bombs.add(bomb);
                    }
                    break;
                case 1:
                case 3:
                    if(shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 60 &&
                            shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getY() + 40) {
                        shot.setLive(false);
                        enemyTank.setLive(false);
                        enemys.remove(enemyTank);

                        Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
                        bombs.add(bomb);
                    }
                    break;
            }
        }


}
//    public  void hitTank(Shot shot, Enemy enemyTank) {
////      还需要知道坦克的方向来判断坦克范围
//        switch(enemyTank.getDirect()) {
//            case 0:
//            case 2:
//                if(shot.getX() >= enemyTank.getX() && shot.getX() <= enemyTank.getX() + 40 &&
//                shot.getY() >= enemyTank.getY() && shot.getY() <= enemyTank.getY() + 60) {
//                    shot.setLive(false);
//                    enemyTank.setLive(false);
////                    从集合中去除坦克
//                    enemys.remove(enemyTank);
////                    添加 Bomb 对象
//                    Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
//                    bombs.add(bomb);
//                }
//                break;
//            case 1:
//            case 3:
//                if(shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 60 &&
//                        shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getY() + 40) {
//                    shot.setLive(false);
//                    enemyTank.setLive(false);
//                    enemys.remove(enemyTank);
//
//                    Bomb bomb = new Bomb(enemyTank.getX(),enemyTank.getY());
//                    bombs.add(bomb);
//                }
//                break;
//        }
//
//    }

    public void hitTankEnemy() {
        //          判断子弹击中敌方坦克
        for(int j = 0; j < hero.shots.size();j++) {
            Shot shot = hero.shots.get(j);
            if(shot != null && shot.isLive()) { // 子弹是否还存在

                for(int i = 0 ; i < enemys.size(); i++) { // 遍历一遍敌方坦克，查看是否击中
    //                  if(enemys.get(i).isLive()) { // 先判断敌方坦克是否存活，避免死亡坦克阻挡子弹
    //                      hitTank(hero.getShot(),enemys.get(i));
                    // 这一段是我自己的想法，并没哟
    //                  将爆炸坦克从集合中去除，不推荐
    //                  }
    //                  hitTank(hero.getShot(),enemys.get(i));
                    hitTank(hero.shots,enemys.get(i));
                }

            }
        }
}
//     判断敌方坦克是否击中我方坦克
    public void hitHero() {
//        遍历所有敌人坦克
        for(int i = 0; i < enemys.size(); i++) {
            Enemy enemy = enemys.get(i);
            hitTank(enemy.shots,hero);
////            遍历 enemy 的所有子弹
//            for(int j = 0; j < enemy.shots.size(); j++) {
//                Shot shot = enemy.shots.get(j);
////                先判断己方坦克是否存活
//                if(hero.isLive() && shot.isLive()) {
//                    hitTank(shot,hero);
//
//                }
//
//            }
        }
    }

    public void run() { // 使 画板每隔100 毫秒进行刷新 画板

      while(true) {
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          hitTankEnemy();
          hitHero();
          this.repaint();
      }
    }
}
