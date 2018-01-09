package Swing程序设计;
/**
 * 边界布局管理器
 */
import javax.swing.*;
import java.awt.*;
public class BorderLayoutPosition extends JFrame{
	String[] border = {BorderLayout.CENTER,BorderLayout.NORTH,
			BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String[] bottonName = {"center button","north button","south botton","west button","east button"};
	public BorderLayoutPosition() {
		setTitle("这个窗体使用边界布局管理器");
		Container container = getContentPane();
		setLayout(new BorderLayout());
		for(int i=0;i<border.length;i++) {
			container.add(border[i], new JButton(bottonName[i]));
		}
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutPosition();
	}

}
