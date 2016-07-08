
package modelo;

import java.sql.*;
import controladores_form.*;

public class GestionClientes {

    Datos dt;

    public GestionClientes(String driver, String cadenacon) {
        dt = new Datos(driver, cadenacon);
    }

    public boolean validar(ValidacionForm vf) {
        boolean estado = false;
        try {
            Connection cn = dt.getConexion();

            String query = "select * from cliente where password='" + vf.getPassword()+ "' and usuario='" + vf.getUsuario()+"';";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            estado = rs.next();
            dt.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

    public void registrar(RegistroForm rf) {
        String query = "insert into cliente values ('" + rf.getNombre() + "','" + rf.getApellidos() + "','" + rf.getUsuario() + "','" + rf.getPassword() + "','" + rf.getEmail() + "')";
        System.out.println(query);

        try {
            int i;
            Connection cn = dt.getConexion();
            Statement st = cn.createStatement();
            i=st.executeUpdate(query);
            st.close();
            dt.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
