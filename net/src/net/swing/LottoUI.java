package net.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoUI extends JFrame implements ActionListener{
	Lotto lotto;
	JButton btn;
	JPanel pan_nth, pan_sth; // 패널중에서 북쪽, 남쪽
	ImageIcon icon;
	List<JButton>btns;
	
	public LottoUI() { // 메소드체인
		init(); //initialize의 약자
		        //복잡한 소스를 하부로 보내고 메소드로 처리해서 
		        //메소드 선언된 위치에 관계없이 호출로써 기능을 수행하도록 하는 것.
		        //자바스크립트의 호이스트 같은 개념.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
	}
	
	private void showLotto() {
		int[] arr = lotto.getLotto();
		for(int i=0;i<arr.length;i++){
			btns.get(i).setIcon(getIcon(arr[i]));
		}
	}

	private Icon getIcon(int i){
		String imgPath="src/images/"+Integer.toString(i)+".gif";
		return new ImageIcon(imgPath);
	}
	
	private void makeBtns() {
		JButton tmp = null;
		for(int i=0;i<6;i++){
			tmp = new JButton();
			btns.add(tmp);
			pan_sth.add(tmp);
		}
	}

	private void init(){
		setTitle("로또생성기");
		lotto = new Lotto(); // 로직을 담당하는 클래스인 Lotto를 생성자에 붙였다.
		btns = new ArrayList<JButton>();
		
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		/*
		 * this는 LottoUI 가 할 수 있는 기능 중에서 
		 * ActionListener에 메소드 중 
		 * actionPerformed(ActionEvent e) 를 
		 * 버튼에게 부여하는 것이다.
		 */
		btn = new JButton("생성기");
		btn.addActionListener(this); // 이벤트실행
		pan_nth.add(btn);
		
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		setBounds(300, 400, 1200, 300);

		setResizable(false);
		setVisible(true);
		
		/*
		 * 북쪽패널, 남쪽패널 생성하셔서 프레임 붙이시고...
		 * 버튼에는 이벤트를 할당하는데
		 * btn.addActionListener(this);
		 * 북쪽패널에 버튼을 붙이세요.
		 * 북쪽패널에 BorderLayout에서 북쪽에 배치하도록 하시고
		 * 남쪽패널은 남쪽에 배치하세요.
		 * 프레임 사이즈는 1200, 300 픽셀이고
		 * x, y 좌표값은 300, 400 입니다. (버튼의 좌표)
		 * 프레임의 사이즈는 확장불가로 바꿀 수 없게 하세요.(구글링 필요)
		 */
	}
}


