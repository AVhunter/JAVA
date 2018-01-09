package Swing程序设计;

import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame{//定义一个类继承JFrame
	public void CreateJFrame(String title) {//定义一个CreateJFrame方法
		JFrame jf = new JFrame(title);//实例化一个Jrame对象
		Container container = jf.getContentPane();//获取一个容器
		JLabel jl= new JLabel("这是一个JFrame");//创建一个JLabel标签
		jl.setHorizontalAlignment(SwingConstants.CENTER);//将标签文字居中
		container.add(jl);//将标签加入到容器之中
		container.setBackground(Color.blue);//设置容器背景
		jf.setVisible(true);//将框架设置为可视化
		jf.setSize(1000, 500);//设置框架大小
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {//在主方法中调用CreateJFrame()方法
		new Example1().CreateJFrame("创建一个JFrame窗体");
	}
}