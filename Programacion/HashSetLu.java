package colleciones;

import java.util.*;

public class HashSetLu extends Arboles
{
	public HashSetLu(String nombre, double altura, int yearEdad, String lugarOrigen, boolean hojaCaduca) 
	{
		super(nombre, altura, yearEdad, lugarOrigen, hojaCaduca);
	}

	
	
	public static void main(String[] args)
	{
		
		
		HashSet<Arboles> myArbolesHS = new HashSet<Arboles>();
		
		myArbolesHS.add(new HashSetLu("Roble", 12.5, 80, "Canada", true));
		myArbolesHS.add(new HashSetLu("Encina", 5.25, 90, "Espana", false));
		myArbolesHS.add(new HashSetLu("Pino Laricio", 22.5, 80, "Italia", false));
		myArbolesHS.add(new HashSetLu("Roble",  5.5, 15, "Canada", true));
		myArbolesHS.add(new HashSetLu("Manzano", 3.5, 60, "India", false));
		
		Arboles ArbolesHS[] = new Arboles[myArbolesHS.size()];
		
		if(myArbolesHS.size() != 0)
		{
			ArbolesHS = myArbolesHS.toArray(ArbolesHS);
		}
		
		
		System.out.println();
		System.out.println("El size del HashSet es de "+myArbolesHS.size()+" elementos");
		
		
		System.out.println();
		myArbolesHS.toArray();
		
	
		System.out.println();
		System.out.println("Listo el array");
		System.out.println("==============");
		for (Arboles c: myArbolesHS) 
		{
				System.out.println(c);
		}
		
		System.out.println("");
		System.out.println("Listo HashSet");
		System.out.println("=============");
		for(Arboles o: ArbolesHS){
			System.out.println(o);
		}
	
	
	}





}
