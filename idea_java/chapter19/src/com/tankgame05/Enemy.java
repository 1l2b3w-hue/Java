package com.tankgame05;

import java.util.Vector;

public class Enemy extends Tank implements Runnable {
//    使用 Vector 集合来保存敌方子弹
    Vector<Shot> shots = new Vector<>();
    private boolean live = true;

//    增加一个成员 ： 存放了所有 敌方坦克 的集合
    Vector<Enemy> enemyTanks = new Vector<>();

    public Enemy(int x, int y) {
        super(x, y);
    }

    public Vector<Enemy> getEnemyTanks() {
        return enemyTanks;
    }

//    提供 set 方法将 Mypanel 中的敌人坦克集合设置给 enemyTank
    public void setEnemyTanks(Vector<Enemy> enemyTank) {
        this.enemyTanks = enemyTank;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

//    编写方法 ：来判断当前的敌人坦克是否会与 enemyTanks 的其他坦克重叠
    public boolean isTouch() {
//    获取当前坦克的方向
        switch(this.getDirect()) {
            case 0:
                for(int i = 0; i < enemyTanks.size(); i++) {
                    Enemy enemy = enemyTanks.get(i); // 获取其他坦克
                    if(enemy != this) { // 不与自己比较
//                        分析敌方坦克的坐标范围
//                        this 坦克 的左上角与右上角的坐标
                        if(enemy.getDirect() == 0 || enemy.getDirect() == 2) { // 坦克向上或向下
                            //this左上角(x,y)是否 在坦克范围
                            if(this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60 ) {
                                return true;
                            }
                            // this右上角(x + 40,y) 是否在坦克范围
                            if(this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60 ) {
                                return true;
                            }
                        }
                        if(enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //this左上角(x,y)是否 在坦克范围
                            if(this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40 ) {
                                return true;
                            }
                            // this右上角(x + 40,y) 是否在坦克范围
                            if(this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40 ) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                for(int i = 0; i < enemyTanks.size(); i++) {
                    Enemy enemy = enemyTanks.get(i); // 获取其他坦克
                    if(enemy != this) { // 不与自己比较
//                        分析敌方坦克的坐标范围
//                        this 坦克 的右上角与右下角的坐标
                        if(enemy.getDirect() == 0 || enemy.getDirect() == 2) { // 坦克向上或向下
                            //右上角 (x + 60, y)
                            if(this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60<= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60 ) {
                                return true;
                            }
                            // 右下角 (x + 60, y + 40)
                            if(this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 40
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 60 ) {
                                return true;
                            }
                        }
                        if(enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //右上角(x + 60, y)
                            if(this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40 ) {
                                return true;
                            }
                            // 右下角(x + 60, y + 40)
                            if(this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 60
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 40 ) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                for(int i = 0; i < enemyTanks.size(); i++) {
                    Enemy enemy = enemyTanks.get(i); // 获取其他坦克
                    if(enemy != this) { // 不与自己比较
//                        分析敌方坦克的坐标范围
//                        this 坦克 的左下角与右下角的坐标
                        if(enemy.getDirect() == 0 || enemy.getDirect() == 2) { // 坦克向上或向下
                            //左下角 (x , y + 60)
                            if(this.getX()  >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 60 ) {
                                return true;
                            }
                            // 右下角 (x + 40, y + 60)
                            if(this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 40
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 60 ) {
                                return true;
                            }
                        }
                        if(enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //左下角(x , y + 60)
                            if(this.getX() >= enemy.getX()
                                    && this.getX()<= enemy.getX() + 60
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60  <= enemy.getY() + 40 ) {
                                return true;
                            }
                            // 右下角(x + 40, y + 60)
                            if(this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 60
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 40 ) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                for(int i = 0; i < enemyTanks.size(); i++) {
                    Enemy enemy = enemyTanks.get(i); // 获取其他坦克
                    if(enemy != this) { // 不与自己比较
//                        分析敌方坦克的坐标范围
//                        this 坦克 的左下角与右下角的坐标
                        if(enemy.getDirect() == 0 || enemy.getDirect() == 2) { // 坦克向上或向下
                            //左上角 (x , y )
                            if(this.getX()  >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60 ) {
                                return true;
                            }
                            // 左下角 (x , y + 40)
                            if(this.getX()>= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 60 ) {
                                return true;
                            }
                        }
                        if(enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //左上角(x , y )
                            if(this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40 ) {
                                return true;
                            }
                            // 左下角(x , y + 40)
                            if(this.getX() >= enemy.getX()
                                    && this.getX()  <= enemy.getX() + 60
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 40 ) {
                                return true;
                            }
                        }
                    }
                }
        }

        return false;
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
                        if(!isTouch()) { // 判断是否重叠
                            moveUp();//动一步
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1 :
                    for(int i = 0; i < 30; i++) {
                        if(!isTouch()) {
                            moveRight();//动一步
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2 :
                    for(int i = 0; i < 30; i++) {
                        if(!isTouch()) {
                            moveDown();//动一步
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    break;
                case 3 :
                    for(int i = 0; i < 30; i++) {
                        if(!isTouch()) {
                            moveLeft();//动一步
                        }
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
