package br.com.cubosacademy.patterns.strategy;

public class CompraDebito implements EstrategiaCompra {
    @Override
    public void pagar(int valor) {
        System.out.println("Compra realizada no débito, valor: R$ " + valor);
    }
}
