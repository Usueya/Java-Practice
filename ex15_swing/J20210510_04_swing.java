package ex15_swing;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//GUI화면에서 입력받으려면 J_frame을 만들어야한다.
//swing 패키지를 이용하여 GUI화면 만들기

public class J20210510_04_swing extends JFrame{
	J20210510_04_swing(){
		super("JFRAME TEST");
		setTitle("JFrame Test");
		setSize(500, 300);
		
		JTextField tf = new JTextField();
		JButton btnAdd = new JButton("테스트");
		
		//생성된 컴포넌트(txtfield, button)를 올릴 컨테이너 생성
		Container con = getContentPane();
		
		//컨테이너에 컴포넌트 추가
		con.add(tf,"North");
		con.add(btnAdd,"South");
		
		setVisible(true);//frame 화면에 나타내기
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//윈도우 종료시 강제종료
	}
	public static void main(String[] args) {
		J20210510_04_swing myframe = new J20210510_04_swing();
	}
}
