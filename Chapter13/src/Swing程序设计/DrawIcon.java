package Swing程序设计;

import java.awt.*;
import javax.swing.*;
public class DrawIcon implements Icon{
	private int width;//声明图标的宽
	private int height;//
	public int getIconHeight() {
		return this.height;
	}
	public int getIconWidth() {
		return this.width;
	}
	public DrawIcon(int width,int height) {//构造方法
		this.width=width;
		this.height=height;
	}
	//实现paintIcon()方法
	public void paintIcon(Component arg0,Graphics arg1,int x,int y) {
		arg1.fillArc(x, y, width, height, 0, 100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawIcon icon = new DrawIcon(15,15);//实例化一个DrawIcon对象
		JLabel jl = new JLabel("测试",icon,SwingConstants.CENTER);//创建一个标签，设置名字为测试，并让文字居中
		JFrame jf = new JFrame();//创建一个JFrame窗口
		Container container = jf.getContentPane();//创建一个面板
		container.add(jl);//将标签加到面板中
		jf.setVisible(true);
		jf.setSize(100, 100);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}

}
