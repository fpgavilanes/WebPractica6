
package controladores_form;
//captura los datos

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class ValidacionForm extends ActionForm {

    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nombre) {
        this.usuario = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
