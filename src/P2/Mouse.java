/**
 * 
 */
package P2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Mouse extends JFrame implements MouseListener{
	boolean mouseClick;
	public Mouse() {
		addMouseListener(this);
		mouseClick = false;
	}
	public void mouseClicked(MouseEvent e) {
		// マウスのボタンがクリックされた
		switch ( e.getButton() ) {
		case MouseEvent.BUTTON1:
			mouseClick = true;
			//System.out.println("左クリック");
			break;
		case MouseEvent.BUTTON2:
			//System.out.println("ホイールクリック");
			break;
		case MouseEvent.BUTTON3:
			//System.out.println("右クリック");
			break;
		}
 
		//System.out.println("クリック座標"+e.getPoint());
	}
}
