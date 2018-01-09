package Swing程序设计;
import java.awt.*;
import java.net.*;
/**
 * 在窗体中添加图像元素
 */
import javax.swing.*;
public class MyImageIcon extends JFrame {
	public MyImageIcon() {//构造方法
		Container container = getContentPane();//获取一个容器
		JLabel jl = new JLabel("这是一个JFrame窗体",JLabel.CENTER);//标签内容+标签内容位置
		URL url = MyImageIcon.class.getResource("imageBurron.png");
		Icon icon = new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);//opaque是不透明
		container.add(jl);//将标签加到面版中
		setSize(1250,1000);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyImageIcon();
	}

}
