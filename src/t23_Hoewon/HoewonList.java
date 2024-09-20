package t23_Hoewon;

import java.awt.Font;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HoewonList extends JFrame{
	private JTable table;
	JPanel pn1, pn2, pn3;
	JButton btnJoindayAsc, btnExit;
	@SuppressWarnings("rawtypes")
	Vector title, vData;
	DefaultTableModel dtm;
	JScrollPane scrollPane;
	
	HoewonDAO dao = new HoewonDAO();
	private JTextField txtCondition;
	
	
	@SuppressWarnings("unchecked")
	public HoewonList() {
		setTitle("회원리스트");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(6, 0, 772, 60);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JComboBox cbCondition = new JComboBox();
		cbCondition.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		cbCondition.setModel(new DefaultComboBoxModel(new String[] {"성명", "나이", "성별", "입사일", "주소"}));
		cbCondition.setBounds(12, 10, 145, 40);
		pn1.add(cbCondition);
		
		txtCondition = new JTextField();
		txtCondition.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		txtCondition.setHorizontalAlignment(SwingConstants.CENTER);
		txtCondition.setBounds(184, 10, 145, 40);
		pn1.add(txtCondition);
		txtCondition.setColumns(10);
		
		JButton btnCondition = new JButton("조건검색");
		btnCondition.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		btnCondition.setBounds(404, 11, 145, 40);
		pn1.add(btnCondition);
		
		JButton btnList = new JButton("천제검색");
		btnList.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		btnList.setBounds(587, 10, 145, 40);
		pn1.add(btnList);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 59, 772, 428);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		
		pn3 = new JPanel();
		pn3.setBounds(6, 494, 772, 60);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnJoindayAsc = new JButton("가입일오름차순");
		btnJoindayAsc.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		btnJoindayAsc.setBounds(27, 10, 221, 40);
		pn3.add(btnJoindayAsc);
		
		btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		btnExit.setBounds(523, 10, 221, 40);
		pn3.add(btnExit);
		
		JButton btnJoindayDesc = new JButton("가입일내림차순");
		btnJoindayDesc.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		btnJoindayDesc.setBounds(275, 10, 221, 40);
		pn3.add(btnJoindayDesc);

	
		
		
		//JTable 설계
		//1.'부제목'을 Vector(백터)로 만들어 준다.(저장해야한다)
		title = new Vector<>();
		title.add("번호");
		title.add("이름");
		title.add("나이");
		title.add("성별");
		title.add("가입일");
		title.add("주소");
	
		//2.'데이터(네용)'을 Vector(백터)타입으로 만들어준다. 데이터는 데이터베이스에서 가져온다.
		vData = dao.getHoewonList();
		// System.out.println("vData : " +vData);
		
		//3. DB에서 가져온 자료(vData)와 타이틀(title)을 DefaultTableModel(디폴트테이블모델)(데이터,타이틀)객체에 생성하면서 담아준다.
		dtm = new DefaultTableModel(vData, title);
		
		//4.DefaultTableModel에 담긴 벡터타입의 '데이터/타이틀'틀 JTable객체 생성시에 담아준다.
		table = new JTable(dtm);
		
		//5.자료가 담긴 JTable객체를 JScrollPane객체 생성시에 담아준다.
		//scrollPane.setViewportView(table);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 760, 418);
		pn2.add(scrollPane);
		
		//6.실행시킨후 ,출력된 화면에서 결과를 확인한다.
		
		//JTable 속성 제어연습
		//table의 컬럼크기/크기고정/셍의 위치고정
		table.getColumnModel().getColumn(0).setMaxWidth(50); // 컬럼의 최대크기 지정
		table.getColumnModel().getColumn(2).setMaxWidth(50); 
		table.getColumnModel().getColumn(0).setResizable(false); // 컬럼의 크기 변경불가
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getTableHeader().setReorderingAllowed(false); // 컬럼 고정
		
		// 테이블안의 셀의 내용을 수평정렬하기
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		//tcm.getColumn(3).setCellRenderer(dtcr); 한줄만 정렬할떄
		
		//전체셀 가운데 정렬....
		for(int i=0; i<tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
		//=================================================
		setVisible(true);
		//=================================================
	
		// 전체검색 버튼 클릭
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getHoewonList();
				dtm.setDataVector(vData, title);
			}
		});
		
		// 조건검색 버튼클릭
		btnCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cbCondi = cbCondition.getSelectedItem().toString();
				String txtCondi = txtCondition.getText();
				
				if(txtCondi.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요!");
					txtCondition.requestFocus();
					return;
				}
				if(cbCondi.equals("성명")) vData = dao.getConditionSearch("name", txtCondi);
				else if(cbCondi.equals("나이")) {
					// 나이는 정규식으로 유효성 검사를 해야 함....
					vData = dao.getConditionSearch("age", txtCondi);
				}
				else if(cbCondi.equals("성별")) vData = dao.getConditionSearch("gender", txtCondi);
				else if(cbCondi.equals("가입일")) vData = dao.getConditionSearch("joinday", txtCondi);
				else if(cbCondi.equals("주소")) vData = dao.getConditionSearch("address", txtCondi);
				
				dtm.setDataVector(vData, title);
			}
		});
		
		// 가입일 오름차순 버튼클릭
		btnJoindayAsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData =	dao.getHoewonAlign("joinday","a");
				dtm.setDataVector(vData, title);
			}
		});
		// 가입일 내림차순 버튼클
		btnJoindayDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData =	dao.getHoewonAlign("joinday","d");
				dtm.setDataVector(vData, title);
				
			}
		});
		// 작업종료버튼클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HoewonMain();
			}
		});
	
	
	}
}
