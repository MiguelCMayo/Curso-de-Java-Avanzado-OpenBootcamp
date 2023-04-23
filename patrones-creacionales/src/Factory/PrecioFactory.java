package Factory;

public class PrecioFactory {
    Precio precio;

    public PrecioFactory() {}

    public PrecioFactory(String pais){
        if(pais.equalsIgnoreCase("Spain")){
            System.out.println("Spain, precio en EUR");
            precio = new PrecioEUR();
        }else if(pais.equalsIgnoreCase("UK")){
            System.out.println("UK, precio en GBP");
            precio = new PrecioGBP();
        }else{
            System.out.println("Otro pais, precio en USD");
            precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}
