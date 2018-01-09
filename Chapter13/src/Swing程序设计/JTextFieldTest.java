package Swing程序设计;
/**
 * 文本组件
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTextFieldTest extends JFrame{
	public JTextFieldTest() {
		final JTextField jt = new JTextField("aaa",20);
		final JButton jb = new JButton("清除");
		jt.addActionListener(new ActionListener() {//为文本框添加事件
			public void actionPerformed(ActionEvent arg0) {
				jt.setText("触发事件");//设置文本框中的值
			}
		});
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jt.setText("");//将文本框设置为空
				jt.requestFocus();//焦点回到文本框
			}
		});
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jt);
		container.add(jb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextFieldTest();
	}

}
