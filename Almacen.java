import java.util.ArrayList;
class Almacen {
	private static int contador = 0;
	private int idAlmacen;
	private String direccion;
	
	public Almacen(String direccion){
		contador++;
		this.idAlmacen = contador;
		this.direccion = direccion;
	}
	public int getIdAlmacen(){
		return idAlmacen;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public String getDireccion(){
		return direccion;
	}
}