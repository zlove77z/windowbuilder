package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class T5_Radio_CheckBox extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JPanel pn1, pn2, pn3;
	JLabel lblTitle, lblGander, lblHobby, lblMessage;
	JRadioButton rdMale, rdFemale;
	JCheckBox ckhobby1, ckhobby2, ckhobby3, ckhobby4;
	JButton btnGander, btnHobby, btnExit;
	
	public T5_Radio_CheckBox() {
		setTitle("텍스트박스 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 584, 88);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblTitle = new JLabel("라디오버튼/체크박스 연습");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblTitle.setBounds(104, 20, 364, 41);
		pn1.add(lblTitle);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 86, 584, 268);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblGander = new JLabel("성별");
		lblGander.setHorizontalAlignment(SwingConstants.CENTER);
		lblGander.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblGander.setBounds(18, 34, 121, 35);
		pn2.add(lblGander);
		
		lblHobby = new JLabel("취미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblHobby.setBounds(18, 120, 121, 35);
		pn2.add(lblHobby);
		
		rdMale = new JRadioButton("남자");
		buttonGroup.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		rdMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdMale.setBounds(173, 34, 121, 35);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		buttonGroup.add(rdFemale);
		rdFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdFemale.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		rdFemale.setBounds(316, 34, 121, 35);
		pn2.add(rdFemale);
		
		ckhobby1 = new JCheckBox("등산");
		ckhobby1.setHorizontalAlignment(SwingConstants.CENTER);
		ckhobby1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		ckhobby1.setBounds(157, 120, 88, 35);
		pn2.add(ckhobby1);
		
		ckhobby2 = new JCheckBox("낚시");
		ckhobby2.setHorizontalAlignment(SwingConstants.CENTER);
		ckhobby2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		ckhobby2.setBounds(263, 120, 88, 35);
		pn2.add(ckhobby2);
		
		ckhobby3 = new JCheckBox("수영");
		ckhobby3.setHorizontalAlignment(SwingConstants.CENTER);
		ckhobby3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		ckhobby3.setBounds(369, 120, 88, 35);
		pn2.add(ckhobby3);
		
		ckhobby4 = new JCheckBox("바둑");
		ckhobby4.setHorizontalAlignment(SwingConstants.CENTER);
		ckhobby4.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		ckhobby4.setBounds(475, 120, 88, 35);
		pn2.add(ckhobby4);
		
		lblMessage = new JLabel("메세지 출력");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblMessage.setBounds(18, 196, 554, 62);
		pn2.add(lblMessage);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 353, 584, 88);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGander = new JButton("성별출력");
		btnGander.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		btnGander.setBounds(41, 10, 140, 68);
		pn3.add(btnGander);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		btnHobby.setBounds(222, 10, 140, 68);
		pn3.add(btnHobby);
		
		btnExit = new JButton("작업종료");
		
		btnExit.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBounds(403, 10, 140, 68);
		pn3.add(btnExit);
	
		//==============================================================
		setVisible(true);
		//==============================================================
	
		// 성별버튼 클릭
		btnGander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String gander = "선택하신 성별은: ";
			if(rdMale.isSelected()) gander += rdMale.getText();
			else gander += rdFemale.getText();
				
				lblMessage.setText(gander);
			}
		});
		
		// 취미 버튼클릭
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(ckhobby1.isSelected()) hobby += ckhobby1.getText() + "/";
				if(ckhobby2.isSelected()) hobby += ckhobby2.getText() + "/";
				if(ckhobby3.isSelected()) hobby += ckhobby3.getText() + "/";
				if(ckhobby4.isSelected()) hobby += ckhobby4.getText() + "/";
				
				hobby = hobby.substring(0, hobby.length()-1);
				
				lblMessage.setText("선택하신 취미는: " + hobby + " 입니다");
			}
		});
		
		// 작업 종료버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T5_Radio_CheckBox();
	}
}
