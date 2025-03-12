import java.util.*;
// Clase para gestionar los Pokémon
class GestorPokemon {
    private Map<String, PokemonData> catalogoPokemon;
    private Set<PokemonData> coleccionUsuario;
    
    public GestorPokemon(int tipoMapa) {
        this.catalogoPokemon = CreadorDeMapa.crearMapa(tipoMapa);
        this.coleccionUsuario = new HashSet<>();
    }
    
    public void agregarPokemon(String nombre, String tipo1, String tipo2, String habilidad) {
        catalogoPokemon.put(nombre, new PokemonData(nombre, tipo1, tipo2, habilidad));
    }
    
    public boolean agregarPokemonUsuario(String nombre) {
        PokemonData pokemon = catalogoPokemon.get(nombre);
        if (pokemon == null) {
            System.out.println("Error: Pokémon no encontrado en el catálogo.");
            return false;
        }
        if (!coleccionUsuario.add(pokemon)) {
            System.out.println("Este Pokémon ya está en tu colección.");
            return false;
        }
        return true;
    }
    
    public void mostrarDatosPokemon(String nombre) {
        PokemonData pokemon = catalogoPokemon.get(nombre);
        if (pokemon != null) {
            System.out.println(pokemon);
        } else {
            System.out.println("Pokémon no encontrado.");
        }
    }
    
    public void listarPokemonUsuarioPorTipo() {
        List<PokemonData> lista = new ArrayList<>(coleccionUsuario);
        lista.sort(Comparator.comparing(p -> p.tipo1));
        lista.forEach(System.out::println);
    }
    
    public void listarTodosLosPokemonPorTipo() {
        List<PokemonData> lista = new ArrayList<>(catalogoPokemon.values());
        lista.sort(Comparator.comparing(p -> p.tipo1));
        lista.forEach(System.out::println);
    }
    
    public void buscarPokemonPorHabilidad(String habilidad) {
        catalogoPokemon.values().stream()
            .filter(p -> p.habilidad.equalsIgnoreCase(habilidad))
            .forEach(System.out::println);
    }
}