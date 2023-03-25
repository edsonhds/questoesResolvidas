package Q6AntesDepois;

public class antesDepois {
    public int numero;
    public antesDepois(int numero){
        this.numero = numero;
    }
    public int antecessor(){
       return this.numero -1;
    }
    public int sucessor(){
        return this.numero +1;
    }
}
