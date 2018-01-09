package Swing程序设计;
/**
 * 带滑动条的面板
 * @author nelson
 *
 */
import javax.swing.*;
import java.awt.*;
public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		Container container = getContentPane();
		JTextArea ta = new JTextArea(20,50);//创建文本区域
		JScrollPane sp = new JScrollPane(ta);//创建JScrollPane面板对象
		container.add(sp);
		setTitle("带滚动条的文字编辑器");
		setVisible(true);
		setSize(200,200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JScrollPaneTest();
	}

}
