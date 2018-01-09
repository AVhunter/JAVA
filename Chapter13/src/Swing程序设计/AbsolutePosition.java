package Swing程序设计;
/**
 * 绝对位置
 */
import java.awt.*;
import javax.swing.*;
public class AbsolutePosition extends JFrame{
	public AbsolutePosition() {
		setTitle("本窗口使用绝对布局");//设置窗口标题
		setLayout(null);
		Container container  = getContentPane();//获取一个面板
		JButton b1 = new JButton("按钮1");
		JButton b2 = new JButton("按钮2");
		b1.setBounds(10,30,80,30);
		b2.setBounds(60,70,100,20);
		container.add(b1);
		container.add(b2);
		setVisible(true);
		setBackground(Color.blue);
		setBounds(0,0,400,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AbsolutePosition();
	}

}
