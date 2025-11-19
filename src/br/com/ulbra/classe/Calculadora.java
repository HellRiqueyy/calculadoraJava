package br.com.ulbra.classe;

public class Calculadora {

    private double total;
    private String lastOp;

    public String getLastOp() {
        return lastOp;
    }

    public void setLastOp(String lastOp) {
        this.lastOp = lastOp;
    }

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
            this.lastOp = "SUM";
        } else if (op.equals("SUB")) {
            this.lastOp = "SUB";
            if (total == 0.0) {
                total = valor;
            } else {
                total -= valor;
            }
        } else if (op.equals("DIV")) {
            this.lastOp = "DIV";
            if (total == 0.0) {
                total = valor;
            } else {
                total /= valor;
            }
        } else if (op.equals("MULT")) {
            this.lastOp = "MULT";
            if (total == 0.0) {
                total = valor;
            } else {
                total *= valor;
            }
        } else if (op.equals("PERC")) {
            double number = total;
            if (lastOp.equals("SUM")) {
                total += number * (0.01 * valor);
            } else if (lastOp.equals("SUB")) {
                total -= number * (0.01 * valor);;

            } else if (lastOp.equals("DIV")) {
                total /= number * (0.01 * valor);

            } else if (lastOp.equals("MULT")) {

                total *= number * (0.01 * valor);
            }
        }
        return total;
    }

    public double change(double valor) {
        if (valor == 0.0) {
            return valor;
        } else {
            return valor * -1;
        }
    }

   

}
