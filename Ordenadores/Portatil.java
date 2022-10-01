package EntregasDGV.Ordenadores;

public class Portatil extends Ordenador {
    private int iPeso;
    public Portatil(String paramCodigo, int paramRam, int paramCPU, int paramPrecio,int paramPeso) {
        super(paramCodigo, paramRam, paramCPU, paramPrecio);
        this.iPeso=paramPeso;
    }
    public int getiPeso() {
        return iPeso;
    }
    public void setiPeso(int iPeso) {
        this.iPeso = iPeso;
    }
    @Override
    public String toString() {
        return "Portatil [iPeso=" + iPeso + "]";
    }
    public void getCaracteristicas(){
        System.out.println("El portatil tiene:"+"\nCodigo: "+sCodigo+"\nRAM(GB): "+iRam+"\nCPU(GHz): "+iCPU+"\nPrecio($): "+iPrecio+
        "\nPeso(g): "+iPeso);
    }
}
