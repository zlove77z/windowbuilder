package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class T4_TextField1 extends JFrame{
	private 
	JPanel pn1, pn2, pn3;
	JTextField txtMid, txtPwd, txtName, txtAge;
	JLabel lblNewLabel, lblMid, lblPwd, lblAge, lblImage;
	JButton btnInp,btnReset, btnExit;
	
	public T4_TextField1() {
		setTitle("텍스트박스 연습");
		setSize(600,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.CYAN);
		pn1.setBounds(12, 10, 560, 79);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 0, 560, 79);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 99, 560, 243);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMid = new JLabel("아 이 디 ");
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblMid.setBounds(22, 11, 160, 47);
		pn2.add(lblMid);
		
		JLabel lblPwd = new JLabel("비 밀 번 호");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblPwd.setBounds(22, 69, 160, 47);
		pn2.add(lblPwd);
		
		JLabel lblName = new JLabel("성 명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(22, 127, 160, 47);
		pn2.add(lblName);
		
		JLabel lblAge = new JLabel("나 이 ");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblAge.setBounds(22, 185, 160, 47);
		pn2.add(lblAge);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		txtMid.setBounds(246, 11, 271, 47);
		pn2.add(txtMid);
		txtMid.setColumns(10);
		
		txtPwd = new JTextField();
		txtPwd.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		txtPwd.setColumns(10);
		txtPwd.setBounds(246, 69, 271, 47);
		pn2.add(txtPwd);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		txtName.setColumns(10);
		txtName.setBounds(246, 127, 271, 47);
		pn2.add(txtName);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(246, 185, 271, 47);
		pn2.add(txtAge);
		
		JLabel lblimage = new JLabel("New label");
		lblimage.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\21.jpg"));
		lblimage.setBounds(0, 0, 560, 243);
		pn2.add(lblimage);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.YELLOW);
		pn3.setBounds(12, 352, 560, 79);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btninput = new JButton("회 원 가 입");
		btninput.setBounds(6, 0, 178, 79);
		pn3.add(btninput);
		
		JButton btnReset = new JButton("다시입력");
		btnReset.setBounds(190, 0, 178, 79);
		pn3.add(btnReset);
		
		JButton btnExit = new JButton("작업종료");
		btnExit.setBounds(374, 0, 178, 79);
		pn3.add(btnExit);
		
		
		/*======================================================*/
		setVisible(true);
		/*======================================================*/
		
		// 회원가입버튼 클릭
	}

	public static void main(String[] args) {
		new T4_TextField1();
	}
}
