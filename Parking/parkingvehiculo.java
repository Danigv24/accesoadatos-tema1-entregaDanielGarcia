package EntregasDGV.Parking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class parkingvehiculo implements parking {
    private static final double PRECIO_MINUTO=0.0425;
    private static final int MAXIMO_PLAZAS=100;
    private String direccion;
    private int plazasactuales;

    public parkingvehiculo(String paramdireccion, int paramplazasactuales) {
        this.direccion = paramdireccion;
        this.plazasactuales = paramplazasactuales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazasactuales() {
        return plazasactuales;
    }

    public void setPlazasactuales(int plazasactuales) {
        this.plazasactuales = plazasactuales;
    }

    @Override
    public boolean hayPlaza() {
        if(getPlazasactuales()<MAXIMO_PLAZAS){
            return true;
        }
        else{
            return false;
        }
    }

    
    @Override
    public void aparcaCoche(vehiculo coche) throws Exception {
        if(hayPlaza()){
             plazasactuales++;
             coche.setlFechaIni(LocalDateTime.now());
        }else{
            throw new Exception("Parking lleno");
        }
        
        
    }

    @Override
    public void sacaCoche(vehiculo coche) throws Exception{
        if(coche.getlFechaIni()!=null){
            plazasactuales--;
            coche.setlFechaFin(LocalDateTime.now());
       }else{
           throw new Exception("Error, te has confundido de parking");
       }
        
    }

    @Override
    public double getFactura(vehiculo coche) throws Exception{
        double pagar;
       if(coche.getlFechaFin()!=null){
         pagar=(ChronoUnit.MINUTES.between(coche.getlFechaIni(), coche.getlFechaFin()))*PRECIO_MINUTO;
        
       }else{
        throw new Exception("ERROR en la Factura");
       }
        return pagar;
    }

   
    
}
