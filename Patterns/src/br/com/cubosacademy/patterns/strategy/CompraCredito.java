package br.com.cubosacademy.patterns.strategy;

public class CompraCredito implements EstrategiaCompra{
    @Override
    public void pagar(int valor) {
        System.out.println("Compra realizada no crédito, valor: R$ " + valor);
    }
}
