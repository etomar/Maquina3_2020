package maquina3_2020;

/**
 * @author Dan Nedelea
 * */
public class DispensadorDeBotes {
	
	private int botes; 

     
    
    
    public void iniciarDispensadorDeBotes (int i){
        botes = i;
        
    }
    
    /*
    * Intenta dar un bote, devuelve true si es posible y falso
    * si no hay botes. 
    * Entrada: Ninguna 
    * Salidas: bool, true si entrega el bote */
    
    public boolean pulsarBoton (){
        boolean hay = false;
        if(botes>0){
            hay= true;
            botes--;
        }
        else
            hay= false;
        return hay;
    }
    
    /*Muestra el numero de botes disponibles en el dispensador*/
    /* Entrada: Ninguna */
    /* Salidas: int, el numero de botes */
    
    public int botesDisponibles (){
        return botes;
        
    }
}