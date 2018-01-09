package Swing程序设计;
/**
 * 文本域
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
public class JTextAreaTest extends JFrame{
	public JTextAreaTest() {
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container container = getContentPane();
		JTextArea jt = new JTextArea("输入留言",6,6);
		jt.setLineWrap(true);//可自动换行
		container.add(jt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaTest();
	}

}
