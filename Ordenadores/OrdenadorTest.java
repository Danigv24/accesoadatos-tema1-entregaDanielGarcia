package EntregasDGV.Ordenadores;

public class OrdenadorTest {
    public static void main(String[] args) {
        Portatil ord1=new Portatil("Java", 16,5, 1500, 800);
        ord1.getCaracteristicas();
        Sobremesa ord2=new Sobremesa("C++", 8, 4, 750, "Triangular");
        ord2.getCaracteristicas();
    }

}
