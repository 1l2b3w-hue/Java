package com.tankgame05;

import java.util.Vector;

public class Hero extends Tank { // 自己的坦克
    // 定义一个 shot 对象，由自身提供设计方法
    private Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }
    Vector<Shot> shots = new Vector<>();

//    保存多发子弹
    public Vector<Shot> getShots() {
        return shots;
    }

    public void setShots(Vector<Shot> shots) {
        this.shots = shots;
    }

    public void shotEnemy() {
//        创建一个 shot 对象，根据当前 hero 的坐标和方向来创建
        if(shots.size() == 5) {
            return;
        }
        switch(getDirect()) { // 根据 方向确定位置
            case 0:
//                if(shots.size() < 5) { // 控制己方坦克连续发射 5 枚子弹
                    shot = new Shot(getX() + 20,getY(),0);
                    shots.add(shot); // 将子弹加入集合
//                }

                break;
            case 1:
//                if(shots.size() < 5) {
                    shot = new Shot(getX() + 60,getY() + 20,1);
                    shots.add(shot);
//                }
                break;
            case 2:
//                if(shots.size() < 5) {
                    shot = new Shot(getX() + 20,getY() + 60,2);
                    shots.add(shot);
//                }
                break;
            case 3:
//                if(shots.size() < 5) {
                    shot = new Shot(getX(),getY() + 20,3);
                    shots.add(shot);
//                }
                break;
        }
//        开启射击线程
//        Thread thread = new Thread(shot);
//        thread.start();
        for(int i = 0; i < shots.size(); i++) {
            new Thread(shots.get(i)).start();
        }
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }
}

