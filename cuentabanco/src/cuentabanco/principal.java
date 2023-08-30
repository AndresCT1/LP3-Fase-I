package cuentabanco;
import java.util.*;

public class principal {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		double cantidad;
		int opcion;
		System.out.println("Ingresa tu nombre: ");
		String nombre= leer.nextLine();
		System.out.println("¿Deseas ingresar una cantidad inicial? S/N");
		String opc = leer.nextLine();
		if(opc.equalsIgnoreCase("S")) {
			System.out.println("Ingresa la cantidad inicial ");
			cantidad = leer.nextDouble();
		}
		else {
			cantidad = 0;
		}
		
		cuentabanco BCP = new cuentabanco(nombre);
		BCP.setCantidad(cantidad);
		System.out.println(BCP.toString());
		
		do {
			System.out.println("BIENVENIDO AL CAJERO");
			System.out.println("1. Ingresar ");
			System.out.println("2. Retirar ");
			System.out.println("3. Ver saldo ");
			System.out.println("4. Salir ");
			opcion = leer.nextInt();
			
			switch(opcion) {
				
				case 1:
					System.out.println("Ingrese la cantidad a depositar: ");
					cantidad = leer.nextDouble();
					BCP.ingresar(cantidad);
					break;
				case 2:
					System.out.println("Ingrese la cantidad a retirar: ");
					cantidad = leer.nextDouble();
					BCP.retirar(cantidad);
					break;
				case 3:
					BCP.verSaldo();
					break;
			}
		} while(opcion !=4);
	}

}
