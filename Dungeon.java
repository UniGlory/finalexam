package com.company;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;


public class Dungeon extends JFrame {
    private Container menu;
    private JButton Start = new JButton(new ImageIcon(getClass().getResource("\\img\\start.png")));
    private JButton Exit = new JButton(new ImageIcon(getClass().getResource("\\img\\end.png")));
    private JButton info = new JButton(new ImageIcon(getClass().getResource("\\img\\info.png")));
    private JButton Restart = new JButton();
    private JLabel Title = new JLabel(new ImageIcon(getClass().getResource("\\img\\Title2.png")));
    private JLabel Black = new JLabel(new ImageIcon(getClass().getResource("\\img\\cc.png")));
    private JTextArea endstory = new JTextArea();
    private JLabel endtitleplace = new JLabel();
    private JLabel storyplace = new JLabel();
    private JLabel ItemBar = new JLabel();
    private JLabel Boxplace = new JLabel();
    private JLabel SBoxplace = new JLabel();
    private JLabel menubackplace = new JLabel();
    private JLabel[] showammo = new JLabel[5];
    private JLabel[] keyplace = new JLabel[5];
    private JLabel[] hpplace = new JLabel[4];
    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel[][][] ground = new JLabel[10][10][2];
    private JLabel dangerous = new JLabel();
    private JLabel Mreborn = new JLabel();
    private JLabel Heroplace = new JLabel();
    private JLabel fireplace = new JLabel();
    private JLabel exitplace = new JLabel();
    private JLabel gameoverplace = new JLabel();
    private JLabel theKey = new JLabel();
    private JLabel bodyplace = new JLabel();
    private JLabel[] Itemplace = new JLabel[5];
    private ArrayList<Monster> depot = new ArrayList<Monster>();
    private int x,y = 0;
    private ImageIcon backmenu = new ImageIcon(getClass().getResource("\\img\\tomenu.png"));
    private ImageIcon ammoimg = new ImageIcon(getClass().getResource("\\img\\ammo.png"));
    private ImageIcon icon = new ImageIcon(getClass().getResource("\\img\\block.png"));
    private ImageIcon pass = new ImageIcon(getClass().getResource("\\img\\pass.png"));
    private ImageIcon gogogo = new ImageIcon(getClass().getResource("\\img\\cc.png"));
    private ImageIcon itembar = new ImageIcon(getClass().getResource("\\img\\itembar.png"));
    private ImageIcon keyimg = new ImageIcon(getClass().getResource("\\img\\key.png"));
    private ImageIcon Skeyimg = new ImageIcon(getClass().getResource("\\img\\Skey.png"));
    private ImageIcon showhp = new ImageIcon(getClass().getResource("\\img\\HP.png"));
    private ImageIcon showdan = new ImageIcon(getClass().getResource("\\img\\dangers.png"));
    private ImageIcon menuback = new ImageIcon(getClass().getResource("\\img\\BACK.png"));
    private ImageIcon catchzoom = new ImageIcon();
    private ImageIcon[] endtitle = new ImageIcon[5];
    private ImageIcon[] story = new ImageIcon[6];
    private ImageIcon[] body = new ImageIcon[5];
    private ImageIcon[] exit = new ImageIcon[4];
    private ImageIcon[] Item = new ImageIcon[6];
    private ImageIcon[] box = new ImageIcon[12];
    private ImageIcon[] fire = new ImageIcon[58];
    private ImageIcon[] door = new ImageIcon[4];
    private ImageIcon[] gameover = new ImageIcon[10];
    private ImageIcon[] hero = new ImageIcon[12];  //0.1:left , 2.3:up , 4.5:right , 6.7: down , 8:attack , 9: get , 10:dead , 11:reload
    private String[] herofile = {"\\img\\left.png","\\img\\left_move.png","\\img\\up.png","\\img\\up_move.png","\\img\\right.png","\\img\\right_move.png","\\img\\down.png","\\img\\down_move.png","\\img\\attack.png","\\img\\get.png","\\img\\dead.png","\\img\\reload.png"};
    private String[] firefile = {"\\explosion\\1.png","\\explosion\\2.png","\\explosion\\3.png","\\explosion\\4.png","\\explosion\\5.png","\\explosion\\6.png","\\explosion\\7.png","\\explosion\\8.png","\\explosion\\9.png","\\explosion\\10.png",
                                 "\\explosion\\11.png","\\explosion\\12.png","\\explosion\\13.png","\\explosion\\14.png","\\explosion\\15.png","\\explosion\\16.png","\\explosion\\17.png","\\explosion\\18.png","\\explosion\\19.png","\\explosion\\20.png",
                                 "\\explosion\\21.png","\\explosion\\22.png","\\explosion\\23.png","\\explosion\\24.png","\\explosion\\25.png","\\explosion\\26.png","\\explosion\\27.png","\\explosion\\28.png","\\explosion\\29.png","\\explosion\\30.png",
                                 "\\explosion\\31.png","\\explosion\\32.png","\\explosion\\33.png","\\explosion\\34.png","\\explosion\\35.png","\\explosion\\36.png","\\explosion\\37.png","\\explosion\\38.png","\\explosion\\39.png","\\explosion\\40.png",
                                 "\\explosion\\41.png","\\explosion\\42.png","\\explosion\\43.png","\\explosion\\44.png","\\explosion\\45.png","\\explosion\\46.png","\\explosion\\47.png","\\explosion\\48.png","\\explosion\\49.png","\\explosion\\50.png",
                                 "\\explosion\\51.png","\\explosion\\52.png","\\explosion\\53.png","\\explosion\\54.png","\\explosion\\55.png","\\explosion\\56.png","\\explosion\\57.png","\\explosion\\58.png"};
    private String[] boxfile = {"\\img\\o1.png","\\img\\o2.png","\\img\\b1.png","\\img\\b2.png","\\img\\g1.png","\\img\\g2.png","\\img\\p1.png","\\img\\p2.png","\\img\\r1.png","\\img\\r2.png","\\img\\bl1.png","\\img\\bl2.png",};
    private String[] itemfile = {"\\img\\ammoup.png","\\img\\HPup.png","\\img\\torch.png","\\img\\powder.png","\\img\\poison.png"};
    private String[] exitfile = {"\\img\\d1.png","\\img\\d2.png","\\img\\d3.png","\\img\\d4.png"};
    private String[] bodyfile = {"\\img\\body1.png","\\img\\body2.png","\\img\\body3.png","\\img\\body4.png","\\img\\body5.png",};
    private String[] gameoverfile = {"\\gameover\\G1.png","\\gameover\\G2.png","\\gameover\\G3.png","\\gameover\\G4.png","\\gameover\\G5.png","\\gameover\\G6.png","\\gameover\\G7.png","\\gameover\\G8.png","\\gameover\\G9.png","\\gameover\\G10.png"};
    private String[] endtitlefile = {"\\end\\forhonor.png","\\end\\forlier.png","\\end\\forlove.png","\\end\\formoney.png","\\end\\fornothing.png",};
    private String[] storyfile = {"\\end\\honor1.png","\\end\\honor2.jpg","\\end\\lier.jpg","\\end\\love.png","\\end\\money.jpg","\\end\\nothing.jpg",};
    private String readstory;
    private Image[] Itemsize = new Image[6];
    private Image[] herosize = new Image[12];
    private Image[] firesize = new Image[58];
    private Image[] Boxsize = new Image[12];
    private Image[] exitsize = new Image[4];
    private Image[] bodysize = new Image[5];
    private Image zoomin;
    private Image gameoversiz;
    private Image endtiltesize;
    private Image storysize;
    private Image backmenuc = backmenu.getImage().getScaledInstance(150,60,Image.SCALE_DEFAULT);
    private Image ammoimgc = ammoimg.getImage().getScaledInstance(25,40,Image.SCALE_DEFAULT);
    private Image showdanc = showdan.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
    private Image newimg = icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
    private Image newed = pass.getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
    private Image gogoold = gogogo.getImage().getScaledInstance(1300,1300,Image.SCALE_DEFAULT);
    private Image gogo = gogogo.getImage().getScaledInstance(3000,3000,Image.SCALE_AREA_AVERAGING);
    private Image itembarc = itembar.getImage().getScaledInstance(200,510,Image.SCALE_SMOOTH);
    private Image keyimgc = keyimg.getImage().getScaledInstance(50,35,Image.SCALE_DEFAULT);
    private Image Skeyimgc = Skeyimg.getImage().getScaledInstance(50,35,Image.SCALE_AREA_AVERAGING);
    private Image showhpc = showhp.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
    private boolean nextstage = false;
    private boolean timeron = false;
    private boolean HPup = false;
    private boolean viewup = false;
    private boolean ammoup = false;
    private boolean powerup = false;
    private boolean sucide = false;
    private boolean boxopen = false;
    private boolean showSbox = false;
    private boolean trueend = false;
    private boolean end = false;
    private JPanel monsterP = new JPanel();
    private JPanel background = new JPanel();
    private JPanel shadow = new JPanel();
    private JPanel heroP = new JPanel();
    private JPanel ShowItem = new JPanel();
    private JPanel endback = new JPanel();
    private JPanel endshow = new JPanel();
    private JPanel menubackp = new JPanel();
    private int HP = 2;
    private int doorcount = 0;
    private int monsternumber = 0;
    private int monsterX;
    private int monsterY;
    private int heroX;
    private int heroY;
    private int ammo = 3;
    private int way = 3;   //0:left , 1:up , 2:right , 3:down
    private int part = 0;
    private int bx = -575;
    private int by = -575;
    private int walk = 1;
    private int size = 50;
    private int attacktime = 8;
    private int count = 2;
    private int firecount = 0;
    private int gettime = 9;
    private int screenw = 705;
    private int screenh = 530;
    private int password = 0;
    private int bodyclean = 0;
    private int w = screen.width;
    private int h = screen.height;
    private AudioClip ac;
    private AudioClip se;
    private Timer Herosetplace;
    private Timer explosion;
    private Timer openbox;
    private Timer dooropen;
    private Timer indoor;
    private Timer[] deadmovie = new Timer[2];
    private Timer read;
    private Image menubackc = menuback.getImage().getScaledInstance(screenw+100,screenh,Image.SCALE_DEFAULT);
    private info Info = new info(end,trueend);

