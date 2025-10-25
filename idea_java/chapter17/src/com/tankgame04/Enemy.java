package com.tankgame04;

import java.util.Vector;

public class Enemy extends Tank implements Runnable {
//    使用 Vector 集合来保存 子弹
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
//            setDirect((int)(Math.random() * 4));
            setDirect(3);

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
