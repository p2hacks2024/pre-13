/*
package P2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
public class Display extends JFrame implements ActionListener{
	JButton sButton;
	JLabel titleLabel;
	CardLayout layout;
	ImageIcon title = new ImageIcon("toufurash.png");//タイトルロゴ
	int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	Display(){
		this.setSize(1920,1080);//windowの大きさ
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) { //windowが閉じたらプログラムが停まる処理
				System.exit(0);
			}
		});
		getContentPane().setLayout(new BorderLayout());//windowの初期化
		//スタートボタン表示
		JPanel bottomPane = new JPanel();
		JPanel topPane = new JPanel();
		bottomPane.setLayout(new BoxLayout(bottomPane, BoxLayout.PAGE_AXIS));
		bottomPane.setPreferredSize(new Dimension(400, 200));
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		//画像表示用ラベル
		JLabel label1 = new JLabel(title);
		topPane.add(label1);
		//スタートボタン
		sButton = new JButton("Play");
		sButton.setSize(80, 30);
		sButton.addActionListener(this);
        //レイアウトパネル
		layout = new CardLayout();
        panel.setLayout(layout);
        //
		bottomPane.add(panel);
		panel.add(sButton);
		add(topPane,BorderLayout.CENTER);
		this.getContentPane().add(bottomPane, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        layout.show(cardPanel, cmd);
    }


}
*/