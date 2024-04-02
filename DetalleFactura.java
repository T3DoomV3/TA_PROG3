import java.util.ArrayList;
class DetalleFactura {
	private static int contador = 0;
	private int idDetalleFactura;
	private int cantidad;
	private double precioUnitario;
	private double subTotal;
	private Producto producto;
	
	public DetalleFactura(int cantidad,double precioUnitario,Producto producto){
		contador++;
		this.idDetalleFactura = contador;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subTotal = cantidad*precioUnitario;
		this.producto = producto;
	}
	public int getIdDetalleFactura(){
		return idDetalleFactura;
	}
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}
	public int getCantidad(){
		return cantidad;
	}
	public double getPrecioUnitario(){
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario){
		this.precioUnitario = precioUnitario;
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