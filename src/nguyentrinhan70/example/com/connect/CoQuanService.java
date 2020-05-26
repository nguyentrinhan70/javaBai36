package nguyentrinhan70.example.com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import nguyentrinhan70.example.com.model.CoQuan;
import nguyentrinhan70.example.com.model.NguoiDung;

public class CoQuanService {
	public static Connection  connection= MsAccessConnection.getConnecton();
	public static CoQuan layThongTinChiTiet(int idCoQuan){
		CoQuan cq = null;
		try{
			String sql = "select * from coquanbanhanh where coquanid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idCoQuan);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				cq = new CoQuan();
				cq.setCoQuanId(resultSet.getInt("coquanid"));
				cq.setMaCoQuan(resultSet.getString("macoquan"));
				cq.setTenCoQuan(resultSet.getString("tencoquan"));
				return cq;
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return cq;

	}}
