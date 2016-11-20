import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class GameUI
extends JFrame
implements GameView {
    private JFrame frame;
    private JPanel contentPane;
    private ImageIcon imageIcon;
    private ImageIcon imageIcon1;
    private ImageIcon imageIcon2;
    JLabel label_00;
    JLabel label_01;
    JLabel label_02;
    JLabel label_03;
    JLabel label_04;
    JLabel label_05;
    JLabel label_06;
    JLabel label_10;
    JLabel label_11;
    JLabel label_12;
    JLabel label_13;
    JLabel label_14;
    JLabel label_15;
    JLabel label_16;
    JLabel label_20;
    JLabel label_21;
    JLabel label_22;
    JLabel label_23;
    JLabel label_24;
    JLabel label_25;
    JLabel label_26;
    JLabel label_30;
    JLabel label_31;
    JLabel label_32;
    JLabel label_33;
    JLabel label_34;
    JLabel label_35;
    JLabel label_36;
    JLabel label_40;
    JLabel label_41;
    JLabel label_42;
    JLabel label_43;
    JLabel label_44;
    JLabel label_45;
    JLabel label_46;
    JLabel label_50;
    JLabel label_51;
    JLabel label_52;
    JLabel label_53;
    JLabel label_54;
    JLabel label_55;
    JLabel label_56;
    private final int R = -1;
    private final int Y = 1;
    JButton btnToss1;
    JButton btnToss2;
    JButton btnToss3;
    JButton btnToss4;
    JButton btnToss5;
    JButton btnToss6;
    JButton btnToss7;
    JTextArea textArea_1;
    JTextArea textArea;
    private GamePresenter presenter;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

             
            public void run() {
                try {
                    int n = -1;
                    GamePresenter pr = new GamePresenter(new GameUI());
                    while (n == -1) {
                        Object[] options = new Object[]{"Easy", "Normal", "Hard"};
                        n = JOptionPane.showOptionDialog(null, "Choose Difficulty Level", "Difficulty Level", 1, 3, null, options, options[2]);
                        if (n == 0) {
                            pr.setDepth(1);
                            continue;
                        }
                        if (n == 1) {
                            pr.setDepth(3);
                            continue;
                        }
                        if (n != 2) continue;
                        pr.setDepth(5);
                    }
                    pr.start();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GameUI() {
        this.img_init();
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1244, 625);
        this.contentPane = new JPanel();
        this.contentPane.setForeground(Color.RED);
        this.contentPane.setBackground(Color.GRAY);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout(null);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(215, 64, 1013, 522);
        this.contentPane.add(panel);
        panel.setLayout(new GridLayout(0, 7, 0, 0));
        this.setResizable(false);
        this.label_00 = new JLabel(" ");
        this.label_00.setIcon(this.imageIcon);
        panel.add(this.label_00);
        this.label_01 = new JLabel(" ");
        this.label_01.setIcon(this.imageIcon);
        panel.add(this.label_01);
        this.label_02 = new JLabel(" ");
        this.label_02.setIcon(this.imageIcon);
        panel.add(this.label_02);
        this.label_03 = new JLabel(" ");
        this.label_03.setIcon(this.imageIcon);
        panel.add(this.label_03);
        this.label_04 = new JLabel(" ");
        this.label_04.setIcon(this.imageIcon);
        panel.add(this.label_04);
        this.label_05 = new JLabel("");
        this.label_05.setIcon(this.imageIcon);
        panel.add(this.label_05);
        this.label_06 = new JLabel("");
        this.label_06.setIcon(this.imageIcon);
        panel.add(this.label_06);
        this.label_10 = new JLabel("");
        this.label_10.setIcon(this.imageIcon);
        panel.add(this.label_10);
        this.label_11 = new JLabel("");
        this.label_11.setIcon(this.imageIcon);
        panel.add(this.label_11);
        this.label_12 = new JLabel("");
        this.label_12.setIcon(this.imageIcon);
        panel.add(this.label_12);
        this.label_13 = new JLabel("");
        this.label_13.setIcon(this.imageIcon);
        panel.add(this.label_13);
        this.label_14 = new JLabel("");
        this.label_14.setIcon(this.imageIcon);
        panel.add(this.label_14);
        this.label_15 = new JLabel("");
        this.label_15.setIcon(this.imageIcon);
        panel.add(this.label_15);
        this.label_16 = new JLabel("");
        this.label_16.setIcon(this.imageIcon);
        panel.add(this.label_16);
        this.label_20 = new JLabel("");
        this.label_20.setIcon(this.imageIcon);
        panel.add(this.label_20);
        this.label_21 = new JLabel("");
        this.label_21.setIcon(this.imageIcon);
        panel.add(this.label_21);
        this.label_22 = new JLabel("");
        this.label_22.setIcon(this.imageIcon);
        panel.add(this.label_22);
        this.label_23 = new JLabel("");
        this.label_23.setIcon(this.imageIcon);
        panel.add(this.label_23);
        this.label_24 = new JLabel("");
        this.label_24.setIcon(this.imageIcon);
        panel.add(this.label_24);
        this.label_25 = new JLabel(" ");
        this.label_25.setIcon(this.imageIcon);
        panel.add(this.label_25);
        this.label_26 = new JLabel(" ");
        this.label_26.setIcon(this.imageIcon);
        panel.add(this.label_26);
        this.label_30 = new JLabel("");
        this.label_30.setIcon(this.imageIcon);
        panel.add(this.label_30);
        this.label_31 = new JLabel("");
        this.label_31.setIcon(this.imageIcon);
        panel.add(this.label_31);
        this.label_32 = new JLabel("");
        this.label_32.setIcon(this.imageIcon);
        panel.add(this.label_32);
        this.label_33 = new JLabel("");
        this.label_33.setIcon(this.imageIcon);
        panel.add(this.label_33);
        this.label_34 = new JLabel("");
        this.label_34.setIcon(this.imageIcon);
        panel.add(this.label_34);
        this.label_35 = new JLabel("");
        this.label_35.setIcon(this.imageIcon);
        panel.add(this.label_35);
        this.label_36 = new JLabel("");
        this.label_36.setIcon(this.imageIcon);
        panel.add(this.label_36);
        this.label_40 = new JLabel("");
        this.label_40.setIcon(this.imageIcon);
        panel.add(this.label_40);
        this.label_41 = new JLabel("");
        this.label_41.setIcon(this.imageIcon);
        panel.add(this.label_41);
        this.label_42 = new JLabel("");
        this.label_42.setIcon(this.imageIcon);
        panel.add(this.label_42);
        this.label_43 = new JLabel("");
        this.label_43.setIcon(this.imageIcon);
        panel.add(this.label_43);
        this.label_44 = new JLabel("");
        this.label_44.setIcon(this.imageIcon);
        panel.add(this.label_44);
        this.label_45 = new JLabel("");
        this.label_45.setIcon(this.imageIcon);
        panel.add(this.label_45);
        this.label_46 = new JLabel("");
        this.label_46.setIcon(this.imageIcon);
        panel.add(this.label_46);
        this.label_50 = new JLabel("");
        this.label_50.setIcon(this.imageIcon);
        panel.add(this.label_50);
        this.label_51 = new JLabel("");
        this.label_51.setIcon(this.imageIcon);
        panel.add(this.label_51);
        this.label_52 = new JLabel("");
        this.label_52.setIcon(this.imageIcon);
        panel.add(this.label_52);
        this.label_53 = new JLabel("");
        this.label_53.setIcon(this.imageIcon);
        panel.add(this.label_53);
        this.label_54 = new JLabel("");
        this.label_54.setIcon(this.imageIcon);
        panel.add(this.label_54);
        this.label_55 = new JLabel("");
        this.label_55.setIcon(this.imageIcon);
        panel.add(this.label_55);
        this.label_56 = new JLabel("");
        this.label_56.setIcon(this.imageIcon);
        panel.add(this.label_56);
        JButton btnNewButton = new JButton("New Game");
        btnNewButton.setFont(new Font("Calibri", 1, 18));
        btnNewButton.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent arg0) {
                GameUI.this.initializeAll();
            }
        });
        btnNewButton.setBounds(52, 75, 132, 58);
        this.contentPane.add(btnNewButton);
        this.btnToss1 = new JButton("TOSS");
        this.btnToss1.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent arg0) {
                if (GameUI.this.presenter.getLevel(0) == 0) {
                    GameUI.this.btnToss1.setEnabled(false);
                } else {
                    GameUI.this.btnToss1.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(0), 0);
                GameUI.this.setRedIcon(0);
                GameUI.this.presenter.decreaseLevel(0);
                GameUI.this.presenter.changeTurn();
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                check = GameUI.this.presenter.check_winner();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss1.setBounds(219, 19, 89, 34);
        this.contentPane.add(this.btnToss1);
        this.btnToss2 = new JButton("TOSS");
        this.btnToss2.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent arg0) {
                if (GameUI.this.presenter.getLevel(1) == 0) {
                    GameUI.this.btnToss2.setEnabled(false);
                } else {
                    GameUI.this.btnToss2.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(1), 1);
                GameUI.this.setRedIcon(1);
                GameUI.this.presenter.decreaseLevel(1);
                GameUI.this.presenter.changeTurn();
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                check = GameUI.this.presenter.check_winner();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss2.setBounds(362, 19, 89, 34);
        this.contentPane.add(this.btnToss2);
        this.btnToss3 = new JButton("TOSS");
        this.btnToss3.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent arg0) {
                if (GameUI.this.presenter.getLevel(2) == 0) {
                    GameUI.this.btnToss3.setEnabled(false);
                } else {
                    GameUI.this.btnToss3.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(2), 2);
                GameUI.this.setRedIcon(2);
                GameUI.this.presenter.decreaseLevel(2);
                GameUI.this.presenter.changeTurn();
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                check = GameUI.this.presenter.check_winner();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss3.setBounds(503, 19, 89, 34);
        this.contentPane.add(this.btnToss3);
        this.btnToss4 = new JButton("TOSS");
        this.btnToss4.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent e) {
                if (GameUI.this.presenter.getLevel(3) == 0) {
                    GameUI.this.btnToss4.setEnabled(false);
                } else {
                    GameUI.this.btnToss4.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(3), 3);
                GameUI.this.setRedIcon(3);
                GameUI.this.presenter.decreaseLevel(3);
                GameUI.this.presenter.changeTurn();
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                check = GameUI.this.presenter.check_winner();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss4.setBounds(646, 19, 89, 34);
        this.contentPane.add(this.btnToss4);
        this.btnToss5 = new JButton("TOSS");
        this.btnToss5.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent e) {
                if (GameUI.this.presenter.getLevel(4) == 0) {
                    GameUI.this.btnToss5.setEnabled(false);
                } else {
                    GameUI.this.btnToss5.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(4), 4);
                GameUI.this.setRedIcon(4);
                GameUI.this.presenter.decreaseLevel(4);
                GameUI.this.presenter.changeTurn();
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                check = GameUI.this.presenter.check_winner();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss5.setBounds(786, 19, 89, 34);
        this.contentPane.add(this.btnToss5);
        this.btnToss6 = new JButton("TOSS");
        this.btnToss6.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent e) {
                if (GameUI.this.presenter.getLevel(5) == 0) {
                    GameUI.this.btnToss6.setEnabled(false);
                } else {
                    GameUI.this.btnToss6.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(5), 5);
                GameUI.this.setRedIcon(5);
                GameUI.this.presenter.decreaseLevel(5);
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                check = GameUI.this.presenter.check_winner();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss6.setBounds(934, 19, 89, 34);
        this.contentPane.add(this.btnToss6);
        this.btnToss7 = new JButton("TOSS");
        this.btnToss7.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent e) {
                if (GameUI.this.presenter.getLevel(6) == 0) {
                    GameUI.this.btnToss7.setEnabled(false);
                } else {
                    GameUI.this.btnToss7.setEnabled(true);
                }
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(6), 6);
                GameUI.this.setRedIcon(6);
                GameUI.this.presenter.decreaseLevel(6);
                GameUI.this.presenter.changeTurn();
                int check = GameUI.this.presenter.check_winner();
                if (check == -1) {
                    JOptionPane.showMessageDialog(null, "Red is the winner");
                    GameUI.this.presenter.userScorePlus();
                    GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                int yelcol = GameUI.this.presenter.Move();
                GameUI.this.setYellowIcon(yelcol);
                GameUI.this.presenter.setBoard(GameUI.this.presenter.getLevel(yelcol), yelcol);
                if (GameUI.this.presenter.checkIfFull(yelcol)) {
                    GameUI.this.disableBtn(yelcol);
                }
                GameUI.this.presenter.decreaseLevel(yelcol);
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Yellow is the winner");
                    GameUI.this.presenter.pcScorePlus();
                    GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
                    GameUI.this.initializeAll();
                    return;
                }
                GameUI.this.presenter.changeTurn();
            }
        });
        this.btnToss7.setBounds(1079, 19, 89, 34);
        this.contentPane.add(this.btnToss7);
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.BLACK);
        separator_1.setBackground(Color.GRAY);
        separator_1.setBounds(215, 62, 1013, 2);
        this.contentPane.add(separator_1);
        JSeparator separator_2 = new JSeparator();
        separator_2.setBackground(Color.GRAY);
        separator_2.setForeground(Color.BLACK);
        separator_2.setOrientation(1);
        separator_2.setBounds(214, 0, 2, 586);
        this.contentPane.add(separator_2);
        JTextArea txtrScore = new JTextArea();
        txtrScore.setForeground(Color.BLUE);
        txtrScore.setFont(new Font("Calibri", 1, 22));
        txtrScore.setEditable(false);
        txtrScore.setBackground(Color.GRAY);
        txtrScore.setText("Score");
        txtrScore.setBounds(88, 190, 74, 34);
        this.contentPane.add(txtrScore);
        JTextArea txtrUser = new JTextArea();
        txtrUser.setFont(new Font("Calibri", 1, 21));
        txtrUser.setEditable(false);
        txtrUser.setForeground(Color.BLACK);
        txtrUser.setText("User");
        txtrUser.setBackground(Color.GRAY);
        txtrUser.setBounds(34, 228, 47, 34);
        this.contentPane.add(txtrUser);
        JTextArea txtrComputer = new JTextArea();
        txtrComputer.setFont(new Font("Calibri", 1, 18));
        txtrComputer.setEditable(false);
        txtrComputer.setText("PC");
        txtrComputer.setForeground(Color.BLACK);
        txtrComputer.setBackground(Color.GRAY);
        txtrComputer.setBounds(166, 231, 28, 34);
        this.contentPane.add(txtrComputer);
        this.textArea = new JTextArea();
        this.textArea.setFont(new Font("Calibri", 1, 18));
        this.textArea.setEditable(false);
        this.textArea.setText(Integer.toString(0));
        this.textArea.setForeground(Color.BLACK);
        this.textArea.setBackground(Color.GRAY);
        this.textArea.setBounds(52, 273, 28, 27);
        this.contentPane.add(this.textArea);
        this.textArea_1 = new JTextArea();
        this.textArea_1.setFont(new Font("Calibri", 1, 18));
        this.textArea_1.setEditable(false);
        this.textArea_1.setText(Integer.toString(0));
        this.textArea_1.setForeground(Color.BLACK);
        this.textArea_1.setBackground(Color.GRAY);
        this.textArea_1.setBounds(166, 273, 18, 27);
        this.contentPane.add(this.textArea_1);
        JButton btnNewButton_1 = new JButton("Reset Score");
        btnNewButton_1.setFont(new Font("Calibri", 1, 18));
        btnNewButton_1.addActionListener(new ActionListener(){

             
            public void actionPerformed(ActionEvent arg0) {
                GameUI.this.presenter.resetScore();
                GameUI.this.textArea.setText(Integer.toString(GameUI.this.presenter.getUserScore()));
                GameUI.this.textArea_1.setText(Integer.toString(GameUI.this.presenter.getPcScore()));
            }
        });
        btnNewButton_1.setBounds(63, 333, 120, 64);
        this.contentPane.add(btnNewButton_1);
    }

     
    public void setPresenter(GamePresenter pr) {
        this.presenter = pr;
    }

     
    public void open() {
        this.setVisible(true);
    }

     
    public void close() {
        this.setVisible(false);
    }

     //paths
    public void img_init() {
        this.imageIcon = new ImageIcon("Icons/wc.gif");
        Image image = this.imageIcon.getImage();
        Image newimg = image.getScaledInstance(80, 80, 4);
        this.imageIcon = new ImageIcon(newimg);
        this.imageIcon1 = new ImageIcon("Icons/rc.gif");
        Image image_1 = this.imageIcon1.getImage();
        Image newimg_1 = image_1.getScaledInstance(80, 80, 4);
        this.imageIcon1 = new ImageIcon(newimg_1);
        this.imageIcon2 = new ImageIcon("Icons/yc.png");
        Image image_2 = this.imageIcon2.getImage();
        Image newimg_2 = image_2.getScaledInstance(80, 80, 4);
        this.imageIcon2 = new ImageIcon(newimg_2);
    }

     
    public void setRedIcon(int i) {
        if (i == 0) {
            if (this.presenter.getLevel(0) == 0) {
                this.label_00.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(0) == 1) {
                this.label_10.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(0) == 2) {
                this.label_20.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(0) == 3) {
                this.label_30.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(0) == 4) {
                this.label_40.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(0) == 5) {
                this.label_50.setIcon(this.imageIcon1);
            }
        }
        if (i == 1) {
            if (this.presenter.getLevel(1) == 0) {
                this.label_01.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(1) == 1) {
                this.label_11.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(1) == 2) {
                this.label_21.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(1) == 3) {
                this.label_31.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(1) == 4) {
                this.label_41.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(1) == 5) {
                this.label_51.setIcon(this.imageIcon1);
            }
        }
        if (i == 2) {
            if (this.presenter.getLevel(2) == 0) {
                this.label_02.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(2) == 1) {
                this.label_12.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(2) == 2) {
                this.label_22.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(2) == 3) {
                this.label_32.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(2) == 4) {
                this.label_42.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(2) == 5) {
                this.label_52.setIcon(this.imageIcon1);
            }
        }
        if (i == 3) {
            if (this.presenter.getLevel(3) == 0) {
                this.label_03.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(3) == 1) {
                this.label_13.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(3) == 2) {
                this.label_23.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(3) == 3) {
                this.label_33.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(3) == 4) {
                this.label_43.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(3) == 5) {
                this.label_53.setIcon(this.imageIcon1);
            }
        }
        if (i == 4) {
            if (this.presenter.getLevel(4) == 0) {
                this.label_04.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(4) == 1) {
                this.label_14.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(4) == 2) {
                this.label_24.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(4) == 3) {
                this.label_34.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(4) == 4) {
                this.label_44.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(4) == 5) {
                this.label_54.setIcon(this.imageIcon1);
            }
        }
        if (i == 5) {
            if (this.presenter.getLevel(5) == 0) {
                this.label_05.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(5) == 1) {
                this.label_15.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(5) == 2) {
                this.label_25.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(5) == 3) {
                this.label_35.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(5) == 4) {
                this.label_45.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(5) == 5) {
                this.label_55.setIcon(this.imageIcon1);
            }
        }
        if (i == 6) {
            if (this.presenter.getLevel(6) == 0) {
                this.label_06.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(6) == 1) {
                this.label_16.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(6) == 2) {
                this.label_26.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(6) == 3) {
                this.label_36.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(6) == 4) {
                this.label_46.setIcon(this.imageIcon1);
            }
            if (this.presenter.getLevel(6) == 5) {
                this.label_56.setIcon(this.imageIcon1);
            }
        }
    }

     
    public void setYellowIcon(int i) {
        if (i == 0) {
            if (this.presenter.getLevel(0) == 0) {
                this.label_00.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(0) == 1) {
                this.label_10.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(0) == 2) {
                this.label_20.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(0) == 3) {
                this.label_30.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(0) == 4) {
                this.label_40.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(0) == 5) {
                this.label_50.setIcon(this.imageIcon2);
            }
        }
        if (i == 1) {
            if (this.presenter.getLevel(1) == 0) {
                this.label_01.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(1) == 1) {
                this.label_11.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(1) == 2) {
                this.label_21.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(1) == 3) {
                this.label_31.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(1) == 4) {
                this.label_41.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(1) == 5) {
                this.label_51.setIcon(this.imageIcon2);
            }
        }
        if (i == 2) {
            if (this.presenter.getLevel(2) == 0) {
                this.label_02.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(2) == 1) {
                this.label_12.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(2) == 2) {
                this.label_22.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(2) == 3) {
                this.label_32.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(2) == 4) {
                this.label_42.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(2) == 5) {
                this.label_52.setIcon(this.imageIcon2);
            }
        }
        if (i == 3) {
            if (this.presenter.getLevel(3) == 0) {
                this.label_03.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(3) == 1) {
                this.label_13.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(3) == 2) {
                this.label_23.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(3) == 3) {
                this.label_33.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(3) == 4) {
                this.label_43.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(3) == 5) {
                this.label_53.setIcon(this.imageIcon2);
            }
        }
        if (i == 4) {
            if (this.presenter.getLevel(4) == 0) {
                this.label_04.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(4) == 1) {
                this.label_14.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(4) == 2) {
                this.label_24.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(4) == 3) {
                this.label_34.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(4) == 4) {
                this.label_44.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(4) == 5) {
                this.label_54.setIcon(this.imageIcon2);
            }
        }
        if (i == 5) {
            if (this.presenter.getLevel(5) == 0) {
                this.label_05.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(5) == 1) {
                this.label_15.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(5) == 2) {
                this.label_25.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(5) == 3) {
                this.label_35.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(5) == 4) {
                this.label_45.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(5) == 5) {
                this.label_55.setIcon(this.imageIcon2);
            }
        }
        if (i == 6) {
            if (this.presenter.getLevel(6) == 0) {
                this.label_06.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(6) == 1) {
                this.label_16.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(6) == 2) {
                this.label_26.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(6) == 3) {
                this.label_36.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(6) == 4) {
                this.label_46.setIcon(this.imageIcon2);
            }
            if (this.presenter.getLevel(6) == 5) {
                this.label_56.setIcon(this.imageIcon2);
            }
        }
    }

    private void initializeIcons() {
        this.label_00.setIcon(this.imageIcon);
        this.label_01.setIcon(this.imageIcon);
        this.label_02.setIcon(this.imageIcon);
        this.label_03.setIcon(this.imageIcon);
        this.label_04.setIcon(this.imageIcon);
        this.label_05.setIcon(this.imageIcon);
        this.label_06.setIcon(this.imageIcon);
        this.label_10.setIcon(this.imageIcon);
        this.label_11.setIcon(this.imageIcon);
        this.label_12.setIcon(this.imageIcon);
        this.label_13.setIcon(this.imageIcon);
        this.label_14.setIcon(this.imageIcon);
        this.label_15.setIcon(this.imageIcon);
        this.label_16.setIcon(this.imageIcon);
        this.label_20.setIcon(this.imageIcon);
        this.label_21.setIcon(this.imageIcon);
        this.label_22.setIcon(this.imageIcon);
        this.label_23.setIcon(this.imageIcon);
        this.label_24.setIcon(this.imageIcon);
        this.label_25.setIcon(this.imageIcon);
        this.label_26.setIcon(this.imageIcon);
        this.label_30.setIcon(this.imageIcon);
        this.label_31.setIcon(this.imageIcon);
        this.label_32.setIcon(this.imageIcon);
        this.label_33.setIcon(this.imageIcon);
        this.label_34.setIcon(this.imageIcon);
        this.label_35.setIcon(this.imageIcon);
        this.label_36.setIcon(this.imageIcon);
        this.label_40.setIcon(this.imageIcon);
        this.label_41.setIcon(this.imageIcon);
        this.label_42.setIcon(this.imageIcon);
        this.label_43.setIcon(this.imageIcon);
        this.label_44.setIcon(this.imageIcon);
        this.label_45.setIcon(this.imageIcon);
        this.label_46.setIcon(this.imageIcon);
        this.label_50.setIcon(this.imageIcon);
        this.label_51.setIcon(this.imageIcon);
        this.label_52.setIcon(this.imageIcon);
        this.label_53.setIcon(this.imageIcon);
        this.label_54.setIcon(this.imageIcon);
        this.label_55.setIcon(this.imageIcon);
        this.label_56.setIcon(this.imageIcon);
    }

    public void initializeAll() {
        this.presenter.newGame();
        this.initializeIcons();
        this.enableBtn();
    }

    public void enableBtn() {
        this.btnToss1.setEnabled(true);
        this.btnToss2.setEnabled(true);
        this.btnToss3.setEnabled(true);
        this.btnToss4.setEnabled(true);
        this.btnToss5.setEnabled(true);
        this.btnToss6.setEnabled(true);
        this.btnToss7.setEnabled(true);
    }

    public void disableBtn(int yelcol) {
        if (yelcol == 0) {
            this.btnToss1.setEnabled(false);
        }
        if (yelcol == 1) {
            this.btnToss2.setEnabled(false);
        }
        if (yelcol == 2) {
            this.btnToss3.setEnabled(false);
        }
        if (yelcol == 3) {
            this.btnToss4.setEnabled(false);
        }
        if (yelcol == 4) {
            this.btnToss5.setEnabled(false);
        }
        if (yelcol == 5) {
            this.btnToss6.setEnabled(false);
        }
        if (yelcol == 6) {
            this.btnToss7.setEnabled(false);
        }
    }

}

