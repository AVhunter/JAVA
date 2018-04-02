package 测试;
import java.awt.*;
import javax.swing.*;
public class JTextAreaTest extends JFrame{
	public JTextAreaTest() {
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container c=getContentPane();
		JTextArea jt=new JTextArea("文本域",6,6);
		jt.setLineWrap(true);//可自动换行
		c.add(jt);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
	
}
