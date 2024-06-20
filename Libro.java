
package Bibliotecaas;
public class Libro {
    public String titulo;
    public String autor;
    public int paginas;
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void abrir() {
        System.out.println("El libro '" + titulo + "' está abierto.");
    }
    public void leer() {
        System.out.println("El libro '" + titulo + "' está siendo leído.");
    }
    public void cerrar() {
        System.out.println("El libro '" + titulo + "' está cerrado.");
    }
    public static void main(String[] args) {
        // Crear dos objetos de tipo Libro
        Libro libro1 = new Libro("Amanecer", "Stephenie Meyer", 829);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        libro1.abrir();
        libro2.leer();
    }
}

