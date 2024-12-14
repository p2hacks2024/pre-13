
package P2;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
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
	boolean tofuChengeFlag = true;
	int fheight,fwidth;
	int currentSlideIndex = 1; // 現在のスライドインデックス
	JButton sButton,ryoriButton,ryoriCancelButton;
	JLabel titleLabel;
	JLabel slideLabel[]=new JLabel[9] ;
	JLabel recipeLabel[] = new JLabel[7];
	JLabel myTofuLabel[] = new JLabel[5];
	JLabel enTofuLabel[] = new JLabel[5];
	JLabel myGuzaiLabel[] = new JLabel[8];
	JLabel enGuzaiLabel[] = new JLabel[8];
	JLabel ryoriLabel[] = new JLabel[14];
	JLabel refrigerator[] = new JLabel[2];
	JLabel chefLabel,myGageLabel,enGageLabel,tableLabel,myBackGageLabel,enBackGageLabel,myGageFrameLabel,enGageFrameLabel,backgroundLabel,recipeBLabel,chefaseLabel,syobuLabel,chefeatLabel,chefeatryoriLabel,ikasamaLabel,onokosiLabel,winLabel,loseLabel;
	JPanel titlePanel, buttonPanel,slidePanel;
	static JPanel vsPanel;
	JPanel scenePanel;
	JPanel myTofuPanel;
	JPanel enTofuPanel;
	JPanel myGuzaiPanel;
	JPanel enGuzaiPanel;
	JPanel recipePanel;
	JPanel recipeBPanel;
	JPanel ryoriPanel;
	JPanel backryoriPanel;
	JPanel eatryoriPanel;
	JPanel ikasamaPanel;
	JPanel resultPanel;
	FlowLayout layout1, layout2;
	ImageIcon title,chef,chefase,table,cRefrigerator,oRefrigerator,myGageFrame,enGageFrame,backGage,kinu,momen,tamago,gaming,background,
	soysauce,miso,negi,niku,dasi,karami,hamono,konsai,recipeB,myGage,enGage,syobuB,eatChef;
	ImageIcon slide[] = new ImageIcon[9];
	ImageIcon recipe[] = new ImageIcon[7];
	ImageIcon ryori[] = new ImageIcon[14];
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
		for(int i=1;i<7;i++) {
			recipe[i] = new ImageIcon(getClass().getResource("/レシピ"+i+".JPG"));
		}

		chef = new ImageIcon(getClass().getResource("/chef.png")); // 画像の読み込み（リソースパス）
		chefase = new ImageIcon(getClass().getResource("/chefase.png")); // 画像の読み込み（リソースパス）
		eatChef= new ImageIcon(getClass().getResource("/chefeat.png")); // 画像の読み込み（リソースパス）
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
		background = new ImageIcon(getClass().getResource("/background.png")); // 画像の読み込み（リソースパス）
		soysauce= new ImageIcon(getClass().getResource("/soysauce.png")); // 画像の読み込み（リソースパス）
		miso = new ImageIcon(getClass().getResource("/miso.png")); // 画像の読み込み（リソースパス）
		negi = new ImageIcon(getClass().getResource("/negi.png")); // 画像の読み込み（リソースパス）
		niku = new ImageIcon(getClass().getResource("/niku.png")); // 画像の読み込み（リソースパス）
		dasi = new ImageIcon(getClass().getResource("/dasi.png")); // 画像の読み込み（リソースパス）
		karami= new ImageIcon(getClass().getResource("/karami.png")); // 画像の読み込み（リソースパス）
		hamono= new ImageIcon(getClass().getResource("/hamono.png")); // 画像の読み込み（リソースパス）
		konsai= new ImageIcon(getClass().getResource("/konsai.png")); // 画像の読み込み（リソースパス）
		recipeB = new ImageIcon(getClass().getResource("/recipeIcon.png")); // 画像の読み込み（リソースパス）
		myGage =new ImageIcon(getClass().getResource("/myGage.png")); // 画像の読み込み（リソースパス）
		enGage =new ImageIcon(getClass().getResource("/enGage.png")); // 画像の読み込み（リソースパス）
		syobuB = new ImageIcon(getClass().getResource("/syobuButton.png")); // 画像の読み込み（リソースパス）
		// レイアウトとパネルの設定
		layout1 = new FlowLayout(FlowLayout.CENTER, 0, 100);
		layout2 = new FlowLayout(FlowLayout.LEFT,0,100);
		buttonPanel = new JPanel(layout1);
		titlePanel = new JPanel(layout1);
		slidePanel = new JPanel();
		recipePanel = new JPanel();
		vsPanel = new JPanel();
		backryoriPanel = new JPanel();
		ryoriPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,-5,0));
		myTofuPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,-5,0));//x,y、
		enTofuPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//x,y、
		myGuzaiPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		enGuzaiPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		eatryoriPanel = new JPanel();
		ikasamaPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 300));
		ikasamaLabel = new JLabel();
		resultPanel = new JPanel();
		winLabel =  new JLabel();
		loseLabel =  new JLabel();
		onokosiLabel = new JLabel();
		vsPanel.setLayout(null);
		eatryoriPanel.setLayout(null);
		resultPanel.setLayout(null);
		// タイトルラベルを追加
		titleLabel = new JLabel(heightResizeImage(title,fheight/3));
		titlePanel.add(titleLabel);
		//説明スライドパネルを追加
		recipeBLabel = new JLabel(heightResizeImage(recipeB,100));
		for(int i = 8;i>0;i--) {
			slideLabel[i] = new JLabel(slide[i]);
			slidePanel.add(slideLabel[i]);
			slideLabel[i].setVisible(false);
		}
		for(int i = 6;i>0;i--) {
			recipeLabel[i] = new JLabel(recipe[i]);
			recipePanel.add(recipeLabel[i]);
			recipeLabel[i].setVisible(false);
		}
		for(int i=0;i<14;i++) {
			ryori[i] = new ImageIcon(getClass().getResource("/ryori"+i+".png"));
			ryoriLabel[i] = new JLabel(heightResizeImage(ryori[i],170));
			ryoriPanel.add(ryoriLabel[i]);
		}
		backryoriPanel.setBackground(new Color(255, 255, 255, 127)); // 白色で50%透明
		slidePanel.setVisible(false);
		recipePanel.setVisible(false);
		ikasamaLabel.setText("相手操作中");
		Font font = new Font("A-SK 織田特太楷書　Min2",Font.PLAIN,100);
		ikasamaLabel.setFont(font);
		winLabel.setFont(font);
		loseLabel.setFont(font);
		onokosiLabel.setFont(font);
		winLabel.setText("勝利");
		loseLabel.setText("敗北");
		onokosiLabel.setText("お残し");
	
		ikasamaPanel.add(ikasamaLabel);
		ikasamaLabel.setBounds(0,400,fwidth,fheight);
		resultPanel.setBackground(new Color(255, 255, 255, 127)); // 白色で50%透明
		resultPanel.setVisible(false);
		vsPanel.setVisible(false);
		titlePanel.setVisible(true);
		buttonPanel.setVisible(true);
		ryoriPanel.setVisible(false);
		backryoriPanel.setVisible(false);
		ikasamaPanel.setVisible(false);
		ryoriPanel.setOpaque(false); // 背景を透明にする
		myTofuPanel.setOpaque(false); // 背景を透明にする
		enTofuPanel.setOpaque(false); // 背景を透明にする
		myGuzaiPanel.setOpaque(false); // 背景を透明にする
		enGuzaiPanel.setOpaque(false); // 背景を透明にする
		//ラベルに画像を挿入
		chefLabel = new JLabel(heightResizeImage(chef,fheight/3+30));
		chefaseLabel = new JLabel(heightResizeImage(chefase,fheight/3+30));
		refrigerator[0] = new JLabel(heightResizeImage(cRefrigerator,3*fheight/5));
		refrigerator[1] = new JLabel(heightResizeImage(oRefrigerator,3*fheight/5));
		tableLabel = new JLabel(widthResizeImage(table,fwidth+250));
		myBackGageLabel= new JLabel(heightResizeImage(backGage,9*fheight/10));
		enBackGageLabel= new JLabel(heightResizeImage(backGage,8*fheight/10));
		myGageFrameLabel= new JLabel(heightResizeImage(myGageFrame,9*fheight/10));
		enGageFrameLabel= new JLabel(heightResizeImage(enGageFrame,8*fheight/10));
		myGageLabel = new JLabel(heightResizeImage(myGage,9*fheight/10));
		enGageLabel = new JLabel(heightResizeImage(enGage,8*fheight/10));
		backgroundLabel = new JLabel(heightResizeImage(background,fheight));
		chefeatLabel = new JLabel(heightResizeImage(eatChef,fheight+100));
		chefeatryoriLabel = new JLabel();
		//		soysauceLabel = new JLabel(heightResizeImage(soysauce,150));
		//		misoLabel = new JLabel(heightResizeImage(miso,150));
		//		negiLabel = new JLabel(heightResizeImage(negi,150));
		//		nikuLabel = new JLabel(heightResizeImage(niku,150));
		//画像の場所調整
		winLabel.setBounds(0,400,fwidth,fheight);
		loseLabel.setBounds(0,400,fwidth,fheight);
		onokosiLabel.setBounds(0,400,fwidth,fheight);
		resultPanel.setBounds(0,0,fwidth,fheight);
		recipePanel.setBounds(0,0,fwidth,fheight);
		ryoriPanel.setBounds(50,200,fwidth,500);
		backryoriPanel.setBounds(0,0,fwidth,fheight);
		myTofuPanel.setBounds(100,500,730,150);
		enTofuPanel.setBounds(250,250,500,100);
		myGuzaiPanel.setBounds(820,450,470,300);
		enGuzaiPanel.setBounds(770,250,300,300);
		eatryoriPanel.setBounds(0,0,fwidth,fheight);
		ikasamaPanel.setBounds(0,0,fwidth,fheight);
		chefeatLabel.setBounds(400,0,fwidth,fheight);

		vsPanel.setBounds(0, 0, 1920, 1080); // x, y, 幅, 高さ
		recipeBLabel.setBounds(0,0,100,100);
		chefLabel.setBounds(-150, -900, chef.getIconWidth(), chef.getIconHeight()); // x, y, 幅, 高さ
		chefaseLabel.setBounds(-150, -900, chefase.getIconWidth(), chefase.getIconHeight()); // x, y, 幅, 高さ
		refrigerator[0].setBounds(0, -600, cRefrigerator.getIconWidth(),cRefrigerator.getIconHeight() );
		refrigerator[1].setBounds(0, -600, oRefrigerator.getIconWidth(),oRefrigerator.getIconHeight() );
		tableLabel.setBounds(0,30,fwidth,fheight);
		myGageFrameLabel.setBounds(-670,-800,backGage.getIconWidth(),backGage.getIconHeight());
		enGageFrameLabel.setBounds(-550,-1100,backGage.getIconWidth(),backGage.getIconHeight());
		myBackGageLabel.setBounds(-670,-800,backGage.getIconWidth(),backGage.getIconHeight());
		enBackGageLabel.setBounds(-550,-1100,backGage.getIconWidth(),backGage.getIconHeight());
		//関数つける
		//		myGageLabel.setBounds(-670,-800,0,0);
		//		enGageLabel.setBounds(-550,-1100,0,0);
		//ここまで
		backgroundLabel.setBounds(0, 0, fwidth, fheight);
		//		enGageLabel = new JLabel(eGage);
		//		myGageLabel= new JLabel(myGage);
		//		refrigerator[1] = new JLabel(oRefrigerator);
		//対戦画面にラベルを貼る
		ryoriCancelButton = new JButton("キャンセル");
		ryoriCancelButton.setPreferredSize(new Dimension(200, 150)); // ボタンサイズを指定
		ryoriCancelButton.addActionListener(this);
		ryoriCancelButton.setBounds(100,100,100,100);
		eatryoriPanel.add(chefeatLabel);
		resultPanel.add(winLabel);
		resultPanel.add(loseLabel);
		resultPanel.add(onokosiLabel);
		vsPanel.add(resultPanel);
		vsPanel.add(ikasamaPanel);
		vsPanel.add(ryoriCancelButton);
		vsPanel.add(eatryoriPanel);
		ryoriCancelButton.setVisible(false);
		eatryoriPanel.setVisible(false);
		vsPanel.add(ryoriPanel);
		vsPanel.add(backryoriPanel);
		vsPanel.add(recipePanel);
		vsPanel.add(myTofuPanel);
		vsPanel.add(enTofuPanel);
		vsPanel.add(myGuzaiPanel);
		vsPanel.add(enGuzaiPanel);
		//食材配り
		//		if (Hungry.getMyCurrentGauge()>48) {
		//			tofuChengeFlag= false;
		//		}
		//		if(vsPanel.isVisible()==true) {
		//
		//		}
		ryoriButton = new JButton("決定");
		ryoriButton.setPreferredSize(new Dimension(200, 150)); // ボタンサイズを指定
		ryoriButton.addActionListener(this);
		ryoriButton.setBounds(500,400,140,60);
		ryoriButton.setIcon(heightResizeImage(syobuB,150));
		vsPanel.add(ryoriButton);

		// パネルをシーンに追加
		vsPanel.add(recipeBLabel);
		vsPanel.add(myGageLabel);
		vsPanel.add(enGageLabel);
		vsPanel.add(myBackGageLabel);
		vsPanel.add(enBackGageLabel);
		vsPanel.add(myGageFrameLabel);
		vsPanel.add(enGageFrameLabel);
		vsPanel.add(tableLabel);
		vsPanel.add(chefLabel);
		vsPanel.add(chefaseLabel);
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
		//		recipeButton = new JButton("レシピ");
		//		recipeButton.setPreferredSize(new Dimension(200, 150)); // ボタンサイズを指定
		//		recipeButton.addActionListener(this);
		//		recipeButton.setBounds(0,0,100,100);
		//		vsPanel.add(recipeButton);
		vsPanel.add(backgroundLabel);
		// ボタンの設定
		sButton = new JButton("start");
		sButton.setPreferredSize(new Dimension(200, 150)); // ボタンサイズを指定
		sButton.addActionListener(this);
		buttonPanel.add(sButton);



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
						vsSetup();
						// 再描画を強制
						vsPanel.revalidate();
						vsPanel.repaint();
					} else {

						slideLabel[currentSlideIndex].setVisible(true); // 次のスライドを表示
					}
				}
			}
		});
		recipePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				recipeLabel[currentSlideIndex].setVisible(false); // 現在のスライドを非表示
				currentSlideIndex++;
				//System.out.println(currentSlideIndex);
				if (currentSlideIndex > 6) {
					currentSlideIndex = 1; // スライドを最初に戻す
					recipePanel.setVisible(false); // スライドパネルを非表示
					vsPanel.setVisible(true); // vsPanel を表示
					chefLabel.setVisible(true);

					//						recipeLabel[1].setVisible(true);
				} else {

					recipeLabel[currentSlideIndex].setVisible(true); // 次のスライドを表示
				}
			}

		});
		recipeBLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// クリックされたときの動作
				recipePanel.setVisible(true);
				recipeLabel[1].setVisible(true);
			}
		});
		ikasamaPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// クリックされたときの動作
				Hungry.setMyCurrentGauge(4);
				Hungry.setCpuCurrentGauge(7);
				manpukuGauge(Hungry.getMyCurrentGauge(),Hungry.getCpuCurrentGauge());
				ikasamaPanel.setVisible(false);
			}
		});
		eatryoriPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// クリックされたときの動作
				ryoriPanel.setVisible(false);
				eatryoriPanel.setVisible(false);
				backryoriPanel.setVisible(false);
				ryoriButton.setVisible(true);
				CookingFlavor.drawElseCards();
				Tohu.setupTohuCards();
				for(int i=0;i<5;i++) {
					myTofuLabel[i].setIcon(randomTofu(i,150).getIcon());
					myTofuLabel[i].revalidate();
					myTofuLabel[i].repaint();
					enTofuLabel[i].revalidate();
					enTofuLabel[i].repaint();

				}
				for(int i=0;i<CookingFlavor.numberOfCards;i++)	{

					myGuzaiLabel[i] = randomGuzai(i,100);
					myGuzaiPanel.add(myGuzaiLabel[i]);

					//					myGuzaiLabel[i].setIcon(randomGuzai(i,100).getIcon());


					if (myGuzaiLabel[i] == null) {
						System.out.println("myGuzaiLabel[" + i  + "] is null");
					} else {
						System.out.println("myGuzaiLabel[" + i + "] is valid");
					}

					//					myGuzaiLabel[i].revalidate();
					//					myGuzaiLabel[i].repaint();
				}

				//				vsSetup();
				//Main.setup();
				manpukuGauge(Hungry.getMyCurrentGauge(),Hungry.getCpuCurrentGauge());
				ikasamaPanel.setVisible(true);
			}
		});
		onokosiLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// クリックされたときの動作
				if(Hungry.getMyCurrentGauge()>49) {
					winLabel.setVisible(false);
					loseLabel.setVisible(true);
				}
				if(Hungry.getCpuCurrentGauge()>49) {
					winLabel.setVisible(true);
					loseLabel.setVisible(false);
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
		if (e.getSource() == ryoriButton) {
			ryoriPanel.setVisible(true);
			backryoriPanel.setVisible(true);
			ryoriButton.setVisible(false);
			ryoriCancelButton.setVisible(true);
		}
		if (e.getSource() == ryoriCancelButton) {
			ryoriPanel.setVisible(false);
			backryoriPanel.setVisible(false);
			ryoriCancelButton.setVisible(false);
			ryoriButton.setVisible(true);
		}
		if(vsFrag == true) {}
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
	public JLabel randomTofu(int n,int size) {
		JLabel rndtofu = new JLabel();
		//		Random random = new Random();
		//		int randomInt = random.nextInt(4);
		if(Tohu.getMyCards(n).equals("絹ごし豆腐")) {
			rndtofu = new JLabel(heightResizeImage(kinu,size));
		}else if(Tohu.getMyCards(n).equals("木綿豆腐")) {
			rndtofu = new JLabel(heightResizeImage(momen,size));
		}else if(Tohu.getMyCards(n).equals("ゲーミング豆腐")) {
			rndtofu = new JLabel(heightResizeImage(gaming,size));
		}else if(Tohu.getMyCards(n).equals("卵豆腐")) {
			rndtofu = new JLabel(heightResizeImage(tamago,size));
		}
		return rndtofu;
	}
	public JLabel randomGuzai(int n,int size) {
		JLabel rndguzai = new JLabel();
		//		Random random = new Random();
		//		int randomInt = random.nextInt(8);
		if(CookingFlavor.getMyFlavor(n).equals(null)) {
			rndguzai = new JLabel();
		}else if(CookingFlavor.getMyFlavor(n).equals("醤油")) {
			rndguzai = new JLabel(heightResizeImage(soysauce,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("味噌")) {
			rndguzai = new JLabel(heightResizeImage(miso,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("ネギ")) {
			rndguzai = new JLabel(heightResizeImage(negi,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("肉")) {
			rndguzai = new JLabel(heightResizeImage(niku,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("出汁")) {
			rndguzai = new JLabel(heightResizeImage(dasi,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("辛味調味料")) {
			rndguzai = new JLabel(heightResizeImage(karami,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("葉物野菜")) {
			rndguzai = new JLabel(heightResizeImage(hamono,size));
		}else if(CookingFlavor.getMyFlavor(n).equals("根菜")) {
			rndguzai = new JLabel(heightResizeImage(konsai,size));
		}
		return rndguzai;
	}
	public void manpukuGauge(int x,int y){
		myGageLabel.setBounds(-670,660-(x*353/50),myGage.getIconWidth(),x*353/50);
		enGageLabel.setBounds(-550,350-(y*353/50),enGage.getIconWidth(),y*353/50);
		myGageLabel.setVisible(true);
		enGageLabel.setVisible(true);

	}
	public static boolean getVsPanelVisible() {
		return vsPanel.isVisible();
	}

	public void vsSetup() {
		for (int i = 0;i<5;i++) {
			myTofuLabel[i] = randomTofu(i,150);
			myTofuPanel.add(myTofuLabel[i]);
			System.out.println(myTofuLabel[i].toString());
			int index = i; // ローカル変数でインデックスをキャプチャ

			myTofuLabel[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(Hungry.getMyCurrentGauge()>49||Hungry.getCpuCurrentGauge()>49) {
						resultPanel.setVisible(true);
						onokosiLabel.setVisible(true);
//						System.out.println(Hungry.getMyCurrentGauge());
						//			winLabel.setVisible(false);
						//			loseLabel.setVisible(true);
					}
					//TradeCards TofuTrade = new TradeCards();
					if(tofuChengeFlag== true) {
						TradeCards.TradeCard(index);	
						manpukuGauge(Hungry.getMyCurrentGauge(),Hungry.getCpuCurrentGauge());
						System.out.println(Hungry.getMyCurrentGauge());
						myTofuLabel[index].setIcon(randomTofu(index,150).getIcon());
						myTofuPanel.add(myTofuLabel[index]);
						System.out.println(index);

					}
				}
			});
			enTofuLabel[i]= randomTofu(i,100);
			enTofuPanel.add(enTofuLabel[i]);

		}
		for (int i = 0;i<CookingFlavor.numberOfCards;i++) {
			myGuzaiLabel[i] = randomGuzai(i,100);
			myGuzaiPanel.add(myGuzaiLabel[i]);
			//			int index = i; // ローカル変数でインデックスをキャプチャ
			//			myGuzaiLabel[i].addMouseListener(new MouseAdapter() {
			//				@Override
			//				public void mouseClicked(MouseEvent e) {
			//					System.out.println("aaa");
			//				}
			//			});
			enGuzaiLabel[i] = randomGuzai(i,70);
			enGuzaiPanel.add(enGuzaiLabel[i]);
		}
		for(int i = 0;i<14;i++) {
			int index = i; // ローカル変数でインデックスをキャプチャ
			ryoriLabel[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//TradeCards TofuTrade = new TradeCards();	
					//				chefeatryoriLabel = new JLabel(heightResizeImage((ImageIcon) ryoriLabel[index].getIcon(),400));
					if(Hungry.getMyCurrentGauge()>49||Hungry.getCpuCurrentGauge()>49) {
						resultPanel.setVisible(true);
						onokosiLabel.setVisible(true);
						//			winLabel.setVisible(false);
						//			loseLabel.setVisible(true);
					}
					chefeatryoriLabel.setIcon(heightResizeImage((ImageIcon) ryoriLabel[index].getIcon(),400));
					chefeatryoriLabel.setBounds(100,200,500,500);
					eatryoriPanel.add(chefeatryoriLabel);
					DecideDishes.setDishNumber(index);
					DecideDishes.calculateFlavor();
					DecideDishes.selectDishes();

					for (int i = 0;i<CookingFlavor.numberOfCards;i++) {
						vsPanel.remove(myGuzaiLabel[i]);  // JLabelを削除
						myGuzaiLabel[i].setIcon(null);
					}
					manpukuGauge(Hungry.getMyCurrentGauge(),Hungry.getCpuCurrentGauge()+DecideDishes.getNextGauge());
					Hungry.setCpuCurrentGauge(DecideDishes.getNextGauge());
					//					Main.setup();
					//					vsSetup();

					ryoriCancelButton.setVisible(false);
					eatryoriPanel.setVisible(true);
					if(index == 13) {
						DecideDishes.setDishNumber(100);
						chefeatryoriLabel.setIcon(heightResizeImage((ImageIcon) myTofuLabel[0].getIcon(),400));
					}
				}
			});
		}
	}
}
//=======
//public class Display {
//	
//>>>>>>> 0593dd9b5a2d769d9c21c6e6c7c57f02ff47edc8
//}
