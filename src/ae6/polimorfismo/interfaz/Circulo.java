package ae6.polimorfismo.interfaz;

public class Circulo implements Figura{
	double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
