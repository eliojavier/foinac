<%-- 
    Document   : index
    Created on : 27/03/2016, 08:02:25 PM
    Author     : Elio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
                        <li><a href="insertarTransaccion.jsp">Insertar Transacción</a></li>
                        <li><a href="interesesMensuales.jsp">Intereses Mensuales</a></li>
                        <li><a href="#">Estadísticas</a></li>
                    </ul>
            </div>
        </nav>       
    </div>   
</body>
</html>