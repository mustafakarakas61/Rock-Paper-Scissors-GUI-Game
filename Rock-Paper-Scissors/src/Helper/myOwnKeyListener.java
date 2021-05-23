package Helper;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myOwnKeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		 System.out.println("Key Pressed " + KeyEvent.getKeyText(e.getKeyCode()));
         if("Right".equals(KeyEvent.getKeyText(e.getKeyCode())))
            System.out.println("Right Button Detected");
        /* if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
            System.exit(0);		*/
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
