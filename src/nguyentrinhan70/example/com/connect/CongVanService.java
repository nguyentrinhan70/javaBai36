package nguyentrinhan70.example.com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import nguyentrinhan70.example.com.model.CongVan;
import nguyentrinhan70.example.com.model.NguoiDung;

public class CongVanService {
	public static Connection connection = MsAccessConnection.getConnecton();
	public static ArrayList<CongVan> layDanhSachCongVanTheoNguoiDung(int maNd)
	
	{
		ArrayList<CongVan> dsCongVan = new ArrayList<>();
		try{
			String sql = "select * from CongVan where nguoiNhanId = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, maNd);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				
				CongVan cv = new CongVan();
				cv.setId(resultSet.getInt("id"));
				cv.setLoaiCongVanId(resultSet.getInt("loaiCongVanId"));
				cv.setNguoiNhanId(resultSet.getInt("nguoiNhanId"));
				cv.setCoQuanId(resultSet.getInt("coQuanId"));
				cv.setNgayThangVaoSo(resultSet.getDate("ngayThangVaoSo"));
				cv.setSoVanBan(resultSet.getString("soVanBan"));
				cv.setNgayVanBan(resultSet.getDate("ngayVanBan"));
				cv.setGhiChu(resultSet.getString("ghiChu"));
				dsCongVan.add(cv);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return dsCongVan;
	}

}
