package navarro.oc1.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import navarro.oc1.di.app.models.domain.ItemFactura;
import navarro.oc1.di.app.models.domain.Producto;
import navarro.oc1.di.app.models.services.IServicio;
import navarro.oc1.di.app.models.services.MiServicio;
import navarro.oc1.di.app.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	@Bean("itemsFactura")
	public List <ItemFactura> regitrarItems(){
		Producto producto1= new Producto ("Camara sony", 100);
		Producto producto2= new Producto ("Bicicleta", 200);
		
		ItemFactura linea1=new ItemFactura(producto1,2);
		ItemFactura linea2=new ItemFactura(producto2,4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List <ItemFactura> regitrarItemsOficina(){
		Producto producto1= new Producto ("Monitor LG", 250);
		Producto producto2= new Producto ("notebook asus", 500);
		Producto producto3= new Producto ("Impresora HP", 80);
		Producto producto4= new Producto ("escritorio oficina", 300);
		
		ItemFactura linea1=new ItemFactura(producto1,2);
		ItemFactura linea2=new ItemFactura(producto2,1);
		ItemFactura linea3=new ItemFactura(producto3,1);
		ItemFactura linea4=new ItemFactura(producto4,1);
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
