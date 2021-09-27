package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class UsuarioServices {

	private UsuarioDao dao = DaoFactory.createUsuaruiDao();
	
	public List<Usuario> findAll(){		
		return dao.findAll();
	}
	
}
