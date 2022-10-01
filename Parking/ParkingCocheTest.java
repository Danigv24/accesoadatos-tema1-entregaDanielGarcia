package EntregasDGV.Parking;

public class ParkingCocheTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando el parking");
        try{
            vehiculo opel= new vehiculo("0987POI");
            vehiculo mazda=new vehiculo("1234QWE");
            vehiculo citroen=new vehiculo("4567KLM");
            vehiculo seat=new vehiculo("4321ZAQ");
            vehiculo porsche=new vehiculo("6789KJH");
            parkingvehiculo parking1=new parkingvehiculo("Plaza El Nano 1,Oviedo", 80);
            parking1.aparcaCoche(porsche);
            parking1.aparcaCoche(opel);
            parking1.aparcaCoche(mazda);
            parking1.aparcaCoche(citroen);
            parking1.aparcaCoche(seat);
            Thread.sleep(120*1000);
            parking1.sacaCoche(porsche);
            parking1.sacaCoche(mazda);
            Thread.sleep(60*1000);
            parking1.sacaCoche(opel);
            parking1.sacaCoche(citroen);
            Thread.sleep(60*1000);
            parking1.sacaCoche(seat);
            double dFacturaP=parking1.getFactura(porsche);
            double dFacturaM=parking1.getFactura(mazda);
            double dFacturaO=parking1.getFactura(opel);
            double dFacturaC=parking1.getFactura(citroen);
            double dFacturaS=parking1.getFactura(seat);
            System.out.println("El porsche debe pagar="+dFacturaP+
                                "\nEl mazda debe pagar="+dFacturaM+ 
                                "\nEl opel debe pagar="+dFacturaO+
                                "\nEl citroen debe pagar="+dFacturaC+ 
                                "\nEl seat debe pagar="+dFacturaS);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
