package Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5, "blue");
        System.out.println(c1);
        System.out.println("Área del círculo: " + c1.getArea());

        Cylinder cy1 = new Cylinder(2.5, 5.0, "green");
        System.out.println("\n" + cy1);
        System.out.println("Altura: " + cy1.getHeight());
        System.out.println("Volumen del cilindro: " + cy1.getVolume());
    }
}
