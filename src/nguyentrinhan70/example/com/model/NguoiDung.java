package nguyentrinhan70.example.com.model;

import java.io.Serializable;

public class NguoiDung implements Serializable {

	private int nguoiNhanId;
	private String userName;
	private String passWord;
	private String HoTen;
	public int getNguoiNhanId() {
		return nguoiNhanId;
	}
	public void setNguoiNhanId(int nguoiNhanId) {
		this.nguoiNhanId = nguoiNhanId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public NguoiDung(int nguoiNhanId, String userName, String passWord, String hoTen) {
		super();
		this.nguoiNhanId = nguoiNhanId;
		this.userName = userName;
		this.passWord = passWord;
		HoTen = hoTen;
	}
	public NguoiDung() {
		super();
	}
	
	
}
