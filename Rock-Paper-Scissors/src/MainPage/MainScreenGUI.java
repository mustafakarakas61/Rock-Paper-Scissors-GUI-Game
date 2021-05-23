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

import javax.swing.Icon;
import java.awt.Color;

public class MainScreenGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreenGUI frame = new MainScreenGUI();
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
		setTitle("Rock-Paper-Scissors");
		
		JLabel lbl_Icon1;
		JLabel lbl_Icon2;
		JLabel lbl_Icon3;
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 700, 600);
		contentPane = new JPanel();
		myOwnKeyListener keyboard = new myOwnKeyListener();
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
		
		ImageIcon imageIcon1= new ImageIcon(MainScreenGUI.class.getResource("/Images/rockL.png"));
		Image newImage1 = imageIcon1.getImage();
		Image image1= newImage1.getScaledInstance(46, 31, Image.SCALE_SMOOTH);
		
		lbl_Icon1 = new JLabel(new ImageIcon(image1));
		lbl_Icon1.setBounds(60, 449, 46, 31);
		contentPane.add(lbl_Icon1);
		
		ImageIcon imageIcon2= new ImageIcon(MainScreenGUI.class.getResource("/Images/paperL.png"));
		Image newImage2=imageIcon2.getImage();
		Image image2= newImage2.getScaledInstance(46, 31, Image.SCALE_SMOOTH);
		
		lbl_Icon2 = new JLabel(new ImageIcon(image2));
		lbl_Icon2.setBounds(60, 484, 46, 31);
		contentPane.add(lbl_Icon2);
		

		ImageIcon imageIcon3= new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsL.png"));
		Image newImage3=imageIcon3.getImage();
		Image image3= newImage3.getScaledInstance(46, 31, Image.SCALE_SMOOTH);
		
		lbl_Icon3 = new JLabel(new ImageIcon(image3));
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
		
		ImageIcon imageIcon4= new ImageIcon(MainScreenGUI.class.getResource("/Images/rockR.png"));
		Image newImage4 = imageIcon4.getImage();
		Image image4= newImage4.getScaledInstance(46, 31, Image.SCALE_SMOOTH);
		
		JLabel lbl_Icon4 = new JLabel(new ImageIcon(image4));
		lbl_Icon4.setBounds(581, 449, 46, 31);
		contentPane.add(lbl_Icon4);
		
		ImageIcon imageIcon5= new ImageIcon(MainScreenGUI.class.getResource("/Images/paperR.png"));
		Image newImage5 = imageIcon5.getImage();
		Image image5= newImage5.getScaledInstance(46, 31, Image.SCALE_SMOOTH);
		
		
		JLabel lbl_Icon5 = new JLabel(new ImageIcon(image5));
		lbl_Icon5.setBounds(581, 484, 46, 31);
		contentPane.add(lbl_Icon5);
		
		ImageIcon imageIcon6= new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsR.png"));
		Image newImage6 = imageIcon6.getImage();
		Image image6= newImage6.getScaledInstance(46, 31, Image.SCALE_SMOOTH);
		
		JLabel lbl_Icon6 = new JLabel(new ImageIcon(image6));
		lbl_Icon6.setBounds(581, 519, 46, 31);
		contentPane.add(lbl_Icon6);
		
		JPanel w_pane = new JPanel();
		w_pane.setBackground(new Color(255, 255, 255));
		w_pane.setBounds(0, 0, 684, 438);
		contentPane.add(w_pane);
		w_pane.setLayout(null);
		
		JLabel lbl_Left = new JLabel("");
		lbl_Left.setBounds(10, 80, 308, 247);
		w_pane.add(lbl_Left);
		
		JLabel lbl_right = new JLabel("");
		lbl_right.setBounds(366, 80, 308, 247);
		w_pane.add(lbl_right);
	
		contentPane.addKeyListener(keyboard);
		
	/*	lbl_Left.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='A' || e.getKeyChar()=='a')
			{
				System.out.println("sa");
				ImageIcon imageIconL= new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsR.png"));
				Image newImageL = imageIconL.getImage();
				Image imageL= newImageL.getScaledInstance(308,247, Image.SCALE_SMOOTH);
				lbl_Left.setIcon(new ImageIcon(imageL));
			}
			
			
			super.keyPressed(e);
		}
		
		});*/
		
		
	}
}
