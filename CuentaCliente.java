import java.util.ArrayList;
import java.util.Date;
class CuentaCliente implements Manage {
	private static int contador = 0;
	private int idCuentaCliente;
	private EstadoCuenta estadoCuenta;
	private Date fechaCreacion;
	private String nombreUsuario;
	private String contraseña;
	private String contraseñaAnterior;

	public CuentaCliente(EstadoCuenta estadoCuenta,String nombreUsuario, String contraseña){
		contador++;
		this.idCuentaCliente = contador;
		this.estadoCuenta = estadoCuenta;
		this.fechaCreacion = new Date();
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}
	public int getIdCuentaCliente(){
		return idCuentaCliente;
	}
	public Date getFechaCreacion(){
		return fechaCreacion;
	}
	public EstadoCuenta getEstadoCuenta(){
		return estadoCuenta;
	}
	public void setEstadoCuenta(EstadoCuenta estadoCuenta){
		return estadoCuenta;
	}
	public String getNombreUsuario(){
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario){
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña(){
		return contraseña;
	}
	public void setContraseña(String contraseña){
		this.contraseña = contraseña;
	}
	public String getContraseñaAnterior(){
		return contraseñaAnterior;
	}
	public void setContraseñaAnterior(){
		this.contraseñaAnterior = contraseñaAnterior;
	}
	public void actualizarcontraseña(String contraseñaAnterior, String contraseñaNueva);
}