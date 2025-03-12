import java.util.*;  // Importa List, Map, Set, ArrayList, HashSet, HashMap, TreeMap, LinkedHashMap, Collections, Comparator


// Factory para los mapas
class CreadorDeMapa {
    // Constantes públicas
    public static final int OPCION_HASHMAP = 1;
    public static final int OPCION_TREEMAP = 2;
    public static final int OPCION_LINKEDHASHMAP = 3;
    
    // Método estático para crear el mapa
    public static Map<String, PokemonData> crearMapa(int tipoMapa) {
        if (tipoMapa == OPCION_HASHMAP) {
            return new HashMap<>();
        } else if (tipoMapa == OPCION_TREEMAP) {
            return new TreeMap<>();
        } else if (tipoMapa == OPCION_LINKEDHASHMAP) {
            return new LinkedHashMap<>();
        } else {
            throw new IllegalArgumentException("Opción de mapa inválida: " + tipoMapa);
        }
    }
}