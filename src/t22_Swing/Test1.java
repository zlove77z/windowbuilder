package t22_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Test1 extends JFrame {

	private JPanel contentPane;

	
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 800, 500);
		setSize(800, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 267);
		contentPane.add(pn1);
		pn1.setLayout(null);
		
		JButton btnStart = new JButton("시작");
		btnStart.setFont(new Font("굴림", Font.PLAIN, 18));
		btnStart.setBounds(83, 71, 150, 50);
		pn1.add(btnStart);
		
		JButton btnStop = new JButton("정지");
		btnStop.setFont(new Font("굴림", Font.PLAIN, 18));
		btnStop.setBounds(316, 71, 150, 50);
		pn1.add(btnStop);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(549, 71, 150, 50);
		pn1.add(btnExit);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 268, 784, 293);
		contentPane.add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMessage = new JLabel("New label");
		lblMessage.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\11.jpg"));
		lblMessage.setBackground(Color.MAGENTA);
		lblMessage.setBounds(95, 52, 538, 128);
		pn2.add(lblMessage);
	}

	public static void main(String[] args) {
		new Test1();
	}
}
