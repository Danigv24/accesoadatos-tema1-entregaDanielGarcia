package EntregasDGV.Parking;

interface parking {
    public boolean hayPlaza();
    public void aparcaCoche(vehiculo coche) throws Exception;
    public void sacaCoche(vehiculo coche) throws Exception;
    public double getFactura(vehiculo coche) throws Exception;

}
