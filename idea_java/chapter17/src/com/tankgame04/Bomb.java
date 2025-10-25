package com.tankgame04;

// 炸弹类 ,爆炸效果
public class Bomb {
//    炸弹坐标
    private int x;
    private int y;
//    炸弹生命周期 ：不同情况展出不同照片
    private int life = 9;
    private boolean isLive = true; // 是否存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    减少生命值 , 配合显示图片爆炸效果
    public void lifeDown() {
        if(life > 0) {
            life--;
        }
        else {
            isLive = false;
        }
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
