
package edu.eci.cvds.tdd.aerodescuentos;



public class CalculadorDescuentos {
    
    private long tarifaBase;
    private int diasAntelacion;
    private int edad;
    
    public CalculadorDescuentos(long tarifaBase, int diasAntelacion, int edad) {
        this.tarifaBase = tarifaBase;
        this.diasAntelacion = diasAntelacion;
        this.edad = edad;
    }
    
    /**
     * retorna la tarifa base
     * @return tarifa retornada
     */
    public long getTarifaBase (){
        return tarifaBase;
    }
    
    /**
     * retorna los dias de antelacion al vuelo      
     * @return dias de atenlacion
     */
    
    public int diasAntelacion (){
        return diasAntelacion;
    }
    /**
     * retorna la edad del pasajero
     * @return edad del pasajero
     */
    public int edad (){
        return edad;
    }
    
    /**
     * setea la tarifa base del vuelo
     * @param tarifaBase nueva tarifa base
     */
    public void setTarifaBase (long tarifaBase){
        this.tarifaBase = tarifaBase;
    }
    
    /**
     * setea los dias de antelacion al vuelo
     * @param diasAntelacion nuevos dias de antelacion
     */
    
    public void setDiasAntelacion (int diasAntelacion){
        this.diasAntelacion = diasAntelacion;
    }
    
    public void setEdad (int edad){
        this.edad=edad;
    }
    
    
    /**
     * 
     * calcular la tarifa de cada billete segun el trayecto, la antelacion
     * en la que se obtiene el billete y la edad del pasajero, de acuerdo
     * con la normativa 005.
     * 
     * @param tarifaBase base del vuelo
     * @param diasAntelacion dias de antelacion del vuelo
     * @param edad edad del pasajero
     * @throws ExcepcionParametrosInvalidas
     */
    
    public long calculoTarifa (long tarifaBase, int diasAntelacion, int edad) throws ExcepcionParametrosInvalidos{
        long contadorDescuento = 0;
        
        if (diasAntelacion > 20){
            contadorDescuento +=15;           
        }
        
        if (edad < 18){
            contadorDescuento += 5;
        }
        
        if (edad > 65){
            contadorDescuento +=8;
        }
        
        return ((tarifaBase*contadorDescuento)/100);  //calcula la tarifa base con el descuento aplicado
        
    }
    
    
    
}
