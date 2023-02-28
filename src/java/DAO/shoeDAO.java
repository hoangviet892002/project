/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author Laptop88
 */
public class shoeDAO {
     public List<Product> select() throws SQLException {
        List<Product> list = null;
        //Tạo connection để kết nối vào DBMS
        Connection con = DBContext.getConnection();
        //Tạo đối tượng statement
        Statement stm = con.createStatement();
        //Thực thi lệnh SELECT
        ResultSet rs = stm.executeQuery("select * from toy");
        list = new ArrayList<>();
        while (rs.next()) {
            //Doc mau tin hien hanh de vao doi tuong toy
            product  = new Toy();
            toy.setId(rs.getString("id"));
            toy.setName(rs.getString("name"));
            toy.setPrice(rs.getDouble("price"));
            toy.setExpDate(rs.getDate("expDate"));
            toy.setBrandId(rs.getString("brand"));
            //Them toy vao list
            list.add(toy);
        }
        con.close();
        return list;
    }
    
    public void delete(String id) throws SQLException {
        //Tạo connection để kết nối vào DBMS
        Connection con = DBContext.getConnection();
        //Tạo đối tượng statement
        PreparedStatement stm = con.prepareStatement("delete from toy where id = ?");
        //Thực thi lệnh sql
        stm.setString(1, id);
        int count = stm.executeUpdate();        
        con.close();
    }
    
    public void update(Toy toy) throws SQLException {
        //Tạo connection để kết nối vào DBMS
        Connection con = DBContext.getConnection();
        //Tạo đối tượng statement
        PreparedStatement stm = con.prepareStatement("update toy set name = ?, price = ?, expDate = ?, brand = ? where id = ?");
        //Thực thi lệnh sql
        stm.setString(1, toy.getName());
        stm.setDouble(2, toy.getPrice());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(3, sdf.format(toy.getExpDate()));
        stm.setString(4, toy.getBrandId());
        stm.setString(5, toy.getId());
        int count = stm.executeUpdate();        
        con.close();
    }
}
