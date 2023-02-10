package calculadora.daw;

/**
 *
 * @author usuario
 */
public class Calculadora {

    private int op1;
    private int op2;
    private int resultado;

    public int suma(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.resultado = op1 + op2;
        return this.resultado;
    }

    public int resta(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.resultado = op1 - op2;
        return this.resultado;
    }

    public int multiplica(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.resultado = op1 * op2;
        return this.resultado;
    }

    public int divide(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.resultado = op1 / op2;
        return this.resultado;
    }
}
