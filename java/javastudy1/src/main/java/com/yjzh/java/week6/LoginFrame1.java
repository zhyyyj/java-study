package com.yjzh.java.week6;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LoginFrame1
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/9
 **/
public class LoginFrame1 {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel westPanel;
    private JPanel southPanel;
    private JPanel eastPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Rectangle bounds = frame.getMaximizedBounds();
        frame.setMaximizedBounds(bounds);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}