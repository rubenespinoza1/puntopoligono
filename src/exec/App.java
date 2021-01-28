import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Punto p1 = new Punto(2, 2);
        Punto p2 = new Punto(5, 4);
        Punto p3 = new Punto(6, 3);
        Punto p4 = new Punto(2, 3);
        Poligono p = new Poligono(p1, p2, p3);
        p.agregarPunto(p4);
        System.out.println(p.calcularPerimetro());


    }
}
