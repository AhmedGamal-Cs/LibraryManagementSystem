/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shaltout.librarymanagementsystem.db.dao;

import com.shaltout.librarymanagementsystem.db.model.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class StaffDao {
    
    private static StaffDao staffDao;
    
    private StaffDao(){}
    
    public static StaffDao getInstance(){
        if(staffDao == null){
            staffDao = new StaffDao();
        }
        return staffDao;
    }
    
    public List<Staff> getAll() throws ClassNotFoundException, SQLException{
        Connection conn = Conn.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM STAFFS");
        ResultSet rs = ps.executeQuery();
        List<Staff> staffs = new ArrayList();
        while(rs.next()){
            String staffId = rs.getString("STAFF_ID");
            String name = rs.getString("NAME");
            String contact = rs.getString("CONTACT");
            staffs.add(new Staff(staffId, name, contact));
        }
        ps.close();
        rs.close();
        Conn.closeConnection(conn);
        return staffs;
    }
    public int insert(Staff staff) throws ClassNotFoundException, SQLException{
        Connection conn = Conn.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO STAFFS VALUES(?,?,?)");
        ps.setString(1, staff.getStaffId());
        ps.setString(2, staff.getName());
        ps.setString(3, staff.getContact());
        int count = ps.executeUpdate();
        Conn.closeConnection(conn);
        ps.close();
        return count;
    }
    
    public int deleteByIdOrName(String input) throws ClassNotFoundException, SQLException{
                
        Connection conn = Conn.getConnection();
        String sql = "DELETE FROM STAFFS WHERE STAFF_ID=? OR NAME=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, input);
        ps.setString(2, input);
        
        int count = ps.executeUpdate();
        Conn.closeConnection(conn);
        ps.close();
        return count;
    }
}
