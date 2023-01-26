package navarro.oc1.di.app.models.services;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante...";
	}
}
