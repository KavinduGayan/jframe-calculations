package com.jtutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculations extends JFrame {

    public Calculations() throws HeadlessException {
        JTextField f1= new JTextField(); //create text field
        f1.setBounds(20,5, 260,20);//set postion x,y,width,height

        JTextField f2= new JTextField();//create text field
        f2.setBounds(20,30,260,20);//set postion x,y,width,height

        JLabel result=new JLabel();//create lable
        result.setBounds(100,40, 100,50);//set postion x,y,width,height
        result.setVisible(false);//set visibility false

        //addition button
        JButton add = new JButton("ADD");//create add button
        add.setBounds(20,80,120,20);//set button postion x,y,width,height
        add.addActionListener(i-> {
            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int sum = num1 + num2;
            result.setText("addition :"+sum);// set text to the label
            result.setVisible(true);// set label visible
        });

        //substraction button
        JButton sub = new JButton("SUBSTRACTION");//create SUBSTRATION button
        sub.setBounds(160,80,120,20);
        sub.addActionListener(i-> {
            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int subtraction = num1 - num2;
            result.setText("subtraction :"+subtraction);
            result.setVisible(true);
        });

        //multiplication button
        JButton multiple = new JButton("MULTIPLY");
        multiple.setBounds(20,110,120,20);
        multiple.addActionListener(i-> {
            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int mul = num1 * num2;
            result.setText("Multiply :"+mul);
            result.setVisible(true);
        });
        //divide button
        JButton devide = new JButton("DEVIDE");
        devide.setBounds(160,110,120,20);
        devide.addActionListener(i-> {
            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int devi = num1 / num2;
            result.setText("devide :"+devi);
            result.setVisible(true);
        });

        this.setVisible(true);// set visible frame
        this.setSize(300,300); // set frame size width and height
        this.setTitle("Calculations");//set frame title
        this.setLayout(null);//can position our components absolutely
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //stop the process once the frame close
        this.setResizable(false);//frame cannot resizable

        // add components to the frame
        this.add(f1);
        this.add(f2);
        this.add(result);
        this.add(add);
        this.add(sub);
        this.add(multiple);
        this.add(devide);
    }
}
