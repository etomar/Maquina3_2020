package maquina3_2020;

/**
 * @author Martin R. Rinn Lacuesta
 * @version 1
 */

class DispensadorDeBotes {

	private int botes; 
        
        /**
         * @param botes usado para aplicarle valores numericos o numero de botes en la máquina.
         */
	
	public DispensadorDeBotes(int i) {
		
		botes = i; 
                
        /**
         * @param i Permite aplicarle un valor numerico a botes, para que este no sea 0.
         */        
	
	}
	public boolean pulsarBoton(){
	
        /**
         * @return false En caso de que no hayan botes en la maquina, se devuelve un boolean false.
         * @return true En caso de que hayan botes en la maquina, la clase devuelve un boolean true.
         */    
            
		if(botes == 0) {
			
			return false;
		}
		
		return true;
		
	}
	public int botesDisponibles(){
		
        /**
         * @return botes Encargado de devolver el numero total de botes en la máquina.
         */    
            
		return botes;
			
	}
	 
}
