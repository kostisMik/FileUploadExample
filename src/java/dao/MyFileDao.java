/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controllers.uploadServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import model.MyFile;

/**
 *
 * @author Kostis.Mikroulis
 */
public class MyFileDao {

    public MyFile getById(int id) throws SQLException {

        MyFile myFile = new MyFile();
        String sql = "select * from uploadstore where id=?";
        Connection conn = dbHelper.DbConnect.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                myFile.setId(rs.getInt(1));
                myFile.setFilename(rs.getString(2));
                myFile.setTheFile(rs.getBytes(3));
                myFile.setThefileasBlob(rs.getBlob(3));
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(uploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myFile;
    }

}
