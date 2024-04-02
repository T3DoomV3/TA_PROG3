import java.util.ArrayList;
class Cliente extends Usuario {
	private static int contador = 0;
	private int idCliente;
	private CuentaCliente cuentaCliente;
	
	public Cliente(CuentaCliente cuentaCliente){
		contador++;
		this.idCliente = contador;
		this.cuentaCliente = cuentaCliente;
	}
	public int getIdCliente(){
		return idCliente;
	}
	public void setCuentaCliente(CuentaCliente cuentaCliente){
		this.cuentaCliente = cuentaCliente;
	}
	public CuentaCliente getCuentaCliente(){
		return cuentaCliente;
	}
	public void actualizarNombre(String nombre);
	public void actualizarCorreo(String correo);
	public void actualizarTelefono(int telefono);
	public void actualizarDNI(String dni);
	public void actualizarContraseña(String contraAnterior, String contraNueva);
}