
//package P2;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class PanelTest extends JFrame {
//    public PanelTest() {
//        setTitle("Panel Visibility Test");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(800, 600);
//        setLayout(new BorderLayout());
//
//        JPanel vsPanel = new JPanel();
//        vsPanel.setBackground(Color.RED);
//        vsPanel.setVisible(false); // 初期状態では非表示
//
//        JPanel slidePanel = new JPanel();
//        slidePanel.setBackground(Color.BLUE);
//
//        add(slidePanel, BorderLayout.CENTER);
//        add(vsPanel, BorderLayout.SOUTH);
//
//        slidePanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("Switching panels...");
//                slidePanel.setVisible(false);
//                vsPanel.setVisible(true);
//                vsPanel.revalidate();
//                vsPanel.repaint();
//            }
//        });
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new PanelTest();
//    }
//}
