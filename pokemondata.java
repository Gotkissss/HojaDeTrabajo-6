// Clase para manejar los datos de los Pokémon
class PokemonData {
    String nombre;
    String tipo1;
    String tipo2;
    String habilidad;
    
    public PokemonData(String nombre, String tipo1, String tipo2, String habilidad) {
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.habilidad = habilidad;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + tipo1 + " / " + tipo2 + " - Habilidad: " + habilidad;
    }
}