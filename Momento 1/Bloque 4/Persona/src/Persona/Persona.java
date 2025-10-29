package Persona;

public class Persona {

    private static final char SEXO_DEFECTO = 'H';
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = SEXO_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni.isEmpty() ? generarDNI() : dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_DEFECTO;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public int calcularIMC() {
        if (altura <= 0) {
            return PESO_BAJO;
        }
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    private String generarDNI() {
        int numero = (int) (Math.random() * 90000000) + 10000000;
        int resto = numero % 23;
        char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(resto);
        return numero + String.valueOf(letra);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", DNI: " + dni +
                ", Sexo: " + sexo +
                ", Peso: " + peso +
                " kg, Altura: " + altura + " m";
    }
}
