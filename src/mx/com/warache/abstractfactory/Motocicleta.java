package mx.com.warache.abstractfactory;

public abstract class Motocicleta {


	private String tipoUso;
	private String tipoSuspension;
	private String tamanoLlantas;
	private String velocidadMaxima;
	
	abstract void acelerar();
	abstract void frenar();
	abstract void encender();
	abstract void apagar();
	public String getTipoUso() {
		return tipoUso;
	}
	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}
	public String getTipoSuspension() {
		return tipoSuspension;
	}
	public void setTipoSuspension(String tipoSuspension) {
		this.tipoSuspension = tipoSuspension;
	}
	public String getTamanoLlantas() {
		return tamanoLlantas;
	}
	public void setTamanoLlantas(String tamanoLlantas) {
		this.tamanoLlantas = tamanoLlantas;
	}
	public String getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
}
