package com.myself.tankgame;

import javax.swing.*;

// 子弹类
public class Shot implements Runnable{
//    横纵坐标
    private int x;
    private int y;
//    子弹方向
    private int direct;
//    子弹速度
    private int speed = 10;
//    设置一个来代表子弹是否存活
    private boolean isLive = true;



    public void run() {
        while(isLive) {
//            出边界使其状态为消亡状态
            if(!(x > 0 && x < 1000 && y > 0 && y < 750)) {
                System.out.println("子弹线程退出~");
                isLive = false;
            }
            switch(direct) {
                case 0: y -= speed;break;
                case 1: x += speed;break;
                case 2: y += speed;break;
                case 3: x -= speed;break;
            }
            System.out.println("子弹坐标：" + x +" " + y);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public boolean isHit(Tank enemy) {
        boolean flag = false;
        switch(enemy.getDirect()) {
            case 0:
            case 2:
                if(getX() >= enemy.getX() && getX() <= enemy.getX() + 40 &&
                        getY() >= enemy.getY() && getY() <= enemy.getY() + 60) {
                    flag = true;
                }
                break;
            case 1:
            case 3:
                if(getX() >= enemy.getX() && getX() <= enemy.getX() + 60 &&
                        getY() >= enemy.getY() && getY() <= enemy.getY() + 40) {
                    flag = true;
                }
                break;
        }

        return flag;
    }

    public Shot(int x, int y,int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
