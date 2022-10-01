package EntregasDGV.Puntos;

public class Punto3D extends Punto {
    /*Atributos */
        protected int iZ;
    
    
    @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }
        /*Constructores */
        public Punto3D(int iX, int iY, int iZ) {
        super(iX, iY);
        this.iZ = iZ;
    }
        public Punto3D(int iX, int iY) {
            super(iX, iY);
            //TODO Auto-generated constructor stub
        }
        /*Getters */
        public int getiZ() {
            return iZ;
        }
    /*Metodo */
        public double dDistancia(Punto otroPunto) {
            double x1 = iX - otroPunto.getiX();
            double y1 = iY - otroPunto.getiY();
            double z1 = iZ - otroPunto.getiZ();
            return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
          }
    
    }
