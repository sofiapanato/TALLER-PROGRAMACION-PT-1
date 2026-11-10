public class Revista extends MaterialBibliografico{
    private int numeroEdicion;
    private String periodicidad;

    public Revista(String titulo, String autor, int añoPublicacion, boolean dispnible, int numeroEdicion,
            String periodicidad) {
        super(titulo, autor, añoPublicacion, dispnible);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
    }
    @Override 
    public String obtenerTipo(){
        return "Revista";
    }
    @Override 
    public int calcularDiasPrestamo(){
        return 7;
    }
    @Override 
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de edicion: "+numeroEdicion);
        System.out.println("Peridicidad: "+periodicidad);
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    
    
}
