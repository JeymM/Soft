
public class Inmuebles {
	int idInmobiliario;
	int AreaInmueble;
	String dirInmueble;
	
	
	public Inmuebles() {
		super();
	}


	public Inmuebles(int idInmobiliario, int areaInmueble, String dirInmueble) {
		super();
		this.idInmobiliario = idInmobiliario;
		AreaInmueble = areaInmueble;
		this.dirInmueble = dirInmueble;
	} 
	
	public double CalcularValorCompra(double valorMetro) {
		double valor=this.AreaInmueble*valorMetro;
		return valor;
	}
	
}
