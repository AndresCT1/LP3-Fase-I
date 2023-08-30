package cuentabanco;

public class cuentabanco {
	
	private String titular;
	private double cantidad;
	
	public cuentabanco(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}
	public cuentabanco(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void ingresar(double cantidad) {
		if(cantidad<0) {
			System.out.println("La cantidad ingresada es negativa");
		}
		else{
			this.cantidad = this.cantidad + cantidad;}
	}
	public void retirar(double cantidad) {
		if(cantidad>this.cantidad) {
			this.cantidad=0;
		}
		else{
			this.cantidad = this.cantidad - cantidad;}
	}
	public void verSaldo() {
		System.out.println("Su saldo es: S/. "+ this.cantidad);
	}	
	@Override
	public String toString() {
		return "cuentabanco [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
}
