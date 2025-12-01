package com.lbw;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class HorseChessBoard {
    // 定义一些相关属性
//    棋盘的行列数
    private static int column = 6;
    private static int row = 6;
//    棋盘规模
    private static int[][] chessBoard = new int[row][column];
//    记录某个位置是否走过
    private static boolean[] visited = new boolean[row * column];
    private static boolean finished = false; // 记录马是否遍历完整个棋盘


    public static void main(String[] args) {

        int x = 5;
        int y = 5;
        long startTime = System.currentTimeMillis();
        traversalChessBoard(chessBoard,x -1,y -1,1);
        long endTime = System.currentTimeMillis();

        System.out.println("遍历耗时：" + (endTime - startTime));

        // 显示棋盘当前状态
        for(int[] row : chessBoard) {
            for(int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }

    }
    //写一个方法 ：对 ps 的各个位置，按照可以走的下一个位置的次数进行排序，使其从下到大进行排列
    public static void sort(ArrayList<Point> ps) {
        ps.sort(new Comparator<Point>() {

            public int compare(Point p1, Point p2) {
                return next(p1).size() - next(p2).size();
            }
        });
    }


    // 编写核心算法，遍历棋盘，如果遍历成功，就把finished 设置为true
//    并且将马的每一步记录到chessBoard中
    public static void traversalChessBoard(int[][] chessBoard,int x,int y,int step) {
//        记录 step 到 chessBoard
        chessBoard[x][y] = step;
//        将该位置设置为已访问
        visited[x * column + y] = true;
//        获取当前位置可以走的所有位置
        ArrayList<Point> ps = next(new Point(y, x));
        sort(ps);
        // 遍历
        while(!ps.isEmpty()) {
//            取出当前 ps 中可以走的一个点
            Point p = ps.remove(0);
//            判断该位置是否走通，如果没有，就递归遍历
            if(!visited[p.y * column + p.x]) {
                // 递归
                traversalChessBoard(chessBoard,p.y,p.x,step+1);
            }
        }

//        退出 while 循环时，查看是否遍历成功，如果没有成功，进行重置
        if(step < column * row && !finished) {
//            重置
            chessBoard[x][y] = 0;
            visited[x * column + y] = false;
        }
        else {
            finished = true;
        }


    }

    // 编写方法，可以获取当前位置，可以走的下一步的所有位置(Point 表示 x,y)
    public static ArrayList<Point> next(Point curPoint) {
        ArrayList<Point> ps = new ArrayList<>();

        // 创建一个 Point 对象，准备放入 ps 集合
        Point p1 = new Point();

//        开始判断在 curPoint 位置是否可以走如下的位置，如果可以，放入 ps 集合

//        开始判断是否可以走到下一个位置 5
        if((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y -1) >=0) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 6
        if((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y -2) >=0) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 7
        if((p1.x = curPoint.x + 1) < column && (p1.y = curPoint.y - 2) >=0) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 0
        if((p1.x = curPoint.x + 2) < column && (p1.y = curPoint.y - 1) >=0) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 1
        if((p1.x = curPoint.x + 2) < column && (p1.y = curPoint.y + 1) < row) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 2
        if((p1.x = curPoint.x + 1) < column && (p1.y = curPoint.y + 2) < row) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 3
        if((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < row) {
            ps.add(new Point(p1));
        }
//        开始判断是否可以走到下一个位置 4
        if((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < row) {
            ps.add(new Point(p1));
        }
        return ps;

    }
}
