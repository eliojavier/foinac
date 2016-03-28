<%-- 
    Document   : interesesMensuales
    Created on : 27/03/2016, 08:01:39 PM
    Author     : Elio
--%>

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
        <div class="col-md-4 col-md-offset-4">
        <form id="" class="form-horizontal" action="CalcularInteresesMensualesPorAccionista.do" method="post">
            <div class="form-group">
                <label for="email">Mes a calcular intereses:</label>
                <div>
                    <select class="form-control" name="anio">
                        <option value="2016">2016</option>                       
                    </select>
                </div>
                <div>
                    <select class="form-control" name="mes">
                        <option value="01">Enero</option>
                        <option value="02">Febrero</option>
                        <option value="03">Marzo</option>
                        <option value="04">Abril</option>
                        <option value="05">Mayo</option>
                        <option value="06">Junio</option>
                        <option value="07">Julio</option>
                        <option value="08">Agosto</option>
                        <option value="09">Septiembre</option>
                        <option value="10">Octubre</option>
                        <option value="11">Noviembre</option>
                        <option value="12">Diciembre</option>
                    </select>
                </div>
            </div>               
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
        </div>
    </body>
</html>
