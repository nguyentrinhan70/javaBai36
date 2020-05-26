package nguyentrinhan70.example.com.model;

import java.io.Serializable;

public class LoaiCongVan implements Serializable {

	private int loaiCongVanId;
	private String maLoaiCongVan;
	private String tenCongVan;
	public int getLoaiCongVanId() {
		return loaiCongVanId;
	}
	public void setLoaiCongVanId(int loaiCongVanId) {
		this.loaiCongVanId = loaiCongVanId;
	}
	public String getMaLoaiCongVan() {
		return maLoaiCongVan;
	}
	public void setMaLoaiCongVan(String maLoaiCongVan) {
		this.maLoaiCongVan = maLoaiCongVan;
	}
	public String getTenCongVan() {
		return tenCongVan;
	}
	public void setTenCongVan(String tenCongVan) {
		this.tenCongVan = tenCongVan;
	}
	
}
