/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Benhnhanmodel;
import Entity.KehoachDTmodel;
import Entity.Lichhenmodel;
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
public class LichhenController {
    public List<Lichhenmodel>getall(){
        List<Lichhenmodel> sv = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Lichhen";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Lichhenmodel std = new Lichhenmodel(resultSet.getString("tenbenhnhan"),resultSet.getString("Nhasi"),resultSet.getString("Trokham"),
                                                        resultSet.getString("giohen"),resultSet.getString("phong"),resultSet.getString("tinhtrang"));
                
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(KehoachDTmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    public static void insert(Lichhenmodel bn){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "insert into Lichhen(tenbenhnhan,Nhasi,Trokham,giohen,phong,tinhtrang) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, bn.getTenbenhnhan());
            statement.setString(2, bn.getNhasi());
            statement.setString(3, bn.getTrokham());
            statement.setString(4, bn.getGiohen());
            statement.setString(5, bn.getPhong());
            statement.setString(6, bn.getTinhtrang());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(BenhnhanController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
}
