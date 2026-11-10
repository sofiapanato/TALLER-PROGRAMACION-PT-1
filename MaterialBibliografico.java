public abstract class MaterialBibliografico {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    public MaterialBibliografico(String titulo, String autor, int añoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = disponible;
    }

    public abstract String obtenerTipo();
    public abstract int calcularDiasPrestamo();
    public boolean prestar() {
        if (!disponible) {
            return false;
        }
        disponible = false;
        return true;
    }
    public boolean devolver() {
        if (disponible) {
            return false;
        }
        disponible = true;
        return true;
    }
    public void mostrarInformacion() {
        System.out.println("["+obtenerTipo()+"] "+ titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicacion: "+añoPublicacion);
        System.out.println("Disponible: "+ (disponible ? "Sí" : "No"));
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
     }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }   
    public boolean isDisponible() { 
        return disponible; 
    }
        
        
}