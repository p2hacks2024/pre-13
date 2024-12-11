package P2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Display extends JFrame implements ActionListener {
	boolean startFrag=false;
	int currentSlideIndex = 1; // 現在のスライドインデックス
	JButton sButton;
	JLabel titleLabel;
	JLabel slideLabel[]=new JLabel[9] ;
	JPanel titlePanel, buttonPanel,slidePanel;
	FlowLayout layout1, layout2;
	ImageIcon title,chef,refrigerator,kinu1,kinu2,momen1,momen2;
	ImageIcon slide[] = new ImageIcon[9];
	CardLayout scene;
	Display() {

		// ウィンドウの設定
		JFrame frame = new JFrame("豆腐rash!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);     
		//        backPanel = new JPanel();
		//        backPanel.setBackground(Color.BLACK);
		// タイトル画像の読み込み
		title = new ImageIcon(getClass().getResource("/toufurash.png")); // 画像の読み込み（リソースパス）
		for(int i=1;i<9;i++) {
			slide[i] = new ImageIcon(getClass().getResource("/スライド"+i+".JPG"));
		}
		// レイアウトとパネルの設定
		layout1 = new FlowLayout(FlowLayout.CENTER, 0, 100);
		layout2 = new FlowLayout(FlowLayout.CENTER, 0, 100);

		buttonPanel = new JPanel(layout1);
		titlePanel = new JPanel(layout2);
		slidePanel = new JPanel();
		// タイトルラベルを追加
		titleLabel = new JLabel(title);
		titlePanel.add(titleLabel);
		//説明スライドパネルを追加
		for(int i = 8;i>0;i--) {
			slideLabel[i] = new JLabel(slide[i]);
			slidePanel.add(slideLabel[i]);
			slideLabel[i].setVisible(false);
		}

		slidePanel.setVisible(false);
		// ボタンの設定
		sButton = new JButton("start");
		sButton.setPreferredSize(new Dimension(200, 150)); // ボタンサイズを指定
		sButton.addActionListener(this);
		buttonPanel.add(sButton);

		// フレームにパネルを追加
		// frame.add(backPanel);
		frame.add(titlePanel, BorderLayout.NORTH); // タイトルパネルを北に配置
		frame.add(buttonPanel, BorderLayout.SOUTH); // ボタンパネルを南に配置
		frame.add(slidePanel,BorderLayout.CENTER);
		// フレームの表示
		frame.setVisible(true);
		slidePanel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            if (startFrag) {
	                slideLabel[currentSlideIndex].setVisible(false); // 現在のスライドを非表示
	                currentSlideIndex++;
	                if (currentSlideIndex > 8) {
	                   
	                }
	                slideLabel[currentSlideIndex].setVisible(true); // 次のスライドを表示
	            }
	        }
	    });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sButton) {
			titlePanel.setVisible(false);
			sButton.setVisible(false);
			slidePanel.setVisible(true);
			startFrag = true;
			slideLabel[1].setVisible(true);
		}
	}


	
}
