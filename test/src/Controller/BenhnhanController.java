/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Benhnhanmodel;
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
public class BenhnhanController {
     public  List<Benhnhanmodel>getall(){
        List<Benhnhanmodel> sv = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from Benhnhan";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Benhnhanmodel std = new Benhnhanmodel(resultSet.getInt("IDbenhnhan"), resultSet.getString("hoten"),
                                          resultSet.getString("gender"), resultSet.getString("tongquat"),
                                          resultSet.getString("diung"),resultSet.getString("Kehoach"));
                
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(BenhnhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
     public static void insert(Benhnhanmodel bn){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "insert into Benhnhan(IDbenhnhan, hoten, gender, tongquat, diung, Kehoach) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, bn.getId());
            statement.setString(2, bn.getHoten());
            statement.setString(3, bn.getGender());
            statement.setString(4, bn.getTongquat());
            statement.setString(5, bn.getDiung());
            statement.setString(6, bn.getKehoach());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(BenhnhanController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
     public static void Update(Benhnhanmodel bn){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql  = "Update Sinhvie set hoten = ?, gender = ?, tongquat = ?, diung = ?, kehoach = ? where IDbenhnhan = ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, bn.getHoten());
            statement.setString(2, bn.getGender());
            statement.setString(3, bn.getTongquat());
            statement.setString(4, bn.getDiung());
            statement.setString(5, bn.getKehoach());
            statement.setInt(6, bn.getId());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(BenhnhanController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
}
