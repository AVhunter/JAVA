package 测试;
import java.awt.*;
import javax.swing.*;
public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		Container c=getContentPane();//创建容器
		JTextArea ta=new JTextArea(20,50);//创建文本区域
		JScrollPane sp=new JScrollPane(ta);//创建JScrollPane面板对象
		c.add(sp);//将该面板添加到该容器中
		setTitle("带滚动条的文本框");//
		setSize(200,200);//
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JScrollPaneTest();
	}
}
