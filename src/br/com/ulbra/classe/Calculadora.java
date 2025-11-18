package br.com.ulbra.classe;



public class Calculadora {

    private double total;

    public Calculadora() {
        this.total = 0.0;
    }

    public double getTotal() {
        return this.total;
    }

    public void clear() {
        total = 0.0;
    }

    public double calcular(String op, double valor) {
        if (op.equals("SUM")) {
            total += valor;
        } else if (op.equals("SUB")) {
            if (total == 0.0) {
                total = valor;
            } else {
                total -= valor;
            }
        } else if (op.equals("DIV")) {
  if (total == 0.0) {
                total = valor;
            } else {
                total /= valor;
            }
        } else if (op.equals("MULT")) {
           if (total == 0.0) {
                total = valor;
            } else {
                total *= valor;
            }
        }
        return total;
    }

}
