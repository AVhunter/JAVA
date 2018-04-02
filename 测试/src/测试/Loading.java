package 测试;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Loading extends JFrame{
	public Loading() {
		setTitle("登录");
		setVisible(true);
		setSize(100,100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(3,1,10,10));
		Container c=getContentPane();
		JTextField user=new JTextField("用户名");
		JPasswordField psw=new JPasswordField();
		psw.setEchoChar('*');
		JPanel jp=new JPanel(new GridLayout(1,2,10,10));
		JButton jb1=new JButton("提交");
		JButton jb2=new JButton("重置");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user.getText().trim().length()==0||new String(psw.getPassword()).trim().length()==0) {
					JOptionPane.showMessageDialog(null, "用户名或密码不能为空");
					return;
				} 
				if(user.getText().trim().equals("yt")&&new String(psw.getPassword()).trim().equals("123")) {
					JOptionPane.showMessageDialog(null, "登录成功");
					return;
				}
				else {
					JOptionPane.showMessageDialog(null, "用户名或密码错误");
				}
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.setText("");
				psw.setText("");
			}
		});
		jp.add(jb1);
		jp.add(jb2);
		c.add(user);
		c.add(psw);
		c.add(jp);
		
	}
	public static void main(String[] args) {
		new Loading();
	}
}