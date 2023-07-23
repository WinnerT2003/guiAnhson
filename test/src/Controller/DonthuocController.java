/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Benhnhanmodel;
import Entity.Donthuoc;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class DonthuocController {
    public  List<Donthuoc>getall(){
        List<Donthuoc> sv = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            
            String urldb = "jdbc:sqlserver://localhost:1443; databasename=QlyBenhvien; encrypt=false ";
            String userName = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(urldb, userName, password);
            String sql = "select * from khothuoc";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Donthuoc std = new Donthuoc(resultSet.getString("tenthuoc"),resultSet.getInt("soluong"),resultSet.getInt("gia"));
                
                sv.add(std);
            }
        }catch(SQLException ex){
            Logger.getLogger(BenhnhanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
    
}
