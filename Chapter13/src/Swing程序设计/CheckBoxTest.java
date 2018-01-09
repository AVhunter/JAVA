package Swing程序设计;
/**
 * 复选框组键
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxTest extends JFrame{
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JTextArea jt = new JTextArea(3,10);
	private JCheckBox jc1 =new JCheckBox("1");
	private JCheckBox jc2 = new JCheckBox("2");
	private JCheckBox jc3 = new JCheckBox("3");
	
	public CheckBoxTest() {
		Container container = getContentPane();
		setSize(200,160);
		setVisible(true);
		setTitle("复选框的使用");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		container.setLayout(new BorderLayout());
		
		container.add(panel1,BorderLayout.NORTH);
		final JScrollPane scrollPane = new JScrollPane(jt);
		panel1.add(scrollPane);
		
		container.add(panel2,BorderLayout.SOUTH);
		panel2.add(jc1);
		jc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jc1.isSelected()) {
					jt.append("复选框1被选中\n");
				}
			}
		});
		
		panel2.add(jc2);
		jc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jc2.isSelected())
					jt.append("复选框2被选中\n");
			}
		});
		
		panel2.add(jc3);
		jc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jc3.isSelected()) {
					jt.append("复选框3被选中\n");
				}
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}

}
