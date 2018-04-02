package 测试;
import javax.swing.*;
import java.awt.*;
public class AbsolutePosition extends JFrame{
	public AbsolutePosition() {//构造方法
		setTitle("本窗体使用绝对布局");//设置窗体的标题
		setLayout(null);//使该窗体取消布局管理器设置
		setBounds(0,0,200,150);//绝对定位窗体的位置与大小
		Container c=getContentPane();//创建容器对象
		JButton b1=new JButton("按钮1");//创建按钮
		JButton b2=new JButton("按钮2");//创建按钮
		b1.setBounds(10,30,80,30);//设置按钮的位置与大小
		b2.setBounds(60,70,100,20);
		c.add(b1);//将按钮添加到容器中去
		c.add(b2);
		setVisible(true);//使窗体可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AbsolutePosition();
	}
}