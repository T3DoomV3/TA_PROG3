import java.util.ArrayList;
class Factura {
	private static int contador = 0;
	private int idFactura;
	private Date fecha;
	private float total;
	private FormaDePago formaDePago;
	private TipoMoneda moneda;
	
	public Factura(FormadDePago formaDePago, TipoMoneda moneda){
		contador++;
		this.idFactura = contador;
		this.fecha = new Date();
		this.formaDePago = formaDePago;
		this.moneda = moneda;
		this.total = 0;
	}

	public int getIdPago(){
		return idPago;
	}
	public void setFecha(Date fecha){
		this.fecha = fecha;
	}
	public Date getFecha(){
		return fecha;
	}
	public void setTotal(float total){
		this.total = total;
	}
	public float getTotal(){
		return total;
	}
	public void setFormaDePago(FormaDePago formaDePago){
		this.formaDePago = formaDePago;
	}
	public FormaDePago getFormaDePago(){
		return formaDePago;
	}
	public void setMoneda(TipoMoneda moneda){
		this.moneda = moneda;
	}
	public TipoMoneda getMoneda(){
		return moneda;
	}
}