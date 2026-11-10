public class AudioLibro extends MaterialBibliografico{
    private int duracionMinutos;
    private String narrador;

    public AudioLibro(String titulo, String autor, int añoPublicacion, boolean dispnible, int duracionMinutos,
            String narrador) {
        super(titulo, autor, añoPublicacion, dispnible);
        this.duracionMinutos = duracionMinutos;
        this.narrador = narrador;
    }

    @Override 
    public String obtenerTipo(){
        return "AudioLibro";
    }
    @Override 
    public int calcularDiasPrestamo(){
        return 14;
    }
    @Override 
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Duracion: "+duracionMinutos+" mins.");
        System.out.println("Narrador: "+narrador);
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public String getNarrador() {
        return narrador;
    }

    
}
