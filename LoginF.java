package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginF extends JFrame {

    public LoginF(String str,String str0){
        Ruwwen(str,str0);
    }

    private Container A;
    private JButton[] JB = new JButton[3];
    private JLabel JL2 = new JLabel("ID：");
    private JLabel JL1 = new JLabel("PW：");
    private JPanel JP = new JPanel(new GridLayout(2,2,3,3));
    private JPanel JP2 = new JPanel(new GridLayout(1,3,3,3));
    private JTextField JT = new JTextField();
    private JPasswordField PF = new JPasswordField();
    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    private void Ruwwen(String str,String str0){
        int sw = screen.width;
        int sh = screen.height;
        int w = 1000;
        int h = 500;

        A = this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        A.setLayout(new GridLayout(2,2));
        A.setBounds(sw/2-w/2,sh/2-h/2,w,h);
        this.setBounds(sw/2-w/2,sh/2-h/2,w,h);

        A.add(JP);
        A.add(JP2);

        PF.setText(str);
        JT.setText(str0);

        for(int i = 0;i < 3;i++){
            if(i == 0){
                JB[i] = new JButton("KeyBoard");
                JB[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        RandBordF rand = new RandBordF(JT.getText());
                        rand.setVisible(true);
                    }
                });
            }else if(i == 1){
                JB[i] = new JButton("Login");
                JB[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(JT.getText().equals("456") && String.valueOf(PF.getPassword()).equals("456")) {
                            UsingF use = new UsingF();
                            use.setVisible(true);
                            dispose();
                        }else{
                            JOptionPane.showMessageDialog(LoginF.this,"Wrong Password or ID");
//                            WrongF wrong = new WrongF();
//                            wrong.setVisible(true);
                            JT.setText("");
                            PF.setText("");
                        }
                    }
                });
            }else{
                JB[i] = new JButton("Exit");
                JB[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
            JP2.add(JB[i]);
        }

        JP.add(JL2);
        JP.add(JT);
        JP.add(JL1);
        JP.add(PF);
    }
    public void getJT(){
     JT.getText();
    }
}
