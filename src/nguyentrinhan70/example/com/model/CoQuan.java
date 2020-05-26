package nguyentrinhan70.example.com.model;

import java.io.Serializable;

public class CoQuan implements Serializable{
	private int coQuanId;
	private String maCoQuan;
	private String tenCoQuan;
	public int getCoQuanId() {
		return coQuanId;
	}
	public void setCoQuanId(int coQuanId) {
		this.coQuanId = coQuanId;
	}
	public String getMaCoQuan() {
		return maCoQuan;
	}
	public void setMaCoQuan(String maCoQuan) {
		this.maCoQuan = maCoQuan;
	}
	public String getTenCoQuan() {
		return tenCoQuan;
	}
	public void setTenCoQuan(String tenCoQuan) {
		this.tenCoQuan = tenCoQuan;
	}
}
