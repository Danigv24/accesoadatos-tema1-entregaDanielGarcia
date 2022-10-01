package EntregasDGV.Puntos;

public class Punto {
    /*Atributos */
    protected int iX;
    protected int iY;
   
    
    /*Constructor */
    public Punto(int iX, int iY) {
        this.iX = iX;
        this.iY = iY;
    }
    public int getiX() {
        return iX;
      }
    
      public int getiY() {
        return iY;
      }
      /*METODO  */
    public double dDistancia(Punto otroPunto) {
        double x1 = iX - otroPunto.getiX();
        double y1 = iY - otroPunto.getiY();
        return Math.sqrt(x1 * x1 + y1 * y1);
      }
      @Override
    public boolean equals(Object obj) {
      // TODO Auto-generated method stub
      return super.equals(obj);
    }
    public int getiZ() {
      return 0;
    }

  
}
