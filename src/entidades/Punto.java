public class Punto {
    
    private double x;
    private double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDis(Punto punto){
        double distancia = Math.sqrt(Math.pow((punto.getX() - this.x), 2) + Math.pow((punto.getY() - this.y), 2));
        return distancia;
    }

}
