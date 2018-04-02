package 测试;
import javax.swing.*;
import java.awt.*;
import java.net.*;

public class MyImageIcon extends JFrame{
	public MyImageIcon() {
		Container container=getContentPane();
		JLabel jl=new JLabel("这是一个JFrame窗体",JLabel.CENTER);
		URL url=MyImageIcon.class.getResource("vc.png");
		Icon icon=new ImageIcon(url);//实例化icon对象
		jl.setIcon(icon);//为标签设置图片
		//设置文字放置在标签中间
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);
		container.add(jl);//将标签添加到容器中
		setSize(250,100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyImageIcon();
	}
}
