package colleciones;

public class Arboles 
{

	private double altura;
	private int yearEdad;
	private String lugarOrigen;
	private boolean hojaCaduca;
	private String nombre;
	
	
	
	public Arboles(String nombre, double altura, int yearEdad, String lugarOrigen, boolean hojaCaduca) 
	{
		super();
		this.altura = altura;
		this.yearEdad = yearEdad;
		this.lugarOrigen = lugarOrigen;
		this.hojaCaduca = hojaCaduca;
		this.nombre = nombre;
	}
	

	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public double getAltura() 
	{
		return altura;
	}
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	public int getyearEdad() 
	{
		return yearEdad;
	}
	public void setyearEdad(int yearEdad) 
	{
		this.yearEdad = yearEdad;
	}
	
	public String getLugarOrigen()
	{
		return lugarOrigen;
	}
	public void setLugarOrigen(String lugarOrigen) 
	{
		this.lugarOrigen = lugarOrigen;
	}
	public boolean isHojaCaduca()
	{
		return hojaCaduca;
	}
	public void setHojaCaduca(boolean hojaCaduca) 
	{
		this.hojaCaduca = hojaCaduca;
	}
	
	public String toString() 
	{
		String sino;
	
		if(hojaCaduca==true)
		{
			sino="Si";
		}
		
		{
			sino="No";
		}
		
		String msj = "\nNombre del arbol: "+nombre+"\nAltura: "+altura+"\nEdad en year: "+yearEdad+
					"\nLugar de origen: "+lugarOrigen+"\nHoja caduca: "+sino+"\n***********************";
		return msj;
	}
	
	
	
}
