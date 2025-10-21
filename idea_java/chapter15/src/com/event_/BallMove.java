package com.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    private MyPanel panel;
    public static void main(String[] args) {
        new BallMove();
    }
    public BallMove() {
        panel = new MyPanel();
        add(panel);
        setSize(1000,750);
        setVisible(true);
//        使窗口可以监听到 panel 上发生的键盘事件
        this.addKeyListener(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
// KeyListener : 一个监听器，监听键盘事件
class MyPanel extends JPanel implements KeyListener {
//    为了方便小球动起来，可以将小球的坐标设成变量
    int x = 100, y = 100;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        g.setColor(Color.red);
        g.fillOval(x,y,20,20);
    }

// 有字符输出时，该方法将会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

//    当某个键按下时，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {

    }

//    当某个键按下后释放了，该方法将会触发
    @Override
    public void keyReleased(KeyEvent e) {

//        System.out.println((char)e.getKeyCode() + "被按了");
//        System.out.println(e.getKeyChar()); // 小写
//        根据用户按下不同的键，来处理小球的移动
        switch (e.getKeyChar()) {
            case 'w' :  y -= 10; break;
            case 's' :  y += 10; break;
            case 'a' :  x -= 10; break;
            case 'd' :  x += 10; break;

        }
//        还需要重绘一次画板
        this.repaint();
    }
}