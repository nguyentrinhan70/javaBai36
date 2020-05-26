package nguyentrinhan70.example.com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import nguyentrinhan70.example.com.model.NguoiDung;

public class NguoiDungService  {
	public static Connection  connection= MsAccessConnection.getConnecton();
	public static NguoiDung dangNhap(String userName, String passWord){
		NguoiDung nd = null;
		try{
			String sql = "select * from nguoidung where userName = ? and passWord = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, passWord);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				nd = new NguoiDung();
				nd.setNguoiNhanId(resultSet.getInt("nguoiNhanId"));
				nd.setUserName(resultSet.getString("userName"));
				nd.setHoTen(resultSet.getString("hoten"));			
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return nd;
	}
	public static ArrayList<NguoiDung> layToanBoNguoiDung(){
		ArrayList<NguoiDung> dsNguoiDung = new ArrayList<>();
		try{
			String sql = "select * from nguoidung";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				NguoiDung nd = new NguoiDung();
				nd.setNguoiNhanId(resultSet.getInt("nguoiNhanId"));
				nd.setUserName(resultSet.getString("userName"));
				nd.setHoTen(resultSet.getString("hoten"));
				nd.setPassWord(resultSet.getString("passWord"));
				dsNguoiDung.add(nd);
		}
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
		return dsNguoiDung;
	}

}
