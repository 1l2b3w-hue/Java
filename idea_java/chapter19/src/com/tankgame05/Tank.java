package com.tankgame05;

public class Tank {
    private int x; // 横坐标
    private int y; // 纵坐标
    private int direct; // 坦克方向 0上 1右 2下 3左
    private int speed = 1;
    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    // 书写方法控制坦克移动
//    上
    public void moveUp() {
        if(y < 0) { // 防止出界
            return;
        }
        y -= speed;
    }
//    下
    public void moveDown() {
        if(y + 60 > 750) {
            return;
        }
        y += speed;
    }
    public void moveLeft() {
        if(x  < 0) {
            return;
        }
        x -= speed;
    }
    public void moveRight() {
        if(x + 60 > 1000) {
            return;
        }
        x += speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
}
