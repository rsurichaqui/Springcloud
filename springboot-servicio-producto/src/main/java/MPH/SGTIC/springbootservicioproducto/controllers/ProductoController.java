package MPH.SGTIC.springbootservicioproducto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import MPH.SGTIC.springbootservicioproducto.models.entity.Producto;
import MPH.SGTIC.springbootservicioproducto.models.service.IProductoService;


@RestController
public class ProductoController {
	@Autowired
	@Qualifier("producto_servicio")
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
	return productoService.finAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
	return productoService.findById(id);
	}
}
