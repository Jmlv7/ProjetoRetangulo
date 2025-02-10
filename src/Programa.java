public class Rectangle {
    private double largura;
    private double altura;

    // Getters
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}
