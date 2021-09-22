package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Usuario;

public class UsuarioServices {

	public List<Usuario> findAll(){
		List<Usuario> list = new ArrayList<>();
		list.add(new Usuario(1, "Carlos", "carlos@gmailcom", "123456"));
		list.add(new Usuario(2, "Maria", "maria@gmailcom", "112233"));
		list.add(new Usuario(3, "Paulo", "paulo@gmailcom", "111222"));
		list.add(new Usuario(4, "Antonio", "antonio@gmailcom", "113333"));
		list.add(new Usuario(5, "Ana", "ana@gmailcom", "114444"));
		list.add(new Usuario(6, "Eliane", "eliane@gmailcom", "115555"));
		return list;
	}
	
}
