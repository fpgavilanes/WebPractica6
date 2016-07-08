<%-- 
    Document   : login
    Created on : 18/05/2015, 11:18:11 AM
    Author     : Andrea
--%>

<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORMULARIO DE VALIDACIÓN DE USUARIO</title>
    </head>
    <body>
    <center>
        <h1>Formulario de Validación de Usuario </h1>
        <html:form action="/validar" method="POST">
            <table>
                <tr>
                    <td> Usuario: </td>
                    <td> <html:text property="usuario"></html:text> </td>
                    </tr>
                    <tr>
                        <td> Password: </td>
                        <td> <html:text property="password"></html:text> </td>
                    </tr>

                    <tr> 
                        <td colspan="2">
                            <br/>
                        <html:submit property="submit" value="Validar"> </html:submit>
                        <html:reset value="Limpiar"/>

                    </td>
                </tr>
            </table>
        </html:form>
        <br/>
        <html:link forward="pararegistro"> Registrese</html:link>
        </center>
    </body>
</html:html>

