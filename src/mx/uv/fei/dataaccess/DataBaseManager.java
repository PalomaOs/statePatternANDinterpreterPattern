/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uv.fei.dataaccess;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexs
 */
public class DataBaseManager {

    private Connection connection;
    private final String DATABASE_NAME = "jdbc:mysql://bdconstruccion.mysql.database.azure.com:3306/proyecto";
    private final String DATABASE_USER = "alejandrin09";
    private final String DATABASE_PASSWORD = "Al_jandrin09";

    public Connection getConnection() throws SQLException {
        connect();
        return connection;
    }

    private void connect() throws SQLException {
        connection = DriverManager.getConnection(DATABASE_NAME, DATABASE_USER, DATABASE_PASSWORD);
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException exception) {
                Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, exception);
            }
        }
    }

}
