package com.tankgame04;

public class Hero extends Tank { // 自己的坦克
    // 定义一个 shot 对象，由自身提供设计方法
    private Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemy() {
//        创建一个 shot 对象，根据当前 hero 的坐标和方向来创建
        switch(getDirect()) { // 根据 方向确定位置
            case 0: shot = new Shot(getX() + 20,getY(),0);
                break;
            case 1: shot = new Shot(getX() + 60,getY() + 20,1);
                break;
            case 2: shot = new Shot(getX() + 20,getY() + 60,2);
                break;
            case 3: shot = new Shot(getX(),getY() + 20,3);
                break;
        }
//        开启射击线程
        Thread thread = new Thread(shot);
        thread.start();
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }
}
