package Q5SalarioMinimo;

public class Minimo {
    public double slMinimo;
    public double slUsuario;

    public Minimo(double slMinimo, double slUsuario) {
        this.slMinimo = slMinimo;
        this.slUsuario = slUsuario;
    }

    public double quantidade() {
        return this.slUsuario / this.slMinimo;

    }
}