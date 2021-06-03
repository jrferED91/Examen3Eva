package EJERCICIO_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPedirDatos {
	
	static Logger log = LogManager.getLogger(MainPedirDatos.class); 
	
	public static void main(String[] args) {
		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			Nodo nodo = new Nodo(valor);
			
			if(valor!=0) {
				lista.add(nodo);
				if(valor%2==0) {
					log.debug("Se ha introducido un valor par");
				}else {
					log.info("Se ha introducido un valor impar en la lista");
				}
			}
		}while(valor!=0);

	}

}
