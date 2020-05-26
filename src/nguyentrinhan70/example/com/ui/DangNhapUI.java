package nguyentrinhan70.example.com.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import nguyentrinhan70.example.com.connect.MsAccessConnection;
import nguyentrinhan70.example.com.connect.NguoiDungService;
import nguyentrinhan70.example.com.model.NguoiDung;

public class DangNhapUI extends JFrame {
	JTextField txtUserName;
	JPasswordField txtPassword;
	JButton btnLogin, btnExit;
	public static NguoiDung login = null;
	public DangNhapUI (String title){
		super(title);
		addControls();
		addEvents();	
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyDangNhap();
			}
		});
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	protected void xuLyDangNhap() {
		// TODO Auto-generated method stub
		login = NguoiDungService.dangNhap(
				txtUserName.getText(), txtPassword.getText());
		if(login ==null){
			JOptionPane.showConfirmDialog(null, "Đăng nhập thất bại");
		}
		else
			{JOptionPane.showConfirmDialog(null, "Đăng nhập thành công");
				this.dispose();
				QuanLyCongVanUI ui = new QuanLyCongVanUI("Màn hình quản lý công văn");
				ui.showWindow();
			}	
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		con.add(pnMain);
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		JPanel pnTitle = new JPanel();
		JLabel lblTitle = new JLabel("Đăng nhập hệ thống quản lý công văn");
		lblTitle.setForeground(Color.BLUE);
		Font font = new Font("cambria", Font.BOLD, 20);
		lblTitle.setFont(font);
		
		pnTitle.add(lblTitle);
		pnMain.add(pnTitle);
		
		JPanel pnDangNhap = new JPanel();
		pnDangNhap.setLayout(new BoxLayout(pnDangNhap, BoxLayout.Y_AXIS));
		pnMain.add(pnDangNhap);
		JPanel pnUser = new JPanel();
		JLabel lblUser = new JLabel("User name:");
		txtUserName = new JTextField(25);
		pnUser.add(lblUser);
		pnUser.add(txtUserName);
		
		JPanel pnPassword = new JPanel();
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setPreferredSize(lblUser.getPreferredSize());
		txtPassword = new JPasswordField(25);
		pnUser.add(lblPassword);
		pnUser.add(txtPassword);
		
		 pnDangNhap.add(pnUser);
		
		 
		 JPanel pnButton = new JPanel();
		 btnLogin = new JButton("Đăng nhập");
		 btnExit = new JButton("Thoát");
		 pnButton.add(btnLogin);
		 pnButton.add(btnExit);
		 pnDangNhap.add(pnButton);
		 TitledBorder border  = new TitledBorder(
				 BorderFactory.createLineBorder(Color.GREEN, 4),
				 "Thông tin đăng nhập");
		 pnDangNhap.setBorder(border);
	}
	public void showWindow(){
		this.setSize(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
