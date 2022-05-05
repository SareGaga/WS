package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Firstform extends JFrame {

    private JButton btn;
    private JPanel p1;

    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField t5;
    private JTextField t1;
    private JTextField tt3;
    private JTextField tt4;
    private JTextField tt2;

    public Firstform() {
        setContentPane(p1);
        setTitle("First form");
        setMinimumSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Secondform sf = new Secondform();
                dispose();
                try{
                    Insert();
                }catch (SQLException ex){
                    Logger.getLogger(Firstform.class.getName()).log(Level.SEVERE,null,ex);
                }


            }
        });
        p1.setBackground(Color.white);

    }

    public static void main(String[] args) {
        Firstform ff = new Firstform();

    }
    public void Insert() throws SQLException{
        Connection connect=null;
        ws_Dal w=new ws_Dal();
        PreparedStatement statement=null;

        try {
            connect=w.getConnection();
            String sql="insert into ws(NAME,SURNAME,ADDRESS,TC)"
                    +"values(?,?,?,?)";
            statement=connect.prepareStatement(sql);
            statement.setString(1,tt2.getText());
            statement.setString(2,tt3.getText());
            statement.setString(3,tt4.getText());
            statement.setString(4,t5.getText());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null,"kayıt başarıyla eklendi");
        }catch (SQLException exception){
            w.ShowError(exception);
        }
        finally {
            statement.close();
            connect.close();
        }
    }

}