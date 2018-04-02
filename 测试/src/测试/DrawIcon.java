package 测试;
import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon{
	private int width;
	private int height;
	public int getIconHeight() {
		return height;
	}
	public int getIconWidth() {
		return width;
	}
	public DrawIcon(int x,int y) {
		this.width=x;
		this.height=y;
	}
	public void paintIcon(Component arg0,Graphics arg1,int x,int y) {
		arg1.fillOval(x, y, width, height);
	}
	public static void main(String[] args) {
		DrawIcon icon=new DrawIcon(15,15);
		JLabel jl=new JLabel("测试",icon,SwingConstants.CENTER);
		JFrame jf=new JFrame();
		Container container = jf.getContentPane();
		container.setBackground(Color.WHITE);
		container.add(jl);
		jf.setVisible(true);
		jf.setSize(100, 100);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
}