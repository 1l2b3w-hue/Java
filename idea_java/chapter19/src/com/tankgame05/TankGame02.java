package com.tankgame05;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGame02 extends JFrame {
    private MyPanel panel;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        new TankGame02();
    }
    public TankGame02() {
        System.out.println("请输入你的选择:1.开始新游戏 2. 继续上一局游戏");
        String key = scanner.next();
        panel = new MyPanel(key);
        Thread thread = new Thread(panel);
        thread.start();
        this.add(panel);
        addKeyListener(panel);
        setSize(1300,750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        在 JFrame 中监听 / 相应点击关闭窗口按钮
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
//                System.out.println("监听到关闭按钮");
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
