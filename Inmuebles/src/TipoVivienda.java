
public class TipoVivienda extends Inmuebles {
	
	int CantidadHabitacion;
	int NumBa�os;
	
	

	public TipoVivienda(int idInmobiliario, int areaInmueble, String dirInmueble,int cantidadHabitacion, int numBa�os) {
		super(idInmobiliario, areaInmueble, dirInmueble);
		CantidadHabitacion = cantidadHabitacion;
		NumBa�os = numBa�os;
		
	}
	
	
	/*public double CalcularValorCompra(double valorMetro) {
		double valor=(this.AreaInmueble*valorMetro);
		return valor;
		
	}*/
	
	public void Imprimir() {
		String mensaje= " Identificacion Inmueble:" +this.idInmobiliario +"el area del inmueble es: "+this.AreaInmueble+""
				+ "Direccion "+this.dirInmueble+" Numero Habitaciones: "+ this.CantidadHabitacion+"Numero Ba�os:"+this.NumBa�os;
		System.out.println(mensaje);
	}

}
