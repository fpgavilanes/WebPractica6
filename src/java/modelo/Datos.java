/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

//hola andre
public class Datos {

    private String driver;
    private String cadenacon;

    public Datos() {
    }

    public Datos(String driver, String cadenacon) {
        this.driver = driver;
        this.cadenacon = cadenacon;
    }

    public Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/test","postgres","labcom");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

    public void cierraConexion(Connection cn) {

        try {
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

