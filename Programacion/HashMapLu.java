package colleciones;

import java.util.HashMap;

public class HashMapLu

{
	
		public static void main(String[] args) 
		
		{
			HashMap<Integer, String> myHS = new HashMap<Integer, String>();
			
			myHS.put(1, "Maria Salomea Sklodowsk");
			myHS.put(2, "Santiago Ramon y Cajal");
			myHS.put(3, "Teano de Crotona");
			myHS.put(4, "Mariano Barbacid");
			myHS.put(5, "Augusta Ada Byron");
			
			HashMap<Integer, String> myHSNacion = new HashMap<Integer, String>();
			
			myHSNacion.put(1, "Polaca");
			myHSNacion.put(2, "Espanola");
			myHSNacion.put(3, "Griega");
			myHSNacion.put(4, "Espanola");
			myHSNacion.put(5, "Inglesa");
		
			System.out.println("El HashMap tiene una longitud de "+myHS.size()+" elementos. ");
			
			
			System.out.println("");
			System.out.println("Posicion: "+1+". Nombre: "+myHS.get(1)+". Nacionaidad: "+myHSNacion.get(1));
			System.out.println("Posicion: "+2+". Nombre: "+myHS.get(2)+". Nacionaidad: "+myHSNacion.get(2));
			System.out.println("Posicion: "+3+". Nombre: "+myHS.get(3)+". Nacionaidad: "+myHSNacion.get(3));
		
		
			
			myHS.replace(4, "Mariano Barbacid ", "Margarita Salas Falgueras");
		
		
			System.out.println("");
			System.out.println("Impresion del HashMap completo");
			System.out.println("==============================");
			System.out.println("Posicion: "+1+" *** Nombre: "+myHS.get(1));
			System.out.println("Posicion: "+2+" *** Nombre: "+myHS.get(2));
			System.out.println("Posicion: "+3+" *** Nombre: "+myHS.get(3));
			System.out.println("Posicion: "+4+" *** Nombre: "+myHS.get(4));
			System.out.println("Posicion: "+5+" *** Nombre: "+myHS.get(5));
		}

	}


