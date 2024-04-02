import java.util.ArrayList;
class Carrito {
	private static int contador = 0;
	private int idCarrito;
	private double total;
	
	public Carrito(double total){
		contador++;
		this.idCarrito = contador;
		this.total = total;
	}
	public int getIdCarrito(){
		return idCarrito;
	}
	public void setTotal(double total){
		this.total = total;
	}
	public double getTotal(){
		return total;
	}
}