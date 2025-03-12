import java.util.*;  // Importa List, Map, Set, ArrayList, HashSet, HashMap, TreeMap, LinkedHashMap, Collections, Comparator
// Clase Factory para crear el mapa de Pokémon
class CreadorDeMapa {
    public static Map<String, PokemonData> crearMapa(int tipoMapa) {
        switch (tipoMapa) {
            case 1: return new HashMap<>();
            case 2: return new TreeMap<>();
            case 3: return new LinkedHashMap<>();
            default: throw new IllegalArgumentException("Opción inválida");
        }
    }
}