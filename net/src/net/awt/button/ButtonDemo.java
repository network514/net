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
		 * [1] ������Ʈ ����
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500,300);
		// import ����Ű CTRL + SHIFT + O 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// toolkit ��ü ���� ... new�� �ƴ� �޼ҵ� ���Ϲ������ ��ü�� ������Ŵ
		Dimension dim = toolkit.getScreenSize(); // ȭ��ũ��
		
		Panel panel = new Panel();
		panel.setBackground(Color.GREEN);
		panel.setSize(100, 100);
		panel.setLocation(50, 50);

		Button button = new Button("Ȯ��");
		button.setSize(100,50);
		button.setLocation(100,75);
		/*
		 * [2] ������Ʈ�� ����
		 */
		//null : ���̾ƿ� �Ŵ����� �̿����� �ʰ� ��ǥ�� �����Ͽ� ���� ����
		frame.setLayout(null);
		frame.add(button);
		
		/*
		 * [3] ������Ʈ�� �����ֱ�
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		// ��üȭ�鿡�� ����, ������ ��ġ�� �ΰڴ�.
		// Ư�� ����� ���ϴ� �ͺ��� ����ó�� dim �� ����ϸ�
		// �������� ȭ�鿡 ���� �������� ������ ȭ���� ũ�� �۵�
		// �߾� �αٿ� ��ġ�ϰ� ��.
		frame.setVisible(true);
	}
}