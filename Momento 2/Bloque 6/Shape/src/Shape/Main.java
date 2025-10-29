package Shape;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("blue", true);
        System.out.println(s1);

        Circle c1 = new Circle(2.5, "green", false);
        System.out.println(c1);
        System.out.println("Área del círculo: " + c1.getArea());
        System.out.println("Perímetro del círculo: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println(r1);
        System.out.println("Área del rectángulo: " + r1.getArea());
        System.out.println("Perímetro del rectángulo: " + r1.getPerimeter());

        Square sq1 = new Square(3.0, "purple", true);
        System.out.println(sq1);
        System.out.println("Área del cuadrado: " + sq1.getArea());
    }
}
