package MPH.SGTIC.springbootserviciooauth.services;

import MPH.SGTIC.springbootserviciousuarioscommons.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
