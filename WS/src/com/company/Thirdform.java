package com.company;

import javax.swing.*;
import java.awt.*;

public class Thirdform extends JFrame {

    private JPanel p3;
    private JFormattedTextField t6;


    public Thirdform() {
        setContentPane(p3);
        setTitle("Third form");
        setMinimumSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        p3.setBackground(Color.white);

    }

    public static void main(String[] args) {
        Thirdform tf = new Thirdform();


    }
}