package edu.cientifica.papeleta.service;

import java.util.List;

import edu.cientifica.papeleta.model.Usuario;

public interface UsuarioService {
	public List<Usuario> listarUsuarios();
	public Usuario buscarUsuario(String username); 
	public boolean validarUsuario(Usuario usuario);

}
