package colleciones;

import java.util.*;

public class ArraylistLu extends Arboles
{

	
	
	public ArraylistLu(String nombre, double altura, int yearEdad, String lugarOrigen, boolean hojaCaduca) 
	{
		super(nombre, altura, yearEdad, lugarOrigen, hojaCaduca);
	}

	public static void main(String[] args) 
	{
			
		boolean existe= false;
			
			
			ArrayList<Arboles> myArboles = new ArrayList<Arboles>();
			
			myArboles.add(new ArraylistLu("Roble",12.5, 80, "Canada", true));
			myArboles.add(new ArraylistLu("Encina", 5.25, 90, "Espana", false));
			myArboles.add(new ArraylistLu("Pino Laricio", 22.5, 80, "Italia", false));
			myArboles.add(new ArraylistLu("Roble",  5.5, 15, "Canada", true));
			myArboles.add(new ArraylistLu("Manzano", 3.5, 60, "India", false));
			
			Arboles listaArray[] = new  Arboles[myArboles.size()];
			
			
			if(myArboles.isEmpty()==true) 
			{
				System.out.println("El array list esta vacio");
			}
			else 
			{
				
				listaArray = myArboles.toArray(listaArray);
			}
			
			
			
			
			
			for (int i=0; i<myArboles.size(); i++)
			{  
				 if(myArboles.get(i).getNombre() == "Peral" && myArboles.get(i).getLugarOrigen() == "Canada")
					 existe = true;
			}
			
			 if (existe == true)
					System.out.println("* El arbol Peral de lugar de origen Canada, existe");
				else
					System.out.println("* El arbol Peral de lugar de origen Canada, no existe");
			 
			
			
			
			for (int i=0; i<myArboles.size(); i++) 
			{  
				
				boolean encontrado=false;
				
				if(myArboles.get(i).getAltura() == 3.5 ) 
				{
					
					
					encontrado=true; 
					System.out.println("* La posicion del arbol de 3.5 de alto esta en la posicion "+i);
					
				}
				else if(myArboles.get(i).getAltura() != 3.5)
				{  
					
				}
				else if(encontrado==false) 
				{ 
				
					System.out.println("* La posicion del arbol de 3.5 de alto no se encuentra");
				}
			}
			
			
			
			
			for (int i=0; i<myArboles.size(); i++) { 
				
				if(myArboles.get(i).getNombre() == "Encina" ) {
					
					myArboles.get(i).setyearEdad(95);
					
					System.out.println("* Edad de Encina de 90 anos se ha cambiado a 95");
			}
			}
			
			
		
			for (int i=0; i<myArboles.size(); i++) {
				
				if(myArboles.get(i).getNombre() == "Roble" && myArboles.get(i).isHojaCaduca()==true ) {
					
					myArboles.remove(i);
				
				}
			}
			System.out.println("* Se ha borrado el Roble de hoja caduca");
			
			
			System.out.println();
			myArboles.trimToSize();
			
			
			
			
			
			Comparator<Arboles> comparator= new Comparator<Arboles>() 
			{
				
				public int compare(Arboles o1, Arboles o2) {
				
					return new Integer(o2.getyearEdad()).compareTo(new Integer(o1.getyearEdad()));
				}
			}
			;
			
			Collections.sort(myArboles,comparator);
			
		
			
			
			System.out.println("");
			System.out.println("Listo ArrayList");
			System.out.println("===============");
			
			for (Arboles a: myArboles) 
			{
					System.out.println(a);
			}
			
			System.out.println("");
			System.out.println("Listo Array");
			System.out.println("===========");
			
			for (Arboles b: listaArray) 
			{
					System.out.println(b);
			}
			
		
			

	}


}

	
