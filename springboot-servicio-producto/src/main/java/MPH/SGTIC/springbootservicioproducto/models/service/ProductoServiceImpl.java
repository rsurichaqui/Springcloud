package MPH.SGTIC.springbootservicioproducto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import MPH.SGTIC.springbootservicioproducto.models.dao.ProductoDao;
import MPH.SGTIC.springbootservicioproducto.models.entity.Producto;

@Service("producto_servicio")
public class ProductoServiceImpl implements IProductoService  {
	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Producto> finAll() {
		return (List<Producto>)productoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}
	
	//@Override
	//protected Object clone() throws CloneNotSupportedException {
	//	// TODO Auto-generated method stub
	//	return super.clone();
	//}
	//@Override
	//public boolean equals(Object arg0) {
	//	// TODO Auto-generated method stub
	//	return super.equals(arg0);
	//}
	//@Override
	//protected void finalize() throws Throwable {
	//	// TODO Auto-generated method stub
	//	super.finalize();
	//}
	//@Override
	//public int hashCode() {
	//	// TODO Auto-generated method stub
	//	return super.hashCode();
	//}
	//@Override
	//public String toString() {
	//	// TODO Auto-generated method stub
	//	return super.toString();
	//}
}
