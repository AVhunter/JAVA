package Swing程序设计;
/**
 * 网格布局管理器
 * @author nelson
 *
 */
import java.awt.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame {
	public GridLayoutPosition() {
		Container container = getContentPane();	
		setLayout(new GridLayout(7,3,10,10));//7行3列，组建之间的间隔是10px
		for(int i=0;i<21;i++) {
			container.add(new JButton("button"+i));
		}
		setSize(400,400);
		setTitle("这是一个网格布局窗体");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutPosition();
	}

}
