package Swing程序设计;


/**
 * 密码框组件
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JPassqordFieldTest extends JFrame {
	public JPassqordFieldTest() {
		final JTextField jt = new JTextField("用户名",20);
		final JPasswordField jp =new JPasswordField(20);
		final JButton jb1 = new JButton("清除");
		final JButton jb2 = new JButton("提交");
		jt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jt.setText("触发事件");
			}
		});
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jt.setText("");
				jt.requestFocus();
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "已提交");
			}
		});
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(jt);
		container.add(jb1);
		container.add(jp);
		container.add(jb2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPassqordFieldTest();
	}

}
