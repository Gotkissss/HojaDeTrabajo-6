// Clase para representar un Pokémon
class PokemonData {
    // Atributos privados
    private String nombrePokemon;
    private String tipoPrimario;
    private String tipoSecundario;
    private int totalStats;
    private int puntosVida;
    private int poderAtaque;
    private int poderDefensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private int generacion;
    private boolean esLegendario;
    private String habilidadEspecial;
    
    // Constructor alternativo
    public PokemonData(String[] datos) {
        this.nombrePokemon = datos[0];
        this.tipoPrimario = datos[1];
        this.tipoSecundario = datos[2];
        this.totalStats = Integer.parseInt(datos[3]);
        this.puntosVida = Integer.parseInt(datos[4]);
        this.poderAtaque = Integer.parseInt(datos[5]);
        this.poderDefensa = Integer.parseInt(datos[6]);
        this.ataqueEspecial = Integer.parseInt(datos[7]);
        this.defensaEspecial = Integer.parseInt(datos[8]);
        this.velocidad = Integer.parseInt(datos[9]);
        this.generacion = Integer.parseInt(datos[10]);
        this.esLegendario = Boolean.parseBoolean(datos[11]);
        this.habilidadEspecial = datos[12];
    }
    
    // Métodos para acceder a los atributos
    public String obtenerNombre() { return nombrePokemon; }
    public String obtenerTipoPrimario() { return tipoPrimario; }
    public String obtenerTipoSecundario() { return tipoSecundario; }
    public int obtenerTotal() { return totalStats; }
    public int obtenerPuntosVida() { return puntosVida; }
    public int obtenerAtaque() { return poderAtaque; }
    public int obtenerDefensa() { return poderDefensa; }
    public int obtenerAtaqueEspecial() { return ataqueEspecial; }
    public int obtenerDefensaEspecial() { return defensaEspecial; }
    public int obtenerVelocidad() { return velocidad; }
    public int obtenerGeneracion() { return generacion; }
    public boolean esLegendario() { return esLegendario; }
    public String obtenerHabilidad() { return habilidadEspecial; }
    
    // Método para representar como cadena
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Información de ").append(nombrePokemon).append(":\n");
        sb.append("- Tipo primario: ").append(tipoPrimario).append("\n");
        sb.append("- Tipo secundario: ").append(tipoSecundario.isEmpty() ? "N/A" : tipoSecundario).append("\n");
        sb.append("- Estadísticas totales: ").append(totalStats).append("\n");
        sb.append("- Puntos de vida: ").append(puntosVida).append("\n");
        sb.append("- Ataque: ").append(poderAtaque).append("\n");
        sb.append("- Defensa: ").append(poderDefensa).append("\n");
        sb.append("- Ataque especial: ").append(ataqueEspecial).append("\n");
        sb.append("- Defensa especial: ").append(defensaEspecial).append("\n");
        sb.append("- Velocidad: ").append(velocidad).append("\n");
        sb.append("- Generación: ").append(generacion).append("\n");
        sb.append("- ¿Es legendario?: ").append(esLegendario ? "Sí" : "No").append("\n");
        sb.append("- Habilidad especial: ").append(habilidadEspecial);
        return sb.toString();
    }
}