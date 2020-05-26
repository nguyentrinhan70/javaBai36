package nguyentrinhan70.example.com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import nguyentrinhan70.example.com.model.CoQuan;
import nguyentrinhan70.example.com.model.LoaiCongVan;

public class LoaiCongVanService {
	public static Connection  connection= MsAccessConnection.getConnecton();
	public static LoaiCongVan layThongTinChiTiet(int idLoaiCv){
		LoaiCongVan lcv = null;
		try{
			String sql = "select * from LoaiCongVan where LoaiCongVanId = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idLoaiCv);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				lcv = new LoaiCongVan();
				lcv.setLoaiCongVanId(resultSet.getInt("loaiCongVanId"));
				lcv.setMaLoaiCongVan(resultSet.getString("maLoaiCongVan"));
				lcv.setTenCongVan(resultSet.getString("tenCongVan"));
				return lcv;
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return lcv;
	}
}
