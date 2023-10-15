/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myswing.swingtut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.text.NumberFormatter;

/**        
 *
 * @author pradeepkumar
 */
class MyFrame extends JFrame implements ActionListener{

    JLabel l;
    JButton b;
    int count = 0;

    MyFrame() {
        super("Swing Demo");

        setLayout(new FlowLayout());
        l = new JLabel("Clicked " + count + " Times");
        b = new JButton("Click");
//        count++;
        add(l);
        add(b);
//        add(new JButton("Cancel"));
        b.addActionListener(this);
        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("/home/pradeepkumar/Downloads/profile.jpeg"));
        l.setToolTipText("Counter");
    }
    
    public void actionPerformed(ActionEvent ae) {
        count++;
        l.setText("CLicked "+count+" Times");
    }
}

class MyFrame2 extends JFrame {

    public MyFrame2() throws HeadlessException {
        JTextField tf1 = new JTextField(15);
        
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);
        
//        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(0);
        setLayout(new FlowLayout());
        
        JTextArea ta = new JTextArea(30,30);
//        String str = ;
        ta.setText(ta.toString());
        add(tf1);
        add(tf2);
        add(tf3);
        add(ta);
    }
    
}

public class SwingTut {

    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
