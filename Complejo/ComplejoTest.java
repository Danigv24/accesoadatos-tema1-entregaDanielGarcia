package EntregasDGV.Complejo;

public class ComplejoTest {
    public static void main(String[] args) {                                                 
        // declaración de números complejos
        Complejo c1 = new Complejo(1.0, 1.0);
        Complejo c2 = new Complejo(2.0, 2.0);
        Complejo c3;
        // operadores aritméticos
        c3 = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
