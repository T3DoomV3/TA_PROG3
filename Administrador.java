import java.util.ArrayList;
class Administrador extends Usuario {
	private static int contador = 0;
	private int idAdministrador;
	private String descripcion;
	public Administrador(String descripcion){
		contador++;
		this.idAdministrador = contador;
		this.descripcion = descripcion;
	}
	public int getIdAdministrador(){
		return idAdministrador;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public void agregarCliente(Cliente cliente);
	public void modificarCliente(Cliente cliente, String dni);
	public void eliminarCliente(String dni);
	public void agregarProducto(Producto producto);
	public void modificarProducto(String nombre, Producto producto);
	public void eliminarProducot(String nombre);
}