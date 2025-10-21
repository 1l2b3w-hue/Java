package com.tankgame02;

import javax.swing.*;

public class TankGame02 extends JFrame {
    private MyPanel panel;
    public static void main(String[] args) {
        new TankGame02();
    }
    public TankGame02() {
        panel = new MyPanel();
        this.add(panel);
        addKeyListener(panel);
        setSize(1000,750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
