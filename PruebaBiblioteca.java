import java.util.ArrayList;
import java.util.Scanner;
public class PruebaBiblioteca {
  public static void main(String[] args) {
    ArrayList<MaterialBibliografico> materiales = new ArrayList<>();
    materiales.add(new Libro("Mujercitas", "Jane Austen", 1968, true, 688, "Novela"));
    materiales.add(new Revista("National Geographic", "Varios autores", 2026, false, 250, "Mensual"));
    materiales.add(new AudioLibro("El Hobbit", "J.R.R. Tolkien", 1937, true, 12, "Sofia"));

    System.out.println("CATALOGO:");
    for (int i = 0; i < materiales.size(); i++) {
    System.out.print((i + 1) + ". ");
        materiales.get(i).mostrarInformacion();
        System.out.println("----------------------------------------");
        }
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el numero en la lista del material que desea tomar en prestamo: ");
    int opcion = scanner.nextInt(); 
    
    if (opcion >= 1 && opcion <= materiales.size()){
        MaterialBibliografico seleccionado = materiales.get(opcion-1);

        if (seleccionado.prestar()){
            System.out.println("Prestamo exitoso. Devuelvelo en "+seleccionado.calcularDiasPrestamo()+" dias.");
        } else {
            System.out.println("Lo sentimos, el material que selecciono ya esta prestado.");
        } 
    } else {
            System.out.println("Numero invalido");
        }
        scanner.close();
    }
  }
  