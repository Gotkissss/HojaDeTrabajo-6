import java.util.Scanner; // Importa Scanner
// Clase principal para la ejecución del programa
public class SistemaPokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== SISTEMA DE GESTIÓN DE POKÉMON =====");
        System.out.println("Seleccione la implementación de mapa a utilizar:");
        System.out.println("1. HashMap (acceso rápido, sin orden específico)");
        System.out.println("2. TreeMap (ordenado alfabéticamente por nombre)");
        System.out.println("3. LinkedHashMap (mantiene orden de inserción)");
        System.out.print("Su elección (1-3): ");
        int tipoMapa = scanner.nextInt();
        scanner.nextLine();
        
        GestorPokemon gestor = new GestorPokemon(tipoMapa);
        
        gestor.agregarPokemon("Pikachu", "Eléctrico", "Ninguno", "Electricidad estática");
        gestor.agregarPokemon("Charmander", "Fuego", "Ninguno", "Mar llamas");
        gestor.agregarPokemon("Bulbasaur", "Planta", "Veneno", "Espesura");
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Pokémon a la colección del usuario");
            System.out.println("2. Mostrar datos de un Pokémon");
            System.out.println("3. Mostrar colección del usuario ordenada por tipo");
            System.out.println("4. Mostrar todos los Pokémon ordenados por tipo");
            System.out.println("5. Buscar Pokémon por habilidad");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del Pokémon: ");
                    String nombre = scanner.nextLine();
                    gestor.agregarPokemonUsuario(nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Pokémon: ");
                    nombre = scanner.nextLine();
                    gestor.mostrarDatosPokemon(nombre);
                    break;
                case 3:
                    gestor.listarPokemonUsuarioPorTipo();
                    break;
                case 4:
                    gestor.listarTodosLosPokemonPorTipo();
                    break;
                case 5:
                    System.out.print("Ingrese la habilidad: ");
                    String habilidad = scanner.nextLine();
                    gestor.buscarPokemonPorHabilidad(habilidad);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
        
        scanner.close();
    }
}