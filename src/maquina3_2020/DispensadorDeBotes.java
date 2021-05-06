package maquina3_2020;

/**
 * @author Martin R. Rinn Lacuesta
 * @version 1
 * @see maquina3_2020.ContadorDeMonedas
 * @see maquina3_2020.MaquinaDeBebidas
 * @see maquina3_2020.Maquina3_2020
 * @see maquina3_2020.Test_Maquina3
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
