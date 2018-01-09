package Swing程序设计;
/**
 * 提交按钮组键
 * @author nelson
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class JButtonTest extends JFrame{

	public JButtonTest() {
		URL url = MyImageIcon.class.getResource("imageBurron.png");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3,2,5,5));
		Container container = getContentPane();
		for(int i=0;i<5;i++) {
			//创建按钮，同时设置按钮文字与图标
			JButton J = new JButton("button"+i,icon);
			container.add(J);
			if(i%2 == 0)
				J.setEnabled(false);//设置其中一些按钮不可用
		}
		JButton jb = new JButton();//实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(90,30));//设置按钮大小与图片大小相同
		jb.setIcon(icon);//为按钮设置图标
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");//设置提示文字
		jb.setBorderPainted(false);//按钮编辑不显示
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//弹出对话框
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		container.add(jb);
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonTest();
	}

}
