package MainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		JLabel lblNewLabel;
		setTitle("Welcome to this game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 409, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_Start = new JButton("Start");
		btn_Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreenGUI msGUI = new MainScreenGUI();
				dispose();
				msGUI.setVisible(true);
			}
		});
		btn_Start.setBackground(new Color(173, 216, 230));
		btn_Start.setFont(new Font("Times New Roman", Font.BOLD, 31));
		btn_Start.setBounds(48, 172, 131, 52);
		contentPane.add(btn_Start);

		JButton btn_Exit = new JButton("Exit");
		btn_Exit.setBackground(new Color(220, 20, 60));
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_Exit.setFont(new Font("Times New Roman", Font.BOLD, 31));
		btn_Exit.setBounds(209, 172, 131, 52);
		contentPane.add(btn_Exit);

		ImageIcon imageIcon = new ImageIcon(LoginGUI.class.getResource("/Images/background.png"));
		Image image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(244,150, Image.SCALE_SMOOTH);

		lblNewLabel = new JLabel(new ImageIcon(newImage));
		lblNewLabel.setBounds(72, 11, 244, 150);
		contentPane.add(lblNewLabel);
	}
}
