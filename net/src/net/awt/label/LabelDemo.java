package net.awt.label;

import java.awt.Dimension;
// import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트 생성
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500,300);
		// import 단축키 CTRL + SHIFT + O 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// toolkit 객체 생성 ... new가 아닌 메소드 리턴방식으로 객체를 생성시킴
		Dimension dim = toolkit.getScreenSize(); // 화면크기
		
		Label labId = new Label("ID :");
		labId.setBounds(50,50,30,10); // 50, 50은 위치. 30, 10은 가로세로
		Label labPwd = new Label("Password :");
		labPwd.setBounds(50,65,100,10);
		
		/*
		 * [2] 컴포넌트의 조립
		 */
		// frame.setLayout(new FlowLayout());
		frame.setLayout(null);
		// LayoutManager 중에서 FlowLayout 사용하겠다.
		frame.add(labId);
		frame.add(labPwd);
		
		frame.setLocation(dim.width/2, dim.height/2);
		// 전체화면에서 절반, 절반의 위치에 두겠다.
		// 특정 사이즈를 정하는 것보다 위에처럼 dim 을 사용하면
		// 보여지는 화면에 따라 동적으로 무조건 화면이 크든 작든
		// 중앙 부근에 위치하게 됨.
		frame.setVisible(true);
	}
}
