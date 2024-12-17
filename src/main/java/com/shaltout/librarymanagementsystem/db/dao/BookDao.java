/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shaltout.librarymanagementsystem.db.dao;

import com.shaltout.librarymanagementsystem.db.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ahmed
 */
public class BookDao {
    
    private static BookDao bookDao;
    private BookDao(){}
    public static BookDao getInstance(){
        if(bookDao == null){
            bookDao = new BookDao();
        }
        return bookDao;
    }
    
    public int insert(Book book) throws ClassNotFoundException, SQLException{
        Connection conn = Conn.getConnection();
        String sql = "INSERT INTO BOOKS VALUES(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, book.getBookId());
        ps.setString(2, book.getCategory());
        ps.setString(3, book.getName());
        ps.setString(4, book.getAuthor());
        ps.setInt(5, book.getCopies());
        int count = ps.executeUpdate();
        
        Conn.closeConnection(conn);
        ps.close();
        return count;
    }
    
    public int deleteByIdOrName(String input) throws ClassNotFoundException, SQLException{
                
        Connection conn = Conn.getConnection();
        String sql = "DELETE FROM BOOKS WHERE BOOK_ID=? OR NAME=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, input);
        ps.setString(2, input);
        
        int count = ps.executeUpdate();
        Conn.closeConnection(conn);
        ps.close();
        return count;
    }
}
