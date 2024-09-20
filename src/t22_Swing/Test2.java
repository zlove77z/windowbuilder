package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Test2 extends JFrame{

	public Test2() {
		setTitle("연습하기");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 574, 89);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTirle = new JLabel("이미지 연습창");
		lblTirle.setBounds(207, 35, 131, 24);
		lblTirle.setFont(new Font("굴림", Font.BOLD, 20));
		lblTirle.setHorizontalAlignment(SwingConstants.CENTER);
		pn1.add(lblTirle);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 93, 784, 373);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\13.jpg"));
		lbl1.setBounds(16, 0, 175, 373);
		pn2.add(lbl1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\14.jpg"));
		lbl2.setBounds(207, 0, 175, 373);
		pn2.add(lbl2);
		
		JLabel lbl3 = new JLabel("New label");
		lbl3.setIcon(new ImageIcon(Test2.class.getResource("/t22_Swing/Images/12.jpg")));
		lbl3.setBounds(398, 0, 175, 373);
		pn2.add(lbl3);
		
		JLabel lbl4 = new JLabel("New label");
		lbl4.setIcon(new ImageIcon(Test2.class.getResource("/t22_Swing/Images/11.jpg")));
		lbl4.setBounds(589, 0, 175, 373);
		pn2.add(lbl4);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 466, 784, 95);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btn1 = new JButton("그림1");
		
		btn1.setFont(new Font("굴림", Font.BOLD, 18));
		btn1.setBounds(19, 28, 123, 57);
		pn3.add(btn1);
		
		JButton btn2 = new JButton("그림2");
		btn2.setFont(new Font("굴림", Font.BOLD, 18));
		btn2.setBounds(161, 28, 140, 57);
		pn3.add(btn2);
		
		JButton btn3 = new JButton("그림3");
		btn3.setFont(new Font("굴림", Font.BOLD, 18));
		btn3.setBounds(320, 28, 140, 57);
		pn3.add(btn3);
		
		JButton btn4 = new JButton("그림4");
		btn4.setFont(new Font("굴림", Font.BOLD, 18));
		btn4.setBounds(479, 28, 140, 57);
		pn3.add(btn4);
		
		JButton btn5 = new JButton("모두보기");
		btn5.setFont(new Font("굴림", Font.BOLD, 18));
		btn5.setBounds(638, 28, 123, 57);
		pn3.add(btn5);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnExit.setBounds(586, 10, 186, 75);
		getContentPane().add(btnExit);
		
		
		setVisible(true);
		
		/*===================================================*/
		
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// 1번 그림보기!
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(true);
				lbl2.setVisible(false);
				lbl3.setVisible(false);
				lbl4.setVisible(false);
			}
		});
		// 2번 그림보기!
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(true);
				lbl3.setVisible(false);
				lbl4.setVisible(false);
			}
		});
		// 3번 그림보기!
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(true);
				lbl4.setVisible(false);
			}
		});
		// 4번 그림보기!
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(false);
				lbl4.setVisible(true);
			}
		});
		// 모두 그림보기!
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(true);
				lbl2.setVisible(true);
				lbl3.setVisible(true);
				lbl4.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
