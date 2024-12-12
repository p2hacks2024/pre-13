
package P2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
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
	boolean vsFrag = false;
	int fheight,fwidth;
	int currentSlideIndex = 1; // 現在のスライドインデックス
	JButton sButton;
	JLabel titleLabel;
	JLabel slideLabel[]=new JLabel[9] ;
	JLabel myTofuLabel[] = new JLabel[5];
	JLabel enTofuLabel[] = new JLabel[5];
	JLabel guzaiLabel[] = new JLabel[100];
	JLabel refrigerator[] = new JLabel[2];
	JLabel chefLabel,myGageLabel,enGageLabel,tableLabel,myBackGageLabel,enBackGageLabel,myGageFrameLabel,enGageFrameLabel,kinuLabel,momenLabel,gamingLabel,tamagoLabel;
	JPanel titlePanel, buttonPanel,slidePanel,vsPanel,scenePanel,tofuPanel;
	FlowLayout layout1, layout2;
	ImageIcon title,chef,table,cRefrigerator,oRefrigerator,myGageFrame,enGageFrame,backGage,kinu,momen,tamago,gaming;
	ImageIcon slide[] = new ImageIcon[9];
	CardLayout scene;
	Display() {
		fheight = 720;fwidth =1280 ;
		// ウィンドウの設定
		JFrame frame = new JFrame("豆腐rash!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(fwidth, fheight);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);     
		//        backPanel = new JPanel();
		//        backPanel.setBackground(Color.BLACK);
		// 画像の読み込み
		title = new ImageIcon(getClass().getResource("/toufurash.png")); // 画像の読み込み（リソースパス）
		for(int i=1;i<9;i++) {
			slide[i] = new ImageIcon(getClass().getResource("/スライド"+i+".JPG"));
		}
		chef = new ImageIcon(getClass().getResource("/chef.png")); // 画像の読み込み（リソースパス）
		cRefrigerator = new ImageIcon(getClass().getResource("/cRefrigerator.png")); // 画像の読み込み（リソースパス）
		oRefrigerator = new ImageIcon(getClass().getResource("/oRefrigerator.png")); // 画像の読み込み（リソースパス）
		table = new ImageIcon(getClass().getResource("/table.png")); // 画像の読み込み（リソースパス）
		backGage = new ImageIcon(getClass().getResource("/backgage.png")); // 画像の読み込み（リソースパス）
		myGageFrame = new ImageIcon(getClass().getResource("/mygageframe.png")); // 画像の読み込み（リソースパス）
		enGageFrame = new ImageIcon(getClass().getResource("/engageframe.png")); // 画像の読み込み（リソースパス）
		kinu = new ImageIcon(getClass().getResource("/kinu.png")); // 画像の読み込み（リソースパス）
		momen= new ImageIcon(getClass().getResource("/momen.png")); // 画像の読み込み（リソースパス）
		gaming = new ImageIcon(getClass().getResource("/gamingtofu.png")); // 画像の読み込み（リソースパス）
		tamago= new ImageIcon(getClass().getResource("/tamagotofu.png")); // 画像の読み込み（リソースパス）
		// レイアウトとパネルの設定
		layout1 = new FlowLayout(FlowLayout.CENTER, 0, 100);

		buttonPanel = new JPanel(layout1);
		titlePanel = new JPanel(layout1);
		slidePanel = new JPanel();
		vsPanel = new JPanel();
		tofuPanel = new JPanel(new GridLayout(1,5,-50,0));
		vsPanel.setLayout(null);
		// タイトルラベルを追加
		titleLabel = new JLabel(heightResizeImage(title,fheight/3));
		titlePanel.add(titleLabel);
		//説明スライドパネルを追加
		for(int i = 8;i>0;i--) {
			slideLabel[i] = new JLabel(slide[i]);
			slidePanel.add(slideLabel[i]);
			slideLabel[i].setVisible(false);
		}

		slidePanel.setVisible(false);
		vsPanel.setVisible(true);
		titlePanel.setVisible(false);
		buttonPanel.setVisible(false);
		tofuPanel.setOpaque(false); // 背景を透明にする
		//ラベルに画像を挿入
		chefLabel = new JLabel(heightResizeImage(chef,fheight/3+30));
		refrigerator[0] = new JLabel(heightResizeImage(cRefrigerator,3*fheight/5));
		refrigerator[1] = new JLabel(heightResizeImage(oRefrigerator,3*fheight/5));
		tableLabel = new JLabel(widthResizeImage(table,fwidth+250));
		myBackGageLabel= new JLabel(heightResizeImage(backGage,9*fheight/10));
		enBackGageLabel= new JLabel(heightResizeImage(backGage,8*fheight/10));
		myGageFrameLabel= new JLabel(heightResizeImage(myGageFrame,9*fheight/10));
		enGageFrameLabel= new JLabel(heightResizeImage(enGageFrame,8*fheight/10));
		kinuLabel = new JLabel(heightResizeImage(kinu,150));
		momenLabel = new JLabel(heightResizeImage(momen,150));
		gamingLabel = new JLabel(heightResizeImage(gaming,150));
		tamagoLabel = new JLabel(heightResizeImage(tamago,150));
		//画像の場所調整
		tofuPanel.setBounds(100,500,290,150);
		vsPanel.setBounds(0, 0, 1920, 1080); // x, y, 幅, 高さ
		chefLabel.setBounds(-150, -900, chef.getIconWidth(), chef.getIconHeight()); // x, y, 幅, 高さ
		refrigerator[0].setBounds(0, -600, cRefrigerator.getIconWidth(),cRefrigerator.getIconHeight() );
		refrigerator[1].setBounds(0, -600, oRefrigerator.getIconWidth(),oRefrigerator.getIconHeight() );
		tableLabel.setBounds(0,30,fwidth,fheight);
		myGageFrameLabel.setBounds(-670,-800,backGage.getIconWidth(),backGage.getIconHeight());
		enGageFrameLabel.setBounds(-450,-1100,backGage.getIconWidth(),backGage.getIconHeight());
		myBackGageLabel.setBounds(-670,-800,backGage.getIconWidth(),backGage.getIconHeight());
		enBackGageLabel.setBounds(-450,-1100,backGage.getIconWidth(),backGage.getIconHeight());
		//		enGageLabel = new JLabel(eGage);
		//		myGageLabel= new JLabel(myGage);

		//		refrigerator[1] = new JLabel(oRefrigerator);
		//対戦画面にラベルを貼る
		vsPanel.add(tofuPanel);
		tofuPanel.add(kinuLabel);
		tofuPanel.add(momenLabel);
		tofuPanel.add(gamingLabel);
		tofuPanel.add(tamagoLabel);
		vsPanel.add(myBackGageLabel);
		vsPanel.add(enBackGageLabel);
		vsPanel.add(myGageFrameLabel);
		vsPanel.add(enGageFrameLabel);
		vsPanel.add(tableLabel);
		vsPanel.add(chefLabel);
//		vsPanel.setBackground(Color.BLUE);
		//		titlePanel.setBackground(Color.RED);
		//		buttonPanel.setBackground(Color.GREEN);
		//		slidePanel.setBackground(Color.YELLOW);
		//		vsPanel.add(enGageLabel);
		//		vsPanel.add(myGageLabel);
		vsPanel.add(refrigerator[1]);
		vsPanel.add(refrigerator[0]);


		refrigerator[1].setVisible(false);
		//		for(int i = 0;i<myTofuLabel.length;i++) {
		//			
		//		}

		// ボタンの設定
		sButton = new JButton("start");
		sButton.setPreferredSize(new Dimension(200, 150)); // ボタンサイズを指定
		sButton.addActionListener(this);
		buttonPanel.add(sButton);
		// パネルをシーンに追加

		//すべてのパネルをレイアウトに追加
		//		scenePanel = new JPanel();
		//		scene = new CardLayout();
		//		scenePanel.setLayout(scene);
		//		scenePanel.add(buttonPanel,"start");
		//		scenePanel.add(titlePanel,"start");
		//		scenePanel.add(slidePanel,"info");
		//		scenePanel.add(vsPanel,"battle");
		//		.setActionCommand("start");
		//		.setActionCommand("info");
		//		.setActionCommand("battle");
		// フレームにパネルを追加
		// frame.add(backPanel);
		frame.add(titlePanel, BorderLayout.NORTH); // タイトルパネルを北に配置
		frame.add(buttonPanel, BorderLayout.SOUTH); // ボタンパネルを南に配置
		
		frame.add(vsPanel);
		frame.add(slidePanel,BorderLayout.CENTER);
		// フレームの表示
		frame.setVisible(true);

		slidePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (startFrag) {
					slideLabel[currentSlideIndex].setVisible(false); // 現在のスライドを非表示
					currentSlideIndex++;
					//System.out.println(currentSlideIndex);
					if (currentSlideIndex > 8) {
						currentSlideIndex = 1; // スライドを最初に戻す
						slidePanel.setVisible(false); // スライドパネルを非表示

						vsFrag = true; // vsFrag を true に設定
						vsPanel.setVisible(true); // vsPanel を表示
						chefLabel.setVisible(true);
						// 再描画を強制
						vsPanel.revalidate();
						vsPanel.repaint();
					} else {

						slideLabel[currentSlideIndex].setVisible(true); // 次のスライドを表示
					}
				}
			}
		});
		//		vsPanel.addMouseListener(new MouseAdapter() {
		//			public void mouseClicked(MouseEvent e) {
		//				
		//			}
		//		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sButton) {
			titlePanel.setVisible(false);
			buttonPanel.setVisible(false);
			slidePanel.setVisible(true);
			startFrag = true;
			slideLabel[1].setVisible(true);
		}
		if(vsFrag = true) {}
	}
	public ImageIcon  widthResizeImage(ImageIcon i,int x){
		int originalWidth = i.getIconWidth();
		int originalHeight = i.getIconHeight();
		int targetWidth = x;
		int targetHeight = (int) ((double) targetWidth / originalWidth * originalHeight);
		Image originalImage = i.getImage();
		Image resizedImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		return resizedIcon;
	}	
	public ImageIcon  heightResizeImage(ImageIcon i,int y){
		int originalWidth = i.getIconWidth();
		int originalHeight = i.getIconHeight();
		int targetHeight = y;
		int targetWidth = (int) ((double) targetHeight / originalHeight * originalWidth);
		Image originalImage = i.getImage();
		Image resizedImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		return resizedIcon;
	}
}
//=======
//public class Display {
//	
//>>>>>>> 0593dd9b5a2d769d9c21c6e6c7c57f02ff47edc8
//}
