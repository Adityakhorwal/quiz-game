package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Questionone extends JFrame implements ActionListener{
    
    JButton option1,option2,option3,option4,option5,option6,option7,option8,option9,option10,option11,option12
            ,option13,option14,option15,option16 ,option17,option18,option19,option20;
    JLabel time,question,image,image2,right,wrong,score;
    int ans,count=30,q1=0,q2=0,q3=0,q4=0,q5=0;
    
    Questionone()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/questionbg.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 570, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        setLayout(null);
        
        image=new JLabel(i3);
        add(image);
        image.setBounds(0,0,800,570);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/score.jpeg"));
        Image i5=i4.getImage().getScaledInstance(850, 600, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        
        setLayout(null);
        
        image2=new JLabel(i6);
        add(image2);
        image2.setBounds(0,0,800,600);
        
        
        right =new JLabel();
        image2.add(right);
        right.setFont(new Font("Systeme",Font.BOLD,40));
        right.setBounds(340,200,400,100);
        right.setForeground(Color.white);
        
        wrong =new JLabel();
        image2.add(wrong);
        wrong.setFont(new Font("Systeme",Font.BOLD,40));
        wrong.setBounds(340,250,400,100);
        wrong.setForeground(Color.white);
        
        score =new JLabel();
        image2.add(score);
        score.setFont(new Font("Systeme",Font.BOLD,60));
        score.setBounds(290,320,400,100);
        score.setForeground(Color.white);
        
        question=new JLabel("<html>Which of the following is the top-level<br> container in the Swing package?</br></html>");
        image.add(question);
        question.setForeground(Color.BLACK);
        question.setFont(new Font("Ralway",Font.BOLD,20));
        question.setBounds(200,230,400,100);

        time=new JLabel("00:00"); 
        image.add(time);
        time.setForeground(Color.BLACK);
        time.setFont(new Font("Ralway",Font.BOLD,40));
        time.setBounds(320,50,400,100);
        
        option1 = new JButton("JButton");
        image.add(option1);
        option1.addActionListener(this);
        option1.setFont(new Font("System",Font.BOLD,13));
        option1.setBounds(150,390,200,55);
        
        option2 = new JButton("JFrame");
        image.add(option2);
        option2.addActionListener(this);
        option2.setFont(new Font("System",Font.BOLD,13));
        option2.setBounds(470,390,200,55);
        
        option3 = new JButton("JPanel");
        image.add(option3);
        option3.addActionListener(this);
        option3.setFont(new Font("System",Font.BOLD,13));
        option3.setBounds(150,465,200,55);
        
        option4 = new JButton("JTextField");
        image.add(option4);
        option4.addActionListener(this);
        option4.setFont(new Font("System",Font.BOLD,13));
        option4.setBounds(470,465,200,55);
        
        option5 = new JButton("setVisible(true)");
        image.add(option5);
        option5.addActionListener(this);
        option5.setFont(new Font("System",Font.BOLD,13));
        option5.setBounds(150,390,200,55);
        
        option6 = new JButton("show()");
        image.add(option6);
        option6.addActionListener(this);
        option6.setFont(new Font("System",Font.BOLD,13));
        option6.setBounds(470,390,200,55);
        
        option7 = new JButton("display()");
        image.add(option7);
        option7.addActionListener(this);
        option7.setFont(new Font("System",Font.BOLD,13));
        option7.setBounds(150,465,200,55);
        
        option8 = new JButton("open()");
        image.add(option8);
        option8.addActionListener(this);
        option8.setFont(new Font("System",Font.BOLD,13));
        option8.setBounds(470,465,200,55);
        
        option9 = new JButton("JTextField");
        image.add(option9);
        option9.addActionListener(this);
        option9.setFont(new Font("System",Font.BOLD,13));
        option9.setBounds(150,390,200,55);
        
        option10 = new JButton("JButton");
        image.add(option10);
        option10.addActionListener(this);
        option10.setFont(new Font("System",Font.BOLD,13));
        option10.setBounds(470,390,200,55);
        
        option11 = new JButton("JLabel");
        image.add(option11);
        option11.addActionListener(this);
        option11.setFont(new Font("System",Font.BOLD,13));
        option11.setBounds(150,465,200,55);
        
        option12 = new JButton("JPanel");
        image.add(option12);
        option12.addActionListener(this);
        option12.setFont(new Font("System",Font.BOLD,13));
        option12.setBounds(470,465,200,55);
        
        option13 = new JButton("FlowLayout");
        image.add(option13);
        option13.addActionListener(this);
        option13.setFont(new Font("System",Font.BOLD,13));
        option13.setBounds(150,390,200,55);
        
        option14 = new JButton("GridLayout");
        image.add(option14);
        option14.addActionListener(this);
        option14.setFont(new Font("System",Font.BOLD,13));
        option14.setBounds(470,390,200,55);
        
        option15 = new JButton("BorderLayout");
        image.add(option15);
        option15.addActionListener(this);
        option15.setFont(new Font("System",Font.BOLD,13));
        option15.setBounds(150,465,200,55);
        
        option16 = new JButton("CardLayout");
        image.add(option16);
        option16.addActionListener(this);
        option16.setFont(new Font("System",Font.BOLD,13));
        option16.setBounds(470,465,200,55);
        
        option17 = new JButton("JList");
        image.add(option17);
        option17.addActionListener(this);
        option17.setFont(new Font("System",Font.BOLD,13));
        option17.setBounds(150,390,200,55);
        
        option18 = new JButton("JComboBox");
        image.add(option18);
        option18.addActionListener(this);
        option18.setFont(new Font("System",Font.BOLD,13));
        option18.setBounds(470,390,200,55);
        
        option19 = new JButton("JTextField");
        image.add(option19);
        option19.addActionListener(this);
        option19.setFont(new Font("System",Font.BOLD,13));
        option19.setBounds(150,465,200,55);
        
        option20 = new JButton("JButton");
        image.add(option20);
        option20.addActionListener(this);
        option20.setFont(new Font("System",Font.BOLD,13));
        option20.setBounds(470,465,200,55);
        
        setVisible(true);
        setBounds(350,20,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                  
    }
    
    Timer timer=new Timer(1000 , new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            count -- ;
            time.setText("00:"+count);
            if(count==0)
            {
                if(q1==0)
                {
                    question2();
                    q1=1;
                    restart();
                }else if(q2==0)
                {
                    question3();
                    q2=1;
                    restart();
                }else if(q3==0)
                {
                    question4();
                    q3=1;
                    restart();
                }else if(q4==0)
                {
                    question5();
                    q4=1;
                    restart();
                }else if(q5==0)
                {
                    score();
                    q5=1;
                }
            }
        }
        
    });
    
    
    public void question2()
    {
        question.setText("<html>Which method is used to make a Swing <br> component visible?</br></html>");
        option1.setVisible(false);
        option2.setVisible(false);
        option3.setVisible(false);
        option4.setVisible(false);
        option5.setVisible(true);
        option6.setVisible(true);
        option7.setVisible(true);
        option8.setVisible(true);
        
        
    }
    
    public void question3()
    {
        question.setText("<html>Which class is used to create a button in <br> the Swing package ?</br></html>");
        option5.setVisible(false);
        option6.setVisible(false);
        option7.setVisible(false);
        option8.setVisible(false);
        option9.setVisible(true);
        option10.setVisible(true);
        option11.setVisible(true);
        option12.setVisible(true);
        
        
    }
    
    public void question4()
    {
        question.setText("<html>What is the default layout manager for a JFrame?</html>");
        option9.setVisible(false);
        option10.setVisible(false);
        option11.setVisible(false);
        option12.setVisible(false);
        option13.setVisible(true);
        option14.setVisible(true);
        option15.setVisible(true);
        option16.setVisible(true);
        
    }
    
    public void question5()
    {
        question.setText("<html>Which component in Swing is used to <br>create a drop-down list?</br></html>");
        option13.setVisible(false);
        option14.setVisible(false);
        option15.setVisible(false);
        option16.setVisible(false);
        option17.setVisible(true);
        option18.setVisible(true);
        option19.setVisible(true);
        option20.setVisible(true);
       
       
    }
     public void score()
    {
        question.setVisible(false);
        option17.setVisible(false);
        option18.setVisible(false);
        option19.setVisible(false);
        option20.setVisible(false);
        image.setVisible(false);
        image2.setVisible(true);
        setBounds(320,20,800,600);
        right.setText("Right = "+ans);
        wrong.setText("wrong = "+(5-ans));
        score.setText("Score: "+(ans*200));
    }
    
    void restart()
    {
        timer.stop();
        count = 30;
        time.setText("00:"+count);
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
                
        if(e.getSource() == option1)
        {
            q1=1;
            question2();
            restart();
            
        }else if(e.getSource() == option2)
        {
            q1=1;
            ans=ans+1;
            System.out.println(ans);
            question2();
            restart();
        }else if(e.getSource() == option3)
        {
            q1=1;
            question2();
            restart();
        }else if(e.getSource() == option4)
        {
            q1=1;
            question2();
            restart();
        }else if(e.getSource() == option5)
        {
            q2=1;
            question3();
            restart();
            ans=ans+1;
            System.out.println(ans);
            
        }else if(e.getSource() == option6)
        {
            q2=1;
            question3();
            restart();
        }else if(e.getSource() == option7)
        {
            q2=1;
            question3();
            restart();
        }else if(e.getSource() == option8)
        {
            q2=1;
            question3();
            restart();
        }else if(e.getSource() == option9)
        {
            q3=1;
            question4();
            restart();
                        
        }else if(e.getSource() == option10)
        {
            q3=1;
            question4();
            restart();
            ans=ans+1;
            System.out.println(ans);
        }else if(e.getSource() == option11)
        {
            q3=1;
            question4();
            restart();
        }else if(e.getSource() == option12)
        {
            q3=1;
            question4();
            restart();
        }else if(e.getSource() == option13)
        {
            q4=1;
            question5();
            restart();
                        
        }else if(e.getSource() == option14)
        {
            q4=1;
            question5();
            restart();
            System.out.println(ans);
        }else if(e.getSource() == option15)
        {
            q4=1;
            question5();
            restart();
            ans=ans+1;
            System.out.println(ans);
        }else if(e.getSource() == option16)
        {
            q4=1;
            question5();
            restart();
        }else if(e.getSource() == option17)
        {
            q5=1;
            score();
                        
        }else if(e.getSource() == option18)
        {    
            q5=1;
            ans=ans+1;
            System.out.println(ans);
            score();
        }else if(e.getSource() == option19)
        {    
            q5=1;
            score();
        }else if(e.getSource() == option20)
        {   
            q5=1;
            score();
        }
        
    }
    
    public static void main(String []args)
    {
        new Questionone();
    }
    
}
