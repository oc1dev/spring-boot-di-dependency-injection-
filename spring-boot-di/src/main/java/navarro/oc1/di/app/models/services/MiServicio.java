package navarro.oc1.di.app.models.services;

import org.springframework.stereotype.Component;

@Component
public class MiServicio {

	public String operacion() {
		return "ejecutando algun proceso importante...";
	}
}
