import java.util.ArrayList;
import java.util.Date;
class CuentaCliente {
	private static int contador = 0;
	private int idCuentaCliente;
	private EstadoCuenta estadoCuenta;
	private Date fechaCreacion;
	private String nombreUsuario;
	private String contraseña;
	private String contraseñaAnterior;
	
	public void cambiarContraseña(String contraseñaAnterior, String contraseñaNueva);
}