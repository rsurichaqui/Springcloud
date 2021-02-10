package MPH.SGTIC.springbootservicioproducto.models.dao;

import org.springframework.data.repository.CrudRepository;

import MPH.SGTIC.springbootservicioproducto.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
