package MPH.SGTIC.springbootservicioitem.service;

import java.util.List;

import MPH.SGTIC.springbootservicioitem.models.Item;

public interface ItemService {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
