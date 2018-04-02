package 测试;
import java.awt.*;
import javax.swing.*;
public class JPanelTest extends JFrame{
	public JPanelTest() {
		Container c=getContentPane();
		//将整个容器设置为2行1列的网络布局
		c.setLayout(new GridLayout(2,1,10,10));
		//初始化一个面板，设置1行3列的网络布局
		JPanel p1=new JPanel(new GridLayout(1,3,10,10));
		JPanel p2=new JPanel(new GridLayout(1,2,10,10));
		JPanel p3=new JPanel(new GridLayout(1,2,10,10));
		JPanel p4=new JPanel(new GridLayout(2,1,10,10));
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("7"));
		p4.add(new JButton("8"));
		p4.add(new JButton("9"));
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
	}
	public static void main(String[] args) {
		new JPanelTest();
	}
}