/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.DataBaseConnection.DataBaseConnection;
import ec.edu.espe.vinylstilos.model.User;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Caicedo
 */
public class UserController {
    DataBaseConnection conn = new DataBaseConnection();
    public UserController() {
    }

    public List<User> ShowUsers(){
        List<User> users = new ArrayList();
        try {
            conn.connect();            
            String sql = "Select * from user";
            ResultSet rec = conn.getSqlStatement().executeQuery(sql);
            
            while ((rec != null) && (rec.next())) {
                User user = new User();
                user.setIdUser(rec.getString("IDUSER"));
                user.setFirstName(rec.getString("FIRSTNAME"));
                user.setLastName(rec.getString("LASTNAME"));
                user.setEmail(rec.getString("EMAIL"));
                user.setPassword(rec.getString("PASSWORD"));
                users.add(user);
            }
            conn.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);

        }

        return users;
    }

    public void insertUser(User user) {
        try {
            conn.connect();            
            String sql = "Insert into user(IDUSER,FIRSTNAME,LASTNAME,EMAIL,PASSWORD) VALUES ('" + user.getIdUser()
                    + "','" + user.getFirstName() + "' , '" + user.getLastName()
                    + "' , '" + user.getEmail() + "' , '" + user.getPassword() + "')";
             conn.getSqlStatement().executeQuery(sql);
            conn.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public User getUserById(String idUser) {
        User user = new User();
        try {
            conn.connect();
            String sql = "SELECT * FROM user WHERE IDUSER='" + idUser + "'";
            ResultSet rec =conn.getSqlStatement().executeQuery(sql);
            rec.next();
            user.setIdUser(rec.getString("IDUSER"));
            user.setFirstName(rec.getString("FIRSTNAME"));
            user.setLastName(rec.getString("LASTNAME"));
            user.setEmail(rec.getString("EMAIL"));
            user.setPassword(rec.getString("PASSWORD"));
            conn.disconnect();

        } catch (Exception ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public void putUser(String idUser, User user) {
        try {
            conn.connect();
            String sql = "SELECT * FROM user WHERE IDUSER='" + idUser + "'";
            ResultSet rec = conn.getSqlStatement().executeQuery(sql);
            rec.next();
            if (idUser.equals(rec.getString("IDUSER"))) {
                
                String sqlUpdate = "Update user set FIRSTNAME ='" + user.getFirstName() + "',LASTNAME = '"
                        + user.getLastName() + "',EMAIL = '" + user.getEmail() + "',PASSWORD = '" + user.getPassword()
                        + "' where IDUSER='" + idUser + "'";
                conn.getSqlStatement().executeQuery(sqlUpdate);
            } else {
                insertUser(user);
            }
            conn.disconnect();

        } catch (Exception ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteUser(String idUser) {
        try {
            conn.connect();
            String sql = "DELETE FROM user WHERE IDUSER='" + idUser + "'";
            conn.getSqlStatement().executeQuery(sql);
            conn.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
