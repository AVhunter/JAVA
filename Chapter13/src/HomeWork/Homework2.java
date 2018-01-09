package HomeWork;
/**
 * 在窗体中设置下拉列表框,设置按钮，点按钮在下拉列表框中添加数组中的内容
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Homework2 extends JFrame{
	
	private String[] contents = {"列表1","列表2","列表3","列表4","列表5","列表6"};
	JComboBox<String> jc = new JComboBox<>();
	private JButton jb = new JButton("提交");
	int count =0;
	public Homework2() {
		Container container = getContentPane();
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		container.setLayout(new BorderLayout());
		
		//final JPanel panel = new JPanel();
		
		container.add(jc,BorderLayout.WEST);
		container.add(jb,BorderLayout.EAST);
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(count < contents.length)
					jc.addItem(contents[count++]);
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Homework2();
	}

}
