package com.myself.tankgame;
 // 一个炸弹类
public class Bomb {
//    炸弹横纵坐标
    public int x;
    public int y;

    public int life = 9; // 炸弹的生命周期

     public void lifeDown() {
         life--;
     }

     public Bomb(int x, int y) {
         this.x = x;
         this.y = y;
     }
 }
