/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Benhnhanmodel;
import Entity.KehoachDTmodel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AD
 */
public class KehoachDTController {
    public List<KehoachDTmodel>getall(){
        List<KehoachDTmodel> sv = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Kehoachchitiet";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                KehoachDTmodel std = new KehoachDTmodel(resultSet.getInt("ID"), resultSet.getString("mota"),
                                          resultSet.getString("ngaydieutri"), resultSet.getString("BsiTH"),
                                          resultSet.getString("Trokham"),resultSet.getString("Ghichu"),resultSet.getString("danhsachrang"));
                
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(KehoachDTmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    public static void insert(KehoachDTmodel bn){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "insert into Kehoachchitiet(ID,mota,ngaydieutri, BsiTH,Trokham,Ghichu,danhsachrang) values(?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, bn.getId());
            statement.setString(2, bn.getMota());
            statement.setString(3, bn.getNgaydieutri());
            statement.setString(4, bn.getBsiTH());
            statement.setString(5, bn.getTrokham());
            statement.setString(6, bn.getGhichu());
            statement.setString(7, bn.getDanhsachrang());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(BenhnhanController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
    public List<KehoachDTmodel>getChitiet(int ID){
        List<KehoachDTmodel> sv = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select ID,mota,gia from (Kehoachchitiet join giaDieutri on Kehoachchitiet.mota=giaDieutri.Tenbenh) where id = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                KehoachDTmodel std = new KehoachDTmodel(resultSet.getInt("ID"),resultSet.getString("mota"),resultSet.getInt("gia"));
                                          
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(KehoachDTmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    public List<KehoachDTmodel>getChitiet1(int ID){
        List<KehoachDTmodel> sv = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = " select hoten,ngaydieutri,BsiTH from Benhnhan join Kehoachchitiet on Benhnhan.IDbenhnhan=Kehoachchitiet.ID where ID = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                KehoachDTmodel std = new KehoachDTmodel(resultSet.getString("ngaydieutri"), resultSet.getString("BsiTH"),resultSet.getString("hoten"));
                                          
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(KehoachDTmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
}
