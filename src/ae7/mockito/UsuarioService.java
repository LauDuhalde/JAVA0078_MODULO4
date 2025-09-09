package ae7.mockito;

public class UsuarioService {

	private UsuarioRepositorio uRepo;
	
	public UsuarioService(UsuarioRepositorio usuarioRepositorio) {
		this.uRepo  = usuarioRepositorio;
	}
	
	public void guardar(Usuario usuario) {
		System.out.println("Guardando usuario: " + usuario.getNombre());
		uRepo.guardar(usuario);
	}
	
}
