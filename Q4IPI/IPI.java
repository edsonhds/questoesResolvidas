package Q4IPI;

public class IPI {
    double porcento;
    int cod1;
    double val1;
    int quant1;
    int cod2;
    double val2;
    int quant2;

    public IPI(double porcento, int cod1, double val1, int quant1, int cod2, double val2, int quant2) {
        this.porcento = porcento;
        this.cod1 = cod1;
        this.val1 = val1;
        this.quant1 = quant1;
        this.cod2 = cod2;
        this.val2 = val2;
        this.quant2 = quant2;
    }
    public double valFinal(){

      return ((this.val1 * this.quant1) + (this.val2 * this.quant2)) * ((this.porcento / 100) + 1);

    }
}









