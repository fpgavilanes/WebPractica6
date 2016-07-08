<%-- 
    Document   : registro
    Created on : 18/05/2015, 11:18:26 AM
    Author     : Andrea
   
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO DE USUARIOS</title>
    </head>
    <body>
    <center>
        <h1>Registro de usuarios para Página de Andrea</h1>
        <html:form action="/registrar" method="POST">
            <table>
                <tr>
                    <td> Nombre: </td>
                    <td> <html:text property="nombre"></html:text> </td>
                
                    </tr>
                    <tr>
                        <td> Apellidos: </td>
                        <td> <html:text property="apellidos"></html:text> </td>
                    </tr>
                    <tr>
                        <td> Usuario: </td>
                        <td> <html:text property="usuario"></html:text> </td>
                    </tr>
                    <tr>
                        <td> Password: </td>
                        <td> <html:text property="password"></html:text> </td>
                    </tr>
                    <tr>
                        <td> Email: </td>
                        <td> <html:text property="email"></html:text> </td>
                    </tr>

                    <tr> 
                        <td colspan="2">
                            <br/>
                        <html:submit property="submit" value="Registrar"> </html:submit>
                        <html:reset value="Limpiar"/>

                    </td>
                </tr>
            </table>

        </html:form>

        <br/> 
    </center> 
</body> 
</html:html>

