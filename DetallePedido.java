import java.util.ArrayList;
class DetallePedido {
	private static int contador = 0;
	private int idDetallePedido;
	private int cantidad;
	private double subTotal;
	private Producto producto;
	
	public DetallePedido(int cantidad,Producto producto){
		contador++;
		this.idDetallePedido = contador;
		this.cantidad = cantidad;
		this.producto = producto;
	}
	public int getIdDetallePedido(){
		return idDetallePedido;
	}
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}
	public int getCantidad(){
		return cantidad;
	}
	public void setSubTotal(double subTotal){
		this.subTotal = subTotal;
	}
	public double getSubTotal(){
		return subTotal;
	}
	public void setProducto(Producto producto){
		this.producto = producto;
	}
	public Producto getProducto(){
		return producto;
	}
}