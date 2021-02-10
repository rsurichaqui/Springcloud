package MPH.SGTIC.springbootservicioproducto.models.service;

import java.util.List;

import MPH.SGTIC.springbootservicioproducto.models.entity.Producto;

public interface IProductoService {
	public List<Producto> finAll();
	public Producto findById(Long id);
}
