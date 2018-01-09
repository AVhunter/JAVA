package Swing程序设计;
/**
 * JPanel面板
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;

public class JPanelTest extends JFrame{
	public JPanelTest() {
		Container container =getContentPane();
		container.setLayout(new GridLayout(2,1,10,10));//将整个容器设置为2行1列的网格布局
		JPanel p1 = new JPanel(new GridLayout(1,3,10,10));//面板p1设置为1行3列
		JPanel p2 = new JPanel(new GridLayout(1,2,10,10));//面板p2设置为1行2列
		JPanel p3 = new JPanel(new GridLayout(1,2,10,10));//面板p3设置为1行2列
		JPanel p4 = new JPanel(new GridLayout(2,1,10,10));//面板p4设置为2行1列
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("7"));
		p4.add(new JButton("8"));
		p4.add(new JButton("9"));
		container.add(p1);
		container.add(p2);
		container.add(p3);
		container.add(p4);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(400,400);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanelTest();
	}

}
