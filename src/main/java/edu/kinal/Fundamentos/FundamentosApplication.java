
package edu.kinal.Fundamentos;
import edu.kinal.Fundamentos.models.Tarea;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private static List<Tarea> tareas = new ArrayList<Tarea>();
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		menu();
	}

	public static void menu(){
		String respuesta = "";
		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("1. Agregar");
			System.out.println("2. Listar");
			System.out.println("3. eliminar");
			System.out.println("4. salir");
			System.out.println("ingres su opcion");
			respuesta = leer.nextLine();
			if(respuesta.equalsIgnoreCase("1")){
				agregar();
			} else if (respuesta.equalsIgnoreCase("2")) {
				listar();
			} else if (respuesta.equalsIgnoreCase("3")){
				eliminar();
			}
		} while (!respuesta.equalsIgnoreCase("4"));

	}

	public static void agregar(){
		Scanner leer = new Scanner(System.in);
		Tarea nueva = new Tarea();
		nueva.setNumero(tareas.size() + 1);
		System.out.println("ingrese  la descripcion");
		nueva.setDescripcion(leer.nextLine());
		tareas.add(nueva);
	}

	public static void listar() {
		for (int i = 0; i < tareas.size(); i++){
			System.out.println("Tarea:".concat(String.valueOf(tareas.get(i).getNumero())).concat("-").concat(tareas.get(i).getDescripcion()));
		}
	}

	public static void eliminar() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el numero de la tarea que desea eliminar ");
		for (int i = 0; i < tareas.size(); i++) {
			System.out.println("Tarea:".concat(String.valueOf(tareas.get(i).getNumero())).concat("-").concat(tareas.get(i).getDescripcion()));
		}
			int numTarea = leer.nextInt();

		for (int i = 0; i < tareas.size(); i++) {
			if (tareas.get(i).getNumero() == numTarea) {
				tareas.remove(i);
				System.out.println("Tarea eliminada");
				return;
			}
		}
		System.out.println("el numero de tarea no se encontro en la lista");
	}

}



