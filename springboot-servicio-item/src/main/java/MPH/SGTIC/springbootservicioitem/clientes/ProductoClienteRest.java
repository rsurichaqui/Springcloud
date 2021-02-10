package MPH.SGTIC.springbootservicioitem.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import MPH.SGTIC.springbootservicioitem.models.Producto;

@FeignClient(name="servicio-productos",url="http://localhost:8001")
public interface ProductoClienteRest {
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id);
}
