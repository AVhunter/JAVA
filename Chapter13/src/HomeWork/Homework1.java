package HomeWork;
/**
 * 开发一个窗体
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
public class Homework1 extends JFrame{
	private JComboBox<String> comboBox;
	public Homework1() {
		super();
		Container container = getContentPane();
		//设置布局为边界布局
		container.setLayout(new BorderLayout());
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		comboBox = new JComboBox<>();//实化一个JComboBox类的对象comboBox
		comboBox.addItem("红");//添加下拉列表表项
		comboBox.addItem("绿");
		comboBox.addItem("黑");
		comboBox.addItem("蓝");
		//将下拉列表添加在顶层
		container.add(comboBox, BorderLayout.NORTH);
		
		//添加单选框,单选框放在面板里，面板放在容器里
		final JPanel panel1= new JPanel();
		container.add(panel1,BorderLayout.CENTER);
		
		final JRadioButton jr1 = new JRadioButton("男");
		final JRadioButton jr2 = new JRadioButton("女");
		ButtonGroup group = new ButtonGroup();
		group.add(jr1);//把它们添加在一个ButtonGroup组里，然后再依次添加到面板里
		group.add(jr2);
		
		panel1.add(jr1);
		panel1.add(jr2);
		
		
		
		//最后添加按钮,按钮也放在面板里，面板放在容器里
		final JPanel panel2 = new JPanel();
		container.add(panel2, BorderLayout.SOUTH);
		
		final JButton jb1 = new JButton("确定");
		panel2.add(jb1);
		
		final JButton jb2 = new JButton("取消");
		panel2.add(jb2);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Homework1();
	}

}
