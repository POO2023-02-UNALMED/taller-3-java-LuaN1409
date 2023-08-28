package taller3.televisores;

public class TV {
	public Marca marca;
	public int canal;
	public int precio;
	public boolean estado;
	public int volumen;
	public Control control;
	public static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		if(estado == true && canal >= 1 && canal <= 120){
		this.canal = canal;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		return;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado == true && canal < 120 ) {
			canal++;
		}
	}
	
	public void canalDown(){
		if(estado == true && canal > 1) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (estado == true && volumen < 7) {
			volumen++;
		}
	}
	
	public void volumenDown(){
		if(estado == true && volumen > 0) {
			volumen--;}
	}
	
}
