package Dijkstra;

public class No {
    
    private double peso;
    private double i;
    private double j;
    private No proximo;
    
    public No(double peso, double i, double j){
        this.peso = peso;
        this.i = i;
        this.j = j;
        proximo = null;   
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }
    
    
}
