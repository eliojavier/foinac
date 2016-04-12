<%-- 
    Document   : reportes
    Created on : 11/04/2016, 07:25:36 PM
    Author     : Elio
--%>

<%@page import="controlador.Reportes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FOINAC En Línea</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link href="//oss.maxcdn.com/jquery.bootstrapvalidator/0.5.2/css/bootstrapValidator.min.css" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
        <script type="text/javascript" src="validatorS.js"></script>
    </head>
    <body>
        <div class="container">
            <h1>Fondo de Inversiones Acosta</h1>      
        
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">FOINAC</a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Resumen</a></li>
                        <li><a href="consultarAccionista.jsp">Información Accionistas</a></li>
                        <li><a href="comprarAccion.jsp">Comprar Acción</a></li>
                        <li><a href="insertarTransaccion.jsp">Registrar Transacción</a></li>
                        <li><a href="interesesMensuales.jsp">Intereses Mensuales</a></li>
                        <li><a href="reportes.jsp#">Reportes</a></li>
                        <li><a href="grid.jsp#">Grid</a></li>
                    </ul>
                </div>
            </nav>       
        </div>   
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-4">
                    <div class="span3 bs-docs-sidebar">
                        <ul class="nav nav-list bs-docs-sidenav affix">
                            <li class="active"><a href="#dropdowns"><i class="icon-chevron-right"></i> Participaciones</a></li>
                            <li class=""><a href="#buttonGroups"><i class="icon-chevron-right"></i> Préstamos</a></li>
                            <li><a href="#buttonDropdowns"><i class="icon-chevron-right"></i> Gráficos</a></li>
                            <li><a href="#navs"><i class="icon-chevron-right"></i> Navs</a></li>
                            <li><a href="#navbar"><i class="icon-chevron-right"></i> Navbar</a></li>
                            <li><a href="#breadcrumbs"><i class="icon-chevron-right"></i> Breadcrumbs</a></li>
                            <li><a href="#pagination"><i class="icon-chevron-right"></i> Pagination</a></li>
                            <li><a href="#labels-badges"><i class="icon-chevron-right"></i> Labels and badges</a></li>
                            <li><a href="#typography"><i class="icon-chevron-right"></i> Typography</a></li>
                            <li><a href="#thumbnails"><i class="icon-chevron-right"></i> Thumbnails</a></li>        
                        </ul>
                    </div>
                </div>
                <div class="col-sm-8">
                    <h1>Hello World!</h1>
                        <%Reportes reportes;
                        out.println ("hola");%>
                </div>
            </div>
        </div>       
    </body>
</html>
