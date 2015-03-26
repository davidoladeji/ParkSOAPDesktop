package com.davidoladeji.park.gui;

import javax.swing.*;
import java.awt.*;

public class Main  {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        StartUpDesktop startUpDesktop = new StartUpDesktop();



        startUpDesktop.setSize(340, 300);
        startUpDesktop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startUpDesktop.setVisible(true);
        startUpDesktop.setLayout(new FlowLayout());
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - startUpDesktop.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - startUpDesktop.getHeight()) / 2);
        startUpDesktop.setLocation(x, y);
    }

}
