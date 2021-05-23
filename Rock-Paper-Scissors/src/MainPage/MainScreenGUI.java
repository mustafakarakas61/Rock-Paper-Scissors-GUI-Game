package MainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.myOwnKeyListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreenGUI extends JFrame {

	private JPanel contentPane;
	public static JLabel lbl_Left;
	public static JLabel lbl_Right;
	public static JLabel lbl_LeftScore;
	public static JLabel lbl_RightScore;
	public static JLabel lbl_Clean;
	public static JLabel lbl_Result;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreenGUI frame = new MainScreenGUI();
					myOwnKeyListener keyboard = new myOwnKeyListener();
					frame.addKeyListener(keyboard);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreenGUI() {
		setResizable(false);
		setTitle("Rock-Paper-Scissors");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 700, 600);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_1 = new JLabel("A :");
		lbl_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lbl_1.setBounds(20, 449, 46, 24);
		contentPane.add(lbl_1);

		JLabel lbl_2 = new JLabel("S :");
		lbl_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lbl_2.setBounds(24, 484, 46, 24);
		contentPane.add(lbl_2);

		JLabel lbl_3 = new JLabel("D :");
		lbl_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lbl_3.setBounds(20, 519, 46, 24);
		contentPane.add(lbl_3);

		ImageIcon imageIcon1 = new ImageIcon(MainScreenGUI.class.getResource("/Images/rockL.png"));
		Image newImage1 = imageIcon1.getImage();
		Image image1 = newImage1.getScaledInstance(46, 31, Image.SCALE_SMOOTH);

		JLabel lbl_Icon1 = new JLabel(new ImageIcon(image1));
		lbl_Icon1.setBounds(60, 449, 46, 31);
		contentPane.add(lbl_Icon1);

		ImageIcon imageIcon2 = new ImageIcon(MainScreenGUI.class.getResource("/Images/paperL.png"));
		Image newImage2 = imageIcon2.getImage();
		Image image2 = newImage2.getScaledInstance(46, 31, Image.SCALE_SMOOTH);

		JLabel lbl_Icon2 = new JLabel(new ImageIcon(image2));
		lbl_Icon2.setBounds(60, 484, 46, 31);
		contentPane.add(lbl_Icon2);

		ImageIcon imageIcon3 = new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsL.png"));
		Image newImage3 = imageIcon3.getImage();
		Image image3 = newImage3.getScaledInstance(46, 31, Image.SCALE_SMOOTH);

		JLabel lbl_Icon3 = new JLabel(new ImageIcon(image3));
		lbl_Icon3.setBounds(60, 519, 46, 31);
		contentPane.add(lbl_Icon3);

		JLabel lbl_4 = new JLabel(": J");
		lbl_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lbl_4.setBounds(637, 456, 46, 24);
		contentPane.add(lbl_4);

		JLabel lbl_5 = new JLabel(": K");
		lbl_5.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lbl_5.setBounds(637, 491, 46, 24);
		contentPane.add(lbl_5);

		JLabel lbl_6 = new JLabel(": L");
		lbl_6.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lbl_6.setBounds(638, 526, 46, 24);
		contentPane.add(lbl_6);

		ImageIcon imageIcon4 = new ImageIcon(MainScreenGUI.class.getResource("/Images/rockR.png"));
		Image newImage4 = imageIcon4.getImage();
		Image image4 = newImage4.getScaledInstance(46, 31, Image.SCALE_SMOOTH);

		JLabel lbl_Icon4 = new JLabel(new ImageIcon(image4));
		lbl_Icon4.setBounds(581, 449, 46, 31);
		contentPane.add(lbl_Icon4);

		ImageIcon imageIcon5 = new ImageIcon(MainScreenGUI.class.getResource("/Images/paperR.png"));
		Image newImage5 = imageIcon5.getImage();
		Image image5 = newImage5.getScaledInstance(46, 31, Image.SCALE_SMOOTH);

		JLabel lbl_Icon5 = new JLabel(new ImageIcon(image5));
		lbl_Icon5.setBounds(581, 484, 46, 31);
		contentPane.add(lbl_Icon5);

		ImageIcon imageIcon6 = new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsR.png"));
		Image newImage6 = imageIcon6.getImage();
		Image image6 = newImage6.getScaledInstance(46, 31, Image.SCALE_SMOOTH);

		JLabel lbl_Icon6 = new JLabel(new ImageIcon(image6));
		lbl_Icon6.setBounds(581, 519, 46, 31);
		contentPane.add(lbl_Icon6);

		JPanel w_pane = new JPanel();
		w_pane.setBackground(new Color(250, 250, 210));
		w_pane.setBounds(0, 0, 684, 438);
		contentPane.add(w_pane);
		w_pane.setLayout(null);

		lbl_Left = new JLabel("");
		lbl_Left.setBounds(10, 80, 308, 247);
		w_pane.add(lbl_Left);

		lbl_Right = new JLabel("");
		lbl_Right.setBounds(366, 80, 308, 247);
		w_pane.add(lbl_Right);
		
		lbl_Result = new JLabel("");
		lbl_Result.setBackground(new Color(211, 211, 211));
		lbl_Result.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Result.setForeground(new Color(0, 0, 0));
		lbl_Result.setFont(new Font("Tahoma", Font.BOLD, 60));
		lbl_Result.setBounds(10, 7, 664, 101);
		w_pane.add(lbl_Result);

		JLabel lbl_Duo = new JLabel(":");
		lbl_Duo.setFont(new Font("Tahoma", Font.BOLD, 50));
		lbl_Duo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Duo.setBounds(320, 456, 46, 87);
		contentPane.add(lbl_Duo);

		lbl_LeftScore = new JLabel("0");
		lbl_LeftScore.setForeground(new Color(255, 182, 193));
		lbl_LeftScore.setFont(new Font("Tahoma", Font.BOLD, 60));
		lbl_LeftScore.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_LeftScore.setBounds(158, 449, 131, 101);
		contentPane.add(lbl_LeftScore);

		lbl_RightScore = new JLabel("0");
		lbl_RightScore.setForeground(new Color(0, 255, 255));
		lbl_RightScore.setFont(new Font("Tahoma", Font.BOLD, 60));
		lbl_RightScore.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RightScore.setBounds(401, 449, 131, 101);
		contentPane.add(lbl_RightScore);

		JPanel w_paneRight = new JPanel();
		w_paneRight.setBackground(new Color(0, 139, 139));
		w_paneRight.setBounds(401, 449, 131, 101);
		contentPane.add(w_paneRight);

		JPanel w_paneLeft = new JPanel();
		w_paneLeft.setBackground(new Color(0, 139, 139));
		w_paneLeft.setBounds(158, 449, 131, 101);
		contentPane.add(w_paneLeft);
		
		lbl_Clean = new JLabel("Clean C");
		lbl_Clean.setForeground(new Color(138, 43, 226));
		lbl_Clean.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_Clean.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Clean.setBounds(299, 449, 92, 31);
		contentPane.add(lbl_Clean);
		
		JLabel lbl_Reset = new JLabel("Reset R");
		lbl_Reset.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Reset.setForeground(new Color(138, 43, 226));
		lbl_Reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_Reset.setBounds(299, 519, 92, 31);
		contentPane.add(lbl_Reset);
		/*
		JButton btn_Start = new JButton("Start");
		btn_Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Start.setForeground(new Color(60, 179, 113));
		btn_Start.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Start.setBounds(302, 449, 89, 23);
		contentPane.add(btn_Start);
		
		JButton btn_Exit = new JButton("Exit");
		btn_Exit.setForeground(new Color(255, 0, 0));
		btn_Exit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Exit.setBounds(302, 526, 89, 23);
		contentPane.add(btn_Exit);*/
		
		
	}
}
