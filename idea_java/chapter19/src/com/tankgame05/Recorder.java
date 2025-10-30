package com.tankgame05;

import java.io.*;
import java.util.Vector;

// 该类用于记录 相关信息，与文件交互
public class Recorder {
//    定义一个变量，记录 我方击毁敌人坦克数量
    private static int allEnemyTankNum = 0;
//    定义 IO 对象，准备写数据到文件中
    private static BufferedWriter bufferedWriter = null;
    private static BufferedReader bufferedReader = null;
//    private static String recordFile = "d:\\myRecord.txt"; // 也可以指定其他位置
    private static String recordFile = "src\\myRecord.txt";
//    用于指向 Mypanel敌人坦克集合
    private static Vector<Enemy> enemys = null;
//    定义一个集合，用来存放 node 对象(保存敌方坦克信息)
    private static Vector<Node> nodes = new Vector<>();


    public static String getRecordFile() {
//        返回文件路径
        return recordFile;
    }

    //    通过该方法获取坦克集合
    public static void setEnemys(Vector<Enemy> enemys) {
        Recorder.enemys = enemys;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

//    当我方坦克击毁敌方坦克时，要使 allEnemyTankNum 的数量 ++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

//    实现一个方法用来 当游戏退出时，保存 allEnemyTankNum 的数量
//    升级：当退出游戏时，记录敌人坦克的坐标与方向(击毁坦克不需要进行记录)，每行保存一个存活坦克
    public static void keepRecord() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(recordFile));
            bufferedWriter.write(allEnemyTankNum + "\r\n");
//            bufferedWriter.write(allEnemyTankNum);
//            bufferedWriter.newLine();
//            遍历集合，记录存活坦克信息(横纵坐标 + 方向)
            for(int i = 0; i < enemys.size(); i++) {
//                获取敌人坦克
                Enemy tank = enemys.get(i);
                if(tank.isLive()) { // 再次检验一下坦克是不是还活着
                    String record = tank.getX() + " " + tank.getY() + " " + tank.getDirect();
                    bufferedWriter.write(record + "\r\n");
                }
            }

//            于是可以通过遍历 敌人坦克集合来记录存活坦克情况
//            OOP 中，定义一个属性用于接受 敌人坦克集合，然后通过set方法获取敌人坦克
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //    编写一个方法，用于读取 readFile 文件的数据，恢复相关信息
//    再点击继续上一局游戏时，才调用该方法
    public static Vector<Node> getNodesAndEnemyTankRecord() {
        try {
            bufferedReader = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(bufferedReader.readLine()); // 读取坦克数量
            String read = "";
            while((read = bufferedReader.readLine()) != null) {
                String[] str = read.split(" ");
                Node node = new Node(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
                nodes.add(node);
            }
            return nodes;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }


}
