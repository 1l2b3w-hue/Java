package com.tankgame;

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
    int enemyNumber = 3; // 定义敌人坦克数量

    public MyPanel() {
        hero = new Hero(100,100);
        hero.setSpeed(2);
        for(int i = 0; i < enemyNumber; i++) {
            enemys.add(new Enemy(100 * (i + 1),0));
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
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0 );

//        绘画出 hero 发射的子弹
        if(hero.getShot() != null && hero.getShot().isLive() ) {
//            子弹重绘还是得做成一个线程，
//            drawBullet(hero.getShot().getX(),hero.getShot().getY(),g);
            g.fill3DRect(hero.getShot().getX(),hero.getShot().getY(),2,2,false);

        }
//        drawTank(enemy1.getX(),enemy1.getY(),g,enemy1.getDirect(),1 );
//        drawTank(enemy2.getX(),enemy2.getY(),g,enemy2.getDirect(),1 );
//        drawTank(enemy3.getX(),enemy3.getY(),g,enemy3.getDirect(),1 );

//        绘制敌方坦克
        for(Enemy e : enemys) {
            e.setDirect(2); // 修改敌人坦克方向
            drawTank(e.getX(),e.getY(),g,e.getDirect(),1 );

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
            hero.shotEnemy();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    public void run() { // 使 画板每隔100 毫秒进行刷新 画板

      while(true) {
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          this.repaint();
      }
    }
}
