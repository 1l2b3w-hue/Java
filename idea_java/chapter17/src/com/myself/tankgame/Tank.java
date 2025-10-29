package com.myself.tankgame;

import java.util.Vector;

public  class Tank {
    private int x; // 坦克横坐标
    private int y; // 坦克纵坐标
    private int direct; // 坦克方向
    // 为坦克新增速度
    private int speed = 1;

//    为坦克设置子弹集合
    Vector<Shot> shots = new Vector<>();



    //    把移动放入 Tank 中
    public void moveUp() {
        if(y - speed < 0) {
            return;
        }
        y -= speed;
    }
    public void moveDown() {
        if(y + 60 + speed > 750) {
            return;
        }
        y += speed;
    }
    public void moveLeft() {
        if(x - speed < 0) {
            return;
        }

        x -= speed;
    }
    public void moveRight() {
        if(x + speed + 60 > 1000) {
            return;
        }

        x += speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
