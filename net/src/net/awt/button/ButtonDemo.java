package net.awt.button;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class ButtonDemo {
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
		
		Panel panel = new Panel();
		panel.setBackground(Color.GREEN);
		panel.setSize(100, 100);
		panel.setLocation(50, 50);

		Button button = new Button("확인");
		button.setSize(100,50);
		button.setLocation(100,75);
		/*
		 * [2] 컴포넌트의 조립
		 */
		//null : 레이아웃 매니저를 이용하지 않고 좌표를 지정하여 붙인 예제
		frame.setLayout(null);
		frame.add(button);
		
		/*
		 * [3] 컴포넌트의 보여주기
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		// 전체화면에서 절반, 절반의 위치에 두겠다.
		// 특정 사이즈를 정하는 것보다 위에처럼 dim 을 사용하면
		// 보여지는 화면에 따라 동적으로 무조건 화면이 크든 작든
		// 중앙 부근에 위치하게 됨.
		frame.setVisible(true);
	}
}
