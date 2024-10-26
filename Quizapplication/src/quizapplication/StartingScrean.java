package quizapplication;

import javax.swing.*;
import java .awt.*;
import java.awt.event.*;
import java.util.*;

public class StartingScrean extends JFrame implements ActionListener{
    
    JButton start,quit;
    
    StartingScrean()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/background.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 640, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        setLayout(null);
        
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(0,0,600,640);
        
        JLabel text=new JLabel("<html> Welcome to Quiz <br>&nbsp &nbsp &nbsp &nbsp Game </br></html>");
        image.add(text);
        text.setForeground(Color.black);
        text.setFont(new Font("System",Font.BOLD,50));
        text.setBounds(100,70,600,120);
        
        start=new JButton("Start");
        image.add(start);
        start.addActionListener(this);
        start.setBackground(Color.white);
        start.setFont(new Font("Ralway",Font.BOLD,20));
        start.setBounds(120,300,150,60);
        
        quit=new JButton("Quit");
        image.add(quit);
        quit.addActionListener(this);
        quit.setBackground(Color.white);
        quit.setFont(new Font("Ralway",Font.BOLD,20));
        quit.setBounds(300,300,150,60);
        
        setVisible(true);
        setBounds(450,50,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== start)
        {
            setVisible(false);
            Questionone q=new Questionone();
            q.timer.start();
            q.count = 30;
        }else if(e.getSource() == quit)
        {
            System.exit(0);
        }
    }
    
    public static void main(String []args)
    {
        new StartingScrean();
    }
}
