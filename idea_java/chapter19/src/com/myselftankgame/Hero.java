package com.myselftankgame;
// 己方坦克
public class Hero extends Tank {

    public boolean live = true;
    public Hero(int x, int y) {
        super(x, y);
    }

    //    发射子弹放入
    public  void ShotEnemys() {
        if(shots.size() >= 5) { // 场内只能存在 5 发子弹
            return;
        }
        Shot shot =null;
        switch(getDirect()) {
            case 0:
                shot = new Shot(getX() + 20,getY(),getDirect());
                shots.add(shot);
                new Thread(shot).start();
                break;
            case 1:
                shot = new Shot(getX() + 60,getY() + 20,getDirect());
                shots.add(shot);
                new Thread(shot).start();
                break;
            case 2:
                shot = new Shot(getX() + 20,getY() + 60,getDirect());
                shots.add(shot);
                new Thread(shot).start();
                break;
            case 3:
                shot = new Shot(getX() ,getY() + 20,getDirect());
                shots.add(shot);
                new Thread(shot).start();
                break;
        }

//        不推荐，会导致一个线程重复启动
//        for(int i = 0 ; i < shots.size() ; i++) {
//            new Thread(shots.get(i)).start();
//        }
    }
}
