import java.util.ArrayList;

public class Poligono {

    private ArrayList<Punto> puntos;

    public Poligono(Punto p1, Punto p2, Punto p3) {
        this.puntos = new ArrayList<>();
        this.puntos.add(p1);
        this.puntos.add(p2);
        this.puntos.add(p3);
    }

    public boolean agregarPunto(Punto punto){
        for(int i = 0; i < this.puntos.size(); i++){
            if (this.puntos.get(i).getX() == punto.getX() && this.puntos.get(i).getY() == punto.getY()){
                return false;
            }
        }
        this.puntos.add(punto);
        return true;
    }

    public double calcularPerimetro(){
        double perimetro = this.puntos.get(0).calcularDis(this.puntos.get(this.puntos.size() - 1));
        for(int i = 0; i < this.puntos.size() - 1; i++){
            perimetro += this.puntos.get(i).calcularDis(this.puntos.get(i+1));
        }
        return perimetro;
    }
    
    
}
