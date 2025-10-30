package com.tankgame05;
// 一个子弹发射，作为一个线程来看
public class Shot implements Runnable {
//    子弹的横纵坐标
    private int x ;
    private int y ;
    private int direct; // 子弹方向
    private int speed = 10; //子弹速度
    private boolean isLive = true; // 记录子弹状态

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public void run() {
        while(true) {
            switch(direct) {
                case 0 : y -= speed; break;
                case 1 : x += speed; break;
                case 2 : y += speed; break;
                case 3 : x -= speed; break;
            }
            System.out.println("子弹坐标：" + x +","+ y);
            if(!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) { // 超出边界或者碰到任意销毁子弹的行为
                isLive = false;
                System.out.println("子弹线程退出~");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public Shot(int x, int y, int direct) {
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
