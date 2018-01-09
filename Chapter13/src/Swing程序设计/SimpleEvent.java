package Swing程序设计;
/**
 * 动作事件监听器
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleEvent extends JFrame{
	private JButton jb= new JButton("我是按钮，fuck me");
	public SimpleEvent() {
		Container container = getContentPane();
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		container.add(jb);
		container.setLayout(new FlowLayout());
		jb.setBounds(10, 10, 100, 80);
		jb.addActionListener(new jbAction());
	}
	//定义内部类实现ActionListener接口
	class jbAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("爽");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleEvent();
	}

}
