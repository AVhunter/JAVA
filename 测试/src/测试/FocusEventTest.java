package 测试;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FocusEventTest extends JFrame{
	public FocusEventTest() {
		setVisible(true);
		setSize(300,300);
		setLayout(new GridLayout(2,1,10,10));
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container c=getContentPane();
		JTextField jt=new JTextField("请点击我",10);
		JTextField jt2=new JTextField("请点击其他文本",10);
		c.add(jt2); 
		c.add(jt);
		jt2.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent arg0) {
				JOptionPane.showMessageDialog(null, "文本框失去焦点");
			}
			public void focusGained(FocusEvent arg0) {
				
			}
		});
	}
	public static void main(String[] args) {
		new FocusEventTest();
	}
}
