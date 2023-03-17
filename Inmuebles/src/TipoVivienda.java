
public class TipoVivienda extends Inmuebles {
	
	int CantidadHabitacion;
	int NumBaños;
	
	

	public TipoVivienda(int idInmobiliario, int areaInmueble, String dirInmueble,int cantidadHabitacion, int numBaños) {
		super(idInmobiliario, areaInmueble, dirInmueble);
		CantidadHabitacion = cantidadHabitacion;
		NumBaños = numBaños;
		
	}
	
	
	/*public double CalcularValorCompra(double valorMetro) {
		double valor=(this.AreaInmueble*valorMetro);
		return valor;
		
	}*/
	
	public void Imprimir() {
		String mensaje= " Identificacion Inmueble:" +this.idInmobiliario +"el area del inmueble es: "+this.AreaInmueble+""
				+ "Direccion "+this.dirInmueble+" Numero Habitaciones: "+ this.CantidadHabitacion+"Numero Baños:"+this.NumBaños;
		System.out.println(mensaje);
	}

}
