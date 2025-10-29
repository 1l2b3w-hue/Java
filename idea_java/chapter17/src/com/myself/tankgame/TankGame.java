package com.myself.tankgame;

import javax.swing.*;

public class TankGame extends JFrame {
    private MyPanel panel;

    public static void main(String[] args) {
        new TankGame();
    }
    public TankGame() {
        panel = new MyPanel();
        new Thread(panel).start();
        add(panel);
        addKeyListener(panel);
        setSize(1000,750);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
