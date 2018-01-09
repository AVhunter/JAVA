package Swing程序设计;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJDialog extends JDialog{//创建新类继承JDialog类
	private static final long serialVersionUID = 1L;
	public MyJDialog(MyFrame frame) {
		super(frame,"第一个JDialog窗体",true);
		Container container = getContentPane();//创建一个容器
		container.add(new JLabel("这是一个对话框"));//在窗体中添加标签
		setBounds(120,120,100,100);//设置对话框大小
	}
	
}
public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new MyFrame();
	}
	public MyFrame() {
		Container container = getContentPane();//创建一个容器
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);//
		container.add(jl);
		JButton jb = new JButton("弹出对话框");//定义一个按钮
		jb.setBounds(10,50,100,21);
		//jb.setBackground(Color.RED);
		jb.addActionListener(new ActionListener() {//按钮添加鼠标点击事件
			public void actionPerformed(ActionEvent e) {
				//使MyJDialog窗体可见
				new MyJDialog(MyFrame.this).setVisible(true); 
			}
		});
		container.add(jb);//将按钮添加到容器中
		container.setBackground(Color.BLUE);
		setBounds(200,200,200,200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
}