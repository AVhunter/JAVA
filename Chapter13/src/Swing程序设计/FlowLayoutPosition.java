package Swing程序设计;
/**
 * 流布局管理器
 */
import javax.swing.*;
import java.awt.*;
public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		setTitle("本窗口使用流布局管理器");
		Container container = getContentPane();//活得一个面板
		setLayout(new FlowLayout(2,10,10));//2表示按右对齐排列，10，10表示组键之间的间隔
		for(int i=0;i<10;i++) {
			container.add(new JButton("button"+i));
		}
		setSize(300,200);//设置面板大小
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutPosition();
	}

}
