package EntregasDGV.Ordenadores;

public class Ordenador {
    protected String sCodigo;
    protected int iRam;
    protected int iCPU;
    protected int iPrecio;
    
    public Ordenador(String paramCodigo, int paramRam, int paramCPU, int paramPrecio) {
        this.sCodigo = paramCodigo;
        this.iRam = paramRam;
        this.iCPU = paramCPU;
        this.iPrecio = paramPrecio;
    }

    public String getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public void setiRam(int iRam) {
        this.iRam = iRam;
    }

    public int getiCPU() {
        return iCPU;
    }

    public void setiCPU(int iCPU) {
        this.iCPU = iCPU;
    }

    public int getiPrecio() {
        return iPrecio;
    }

    public void setiPrecio(int iPrecio) {
        this.iPrecio = iPrecio;
    }

    @Override
    public String toString() {
        return "Ordenador [iCPU=" + iCPU + ", iPrecio=" + iPrecio + ", iRam=" + iRam + ", sCodigo=" + sCodigo + "]";
    }
    
}
