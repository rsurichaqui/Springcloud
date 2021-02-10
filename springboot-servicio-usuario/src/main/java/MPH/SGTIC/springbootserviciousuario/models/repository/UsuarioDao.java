package MPH.SGTIC.springbootserviciousuario.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import MPH.SGTIC.springbootserviciousuario.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	
	@RestResource(path="buscar-username") //Nombre de mapeo
	public Usuario findByUsername(@Param("username") String username);
	//la Imterfas dao son metos que publican eventos que se encuentran mas abajo del controller
	//llamando desde el cliente usuarios/serarch/buscar-username
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);

	@Query("select u from Usuario u where u.nombre=?1")
	public Usuario obtenerPorNombre(String nombre);

	@Query("select u from Usuario u where u.apellido=?1")
	public Usuario obtenerPorApellido(String apellido);
}
