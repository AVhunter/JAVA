package Swing程序设计;
/**
 * 列表框组键
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;
public class JListTest extends JFrame{
	public JListTest() {
		Container container = getContentPane();
		container.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());
		JScrollPane js  = new JScrollPane(jl);
		js.setBounds(10,10,200,200);
		container.add(js);
		setTitle("在这个窗体中使用了列表框");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(400,300);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListTest();
	}

}
class MyListModel extends AbstractListModel<String>{//继承抽象类AbstractListModel
		private String[] contents = {"列表1","列表2","列表3","列表4","列表5","列表6"};
		public String getElementAt(int x) {
			if(x<contents.length)
				return contents[x++];
			else return null;
		}
		public int getSize() {
			return contents.length;
		}
}