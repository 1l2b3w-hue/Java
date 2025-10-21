package com.myself.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//画板
public class MyPanel extends JPanel implements KeyListener {
    Hero hero;
    //开始准备存储敌方坦克，使用集合存放(考虑到多线程问题，使用 Vector 存放)
    Vector<Enemy> enemys = new Vector<>();
    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(5); // 调整己方坦克整体速度
//        设置坦克数量
        int enemyNum = 3;
        for(int i = 0; i < enemyNum; i++) {
            enemys.add(new Enemy(100 * (i + 1),0));
        }
    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.fillRect(0,0,1000,750); // 背景图

        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
        for(Enemy e : enemys){
            e.setDirect(2); // 设置敌方坦克朝向己方
            drawTank(e.getX(),e.getY(),g,e.getDirect(),1);
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

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
