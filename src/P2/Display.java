package P2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display extends JFrame implements ActionListener {
    JButton sButton;
    JLabel titleLabel;
    JPanel titlePanel, buttonPanel,backPanel;
    FlowLayout layout1, layout2;
    ImageIcon title;

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

        // レイアウトとパネルの設定
        layout1 = new FlowLayout(FlowLayout.CENTER, 0, 100);
        layout2 = new FlowLayout(FlowLayout.CENTER, 0, 100);

        titlePanel = new JPanel(layout2);
        buttonPanel = new JPanel(layout1);

        // 画像のラベルを追加
        titleLabel = new JLabel(title);
        titlePanel.add(titleLabel);

        // ボタンの設定
        sButton = new JButton("start");
        sButton.setPreferredSize(new Dimension(150, 100)); // ボタンサイズを指定
        sButton.addActionListener(this);
        buttonPanel.add(sButton);
        
        // フレームにパネルを追加
       // frame.add(backPanel);
        frame.add(titlePanel, BorderLayout.NORTH); // タイトルパネルを北に配置
        frame.add(buttonPanel, BorderLayout.SOUTH); // ボタンパネルを南に配置

        // フレームの表示
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sButton) {
            System.out.println("Start button clicked!");
        }
    }
}
