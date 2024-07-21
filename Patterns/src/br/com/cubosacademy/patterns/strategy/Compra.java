package br.com.cubosacademy.patterns.strategy;

public class Compra {
    private int valor;

    public Compra(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void processarCompra(EstrategiaCompra estrategiaCompra) {
        estrategiaCompra.pagar(this.valor);
    }
}
