public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    public void engordar() {
        peso=0;
        System.out.println("La mascota ha subido de peso.");
    }

    public void adelgazar() {
        peso=0;
        System.out.println("La mascota ha bajado de peso.");
    }

    public void enfermar() {
        saludable = false;
        System.out.println("La mascota se enfermó.");
    }

    public void recuperarSalud() {
        saludable = true;
        System.out.println("La mascota se recuperó.");
    }

    public String mostrarFicha() {
        return "\nNombre: " + nombre +
                "\nEspecie: " + especie +
                "\nEdad: " + edad +
                "\nPeso: " + peso +
                "\nSaludable: " + saludable;
    }
}