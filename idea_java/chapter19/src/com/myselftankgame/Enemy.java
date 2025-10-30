package com.myselftankgame;

import java.util.Objects;
import java.util.Vector;

// 敌方坦克
public class Enemy extends Tank implements Runnable {

    //定义一个变量来查看坦克是否存活
    private boolean live = true;
    public Enemy(int x, int y) {
        super(x, y);
    }

    public void run() {
        while(live) {

            move();

        }

    }

    public void move() {
        setDirect((int)(Math.random() * 4));

        switch(getDirect()) {
            case 0:
                for(int i = 0; i <= 30; i++) {
                    moveUp();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
            case 1:
                for(int i = 0; i <= 30; i++) {
                    moveRight();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
            case 2 :
                for(int i = 0; i <= 30; i++) {
                    moveDown();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
            case 3:
                for(int i = 0; i <= 30; i++) {
                    moveLeft();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
        }
    }

    public void setShot() {
        if(!live) {
            return;
        }
        if(shots.size() > 1  ) {
            return;
        }
        Shot shot = null;
        switch(getDirect()) {
            case 0:
                shot = new Shot(getX() + 20,getY(),getDirect());
                break;
            case 1:
                shot = new Shot(getX() + 60,getY() + 20,getDirect());
                break;
            case 2:
                shot = new Shot(getX() + 20,getY() + 60,getDirect());
                break;
            case 3:
                shot = new Shot(getX() ,getY() + 20,getDirect());
                break;
        }
        shots.add(shot);
        new Thread(shot).start();
    }


    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Enemy enemy = (Enemy) o;
        return live == enemy.live;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(live);
    }
}
