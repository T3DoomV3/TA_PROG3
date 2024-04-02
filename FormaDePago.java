import java.util.ArrayList;
class FormaDePago{
	private static int contador = 0;
	private int idPago;
	private String descripcion;
	
	public FormaDePago(String descripcion){
		contador++;
		this.idPago = contador;
		this.descripcion = descripcion;
	}
	public void setIdPago(int idPago){
		this.idPago = idPago;
	}
	public int getIdPago(){
		return idPago;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public String getDescripcion(){
		return descripcion;
	}
}