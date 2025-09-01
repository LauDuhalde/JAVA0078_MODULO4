package ae6.polimorfismo.interfaz;

public class Cuadrado implements Figura{

	double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
