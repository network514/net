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
	JPanel pan_nth, pan_sth; // �г��߿��� ����, ����
	ImageIcon icon;
	List<JButton>btns;
	
	public LottoUI() { // �޼ҵ�ü��
		init(); //initialize�� ����
		        //������ �ҽ��� �Ϻη� ������ �޼ҵ�� ó���ؼ� 
		        //�޼ҵ� ����� ��ġ�� ������� ȣ��ν� ����� �����ϵ��� �ϴ� ��.
		        //�ڹٽ�ũ��Ʈ�� ȣ�̽�Ʈ ���� ����.
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
		setTitle("�ζǻ�����");
		lotto = new Lotto(); // ������ ����ϴ� Ŭ������ Lotto�� �����ڿ� �ٿ���.
		btns = new ArrayList<JButton>();
		
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		/*
		 * this�� LottoUI �� �� �� �ִ� ��� �߿��� 
		 * ActionListener�� �޼ҵ� �� 
		 * actionPerformed(ActionEvent e) �� 
		 * ��ư���� �ο��ϴ� ���̴�.
		 */
		btn = new JButton("������");
		btn.addActionListener(this); // �̺�Ʈ����
		pan_nth.add(btn);
		
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		setBounds(300, 400, 1200, 300);

		setResizable(false);
		setVisible(true);
		
		/*
		 * �����г�, �����г� �����ϼż� ������ ���̽ð�...
		 * ��ư���� �̺�Ʈ�� �Ҵ��ϴµ�
		 * btn.addActionListener(this);
		 * �����гο� ��ư�� ���̼���.
		 * �����гο� BorderLayout���� ���ʿ� ��ġ�ϵ��� �Ͻð�
		 * �����г��� ���ʿ� ��ġ�ϼ���.
		 * ������ ������� 1200, 300 �ȼ��̰�
		 * x, y ��ǥ���� 300, 400 �Դϴ�. (��ư�� ��ǥ)
		 * �������� ������� Ȯ��Ұ��� �ٲ� �� ���� �ϼ���.(���۸� �ʿ�)
		 */
	}
}


