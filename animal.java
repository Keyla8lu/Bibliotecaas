package animal; 
public class animal {
    public String nombre;
    public int edad;
    public String tipo;

    public animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
    public void hacerSonido() {
        System.out.println(nombre + " está haciendo un sonido.");
    }
    public static void main(String[] args) {
        animal perro = new animal("Saico", 4, "Perro");
        animal gato = new animal("Gargamel", 8, "Gato");

        perro.comer();
        gato.dormir();
    }
}
