package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingF extends JFrame {
    private Container A;
    private JPanel JP = new JPanel();
    private JMenuBar JMB = new JMenuBar();
    private JMenu JMF = new JMenu("File");
    private JMenu JMG = new JMenu("Game");
    private JMenu JMT = new JMenu("Tool");
    private JMenu JMH = new JMenu("Help");
    private JMenuItem JIO = new JMenuItem("Open");
    private JMenuItem JIC = new JMenuItem("Close");
    private JMenuItem JIE = new JMenuItem("Exit");
    private JMenuItem JIOX = new JMenuItem("O and X");
    private JMenuItem JIM = new JMenuItem("Moving her");
    private JMenuItem JIEn = new JMenuItem("Encrypt");
    private JMenuItem JIEnF = new JMenuItem("EncryptFile");
    private JMenuItem JIT = new JMenuItem("Timer");
    private JMenuItem JTL = new JMenuItem("ThreadL");
    private JMenuItem JTCS = new JMenuItem("CheatRoom_Server");
    private JMenuItem JTCC = new JMenuItem("CheatRoom_Client");
    private JMenuItem JTP = new JMenuItem("Paint");
    private JMenuItem JID = new JMenuItem("Dungeon");
    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public UsingF(){
        King();
    }
    private void King(){
        int sw = screen.width;
        int sh = screen.height;
        int w = 500;
        int h = 600;
        A = this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        A.setLayout(new BorderLayout(9,9));
        A.setBounds(sw/2-w/2,sh/2-h/2,w,h);
        this.setBounds(sw/2-w/2,sh/2-h/2,w,h);

        A.add(JMB,BorderLayout.NORTH);
        A.add(JP,BorderLayout.CENTER);

        JMB.add(JMF);
        JMB.add(JMG);
        JMB.add(JMT);
        JMB.add(JMH);

        JMF.add(JIO);
        JMF.add(JIC);
        JMF.add(JIE);

        JMG.add(JIOX);
        JMG.add(JIM);
        JMG.add(JTL);
        JMG.add(JID);

        JMT.add(JIEn);
        JMT.add(JIEnF);
        JMT.add(JIT);
        JMT.add(JTCS);
        JMT.add(JTCC);
        JMT.add(JTP);

        JIE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JIOX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Ex20180920_CircleF CF = new Ex20180920_CircleF(UsingF.this);
                setVisible(false);
                CF.setVisible(true);
            }
        });
        JIEn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EncryptF EF = new EncryptF(UsingF.this);
                setVisible(false);
                EF.setVisible(true);
            }
        });
        JIEnF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EncryptFileF EFF = new EncryptFileF(UsingF.this);
                setVisible(false);
                EFF.setVisible(true);
            }
        });

        JIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ClockF C = new ClockF(UsingF.this);
               setVisible(false);
               C.setVisible(true);
            }
        });

        JIM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MovingF move = new MovingF(UsingF.this);
                setVisible(false);
                move.setVisible(true);
            }
        });

        JTL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThreadL t = new ThreadL(UsingF.this);
                setVisible(false);
                t.setVisible(true);
            }
        });

        JTCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheatRoom_Server CRS = new CheatRoom_Server(UsingF.this);
//                setVisible(false);
                CRS.setVisible(true);
            }
        });

        JTCC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheatRoom_Client CRC = new CheatRoom_Client(UsingF.this);
//                setVisible(false);
                CRC.setVisible(true);
            }
        });

        JTP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paint P = new Paint(UsingF.this);
                setVisible(false);
                P.setVisible(true);
            }
        });

        JID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dungeon D = new Dungeon(UsingF.this);
                setVisible(false);
                D.setVisible(true);
            }
        });
    }
}
