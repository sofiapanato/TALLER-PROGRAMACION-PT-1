public class Libro extends MaterialBibliografico {
    private int numeroPaginas;
    private String genero;
//constructores
    public Libro(String titulo, String autor, int añoPublicacion, boolean dispnible, int numeroPaginas, String genero) {
        super(titulo, autor, añoPublicacion, dispnible);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }
 //metodos reescritos   
    @Override 
    public String obtenerTipo() {
        return "Libro";
    }
    @Override
    public int calcularDiasPrestamo() {
        return 21;
    }
    @Override 
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de paginas: "+numeroPaginas);
        System.out.println("Genero: "+genero);  
    }
//getters nuevos    
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public String getGenero() {
        return genero;
    }
    
}

