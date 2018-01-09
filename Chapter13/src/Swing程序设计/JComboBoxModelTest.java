package Swing程序设计;
/**
 * 下拉列表
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
public class JComboBoxModelTest extends JFrame{
	JComboBox<String> jc = new JComboBox<>(new MyComboBox());
	JLabel jl = new JLabel("请选择证件:");
	public JComboBoxModelTest() {
		setSize(new Dimension(160,180));
		setVisible(true);
		setTitle("在窗口中设置下拉列表框");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(jl);
		container.add(jc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBoxModelTest();
	}

}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	String selecteditem = null;
	String[] test = {"身份证","学生证","军人证","工作证"};
	public String getElementAt(int index) {//根据索引返回值
		return test[index];
	}
	public int getSize() {//返回下拉列表中项目的数目
		return test.length;
	}
	public void setSelectedItem(Object item) {//设置下拉列表框项目
		selecteditem = (String)item;
	}
	public Object getSelectedItem() {//获取下拉列表框项目
		return selecteditem;
	}
	public int getIndex() {
		for(int i=0;i<test.length;i++) {
			if(test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}