    public Dungeon(UsingF use){
        Ruwen(use);
    }
    private void Ruwen(UsingF use){
        menu = this.getContentPane();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                UsingF UF = new UsingF();
                setVisible(false);
                Info.setVisible(false);
                UF.setVisible(true);
                ac.stop();
            }
        });

         this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                setFocusable(true);
                if (!timeron) {
                    if(e.getKeyCode() == 68){
                        if(sucide){
                            timeron = true;
                            count = 0;
                            fornothing();
                            fornothing_music();
                            end = true;
                        }
                    }
                    if(e.getKeyCode() == 69){
                        herogetitem();
                        sans();
                        changingmap();
                        repaint();
                    }
                    if(e.getKeyCode() == 80){
                        if (part == 0) {
                            sec();
                            repaint();
                            part = 1;
                        } else if (part == 1) {
                            third();
                            repaint();
                            part = 2;
                        } else if (part == 2) {
                            forth();
                            repaint();
                            part = 3;
                        } else if (part == 3) {
                            fifth();
                            repaint();
                            part = 4;
                        } else if (part == 4) {
                            first();
                            repaint();
                            part = 0;
                        }
                    }
                    if (e.getKeyCode() == 82) {
                        sans();
                        if(ammoup){
                            if(ammo != 5) {
                                ammo = 5;
                                ShowItem.add(showammo[0]);
                                ShowItem.add(showammo[1]);
                                ShowItem.add(showammo[2]);
                                ShowItem.add(showammo[3]);
                                ShowItem.add(showammo[4]);
                                monster_walk();
                                monster_attack();
                                monster_born();
                                heroreload();
                                repaint();
                            }
                        }else{
                            if(ammo != 3) {
                                ammo = 3;
                                ShowItem.add(showammo[0]);
                                ShowItem.add(showammo[1]);
                                ShowItem.add(showammo[2]);
                                monster_walk();
                                monster_attack();
                                monster_born();
                                heroreload();
                                repaint();
                            }
                        }
                    }
                    if (e.getKeyCode() == 32) {
                        if(ammo != 0){
                            heroattack();
                            sans();
                            ammo--;
                            ShowItem.remove(showammo[ammo]);
                            repaint();
                        }
                    } else if (e.getKeyCode() == 37) {
                        if (way != 0) {
                            Heroplace.setIcon(hero[0]);
                            way = 0;
                        } else {
                            herocount();
                            if ((ground[heroY][heroX - 1][1].getText()).equals("0")) {
                                walk = 1;
                                herowalk();
                                monster_walk();
                                monster_born();
                            monster_attack();
                            }
                            repaint();
                        }
                    } else if (e.getKeyCode() == 38) {
                        if (way != 1) {
                            Heroplace.setIcon(hero[2]);
                            way = 1;
                        } else {
                            herocount();
                            if ((ground[heroY - 1][heroX][1].getText()).equals("0")) {
                                walk = 1;
                                herowalk();
                                monster_walk();
                                monster_born();
                            monster_attack();
                            }
                            repaint();
                        }
                    } else if (e.getKeyCode() == 39) {
                        if (way != 2) {
                            Heroplace.setIcon(hero[4]);
                            way = 2;
                        } else {
                            herocount();
                            if ((ground[heroY][heroX + 1][1].getText()).equals("0")) {
                                walk = 1;
                                herowalk();
                                monster_walk();
                                monster_born();
                                monster_attack();
                            }
                            repaint();
                        }
                    } else if (e.getKeyCode() == 40) {
                        if (way != 3) {
                            Heroplace.setIcon(hero[6]);
                            way = 3;
                        } else {
                            herocount();
                            if ((ground[heroY + 1][heroX][1].getText()).equals("0")) {
                                herowalk();
                                monster_walk();
                                monster_born();
                                monster_attack();
                            }
                            repaint();
                        }
                    }
                }
            }
        });

        setTitle("Dungeon ver 1.0.0");
        setIconImage(new ImageIcon(getClass().getResource("\\img\\icon.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
        menubackp.setOpaque(false);
        monsterP.setOpaque(false);
        shadow.setOpaque(false);
        background.setOpaque(false);
        heroP.setOpaque(false);
        ShowItem.setOpaque(false);
        endback.setOpaque(true);
        endshow.setOpaque(false);
        endstory.setOpaque(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ShowItem.setLayout(null);
        menu.setLayout(null);
        heroP.setLayout(null);
        monsterP.setLayout(null);
        background.setLayout(null);
        shadow.setLayout(null);
        endback.setLayout(null);
        endshow.setLayout(null);
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                UsingF UF = new UsingF();
//                setVisible(false);
//                UF.setVisible(true);
//            }
//        });


        this.setResizable(false);

        monsterP.setBounds(0,0,505,screenh);
        background.setBounds(0,0,screenw,screenh);
        shadow.setBounds(0,0,505,screenh);
        heroP.setBounds(0,0,505,screenh);
        ShowItem.setBounds(500,0,screenw-500,screenh);
        ItemBar.setBounds(500,0,screenw-500,screenh-30);
        ShowItem.setBackground(Color.blue);
        gameoverplace.setBounds(250,0,200,80);
        menu.setBounds(w/2-750,h/2-250,screenw,screenh);
        this.setBounds(w/2-750,h/2-250,screenw,screenh);
        menubackplace.setBounds(0,0,screenw,screenh);
        Start.setBounds(353-100,250,200,100);
        info.setBounds(353-100,325,200,100);
        Exit.setBounds(353-100,400,200,100);
        Restart.setBounds(15,710,150,60);
        Title.setBounds(353-124,50,248,87);
        endshow.setBounds(0,0,800,800);
        endback.setBounds(0,0,800,800);
        endtitleplace.setBounds(15,15,250,100);
        storyplace.setBounds(275,15,500,280);
        endstory.setBounds(265,400,500,400);

        Start.setContentAreaFilled(false);
        Start.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.setBorderPainted(false);
        info.setContentAreaFilled(false);
        info.setBorderPainted(false);
        Restart.setContentAreaFilled(false);
        Restart.setBorderPainted(false);
        endback.setBackground(Color.black);

        endstory.setFont(new Font(null,Font.BOLD,20));
        endstory.setForeground(Color.white);
        Menu();

        for(int i = 0;i < 58;i++){
            fire[i] = new ImageIcon(getClass().getResource(firefile[i]));
            firesize[i] = fire[i].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
            fire[i].setImage(firesize[i]);
        }
        for(int i = 0;i < 12;i++){
            hero[i] = new ImageIcon(getClass().getResource(herofile[i]));
            herosize[i] = hero[i].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
            hero[i].setImage(herosize[i]);
        }
        for(int i = 0;i < 5;i++){
            body[i] = new ImageIcon(getClass().getResource(bodyfile[i]));
            bodysize[i] = body[i].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
            body[i].setImage(bodysize[i]);
        }
        for(int i = 0;i < 12;i++){
            box[i] = new ImageIcon(getClass().getResource(boxfile[i]));
            Boxsize[i] = box[i].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
            box[i].setImage(Boxsize[i]);
        }
        for(int i = 0;i < 5;i++){
            Item[i] = new ImageIcon(getClass().getResource(itemfile[i]));
            Itemsize[i] = Item[i].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
            Item[i].setImage(Itemsize[i]);
            Itemplace[i] = new JLabel(Item[i]);

            if(i != 0){
                Itemplace[i].setBounds(40,Itemplace[i-1].getY()+75,40,40);
            }else {
                Itemplace[i].setBounds(40,20,40,40);
            }
        }
        for(int i = 0;i < 5;i++){
            ammoimg.setImage(ammoimgc);
            showammo[i] = new JLabel(ammoimg);
            if(i != 0){
                showammo[i].setBounds(showammo[i-1].getX()+30, 445, 40, 40);
            }else {
                showammo[i].setBounds(15, 445, 40, 40);
            }
        }
        for(int i = 0;i < 5;i++){
            keyimg.setImage(keyimgc);
            keyplace[i] = new JLabel(keyimg);
            if(i != 0){
                keyplace[i].setBounds(120, keyplace[i-1].getY()+75, 40, 40);
            }else {
                keyplace[i].setBounds(120, 20, 40, 40);
            }
        }
        for(int i = 0;i < 4;i++){
            showhp.setImage(showhpc);
            hpplace[i] = new JLabel(showhp);
            if(i != 0){
                hpplace[i].setBounds(hpplace[i-1].getX()+40, 385, 40, 40);
            }else {
                hpplace[i].setBounds(15, 385, 40, 40);
            }
        }
        for(int i = 0;i < 4;i++){
            exit[i] = new ImageIcon(getClass().getResource(exitfile[i]));
            exitsize[i] = exit[i].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
            exit[i].setImage(exitsize[i]);
        }
        for(int i = 0;i < 10;i++){
            gameover[i] = new ImageIcon(getClass().getResource(gameoverfile[i]));
            gameoversiz = gameover[i].getImage().getScaledInstance(200,80,Image.SCALE_DEFAULT);
            gameover[i].setImage(gameoversiz);
        }
        for(int i = 0;i < 6;i++){
            story[i] = new ImageIcon(getClass().getResource(storyfile[i]));
            storysize = story[i].getImage().getScaledInstance(500,280,Image.SCALE_DEFAULT);
            story[i].setImage(storysize);
            if(i != 5){
                endtitle[i] = new ImageIcon(getClass().getResource(endtitlefile[i]));
                endtiltesize = endtitle[i].getImage().getScaledInstance(250,100,Image.SCALE_DEFAULT);
                endtitle[i].setImage(endtiltesize);
            }
        }
        door[0] = new ImageIcon(getClass().getResource("\\img\\door_0.png"));
        door[1] = new ImageIcon(getClass().getResource("\\img\\door_1.png"));
        door[2] = new ImageIcon(getClass().getResource("\\img\\door_2.png"));
        door[3] = new ImageIcon(getClass().getResource("\\img\\door_3.png"));
        Image D0 = door[0].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
        Image D1 = door[1].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
        Image D2 = door[2].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
        Image D3 = door[3].getImage().getScaledInstance(50,50,Image.SCALE_AREA_AVERAGING);
        door[0].setImage(D0);
        door[1].setImage(D1);
        door[2].setImage(D2);
        door[3].setImage(D3);
        icon.setImage(newimg);
        pass.setImage(newed);
        itembar.setImage(itembarc);
        ItemBar.setIcon(itembar);
        theKey.setIcon(keyimg);
        showdan.setImage(showdanc);
        dangerous.setIcon(showdan);
        backmenu.setImage(backmenuc);
        Restart.setIcon(backmenu);
        menuback.setImage(menubackc);


        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsingF UF = new UsingF();
                setVisible(false);
                Info.setVisible(false);
                UF.setVisible(true);
                ac.stop();
            }
        });

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Info.setVisible(true);
            }
        });


        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac.stop();
                menu.remove(Start);
                menu.remove(Exit);
                menu.remove(info);
                menu.remove(Title);
                shadow.add(Black);
                heroP.add(Heroplace);
                Heroplace.setIcon(hero[6]);
                music_game();
                    first();
                    repaint();
                }
        });

        Restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac.stop();
                Menu();
            }
        });
    }


    public void Menu(){
        if(trueend) {
            menu.setBounds(w / 2 - 750, h / 2 - 250, screenw, screenh);
            this.setBounds(w / 2 - 750, h / 2 - 250, screenw, screenh);
            endstory.setText("");
            trueend = false;
        }
        shadow.setBounds(0,0,505,screenh);
        menu.removeAll();
        shadow.removeAll();
        background.removeAll();
        monsterP.removeAll();
        heroP.removeAll();
        ShowItem.removeAll();
        menu.add(shadow);
        menu.add(heroP);
        menu.add(monsterP);
        menu.add(ShowItem);
        menu.add(background);
        menu.add(Title);
        menu.add(Start);
        menu.add(Exit);
        menu.add(info);
        menu.add(menubackplace);
        menubackplace.setIcon(menuback);
        HP = 2;
        doorcount = 0;
        password = 0;
        bodyclean = 0;
        timeron = false;
        viewup = false;
        powerup = false;
        ammoup = false;
        HPup = false;
        sucide = false;
        music_menu();
        repaint();
    }

    public void first(){
        Mreborn.setBounds(400,200,50,50);
        Boxplace.setBounds(300,300,50,50);
        exitplace.setBounds(100,400,50,50);
        theKey.setBounds(300,50,50,50);
        bodyplace.setBounds(400,400,50,50);
        part = 0;
        way = 2;
        Boxplace.setIcon(box[0]);
        Heroplace.setIcon(hero[4]);
        bodyplace.setIcon(body[0]);
        Heroplace.setBounds(50,50,50,50);
        ShowItem.add(hpplace[0]);
        ShowItem.add(hpplace[1]);
        start();
        y = 0;
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                ground[y/50][x/50][0] = new JLabel(icon);
                ground[y/50][x/50][0].setBounds(x,y,50,50);
                ground[y / 50][x / 50][1] = new JLabel("1");
                background.add(ground[y / 50][x / 50][0]);
                x+=50;
            }
            x = 0;
            y+=50;
        }
        for(int i = 8;i > 1;i--){
            ground[8][i][0].setIcon(pass);
            ground[8][i][1].setText("0");
        }
        for(int i =6;i > 5;i--){
            ground[7][i][0].setIcon(pass);
            ground[7][i][1].setText("0");
        }
        for(int i =8;i > 5;i--){
            ground[6][i][0].setIcon(pass);
            ground[6][i][1].setText("0");
        }
        for(int i =8;i > 7;i--){
            ground[5][i][0].setIcon(pass);
            ground[5][i][1].setText("0");
        }
        for(int i =8;i > 1;i--){
            ground[4][i][0].setIcon(pass);
            ground[4][i][1].setText("0");
        }
        for(int i =2;i > 1;i--){
            ground[3][i][0].setIcon(pass);
            ground[3][i][1].setText("0");
        }
        for(int i =2;i > 1;i--){
            ground[2][i][0].setIcon(pass);
            ground[2][i][1].setText("0");
        }
        for(int i =5;i > 0;i--){
            ground[1][i][0].setIcon(pass);
            ground[1][i][1].setText("0");
        }
        for(int i =3;i > 0;i--){
            ground[i][6][0].setIcon(pass);
            ground[i][6][1].setText("0");
        }
        for(int i =7;i > 4;i--){
            ground[i][2][0].setIcon(pass);
            ground[i][2][1].setText("0");
        }
    }

    public void sec(){
        Mreborn.setBounds(150,150,50,50);
        Boxplace.setBounds(350,150,50,50);
        exitplace.setBounds(300,400,50,50);
        theKey.setBounds(50,400,50,50);
        bodyplace.setBounds(400,50,50,50);
        part = 1;
        way = 3;
        Boxplace.setIcon(box[2]);
        Heroplace.setIcon(hero[6]);
        bodyplace.setIcon(body[1]);
        Heroplace.setBounds(50,50,50,50);
        start();
        y = 0;
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                ground[y/50][x/50][0] = new JLabel(icon);
                ground[y/50][x/50][0].setBounds(x,y,50,50);
                ground[y / 50][x / 50][1] = new JLabel("1");
                background.add(ground[y / 50][x / 50][0]);
                x+=50;
            }
            x = 0;
            y+=50;
        }
        for(int i = 8;i > 0;i--){
            ground[i][1][0].setIcon(pass);
            ground[i][1][1].setText("0");
            ground[i][8][0].setIcon(pass);
            ground[i][8][1].setText("0");
        }
        for(int i = 6;i > 2;i--){
            ground[1][i][0].setIcon(pass);
            ground[1][i][1].setText("0");
            ground[8][i][0].setIcon(pass);
            ground[8][i][1].setText("0");
        }
        for(int i = 3;i > 1;i--){
            ground[i][3][0].setIcon(pass);
            ground[i][3][1].setText("0");
            ground[i][6][0].setIcon(pass);
            ground[i][6][1].setText("0");
        }
        for(int i = 7;i > 5;i--){
            ground[i][3][0].setIcon(pass);
            ground[i][3][1].setText("0");
            ground[i][6][0].setIcon(pass);
            ground[i][6][1].setText("0");
        }
        for(int i = 3;i > 2;i--){
            ground[i][2][0].setIcon(pass);
            ground[i][2][1].setText("0");
            ground[i][7][0].setIcon(pass);
            ground[i][7][1].setText("0");
        }
        for(int i = 6;i > 5;i--){
            ground[i][2][0].setIcon(pass);
            ground[i][2][1].setText("0");
            ground[i][7][0].setIcon(pass);
            ground[i][7][1].setText("0");
        }
            repaint();
    }

    public void third(){
        Mreborn.setBounds(300,350,50,50);
        Boxplace.setBounds(400,400,50,50);
        exitplace.setBounds(400,100,50,50);
        theKey.setBounds(100,400,50,50);
        bodyplace.setBounds(300,200,50,50);
        part = 2;
        way = 3;
        Boxplace.setIcon(box[4]);
        Heroplace.setIcon(hero[6]);
        bodyplace.setIcon(body[2]);
        Heroplace.setBounds(50,50,50,50);
        start();
        y = 0;
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                ground[y/50][x/50][0] = new JLabel(icon);
                ground[y/50][x/50][0].setBounds(x,y,50,50);
                ground[y / 50][x / 50][1] = new JLabel("1");
                background.add(ground[y / 50][x / 50][0]);
                x+=50;
            }
            x = 0;
            y+=50;
        }
        for(int i = 8;i > 5;i--){
            ground[8][i][0].setIcon(pass);
            ground[8][i][1].setText("0");
        }
        for(int i = 8;i > 2;i--){
            ground[6][i][0].setIcon(pass);
            ground[6][i][1].setText("0");
            ground[4][i][0].setIcon(pass);
            ground[4][i][1].setText("0");
        }
        for(int i = 8;i > 0;i--){
            ground[i][1][0].setIcon(pass);
            ground[i][1][1].setText("0");
        }
        for(int i = 8;i > 1;i--){
            ground[2][i][0].setIcon(pass);
            ground[2][i][1].setText("0");
        }
        for(int i = 8;i > 1;i--){
            ground[i][3][0].setIcon(pass);
            ground[i][3][1].setText("0");
        }
        ground[7][6][0].setIcon(pass);
        ground[7][6][1].setText("0");
        ground[3][8][0].setIcon(pass);
        ground[3][8][1].setText("0");
        ground[5][8][0].setIcon(pass);
        ground[5][8][1].setText("0");
        ground[8][2][0].setIcon(pass);
        ground[8][2][1].setText("0");
    }

    public void forth(){
        Mreborn.setBounds(300,250,50,50);
        Boxplace.setBounds(350,350,50,50);
        exitplace.setBounds(50,400,50,50);
        theKey.setBounds(400,400,50,50);
        bodyplace.setBounds(50,50,50,50);

        part = 3;
        way = 0;
        Boxplace.setIcon(box[6]);
        Heroplace.setIcon(hero[0]);
        bodyplace.setIcon(body[3]);
        Heroplace.setBounds(400,50,50,50);
        start();
        y = 0;
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                ground[y/50][x/50][0] = new JLabel(icon);
                ground[y/50][x/50][0].setBounds(x,y,50,50);
                ground[y / 50][x / 50][1] = new JLabel("1");
                background.add(ground[y / 50][x / 50][0]);
                x+=50;
            }
            x = 0;
            y+=50;
        }
        for(int i = 8;i > 3;i--){
            ground[8][i][0].setIcon(pass);
            ground[8][i][1].setText("0");
        }
        for(int i = 7;i > 0;i--){
            ground[i][4][0].setIcon(pass);
            ground[i][4][1].setText("0");
        }
        for(int i = 8;i > 4;i--){
            ground[4][i][0].setIcon(pass);
            ground[4][i][1].setText("0");
            ground[1][i][0].setIcon(pass);
            ground[1][i][1].setText("0");
        }
        for(int i = 7;i > 0;i--){
            ground[8][i][0].setIcon(pass);
            ground[8][i][1].setText("0");
        }
        for(int i = 8;i > 1;i--){
            ground[i][2][0].setIcon(pass);
            ground[i][2][1].setText("0");
        }
        ground[7][7][0].setIcon(pass);
        ground[7][7][1].setText("0");
        ground[5][6][0].setIcon(pass);
        ground[5][6][1].setText("0");
        ground[3][8][0].setIcon(pass);
        ground[3][8][1].setText("0");
        ground[8][1][0].setIcon(pass);
        ground[8][1][1].setText("0");
        ground[1][1][0].setIcon(pass);
        ground[1][1][1].setText("0");
        ground[1][2][0].setIcon(pass);
        ground[1][2][1].setText("0");
        ground[2][1][0].setIcon(pass);
        ground[2][1][1].setText("0");
    }

    public void fifth(){
        Mreborn.setBounds(300,150,50,50);
        Boxplace.setBounds(250,250,50,50);
        theKey.setBounds(300,200,50,50);
        bodyplace.setBounds(350,350,50,50);
        exitplace.setBounds(-50,-50,50,50);
        part = 4;
        way = 2;
        Boxplace.setIcon(box[8]);
        Heroplace.setIcon(hero[4]);
        bodyplace.setIcon(body[4]);
        Heroplace.setBounds(50,50,50,50);
        start();
        y = 0;
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                ground[y/50][x/50][0] = new JLabel(icon);
                ground[y/50][x/50][0].setBounds(x,y,50,50);
                ground[y / 50][x / 50][1] = new JLabel("1");
                background.add(ground[y / 50][x / 50][0]);
                x+=50;
            }
            x = 0;
            y+=50;
        }
        for(int i = 8;i > 0;i--){
            ground[i][i][0].setIcon(pass);
            ground[i][i][1].setText("0");
            ground[i][8][0].setIcon(pass);
            ground[i][8][1].setText("0");
            ground[1][i][0].setIcon(pass);
            ground[1][i][1].setText("0");
        }
        for(int i = 7;i > 1;i--){
            ground[i][2][0].setIcon(pass);
            ground[i][2][1].setText("0");
            ground[7][i][0].setIcon(pass);
            ground[7][i][1].setText("0");
        }
        for(int i = 6;i > 2;i--){
            ground[3][i][0].setIcon(pass);
            ground[3][i][1].setText("0");
            ground[i][6][0].setIcon(pass);
            ground[i][6][1].setText("0");
        }
    }
    public void herogetitem() {
        openbox = new Timer(350, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gettime == 0) {
                    Heroplace.setIcon(hero[9]);
                    gettime++;
                } else {
                    Heroplace.setIcon(hero[way * 2]);
                    timeron = false;
                    openbox.stop();
                }
            }
        });
        if (Heroplace.getY() == Boxplace.getY()) {
            if (Heroplace.getX() == Boxplace.getX()) {
                switch (part) {
                    case 0:
                        if (!boxopen) {
                            gettime = 0;
                            openbox.start();
                            timeron = true;
                            boxopen = true;
                            Boxplace.setIcon(box[1]);
                            ammoup = true;
                            ShowItem.add(Itemplace[0]);
                        }
                        break;
                    case 1:
                        if (!boxopen) {
                            gettime = 0;
                            openbox.start();
                            timeron = true;
                            boxopen = true;
                            HPup =true;
                            Boxplace.setIcon(box[3]);
                            ShowItem.add(Itemplace[1]);
                            if (HP == 2) {
                                ShowItem.add(hpplace[2]);
                                ShowItem.add(hpplace[3]);
                            } else {
                                ShowItem.add(hpplace[1]);
                                ShowItem.add(hpplace[2]);
                            }
                            HP+=2;
                        }
                        break;
                    case 2:
                        if (!boxopen) {
                            gettime = 0;
                            openbox.start();
                            timeron = true;
                            boxopen = true;
                            Boxplace.setIcon(box[5]);
                            viewup = true;
                            gogogo.setImage(gogo);
                            Black.setIcon(gogogo);
                            ShowItem.add(Itemplace[2]);
                        }
                        break;
                    case 3:
                        if (!boxopen) {
                            gettime = 0;
                            openbox.start();
                            timeron = true;
                            boxopen = true;
                            powerup = true;
                            Boxplace.setIcon(box[7]);
                            ShowItem.add(Itemplace[3]);
                        }
                        break;
                    case 4:
                        if (!boxopen) {
                            gettime = 0;
                            openbox.start();
                            timeron = true;
                            boxopen = true;
                            sucide = true;
                            Boxplace.setIcon(box[9]);
                            ShowItem.add(Itemplace[4]);
                        }
                        break;
                }
            }
        }
        if (Heroplace.getY() == theKey.getY()) {
            if (Heroplace.getX() == theKey.getX()) {
                switch (part){
                    case 0:
                        background.remove(theKey);
                        nextstage = true;
                        gettime = 0;
                        openbox.start();
                        timeron = true;
                        ShowItem.add(keyplace[0]);
                        break;
                    case 1:
                        background.remove(theKey);
                        nextstage = true;
                        gettime = 0;
                        openbox.start();
                        timeron = true;
                        ShowItem.add(keyplace[1]);
                        break;
                    case 2:
                        background.remove(theKey);
                        nextstage = true;
                        gettime = 0;
                        openbox.start();
                        timeron = true;
                        ShowItem.add(keyplace[2]);
                        break;
                    case 3:
                        background.remove(theKey);
                        nextstage = true;
                        gettime = 0;
                        openbox.start();
                        timeron = true;
                        ShowItem.add(keyplace[3]);
                        break;
                    case 4:
                        background.remove(theKey);
                        nextstage = true;
                        gettime = 0;
                        openbox.start();
                        timeron = true;
                        ShowItem.add(keyplace[4]);
                        break;
                }
            }
        }
        if(Heroplace.getX() == bodyplace.getX()){
            if(Heroplace.getY() == bodyplace.getY()){
                background.remove(bodyplace);
                if(showSbox) {
                    monsterP.remove(SBoxplace);
                    showSbox = false;
                }
                bodyclean++;
                laugh();
            }
        }
        if(Heroplace.getX() == SBoxplace.getX()){
            if(Heroplace.getY() == SBoxplace.getY()){
                Skeyimg.setImage(Skeyimgc);
                SBoxplace.setIcon(box[11]);
                gettime = 0;
                openbox.start();
                timeron = true;
                switch (part){
                    case 0:
                        keyplace[0].setIcon(Skeyimg);
                        password++;
                        break;
                    case 1:
                        keyplace[1].setIcon(Skeyimg);
                        password++;
                        break;
                    case 2:
                        keyplace[2].setIcon(Skeyimg);
                        password++;
                        break;
                    case 3:
                        keyplace[3].setIcon(Skeyimg);
                        password++;
                        break;
                    case 4:
                        keyplace[4].setIcon(Skeyimg);
                        password++;
                        if(password == 5){
                            exitplace.setBounds(200,200,50,50);
                        }
                        break;
                }
            }
        }
    }
    public void heroreload(){
        Herosetplace = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(gettime == 0) {
                    Heroplace.setIcon(hero[8]);
                    gettime++;
                }else{
                    Heroplace.setIcon(hero[way*2]);
                    timeron = false;
                    Herosetplace.stop();
                }
            }
        });
        gettime = 0;
        timeron = true;
        Herosetplace.start();
        if(Heroplace.getX() == bodyplace.getX()){
            if(Heroplace.getY() == bodyplace.getY()){
                switch (part){
                    case 0:
                        SBoxplace.setBounds(50,50,50,50);
                        break;
                    case 1:
                        SBoxplace.setBounds(400,400,50,50);
                        break;
                    case 2:
                        SBoxplace.setBounds(50,50,50,50);
                        break;
                    case 3:
                        SBoxplace.setBounds(400,150,50,50);
                        break;
                    case 4:
                        SBoxplace.setBounds(50,50,50,50);
                        break;
                }
                monsterP.add(SBoxplace);
                showSbox = true;
                bell();
            }
        }
    }
    //0:left , 1:up , 2:right , 3:down
    public void heroattack(){
        attacktime = 11;
        count = 2;
        firecount = 0;
        monsterP.add(fireplace);
        switch (way){
            case 0:
                Herosetplace = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(count > 0) {
                            Heroplace.setIcon(hero[attacktime]);
                            attacktime = 0;
                            count--;
                        }else{
                            timeron = false;
                            Herosetplace.stop();
                        }
                    }
                });
                explosion = new Timer(18, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(firecount < 58) {
                            fireplace.setIcon(fire[firecount]);
                            if(powerup){
                                fireplace.setBounds(Heroplace.getX() - 75, Heroplace.getY(), 50, 50);
                            }else {
                                fireplace.setBounds(Heroplace.getX() - 50, Heroplace.getY(), 50, 50);
                            }
                            firecount++;
                        }else{
                            monster_walk();
                            monster_attack();
                            monster_born();
                            monsterP.remove(fireplace);
                            explosion.stop();
                        }
                    }
                });
                timeron = true;
                Herosetplace.start();
                if(powerup){
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY()) {
                            if (depot.get(i).getX() == Heroplace.getX() - 50) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY()) {
                            if (depot.get(i).getX() == Heroplace.getX() - 100) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY()) {
                            if (depot.get(i).getX() == Heroplace.getX() - 50) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }
                explosion.start();
                break;
            case 1:
                Herosetplace = new Timer(400, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(count > 0) {
                            Heroplace.setIcon(hero[attacktime]);
                            attacktime = 2;
                            count--;
                        }else{
                            timeron = false;
                            Herosetplace.stop();
                        }
                    }
                });
                explosion = new Timer(18, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(firecount < 58) {
                            fireplace.setIcon(fire[firecount]);
                            if(powerup){
                                fireplace.setBounds(Heroplace.getX(), Heroplace.getY() - 75, 50, 50);
                            }else {
                                fireplace.setBounds(Heroplace.getX(), Heroplace.getY() - 50, 50, 50);
                            }
                            firecount++;
                        }else{
                            monster_walk();
                            monster_attack();
                            monster_born();
                            monsterP.remove(fireplace);
                            explosion.stop();
                        }
                    }
                });
                timeron = true;
                Herosetplace.start();
                if(powerup) {
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY() - 50) {
                            if (depot.get(i).getX() == Heroplace.getX()) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY() - 100) {
                            if (depot.get(i).getX() == Heroplace.getX()) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY() - 50) {
                            if (depot.get(i).getX() == Heroplace.getX()) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }
                explosion.start();
                break;
            case 2:
                Herosetplace = new Timer(400, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(count > 0) {
                            Heroplace.setIcon(hero[attacktime]);
                            attacktime = 4;
                            count--;
                        }else{
                            timeron = false;
                            Herosetplace.stop();
                        }
                    }
                });
                explosion = new Timer(18, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(firecount < 58) {
                            fireplace.setIcon(fire[firecount]);
                            if(powerup){
                                fireplace.setBounds(Heroplace.getX() + 75, Heroplace.getY(), 50, 50);
                            }else {
                                fireplace.setBounds(Heroplace.getX() + 50, Heroplace.getY(), 50, 50);
                            }
                            firecount++;
                        }else{
                            monster_walk();
                            monster_attack();
                            monster_born();
                            monsterP.remove(fireplace);
                            explosion.stop();
                        }
                    }
                });
                timeron = true;
                Herosetplace.start();
                if(powerup){
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY()) {
                            if (depot.get(i).getX() == Heroplace.getX() + 50) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY()) {
                            if (depot.get(i).getX() == Heroplace.getX() + 100) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY()) {
                            if (depot.get(i).getX() == Heroplace.getX() + 50) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }
                explosion.start();
                break;
            case 3:
                Herosetplace = new Timer(400, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(count > 0) {
                            Heroplace.setIcon(hero[attacktime]);
                            attacktime = 6;
                            count--;
                        }else{
                            timeron = false;
                            Herosetplace.stop();
                        }
                    }
                });
                explosion = new Timer(18, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(firecount < 58) {
                            fireplace.setIcon(fire[firecount]);
                            if(powerup){
                                fireplace.setBounds(Heroplace.getX(), Heroplace.getY() + 75, 50, 50);
                            }else {
                                fireplace.setBounds(Heroplace.getX(), Heroplace.getY() + 50, 50, 50);
                            }
                            firecount++;
                        }else{
                            monster_walk();
                            monster_attack();
                            monster_born();
                            monsterP.remove(fireplace);
                            explosion.stop();
                        }
                    }
                });
                timeron = true;
                Herosetplace.start();
                if(powerup){
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY() + 50) {
                            if (depot.get(i).getX() == Heroplace.getX()) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY() + 100) {
                            if (depot.get(i).getX() == Heroplace.getX()) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < monsternumber; i++) {
                        if (depot.get(i).getY() == Heroplace.getY() + 50) {
                            if (depot.get(i).getX() == Heroplace.getX()) {
                                monsterP.remove(depot.get(i));
                                depot.remove(i);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                }
                explosion.start();
                break;
        }
    }

    public void herowalk(){
        walk = 2;
        shadow.remove(dangerous);
        Herosetplace = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                walk--;
                heroX = Heroplace.getX();
                heroY = Heroplace.getY();
                if (way == 0) {
                    Heroplace.setIcon(hero[walk]);
                    Heroplace.setBounds(heroX - 25, heroY, 50, 50);
                    Black.setBounds(bx + Heroplace.getX(), by + Heroplace.getY(), 1200, 1200);
                    repaint();
                } else if (way == 3) {
                    Heroplace.setIcon(hero[walk + 6]);
                    Heroplace.setBounds(heroX, heroY + 25, 50, 50);
                    Black.setBounds(bx + Heroplace.getX(), by + Heroplace.getY(), 1200, 1200);
                    repaint();
                } else if (way == 2) {
                    Heroplace.setIcon(hero[walk + 4]);
                    Heroplace.setBounds(heroX + 25, heroY, 50, 50);
                    Black.setBounds(bx + Heroplace.getX(), by + Heroplace.getY(), 1200, 1200);
                    repaint();
                } else if (way == 1) {
                    Heroplace.setIcon(hero[walk + 2]);
                    Heroplace.setBounds(heroX, heroY - 25, 50, 50);
                    Black.setBounds(bx + Heroplace.getX(), by + Heroplace.getY(), 1200, 1200);
                    repaint();
                }
                if(walk == 0){
                    sans();
                    Herosetplace.stop();
                    timeron = false;
                    monster_attack();
                }
            }
        });
        timeron = true;
        Herosetplace.start();

    }

    public void start(){
        if(HPup){
          if(HP != 4){
              ShowItem.add(hpplace[HP]);
              HP++;
            }
        }else{
            if(HP != 2){
                ShowItem.add(hpplace[HP]);
                HP++;
            }
        }
        if(ammoup){
           ammo = 5;
            ShowItem.add(showammo[0]);
            ShowItem.add(showammo[1]);
            ShowItem.add(showammo[2]);
            ShowItem.add(showammo[3]);
            ShowItem.add(showammo[4]);
        }else{
            ammo = 3;
            ShowItem.add(showammo[0]);
            ShowItem.add(showammo[1]);
            ShowItem.add(showammo[2]);
        }
        if(viewup){
            gogogo.setImage(gogo);
            Black.setIcon(gogogo);
        }else{
            gogogo.setImage(gogoold);
            Black.setIcon(gogogo);
        }
        background.removeAll();
        monsterP.removeAll();
        depot.clear();
        background.add(Mreborn);
        background.add(Boxplace);
        background.add(ItemBar);
        background.add(exitplace);
        background.add(theKey);
        background.add(bodyplace);
        shadow.add(dangerous);
        Mreborn.setIcon(door[0]);
        exitplace.setIcon(exit[0]);
        SBoxplace.setIcon(box[10]);
        SBoxplace.setBounds(0,0,50,50);
        Black.setBounds(bx+Heroplace.getX(),by+Heroplace.getY(),1200,1200);
        monsternumber = 0;
        doorcount = 0;
        boxopen = false;
        nextstage = false;
        showSbox = false;
    }

    public void changingmap(){
        if(Heroplace.getX() == exitplace.getX()){
            if(Heroplace.getY() == exitplace.getY()){
                count = 0;
                dooropen = new Timer(400, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        exitplace.setIcon(exit[count]);
                        count++;
                        if(count == 4){
                            dooropen.stop();
                            timeron = false;
                            switch (part) {
                                case 0:
                                    part = 1;
                                    sec();
                                    repaint();
                                    break;
                                case 1:
                                    part = 2;
                                    third();
                                    repaint();
                                    break;
                                case 2:
                                    part = 3;
                                    forth();
                                    repaint();
                                    break;
                                case 3:
                                    part = 4;
                                    fifth();
                                    repaint();
                                    break;
                                case 4:
                                    if(!ammoup && !HPup && !viewup && !powerup && !sucide && bodyclean == 5){   //end1_money
                                        count = 0;
                                        formoney();
                                        formoney_music();
                                    }else if(!ammoup && !HPup && !viewup && !powerup && sucide){   //end2_heart
                                        count = 0;
                                        forlove();
                                        forlove_music();
                                    }else if(!ammoup && !HPup && !viewup && !powerup && !sucide){  //end3_lier
                                        count = 0;
                                        forlier();
                                        forlier_music();
                                    }else{                                                          //end4_honor
                                        count = 0;
                                        forhonor();
                                        forhonor_music();
                                    }
                                    break;
                            }
                        }
                    }
                });
                 indoor = new Timer(100, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        size--;
                        zoomin = hero[2].getImage().getScaledInstance(size,size,Image.SCALE_DEFAULT);
                        catchzoom.setImage(zoomin);
                        Heroplace.setIcon(catchzoom);
                        if(count == 3){
                            indoor.stop();
                        }
                    }
                });

                if(nextstage){
                    size = 50;
                    switch (part){
                        case 0:
                            size = 50;
                            timeron = true;
                                doorse();
                                dooropen.start();
                            walking();
                            indoor.start();
                            break;
                        case 1:
                            size = 50;
                            timeron = true;
                                doorse();
                                dooropen.start();
                            walking();
                            indoor.start();
                            break;
                        case 2:
                            size = 50;
                            timeron = true;
                                doorse();
                                dooropen.start();
                            walking();
                            indoor.start();
                            break;
                        case 3:
                            size = 50;
                            timeron = true;
                                doorse();
                                dooropen.start();
                            walking();
                            indoor.start();
                            break;
                        case 4:
                            size = 50;
                            timeron = true;
                                doorse();
                                dooropen.start();
                            walking();
                            indoor.start();
                            break;
                    }
                }
            }
        }
    }

    public void music_menu(){
            URL ur;
            ur = getClass().getResource("\\music\\BGM.wav");
            ac = Applet.newAudioClip(ur);

            ac.loop();
            ac.play();
    }

    public void forlove_music(){
        URL ur;
        ur = getClass().getResource("\\music\\forlove.wav");
        ac = Applet.newAudioClip(ur);

        ac.loop();
        ac.play();
    }

    public void forhonor_music(){
        URL ur;
        ur = getClass().getResource("\\music\\forhonor.wav");
        ac = Applet.newAudioClip(ur);

        ac.loop();
        ac.play();
    }

    public void forlier_music(){
        URL ur;
        ur = getClass().getResource("\\music\\forlier.wav");
        ac = Applet.newAudioClip(ur);

        ac.loop();
        ac.play();
    }

    public void fornothing_music(){
        URL ur;
        ur = getClass().getResource("\\music\\fornothing.wav");
        ac = Applet.newAudioClip(ur);

        ac.loop();
        ac.play();
    }

    public void formoney_music(){
        URL ur;
        ur = getClass().getResource("\\music\\formoney.wav");
        ac = Applet.newAudioClip(ur);

        ac.loop();
        ac.play();
    }

    public void music_game(){
            URL ur;
            ur = getClass().getResource("\\music\\BGM_menu.wav");
            ac = Applet.newAudioClip(ur);

            ac.loop();
            ac.play();
    }

    public void laugh(){
            URL ur;
            ur = getClass().getResource("\\music\\laugh.wav");
            se = Applet.newAudioClip(ur);

            se.play();
    }

    public void bell(){
            URL ur;
            ur = getClass().getResource("\\music\\Bell.wav");
            se = Applet.newAudioClip(ur);
            se.play();
    }

    public void doorse(){
            URL ur;
            ur = getClass().getResource("\\music\\door.wav");
            se = Applet.newAudioClip(ur);

            se.play();
    }

    public void walking(){
            URL ur;
            ur = getClass().getResource("\\music\\walk.wav");
            se = Applet.newAudioClip(ur);

            se.play();
    }

    public void monster_born(){
        if(doorcount == 8) {
            doorcount = 0;
            Mreborn.setIcon(door[doorcount]);
            doorcount++;
            depot.add(new Monster());
            monsternumber++;
            monsterX = Mreborn.getX();
            monsterY = Mreborn.getY();
            depot.get(depot.size() - 1).setBounds(monsterX,monsterY,50,50);
            monsterP.add(depot.get(depot.size() - 1));
        }else{
            if(doorcount%2 == 0) {
                Mreborn.setIcon(door[doorcount/2]);
            }
            doorcount++;
        }
        sans();
    }

    public void monster_walk(){
                for(int i = 0; i < monsternumber;i++){
                    if(depot.get(i).getY() > Heroplace.getY()){
                        depot.get(i).setBounds(depot.get(i).getX(),depot.get(i).getY()-50,50,50);
                    }else if(depot.get(i).getY() < Heroplace.getY()){
                        depot.get(i).setBounds(depot.get(i).getX(),depot.get(i).getY()+50,50,50);
                    }else if(depot.get(i).getY() == Heroplace.getY()){
                        if(depot.get(i).getX() > Heroplace.getX()){
                            depot.get(i).setBounds(depot.get(i).getX()-50,depot.get(i).getY(),50,50);
                        }else if(depot.get(i).getX() < Heroplace.getX()){
                            depot.get(i).setBounds(depot.get(i).getX()+50,depot.get(i).getY(),50,50);
                        }
                    }
                }
                sans();
            }
    public void sans(){
        shadow.add(dangerous);
        for(int i = 0; i < monsternumber;i++){
            if(Heroplace.getX() == depot.get(i).getX()-100 && Heroplace.getY() == depot.get(i).getY()){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getX() == depot.get(i).getX()+100 && Heroplace.getY() == depot.get(i).getY()){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getY() == depot.get(i).getY()+100 && Heroplace.getX() == depot.get(i).getX()){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getY() == depot.get(i).getY()-100 && Heroplace.getX() == depot.get(i).getX()){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getX() == depot.get(i).getX()-50 && Heroplace.getY() == depot.get(i).getY()-50){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getX() == depot.get(i).getX()-50 && Heroplace.getY() == depot.get(i).getY()+50){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getX() == depot.get(i).getX()+50 && Heroplace.getY() == depot.get(i).getY()-50){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else if(Heroplace.getX() == depot.get(i).getX()+50 && Heroplace.getY() == depot.get(i).getY()+50){
                dangerous.setBounds(Heroplace.getX(),Heroplace.getY()-30,50,50);
            }else{
                dangerous.setBounds(600,600,50,50);
            }
        }
        if(monsternumber == 0){
            dangerous.setBounds(600,600,50,50);
        }
    }


    public void monster_attack(){
        for(int i = 0; i < monsternumber;i++){
            if(depot.get(i).getY() == Heroplace.getY()) {
                if(depot.get(i).getX() == Heroplace.getX()){
                  HP--;
                  ShowItem.remove(hpplace[HP]);
                    for(int j = 0; j < monsternumber;j++) {
                        if (depot.get(j).getY() == Heroplace.getY()) {
                            if(depot.get(j).getX() == Heroplace.getX()){
                                monsterP.remove(depot.get(j));
                                depot.remove(j);
                                monsternumber--;
                                repaint();
                            }
                        }
                    }
                  if(HP == 0){
                      timeron = true;
                      deadend();
                  }
                }
            }
        }
    }

    public void herocount(){
        heroX = Heroplace.getX();
        heroY = Heroplace.getY();
        heroX = heroX /50;
        heroY = heroY /50;
    }

    public void deadend(){
        deadmovie[0] = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Heroplace.setBounds(screenw/2-25,screenh/2-count,50,50);
                Restart.setBounds(15,430,150,60);
                count -= 5;
                if(count == 25){
                    gettime = 0;
                    heroP.add(gameoverplace);
                    deadmovie[1].start();
                    deadmovie[0].stop();
                    repaint();
                }
            }
        });
        deadmovie[1] = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameoverplace.setIcon(gameover[gettime]);
                gettime++;
                if(gettime == 10){
                    deadmovie[1].stop();
                    heroP.add(Restart);
                    repaint();
                }
            }
        });
        ac.stop();
        Herosetplace.stop();
        count = 75;
        menu.removeAll();
        menu.add(heroP);
        for(int i = 0;i < 5;i++){
            keyimg.setImage(keyimgc);
            keyplace[i].setIcon(keyimg);
        }
        Heroplace.setBounds(screenw/2-25,screenh/2-count,50,50);
        menu.add(shadow);
        Heroplace.setIcon(hero[10]);
        gogogo.setImage(gogoold);
        Black.setIcon(gogogo);
        shadow.setBounds(0,0,screenw,screenh);
        Black.setBounds(0,0,screenw,screenh);
        deadmovie[0].start();
        repaint();
    }

    public void formoney(){
        read = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endstory.setText(endstory.getText()+readstory.charAt(count));
                count++;
                if(count == 129){
                    endshow.add(Restart);
                    repaint();
                    read.stop();
                }
            }
        });
        readstory = "你慢慢地走出來，拍了拍衣服上的灰塵，走到一個了" +"\n"+
                    "政府稽查人員的面前，面帶笑容的說著「裡面並沒有" +"\n"+
                    "會傷人的怪物，更不可能有什麼屍體，一切都是你們" +"\n"+
                    "想多了」。只見黑衣人搖了搖頭後便全數離去，而你" +"\n"+
                    "就一如往常的繼續做著生意。" +"\n"+
                    "地下城內依然不時地傳出那可怕的尖叫聲。";
        count = 0;
        ac.stop();
        menu.removeAll();
        menu.setBounds(w/2-450,h/2-450,800,800);
        this.setBounds(w/2-450,h/2-450,800,800);
        menu.add(endshow);
        menu.add(endback);
        endshow.add(endstory);
        endshow.add(endtitleplace);
        endshow.add(Restart);
        endshow.add(storyplace);
        endtitleplace.setIcon(endtitle[3]);
        storyplace.setIcon(story[4]);
        read.start();
        trueend = true;
        repaint();
    }

    public void forlove(){
        read = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endstory.setText(endstory.getText()+readstory.charAt(count));
                count++;
                if(count == 128){
                    endshow.add(Restart);
                    repaint();
                    read.stop();
                }
            }
        });
        readstory = "深夜的月光照亮在你的臉上，即便是這一抹微微的亮" +"\n"+
                    "光也讓你有些睜不開眼。一切都結束了，你走到了約" +"\n"+
                    "定的場所，緩緩地將藥倒進女子口中，當你默默地" +"\n"+
                    "祈禱著奇蹟的出現。剎那間，女孩咳嗽了幾下，輕輕" +"\n"+
                    "的叫了你的名字，你的眼眸滑下了淚珠。" +"\n"+
                    "這一瞬間，新的明天又開始了。";
        count = 0;
        ac.stop();
        menu.removeAll();
        menu.setBounds(w/2-450,h/2-450,800,800);
        this.setBounds(w/2-450,h/2-450,800,800);
        menu.add(endshow);
        menu.add(endback);
        endshow.add(endstory);
        endshow.add(endtitleplace);
        endshow.add(Restart);
        endshow.add(storyplace);
        endtitleplace.setIcon(endtitle[2]);
        storyplace.setIcon(story[3]);
        read.start();
        trueend = true;
        repaint();
    }

    public void fornothing(){
        read = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endstory.setText(endstory.getText()+readstory.charAt(count));
                count++;
                if(count == 148){
                    endshow.add(Restart);
                    repaint();
                    read.stop();
                }
            }
        });
        readstory = "你東奔西跑於地下城中在追求著些甚麼，「金錢」?" +"\n"+
                    "「名譽」?「認可」?你在探索的途中漸漸迷失了自己" +"\n"+
                    "，你甚至忘了你是誰，只為了在這地下城中找尋那" +"\n"+
                    "一絲不存在的希望。然而現實是殘酷的，當你自以為" +"\n"+
                    "握住了名為「希望」的事物時，你早已放棄掉許多你" +"\n"+
                    "本該擁有的幸福。"+"\n"+
                    "你喝下了「希望」，然而你有獲得救贖嗎?";

        count = 0;
        ac.stop();
        menu.removeAll();
        menu.setBounds(w/2-450,h/2-450,800,800);
        this.setBounds(w/2-450,h/2-450,800,800);
        menu.add(endshow);
        menu.add(endback);
        endshow.add(endstory);
        endshow.add(endtitleplace);
        endshow.add(Restart);
        endshow.add(storyplace);
        endtitleplace.setIcon(endtitle[4]);
        storyplace.setIcon(story[5]);
        read.start();
        trueend = true;
        repaint();
    }

    public void forlier(){
        read = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endstory.setText(endstory.getText()+readstory.charAt(count));
                count++;
                if(count == 125){
                    endshow.add(Restart);
                    repaint();
                    read.stop();
                }
            }
        });
        readstory = "你精疲力盡的全力跑向小鎮，並大聲地沿途喊到那地" +"\n"+
                    "下城有鬼，然而當你看見那先群眾的眼神時，你才發" +"\n"+
                    "覺並沒有半個人相信你。這時你瘋狂似的大吼大叫，" +"\n"+
                    "試圖證明那邊的危險，但依然沒有人相信，甚至有" +"\n"+
                    "人因為你的行為而朝你咒罵或毆打。" +"\n"+
                    "之後再也沒人聽過你的下落。";
        ac.stop();
        count = 0;
        menu.removeAll();
        menu.setBounds(w/2-450,h/2-450,800,800);
        this.setBounds(w/2-450,h/2-450,800,800);
        menu.add(endshow);
        menu.add(endback);
        endshow.add(endstory);
        endshow.add(endtitleplace);
        endshow.add(Restart);
        endshow.add(storyplace);
        endtitleplace.setIcon(endtitle[1]);
        storyplace.setIcon(story[2]);
        read.start();
        trueend = true;
        repaint();
    }

    public void forhonor(){
        read = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endstory.setText(endstory.getText()+readstory.charAt(count));
                count++;
                if(count == 114){
                    endshow.add(Restart);
                    repaint();
                    read.stop();
                }else if(count == 90){
                    storyplace.setIcon(story[1]);
                }
            }
        });
        readstory = "經歷了所有的困難，所有人見到你平安歸來，大家都" +"\n"+
                    "認可了你的勇氣與能力。當天晚上大家舉杯慶祝，你" +"\n"+
                    "卻提著那忐忑的心鼓起勇氣向喜歡的人告白，但不料" +"\n"+
                    "愛人與你的青梅竹馬在此時訂下婚約。"+"\n"+
                    "隔天早上青梅竹馬倒在自家地上，變成了冰冷的屍體。";
        ac.stop();
        menu.removeAll();
        endshow.removeAll();
        menu.setBounds(w/2-450,h/2-450,800,800);
        this.setBounds(w/2-450,h/2-450,800,800);
        count = 0;
        menu.add(endshow);
        menu.add(endback);
        endshow.add(endstory);
        endshow.add(endtitleplace);
        endshow.add(storyplace);
        endtitleplace.setIcon(endtitle[0]);
        storyplace.setIcon(story[0]);
        read.start();
        trueend = true;
        repaint();
    }


    class Game extends JPanel implements Runnable{
        private JButton Exit = new JButton("結束");
        public Game(){
            Exit.setBounds(0,0,100,100);
            this.add(Exit);
            this.setLayout(null);
        }

        public void run(){

        }
    }
    class Monster extends JLabel implements Runnable{
        private ImageIcon monsteri = new ImageIcon(getClass().getResource("\\img\\monster.png"));
        private Image monstero = monsteri.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
//        private JLabel monster = new JLabel(new ImageIcon(monstero));
        public Monster(){
            monsteri = new ImageIcon(monstero);
            setIcon(monsteri);
            setBounds(150,150,50,50);
        }
        public void run(){

        }
    }
}