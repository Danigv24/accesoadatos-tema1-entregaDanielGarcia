package EntregasDGV.Parking;

import java.time.LocalDateTime;

public class vehiculo {
    private String sMatricula;
    private LocalDateTime lFechaIni;
    private LocalDateTime lFechaFin;
    public vehiculo(String paramMatricula) {
        this.sMatricula = paramMatricula;
        
    }
    public String getsMatricula() {
        return sMatricula;
    }
    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    public LocalDateTime getlFechaIni() {
        return lFechaIni;
    }
    public void setlFechaIni(LocalDateTime lFechaIni) {
        this.lFechaIni = lFechaIni;
    }
    public LocalDateTime getlFechaFin() {
        return lFechaFin;
    }
    public void setlFechaFin(LocalDateTime lFechaFin) {
        this.lFechaFin = lFechaFin;
    }
    
}
