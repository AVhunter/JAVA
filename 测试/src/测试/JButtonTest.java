package 测试;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.*;
public class JButtonTest extends JFrame{
	public JButtonTest() {
		java.net.URL url=MyImageIcon.class.getResource("vc.png");
		Icon icon=new ImageIcon(url);
		setLayout(new GridLayout(3,2,5,5));//设置网格布局管理器
		Container c=getContentPane();//创建容器
		for(int i=0;i<5;i++) {
			//创建按钮，同时设置按钮文字与图标
			JButton j=new JButton("button"+i,icon);
			c.add(j);//在容器中添加按钮
			if(i%2==0)
				j.setEnabled(false);//设置其中一些按钮不可用
		}
		JButton jb=new JButton();//实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(90,30));//设置按钮与图片大小相同
		jb.setIcon(icon);
		jb.setToolTipText("图片按钮");//设置按钮提示为文字
		jb.setBorderPainted(false);//设置按钮边界不显示
		jb.addActionListener(new ActionListener() {//为按钮添加监听时间
			public void actionPerformed(ActionEvent e) {
				//弹出对话确认框
				JOptionPane.showMessageDialog(null,"弹出对话框");
			}
		});
		c.add(jb);
		setTitle("测试");
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButtonTest();
	}
}
