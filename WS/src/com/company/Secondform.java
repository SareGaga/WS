package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Secondform extends JFrame{
    private JTextField t6;
    private JButton b2;
    private JCheckBox c1;
    private JCheckBox c3;
    private JCheckBox c2;
    private JPanel p2;


    public Secondform() {
        setContentPane(p2);
        setTitle("second form");
        setMinimumSize(new Dimension(400,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thirdform tf =new Thirdform();
                dispose();
            }
        });
        p2.setBackground(Color.white);


    }

    public static void main(String[]args){
        Secondform sf=new Secondform();


    }
}
