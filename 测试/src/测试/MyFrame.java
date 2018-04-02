package 测试;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame extends JFrame{
	public static void main(String[] args) {
		new MyFrame();
	}
	public MyFrame() {
		Container container=getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb=new JButton("弹出对话框");
		jb.setBounds(10,10,100,21);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		container.add(jb);
		container.add(jb);
		container.setBackground(Color.CYAN);
		setVisible(true);
		setSize(200,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
}
