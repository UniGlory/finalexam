package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class info extends JFrame {
    private Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int sw = ScreenSize.width, sh = ScreenSize.height;
    private Container cp;
    private JPanel jpc = new JPanel();
    private JPanel jp = new JPanel();
    private JButton next = new JButton();
    private JButton last = new JButton("\\img\\last.png");
    private JLabel jl1 = new JLabel();
    private JLabel jl2 = new JLabel();
    private JLabel jl3 = new JLabel();
    private JLabel jl4 = new JLabel();
    private JLabel jl5 = new JLabel();
    private JLabel jl6 = new JLabel();
    private JLabel jl7 = new JLabel();
    private JLabel jl8 = new JLabel();
    private JLabel jl9 = new JLabel();
    private JLabel jl10 = new JLabel();
    private JLabel jl11 = new JLabel();
    private JLabel jl12 = new JLabel();
    private JLabel jlbk = new JLabel();
    private JLabel jlbk1 = new JLabel();
    private ImageIcon move = new ImageIcon(getClass().getResource("\\img\\move.jpg"));
    private ImageIcon at = new ImageIcon(getClass().getResource("\\img\\at.jpg"));
    private ImageIcon act = new ImageIcon(getClass().getResource("\\img\\activate.jpg"));
    private ImageIcon reload = new ImageIcon(getClass().getResource("\\img\\reload.jpg"));
    private ImageIcon danger = new ImageIcon(getClass().getResource("\\img\\!.jpg"));
    private ImageIcon back = new ImageIcon(getClass().getResource("\\img\\paper.jpg"));
    private ImageIcon back1 = new ImageIcon(getClass().getResource("\\img\\wood.png"));
    private ImageIcon np = new ImageIcon(getClass().getResource("\\img\\nextpage.png"));
    private ImageIcon lt = new ImageIcon(getClass().getResource("\\img\\last.png"));
    private ImageIcon fb = new ImageIcon(getClass().getResource("\\img\\ammoup.png"));
    private ImageIcon hp = new ImageIcon(getClass().getResource("\\img\\HPup.png"));
    private ImageIcon tor = new ImageIcon(getClass().getResource("\\img\\torch.png"));
    private ImageIcon pd = new ImageIcon(getClass().getResource("\\img\\powder.png"));
    private ImageIcon posin = new ImageIcon(getClass().getResource("\\img\\poison.png"));
    private ImageIcon key = new ImageIcon(getClass().getResource("\\img\\key.png"));
    private ImageIcon g1 = new ImageIcon(getClass().getResource("\\img\\g1.png"));
    private ImageIcon md = new ImageIcon(getClass().getResource("\\img\\door_0.png"));
    private ImageIcon monster = new ImageIcon(getClass().getResource("\\img\\monster.png"));
    private ImageIcon db = new ImageIcon(getClass().getResource("\\img\\body1.png"));
    private ImageIcon et = new ImageIcon(getClass().getResource("\\img\\d1.png"));

    private int i = 0;

    public info(boolean a,boolean b){
        init(a,b);
    }
    public void init(boolean a,boolean b){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                page1();
                setVisible(false);
               i = 0;
            }
        });

        this.setBounds(sw/2, sh/2-350,700,700);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(null);
        cp.add(jpc);
        jpc.setSize(700,700);
        jpc.setLayout(null);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cp.removeAll();
                jpc.removeAll();
                jp.removeAll();
                jl1.removeAll();
                repaint();

                if (i == 0){
                    page2();
                    i = 1;
                    repaint();
                } else if (i == 1){
                    page3();
                    i = 2;
                    repaint();
                } else if (i == 2){
                    page4();
                    i = 3;
                    repaint();
                } else if (i == 3){
                    page5();
                    i = 4;
                    repaint();
                } else if (i == 4){
                    if(a || b) {
                        page6();
                        i = 5;
                        repaint();
                    }else{
                        page1();
                        i = 0;
                        repaint();
                    }
                } else if (i == 5){
                    page1();
                    i = 0;
                    repaint();
                }
            }
        });
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cp.removeAll();
                jpc.removeAll();
                jp.removeAll();
                jl1.removeAll();
                repaint();

                if (i == 0){
                    if(a || b) {
                        page6();
                        i = 5;
                        repaint();
                    }else{
                        page5();
                        i = 4;
                        repaint();
                    }
                } else if (i == 1){
                    page1();
                    i = 0;
                    repaint();
                } else if (i == 2){
                    page2();
                    i = 1;
                    repaint();
                } else if (i == 3){
                    page3();
                    i = 2;
                    repaint();
                } else if (i == 4){
                    page4();
                    i = 3;
                    repaint();
                } else if (i == 5){
                    page5();
                    i = 4;
                    repaint();
                }
            }
        });
        page1();
        repaint();
    }

    public void page1(){
        cp.add(jpc);
        cp.add(jp);
        jp.setBounds(0,0,700,700);
        jp.setSize(700,700);
        jp.setOpaque(false);
        jp.setLayout(null);
        jp.add(next);
        next.setBounds(600,615,70,35);
        next.setIcon(np);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorder(null);
        jp.add(last);
        last.setBounds(510,615,70,35);
        last.setIcon(lt);
        last.setOpaque(false);
        last.setContentAreaFilled(false);
        last.setBorder(null);
        jp.add(jlbk1);
        jlbk1.setIcon(back1);
        Image bk3 = back1.getImage();
        Image bk4 = bk3.getScaledInstance(700,700,Image.SCALE_AREA_AVERAGING);
        back1.setImage(bk4);
        jlbk1.setBounds(0,0,700,700);
        jpc.setBounds(40,30,550,600);
        jpc.setSize(550,580);
        jpc.setLayout(null);
        jpc.setOpaque(true);
        jpc.add(jl1);
        jl1.setForeground(Color.WHITE);
        jl1.setText("<html><body><p>移動:使用【方向鍵】可進行方向切換，<br>若方向一樣那將會往前走。</p></body></html>");
        jl1.setFont(new Font("標楷體",Font.BOLD,20));
        jl1.setBounds(125,0,700,50);
        jpc.add(jl2);
        jl2.setText("<html><body><p>攻擊:使用【空白鍵】可像前方一格進行爆炸<br>攻擊，會消耗一格專注。</p></body></html>");
        jl2.setForeground(Color.WHITE);
        jl2.setFont(new Font("標楷體",Font.BOLD,20));
        jl2.setBounds(125,120,700,50);
        jpc.add(jl3);
        jl3.setText("互動:使用【E】對物體進行互動。");
        jl3.setForeground(Color.WHITE);
        jl3.setFont(new Font("標楷體",Font.BOLD,20));
        jl3.setBounds(125,240,700,20);
        jpc.add(jl4);
        jl4.setText("<html><body><p>祈禱：讓人提振精神，替死者默哀，可提升<br>專注。</p></body></html>");
        jl4.setForeground(Color.WHITE);
        jl4.setFont(new Font("標楷體",Font.BOLD,20));
        jl4.setBounds(125,360,700,50);
        jpc.add(jl5);
        jl5.setText("<html><body><p>顯示危險：怪物在周圍時將會感知危險，<br>但有時候危險依舊會降臨。</p></body></html>");
        jl5.setForeground(Color.WHITE);
        jl5.setFont(new Font("標楷體",Font.BOLD,20));
        jl5.setBounds(125,480,700,50);
        jpc.add(jl6);
        jl6.setBounds(25,0,100,100);
        jl6.setIcon(move);
        jpc.add(jl7);
        jl7.setBounds(25,120,100,100);
        jl7.setIcon(at);
        jpc.add(jl8);
        jl8.setBounds(25,240,100,100);
        jl8.setIcon(act);
        jpc.add(jl9);
        jl9.setBounds(25,360,100,100);
        jl9.setIcon(reload);
        jpc.add(jl10);
        jl10.setBounds(25,480,100,100);
        jl10.setIcon(danger);

        Image bk1 = back.getImage();
        Image bk2 = bk1.getScaledInstance(600,600,Image.SCALE_SMOOTH);
        back.setImage(bk2);

        jpc.add(jlbk);
        jlbk.setBounds(0,0,600,600);
        jlbk.setIcon(back);

        Image ig1 = move.getImage();
        Image ig2 = ig1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        move.setImage(ig2);
        Image ig3 = at.getImage();
        Image ig4 = ig3.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        at.setImage(ig4);
        Image ig5 = act.getImage();
        Image ig6 = ig5.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        act.setImage(ig6);
        Image ig7 = danger.getImage();
        Image ig8 = ig7.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        danger.setImage(ig8);
        Image ig9 = reload.getImage();
        Image ig10 = ig9.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        reload.setImage(ig10);
        Image ig11 = np.getImage();
        Image ig12 = ig11.getScaledInstance(70,35,Image.SCALE_SMOOTH);
        np.setImage(ig12);

        Image ig13 = lt.getImage();
        Image ig14 = ig13.getScaledInstance(70,35,Image.SCALE_SMOOTH);
        lt.setImage(ig14);
    }
    public void page2(){
        cp.add(jpc);
        cp.add(jp);
        jp.setBounds(0,0,700,700);
        jp.setSize(700,700);
        jp.setOpaque(false);
        jp.setLayout(null);
        jp.add(next);
        next.setBounds(600,615,70,35);
        next.setIcon(np);
        next.setOpaque(false);
        next.setBorder(null);
        next.setContentAreaFilled(false);
        jp.add(last);
        last.setBounds(510,615,70,35);
        last.setIcon(lt);
        last.setOpaque(false);
        last.setContentAreaFilled(false);
        last.setBorder(null);
        jp.add(jlbk1);
        jlbk1.setIcon(back1);
        jlbk1.setBounds(0,0,700,700);
        jpc.setBounds(40,30,550,600);
        jpc.setSize(550,580);
        jpc.setLayout(null);
        jpc.setOpaque(true);
        jpc.add(jl1);
        jl1.setForeground(Color.WHITE);
        jl1.setText("<html><body><p>火焰瓶：看起來危險十足，但實際上是相當<br>溫暖的火焰，裡面似乎參了咖啡因?</p></body></html>");
        jl1.setFont(new Font("標楷體",Font.BOLD,20));
        jl1.setBounds(125,0,580,50);
        jpc.add(jl2);
        jl2.setText("<html><body><p>布甲：雖然不耐用，但至少還是能提供一層<br>防護。</p></body></html>");
        jl2.setForeground(Color.WHITE);
        jl2.setFont(new Font("標楷體",Font.BOLD,20));
        jl2.setBounds(125,100,580,50);
        jpc.add(jl3);
        jl3.setText("<html><body><p>火把：光！這是安全的保障！</p></body></html>");
        jl3.setForeground(Color.WHITE);
        jl3.setFont(new Font("標楷體",Font.BOLD,20));
        jl3.setBounds(125,200,580,50);
        jpc.add(jl4);
        jl4.setText("<html><body><p>火藥：讓爆炸威力更上一層，不知道這加到<br>火焰瓶內會發生甚麼事?</p></body></html>");
        jl4.setForeground(Color.WHITE);
        jl4.setFont(new Font("標楷體",Font.BOLD,20));
        jl4.setBounds(125,300,580,50);
        jpc.add(jl5);
        jl5.setText("<html><body><p>綠色液體：似乎是一種藥品，上面指示要<br>給對的人喝，否則會出事。按下<font color=maroon>【D】</font>可飲用</p></body></html>");
        jl5.setForeground(Color.WHITE);
        jl5.setFont(new Font("標楷體",Font.BOLD,20));
        jl5.setBounds(125,400,580,50);
        jpc.add(jl11);
        jl11.setText("<html><body><p>鑰匙：骷髏頭裝飾品的鑰匙，跟這個地下層<br>風格相當符合，似乎有其他版本?</p></body></html>");
        jl11.setForeground(Color.WHITE);
        jl11.setFont(new Font("標楷體",Font.BOLD,20));
        jl11.setBounds(125,500,580,50);
        jpc.add(jl6);
        jl6.setBounds(25,0,50,50);
        jl6.setIcon(fb);
        jpc.add(jl7);
        jl7.setBounds(25,100,50,50);
        jl7.setIcon(hp);
        jpc.add(jl8);
        jl8.setBounds(25,200,50,50);
        jl8.setIcon(tor);
        jpc.add(jl9);
        jl9.setBounds(25,300,50,50);
        jl9.setIcon(pd);
        jpc.add(jl10);
        jl10.setBounds(25,400,50,50);
        jl10.setIcon(posin);
        jpc.add(jl12);
        jl12.setBounds(25,500,50,50);
        jl12.setIcon(key);


        Image bk1 = back.getImage();
        Image bk2 = bk1.getScaledInstance(600,600,Image.SCALE_SMOOTH);
        back.setImage(bk2);

        jpc.add(jlbk);
        jlbk.setBounds(0,0,600,600);
        jlbk.setIcon(back);

        Image ig1 = fb.getImage();
        Image ig2 = ig1.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        fb.setImage(ig2);
        Image ig3 = hp.getImage();
        Image ig4 = ig3.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        hp.setImage(ig4);
        Image ig5 = tor.getImage();
        Image ig6 = ig5.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        tor.setImage(ig6);
        Image ig7 = pd.getImage();
        Image ig8 = ig7.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        pd.setImage(ig8);
        Image ig9 = posin.getImage();
        Image ig10 = ig9.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        posin.setImage(ig10);
        Image ig11 = key.getImage();
        Image ig12 = ig11.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        key.setImage(ig12);

    }
    public void page3(){
        cp.add(jpc);
        cp.add(jp);
        jp.setBounds(0,0,700,700);
        jp.setSize(700,700);
        jp.setOpaque(false);
        jp.setLayout(null);
        jp.add(next);
        next.setBounds(600,615,70,35);
        next.setIcon(np);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorder(null);
        jp.add(last);
        last.setBounds(510,615,70,35);
        last.setIcon(lt);
        last.setOpaque(false);
        last.setContentAreaFilled(false);
        last.setBorder(null);
        jp.add(jlbk1);
        jlbk1.setIcon(back1);
        Image bk3 = back1.getImage();
        Image bk4 = bk3.getScaledInstance(700,700,Image.SCALE_AREA_AVERAGING);
        back1.setImage(bk4);
        jlbk1.setBounds(0,0,700,700);
        jpc.setBounds(40,30,550,600);
        jpc.setSize(550,580);
        jpc.setLayout(null);
        jpc.setOpaque(true);
        jpc.add(jl1);
        jl1.setForeground(Color.WHITE);
        jl1.setText("<html><body><p>寶箱：各種稀奇的道具，能夠提升你部分<br>的能力。</p></body></html>");
        jl1.setFont(new Font("標楷體",Font.BOLD,20));
        jl1.setBounds(125,0,700,50);
        jpc.add(jl2);
        jl2.setText("<html><body><p>怪物重生點：跑出怪物的地方。門大開時<br>請自己小心。</p></body></html>");
        jl2.setForeground(Color.WHITE);
        jl2.setFont(new Font("標楷體",Font.BOLD,20));
        jl2.setBounds(125,120,700,50);
        jpc.add(jl3);
        jl3.setText("<html><body><p>怪物：幽靈骷髏。對地下城內會活動的<br>東西有反應，但似乎對原地打轉沒輒?</p></body></html>");
        jl3.setForeground(Color.WHITE);
        jl3.setFont(new Font("標楷體",Font.BOLD,20));
        jl3.setBounds(125,240,700,50);
        jpc.add(jl4);
        jl4.setText("<html><body><p>屍體：地下城內遇害的人。不知道當初下來的<br>原因是為何...</p></body></html>");
        jl4.setForeground(Color.WHITE);
        jl4.setFont(new Font("標楷體",Font.BOLD,20));
        jl4.setBounds(125,360,700,50);
        jpc.add(jl5);
        jl5.setText("<html><body><p>門：似乎有魔法加固過的門，<br>要用蠻力打開...你有肌肉嗎?。</p></body></html>");
        jl5.setForeground(Color.WHITE);
        jl5.setFont(new Font("標楷體",Font.BOLD,20));
        jl5.setBounds(125,480,700,50);
        jpc.add(jl6);
        jl6.setBounds(25,0,100,100);
        jl6.setIcon(g1);
        jpc.add(jl7);
        jl7.setBounds(25,120,100,100);
        jl7.setIcon(md);
        jpc.add(jl8);
        jl8.setBounds(25,240,100,100);
        jl8.setIcon(monster);
        jpc.add(jl9);
        jl9.setBounds(25,360,100,100);
        jl9.setIcon(db);
        jpc.add(jl10);
        jl10.setBounds(25,480,100,100);
        jl10.setIcon(et);
        jpc.add(jlbk);
        jlbk.setBounds(0,0,600,600);
        jlbk.setIcon(back);

        Image ig1 = g1.getImage();
        Image ig2 = ig1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        g1.setImage(ig2);
        Image ig3 = md.getImage();
        Image ig4 = ig3.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        md.setImage(ig4);
        Image ig5 = monster.getImage();
        Image ig6 = ig5.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        monster.setImage(ig6);
        Image ig7 = db.getImage();
        Image ig8 = ig7.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        db.setImage(ig8);
        Image ig9 = et.getImage();
        Image ig10 = ig9.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        et.setImage(ig10);
    }
    public void page4(){
        cp.add(jpc);
        cp.add(jp);
        jp.setBounds(0,0,700,700);
        jp.setSize(700,700);
        jp.setOpaque(false);
        jp.setLayout(null);
        jp.add(next);
        next.setBounds(600,615,70,35);
        next.setIcon(np);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorder(null);
        jp.add(last);
        last.setBounds(510,615,70,35);
        last.setIcon(lt);
        last.setOpaque(false);
        last.setContentAreaFilled(false);
        last.setBorder(null);
        jp.add(jlbk1);
        jlbk1.setIcon(back1);
        Image bk3 = back1.getImage();
        Image bk4 = bk3.getScaledInstance(700,700,Image.SCALE_AREA_AVERAGING);
        back1.setImage(bk4);
        jlbk1.setBounds(0,0,700,700);
        jpc.setBounds(40,30,550,600);
        jpc.setSize(550,580);
        jpc.setLayout(null);
        jpc.setOpaque(true);
        jpc.add(jl1);
        jl1.setForeground(Color.WHITE);
        jl1.setText("<html><body><p>從前鎮外就有一個灰灰暗暗的入口，<br><br>鎮內的人多多少少都對這個地方避而不談，<br><br>但總是會有些人為了追求<font color=maroon>【期望】</font>而下去地下城。<br><br> 如今你意外清醒於地下城內的地板，<br><br>記不清楚到底發生了些什麼事情，<br><br>你依靠著火焰魔法保衛自己開始了你的探索。<br><br>那麼年輕人，你是來尋求<font color=maroon>【金錢】</font>、<font color=maroon>【愛情】</font>、<font color=maroon>【勇氣】</font>、<br><br><font color=maroon>【榮耀】</font>亦或者你只來追求一次<font color=maroon>冒險</font>。無論如何，希望你<br><br>能在此地找到你的<font color=maroon>【希望】</font>。</p></body></html>");
        jl1.setFont(new Font("標楷體",Font.BOLD,20));
        jl1.setBounds(0,0,700,450);
        jpc.add(jlbk);
        jlbk.setBounds(0,0,600,600);
        jlbk.setIcon(back);
    }
    public void page5(){
        cp.add(jpc);
        cp.add(jp);
        jp.setBounds(0,0,700,700);
        jp.setSize(700,700);
        jp.setOpaque(false);
        jp.setLayout(null);
        jp.add(next);
        next.setFont(new Font("標楷體",Font.BOLD,15));
        next.setBounds(600,615,70,35);
        next.setIcon(np);
        next.setOpaque(false);
        next.setBorder(null);
        next.setContentAreaFilled(false);
        jp.add(last);
        last.setBounds(510,615,70,35);
        last.setIcon(lt);
        last.setOpaque(false);
        last.setContentAreaFilled(false);
        last.setBorder(null);
        jp.add(jlbk1);
        jlbk1.setIcon(back1);
        jlbk1.setBounds(0,0,700,700);
        jpc.setBounds(40,30,550,600);
        jpc.setSize(550,580);
        jpc.setLayout(null);
        jpc.setOpaque(true);
        jpc.add(jl1);
        jl1.setForeground(Color.WHITE);
        jl1.setText("<html><body><p>1.搶快永遠沒好處，慢慢來。</p></body></html>");
        jl1.setFont(new Font("標楷體",Font.BOLD,20));
        jl1.setBounds(0,0,580,50);
        jpc.add(jl2);
        jl2.setText("<html><body><p>2.警覺會在怪物離你有點近(2格)的時候觸發，肉眼看的到<br>(1格)就不會觸發。</p></body></html>");
        jl2.setForeground(Color.WHITE);
        jl2.setFont(new Font("標楷體",Font.BOLD,20));
        jl2.setBounds(0,100,580,50);
        jpc.add(jl3);
        jl3.setText("<html><body><p>3.當專注是滿的時候，祈禱並不會發動。</p></body></html>");
        jl3.setForeground(Color.WHITE);
        jl3.setFont(new Font("標楷體",Font.BOLD,20));
        jl3.setBounds(0,200,580,50);
        jpc.add(jl4);
        jl4.setText("<html><body><p>4.每到下一層，你的<font color=maroon>HP</font>會恢復1，專注會恢復滿。</p></body></html>");
        jl4.setForeground(Color.WHITE);
        jl4.setFont(new Font("標楷體",Font.BOLD,20));
        jl4.setBounds(0,300,580,50);
        jpc.add(jl5);
        jl5.setText("<html><body><p>5.寶箱或許不只一個，就像一件事能有很多不同的版本。</p></body></html>");
        jl5.setForeground(Color.WHITE);
        jl5.setFont(new Font("標楷體",Font.BOLD,20));
        jl5.setBounds(0,400,580,50);
        jpc.add(jlbk);
        jlbk.setBounds(0,0,600,600);
        jlbk.setIcon(back);
    }
    public void page6(){
        cp.add(jpc);
        cp.add(jp);
        jp.setBounds(0,0,700,700);
        jp.setSize(700,700);
        jp.setOpaque(false);
        jp.setLayout(null);
        jp.add(next);
        next.setBounds(600,615,70,35);
        next.setIcon(np);
        next.setOpaque(false);
        next.setBorder(null);
        next.setContentAreaFilled(false);
        jp.add(last);
        last.setBounds(510,615,70,35);
        last.setIcon(lt);
        last.setOpaque(false);
        last.setContentAreaFilled(false);
        last.setBorder(null);
        jp.add(jlbk1);
        jlbk1.setIcon(back1);
        jlbk1.setBounds(0,0,700,700);
        jpc.setBounds(40,30,550,600);
        jpc.setSize(550,580);
        jpc.setLayout(null);
        jpc.setOpaque(true);
        jpc.add(jl1);
        jl1.setForeground(Color.WHITE);
        jl1.setText("<html><body><p>成就1：早知道...<br><font color=maroon>喝下綠色液體</font></p></body></html>");
        jl1.setFont(new Font("標楷體",Font.BOLD,20));
        jl1.setBounds(0,0,580,50);
        jpc.add(jl2);
        jl2.setText("<html><body><p>成就2：有光就有影<br><font color=maroon>成功逃出</font>地下城。</p></body></html>");
        jl2.setForeground(Color.WHITE);
        jl2.setFont(new Font("標楷體",Font.BOLD,20));
        jl2.setBounds(0,100,580,50);
        jpc.add(jl3);
        jl3.setText("<html><body><p>成就3：以貌取人<br>逃出地下城<font color=maroon>不帶任何東西</font></p></body></html>");
        jl3.setForeground(Color.WHITE);
        jl3.setFont(new Font("標楷體",Font.BOLD,20));
        jl3.setBounds(0,200,580,50);
        jpc.add(jl4);
        jl4.setText("<html><body><p>成就4：金錢至上<br>清除每個<font color=maroon>屍體</font>且不拿任何<font color=maroon>道具</font>並<font color=maroon>逃出</font>地下城</p></body></html>");
        jl4.setForeground(Color.WHITE);
        jl4.setFont(new Font("標楷體",Font.BOLD,20));
        jl4.setBounds(0,300,580,50);
        jpc.add(jl5);
        jl5.setText("<html><body><p>成就5：新的開始<br><font color=maroon>只拿</font>綠色液體逃出地下城</p></body></html>");
        jl5.setForeground(Color.WHITE);
        jl5.setFont(new Font("標楷體",Font.BOLD,20));
        jl5.setBounds(0,400,580,50);
        jpc.add(jlbk);
        jlbk.setBounds(0,0,600,600);
        jlbk.setIcon(back);

    }
}

