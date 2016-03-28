$("#TransaccionForm").bootstrapValidator({
	message: "Este valor no es valido",
	feedbackIcons: {
            valid: "glyphicon glyphicon-ok",
            invalid: "glyphicon glyphicon-remove",
            validating: "glyphicon glyphicon-refresh"
	},
	fields: {
		accionist: {
                    validators: {
			notEmpty: {
                            message: "El nombre de usuario es requerido"
                        }
                    }
		}		 
	}
});

