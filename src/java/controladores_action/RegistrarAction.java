
package controladores_action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import modelo.*;
import controladores_form.*;
import java.io.*;

public class RegistrarAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadenacon = this.getServlet().getServletContext().getInitParameter("cadenacon");

        GestionClientes gc = new GestionClientes(driver, cadenacon);
        RegistroForm rf = (RegistroForm) form;

        gc.registrar(rf);
        return mapping.findForward("login");
    }

}
