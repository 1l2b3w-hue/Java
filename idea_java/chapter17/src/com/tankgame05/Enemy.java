package com.tankgame05;

import java.util.Vector;

public class Enemy extends Tank implements Runnable {
//    使用 Vector 集合来保存敌方子弹
    Vector<Shot> shots = new Vector<>();
    private boolean live = true;
    public Enemy(int x, int y) {
        super(x, y);
    }


    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public void run() {
        while(live) {
//          判断敌方坦克是否存在 或者是否还有炮弹在场，没有就加一发炮弹
            if(live && shots.size() == 0) {
                Shot shot = null;
                switch(getDirect()) { // 根据 方向确定位置
                    case 0:
                        shot = new Shot(getX() + 20,getY(),0);
                        break;
                    case 1:
                        shot = new Shot(getX() + 60,getY() + 20,1);
                        break;
                    case 2:
                        shot = new Shot(getX() + 20,getY() + 60,2);
                        break;
                    case 3:
                        shot = new Shot(getX(),getY() + 20,3);
                        break;
                }
                shots.add(shot);
                new Thread(shot).start();
            }

//            根据坦克方向来继续移动
            switch(getDirect()) {
                case 0 :
                    for(int i = 0; i < 30; i++) {
                        moveUp();//动一步
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1 :
                    for(int i = 0; i < 30; i++) {
                        moveRight();//动一步
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2 :
                    for(int i = 0; i < 30; i++) {
                        moveDown();//动一步
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    break;
                case 3 :
                    for(int i = 0; i < 30; i++) {
                        moveLeft();//动一步
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }


//            随机改变坦克方向
            setDirect((int)(Math.random() * 4));
//            setDirect(3);

        }
    }

//    我的run 方法已经 坦克移动方法
//    public void run() {
//        while(live) {
//            setDirect((int)(Math.random() * 4));
//            move();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e){
//                throw new RuntimeException(e);
//            }
//        }
//    }
//    public void move() {
//        int n = (int)(Math.random() * 100 + 30);
//        switch(getDirect()) {
//            case 0 :
//                for(int i = 0; i <= n; i++) {
//                    moveUp();
//                }
//                break;
//            case 1 :
//                for(int i = 0; i <= n; i++) {
//                    moveRight();
//                }
//                break;
//            case 2 :
//                for(int i = 0; i <= n; i++) {
//                    moveDown();
//                }
//                break;
//            case 3 :
//                for(int i = 0; i <= n; i++) {
//                    moveLeft();
//                }
//                break;
//        }
//    }
}
