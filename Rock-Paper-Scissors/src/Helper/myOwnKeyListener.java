package Helper;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

import MainPage.MainScreenGUI;
import jdk.jfr.Timespan;

public class myOwnKeyListener implements KeyListener {

	boolean A = false;
	boolean S = false;
	boolean D = false;
	boolean J = false;
	boolean K = false;
	boolean L = false;
	boolean start = true;
	static CountDownLatch latch = new CountDownLatch(3);

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		/*
		 * for(int i = 3;i>=0;i--) { try { TimeUnit.SECONDS.sleep(1); } catch
		 * (InterruptedException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); } }
		 */
		if (start) {

			if (e.getKeyChar() == 'A' || e.getKeyChar() == 'a') {
				ImageIcon imageIconL = new ImageIcon(MainScreenGUI.class.getResource("/Images/rockL.png"));
				Image newImageL = imageIconL.getImage();
				Image imageL = newImageL.getScaledInstance(308, 247, Image.SCALE_SMOOTH);
				MainScreenGUI.lbl_Left.setIcon(new ImageIcon(imageL));
			}

			if (e.getKeyChar() == 'J' || e.getKeyChar() == 'j') {
				ImageIcon imageIconR = new ImageIcon(MainScreenGUI.class.getResource("/Images/rockR.png"));
				Image newImageR = imageIconR.getImage();
				Image imageR = newImageR.getScaledInstance(308, 247, Image.SCALE_SMOOTH);
				MainScreenGUI.lbl_Right.setIcon(new ImageIcon(imageR));
			}

			if (e.getKeyChar() == 'S' || e.getKeyChar() == 's') {
				ImageIcon imageIconL = new ImageIcon(MainScreenGUI.class.getResource("/Images/paperL.png"));
				Image newImageL = imageIconL.getImage();
				Image imageL = newImageL.getScaledInstance(308, 247, Image.SCALE_SMOOTH);
				MainScreenGUI.lbl_Left.setIcon(new ImageIcon(imageL));
			}

			if (e.getKeyChar() == 'K' || e.getKeyChar() == 'k') {
				ImageIcon imageIconR = new ImageIcon(MainScreenGUI.class.getResource("/Images/paperR.png"));
				Image newImageR = imageIconR.getImage();
				Image imageR = newImageR.getScaledInstance(308, 247, Image.SCALE_SMOOTH);
				MainScreenGUI.lbl_Right.setIcon(new ImageIcon(imageR));
			}

			if (e.getKeyChar() == 'D' || e.getKeyChar() == 'd') {
				ImageIcon imageIconL = new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsL.png"));
				Image newImageL = imageIconL.getImage();
				Image imageL = newImageL.getScaledInstance(308, 247, Image.SCALE_SMOOTH);
				MainScreenGUI.lbl_Left.setIcon(new ImageIcon(imageL));
			}

			if (e.getKeyChar() == 'L' || e.getKeyChar() == 'l') {
				ImageIcon imageIconR = new ImageIcon(MainScreenGUI.class.getResource("/Images/scissorsR.png"));
				Image newImageR = imageIconR.getImage();
				Image imageR = newImageR.getScaledInstance(308, 247, Image.SCALE_SMOOTH);
				MainScreenGUI.lbl_Right.setIcon(new ImageIcon(imageR));
			}
			// Score <<<<<<<<<<<<<
			/*
			 * LEFT PRESS TO KEY RIGHT PRESS TO KEY (e.getKeyChar() == 'A' || e.getKeyChar()
			 * == 'a') Rock (e.getKeyChar() == 'J' || e.getKeyChar() == 'j')
			 * 
			 * (e.getKeyChar() == 'S' || e.getKeyChar() == 's') Paper (e.getKeyChar() == 'K'
			 * || e.getKeyChar() == 'k')
			 * 
			 * (e.getKeyChar() == 'D' || e.getKeyChar() == 'd') Scissors (e.getKeyChar() ==
			 * 'L' || e.getKeyChar() == 'l')
			 * 
			 *
			 * Rock > Scissors Scissors > Paper Paper > Rock
			 */

			if ((e.getKeyChar() == 'A' || e.getKeyChar() == 'a')) {
				A = true;
				S = false;
				D = false;

			}
			if ((e.getKeyChar() == 'S' || e.getKeyChar() == 's')) {
				S = true;
				A = false;
				D = false;
			}
			if ((e.getKeyChar() == 'D' || e.getKeyChar() == 'd')) {
				D = true;
				A = false;
				S = false;
			}
			if ((e.getKeyChar() == 'J' || e.getKeyChar() == 'j')) {
				J = true;
				K = false;
				L = false;
			}
			if ((e.getKeyChar() == 'K' || e.getKeyChar() == 'k')) {
				K = true;
				J = false;
				L = false;
			}
			if ((e.getKeyChar() == 'L' || e.getKeyChar() == 'l')) {
				L = true;
				K = false;
				J = false;
			}
			// Left Win
			if (A && L) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int score = Integer.parseInt(MainScreenGUI.lbl_LeftScore.getText());
				MainScreenGUI.lbl_Result.setText("Pink Win!");
				score = score + 1;
				MainScreenGUI.lbl_LeftScore.setText(score + "");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			if (S && J) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int score = Integer.parseInt(MainScreenGUI.lbl_LeftScore.getText());
				MainScreenGUI.lbl_Result.setText("Pink Win!");
				score = score + 1;
				MainScreenGUI.lbl_LeftScore.setText(score + "");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			if (D && K) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int score = Integer.parseInt(MainScreenGUI.lbl_LeftScore.getText());
				MainScreenGUI.lbl_Result.setText("Pink Win!");
				score = score + 1;
				MainScreenGUI.lbl_LeftScore.setText(score + "");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			// Right Win
			if (J && D) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int score = Integer.parseInt(MainScreenGUI.lbl_RightScore.getText());
				MainScreenGUI.lbl_Result.setText("Blue Win!");
				score = score + 1;
				MainScreenGUI.lbl_RightScore.setText(score + "");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			if (K && A) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int score = Integer.parseInt(MainScreenGUI.lbl_RightScore.getText());
				MainScreenGUI.lbl_Result.setText("Blue Win!");
				score = score + 1;
				MainScreenGUI.lbl_RightScore.setText(score + "");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			if (L && S) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int score = Integer.parseInt(MainScreenGUI.lbl_RightScore.getText());
				MainScreenGUI.lbl_Result.setText("Blue Win!");
				score = score + 1;
				MainScreenGUI.lbl_RightScore.setText(score + "");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;

				start = false;
			}
			// Draw
			if (A && J) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				MainScreenGUI.lbl_Result.setText("DRAW");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			if (S && K) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				MainScreenGUI.lbl_Result.setText("DRAW");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}
			if (D && L) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				MainScreenGUI.lbl_Result.setText("DRAW");
				A = false;
				S = false;
				D = false;
				J = false;
				K = false;
				L = false;
				start = false;
			}

		}
		if (e.getKeyChar() == KeyEvent.VK_C || e.getKeyChar() == 'c') {
			start = true;
			A = false;
			S = false;
			D = false;
			J = false;
			K = false;
			L = false;
			MainScreenGUI.lbl_Left.setIcon(null);
			MainScreenGUI.lbl_Right.setIcon(null);
			MainScreenGUI.lbl_Result.setText("");
		}
		if (e.getKeyChar() == KeyEvent.VK_R || e.getKeyChar() == 'r') {
			start = true;
			A = false;
			S = false;
			D = false;
			J = false;
			K = false;
			L = false;
			MainScreenGUI.lbl_Left.setIcon(null);
			MainScreenGUI.lbl_Right.setIcon(null);
			MainScreenGUI.lbl_LeftScore.setText("0");
			MainScreenGUI.lbl_RightScore.setText("0");
			MainScreenGUI.lbl_Result.setText("");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
