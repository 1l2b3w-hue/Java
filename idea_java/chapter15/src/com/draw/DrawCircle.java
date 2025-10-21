package com.draw;

import javax.swing.*;
import java.awt.*;

// 面板画园
public class DrawCircle extends JFrame { // JFrame : 对应窗口，就是一个画框
//    定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() { // 构造器
        // 初始化面板，创建一个面板
        mp = new MyPanel();
//        将面板加入窗口(画框)
        this.add(mp);
//        设置窗口大小
        this.setSize(400,300); // 单位像素
//        当点击窗口小叉，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true); // 可以显示
    }
}
/*
    1. 先定义一个面板类，使其继承于 JPanel，后续画图将在这个面板进行
    2. 重写 paint 方法，先调用 父类的 paint 方法，再进行绘制
    3. public 类继承 JFrame(对应窗口，就是一个画框)
    4. 定义一个画板类属性
    5. 实现一个无参构造器 ： 初始化一个画板，
    6. this.add(画板对象) ： 将画板加入窗口
    7. this.setSize(width,height) : 指定窗口大小
    8. this.setVisible(true) : 使窗口可以显示
    9. this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ： 使点击关闭按钮实现程序完全退出
    10. 在main 方法中创建一个public 类实例对象
 */
class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) { // 重写父类方法
        super.paint(g);
        System.out.println("paint 方法被调用");
        g.setColor(Color.blue);
        g.fillRect(100,100,30,40);

        g.setColor(Color.CYAN);
        g.fillOval(104,110,20,20);

        g.setColor(Color.CYAN);
        g.fillRect(93,90,10,60);

        g.setColor(Color.CYAN);
        g.fillRect(125,90,10,60);
        g.setColor(Color.CYAN);
        g.fillRect(114,90,4,30);
//        画园
//        g.drawOval(40, 40, 100, 100);

//        画直线
//        g.drawLine(25,25,50,50); // 各确定两个点连线

//        矩形边框
//        g.drawRect(25,25,100,100); // 确定一个点，后面为宽高

//        填充矩形
//        g.setColor(Color.blue);
//        g.fillRect(25,25,100,100);

//        填充椭圆
//        g.setColor(Color.red);
//        g.fillOval(25,25,100,100);

//        画图片 1.获取图片资源
//        图片必须放在 out 文件夹的 chapter15 即当前项目文件下
//        MyPanel.class.getResource("/5.png") MyPanel指你继承了 JPanel 类的 画板类，别乱来
//        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/5.png"));
//        g.drawImage(image,25,25,244,155,this); // 宽高与图片一致，否则会变形

//        画字符串 ： 先给画笔设置颜色和字体
//        g.setColor(Color.red);
//        g.setFont(new Font("宋体", Font.BOLD, 20));
//        g.drawString("北京你好",100,100); // 对应左下角坐标

//        设置画笔颜色 setColor()
//        设置画笔字体 setFont(Font font)


    }
}
