package EntregasDGV.Complejo;
/** 
 * @author DGV
 * @since sept 2022
 */

public class Complejo {
  private double dPReal;
  private double dPImag;

  //Constructor por defecto de la clase
  public Complejo() {
 
  }
  //Constructor con parámetros
  public Complejo(double dPReal, double dPImag) {
      this.dPReal = dPReal;
      this.dPImag = dPImag;
  }

  //métodos setters y getters
  public double getImag() {
      return dPImag;
  }

  public void setImag(double dPImag) {
      this.dPImag = dPImag;
  }

  public double getReal() {
      return dPReal;
  }

  public void setReal(double real) {
      this.dPReal = real;
  }
 
  //sumar dos números complejos
  //(a, b) + (c, d) = (a + c, b + d);
  public Complejo sumar(Complejo c){
      Complejo aux = new Complejo();
      aux.dPReal = dPReal + c.dPReal;
      aux.dPImag = dPImag + c.dPImag;
      return aux;
  }
 
  //método toString
  @Override
  public String toString() {
      return "(" + dPReal + ", " + dPImag + ")";
  }

 
}

