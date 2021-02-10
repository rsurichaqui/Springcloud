package MPH.SGTIC.springbootservicioitem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import MPH.SGTIC.springbootservicioitem.models.Item;
import MPH.SGTIC.springbootservicioitem.service.ItemService;

@RestController
public class ItemController {
	@Autowired //Genera los eventos aotomaticos por el framework
	//@Qualifier("serviceTemplate")
	@Qualifier("serviceFeing") // Selecciona con que Interfase se trabajara
	private ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}
}
