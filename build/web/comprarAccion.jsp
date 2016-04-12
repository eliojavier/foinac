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
                        <li><a href="#">Resumen</a></li>
                        <li><a href="consultarAccionista.jsp">Información Accionistas</a></li>
                        <li class="active"><a href="insertarTransaccion.jsp">Insertar Transacción</a></li>
                        <li><a href="#">Estadísticas</a></li>
                    </ul>
            </div>
        </nav>       
    </div>   

    <div class='container' class="col-md-4 col-md-offset-4">
    <form id="TransaccionForm" class="form-horizontal" action="ComprarAccion.do" method="post">                         
        <div class="form-group">
            <label class="control-label col-sm-2" for="accionista">Accionista: </label>
            <div class="col-sm-3">
                <select class="form-control" name="accionista">
                    <option value="Papi">  Papi</option>
                    <option value="Mami">  Mami</option>
                    <option value="Yei">   Yei</option>
                    <option value="Neno">  Neno</option>
                    <option value="Estic"> Estic</option>
                    <option value="Andrea">Andrea</option>
                    <option value="Elio">  Elio</option>
                    <option value="Nicole">Nicole</option>
                </select>
            </div>
        </div>
                       
        <div class="form-group">
            <label class="control-label col-sm-2" for="monto">Monto:</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" name="monto">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="numacciones">Número de acciones:</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" name="numacciones">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="fecha">Fecha:</label>
            <div class="col-sm-2">
                <input type="Date" class="form-control" name="fecha">
            </div>
        </div>
        <div class="col-sm-offset-2 col-sm-4">
            <button type="submit" class="btn btn-default">Registrar Compra</button>
        </div>   
    </form>
    </div>
    
</body>
</html>