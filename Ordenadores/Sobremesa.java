package EntregasDGV.Ordenadores;

public class Sobremesa extends Ordenador {
    private String sTipoTorre;
    public Sobremesa(String paramCodigo, int paramRam, int paramCPU, int paramPrecio, 
        String paramTipoTorre) {
        super(paramCodigo, paramRam, paramCPU, paramPrecio);
        this.sTipoTorre=paramTipoTorre;
    }
    public String getsTipoTorre() {
        return sTipoTorre;
    }
    public void setsTipoTorre(String sTipoTorre) {
        this.sTipoTorre = sTipoTorre;
    }
    @Override
    public String toString() {
        return "Sobremesa [sTipoTorre=" + sTipoTorre + "]";
    }
    public void getCaracteristicas(){
        System.out.println("La Torre tiene:"+"\nCodigo: "+sCodigo+"\nRAM(GB): "+iRam+"\nCPU(GHz): "+iCPU+"\nPrecio($): "+iPrecio+
        "\nTipo de Torre: "+sTipoTorre);
    }
}
