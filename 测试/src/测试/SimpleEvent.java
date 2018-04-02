package 测试;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleEvent extends JFrame{
	private JButton jb=new JButton("我是按钮，点击我");
	public SimpleEvent() {
		setLayout(null);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container c=getContentPane();
		c.add(jb);
		jb.setBounds(10, 10, 100, 60);
		jb.addActionListener(new jbAction());
	}
	class jbAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("我被单击了");
		}
	}
	public static void main(String[] args) {
		new SimpleEvent();
	}
}

