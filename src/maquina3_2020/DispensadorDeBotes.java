/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina3_2020;

/**
 * Para manejar la dispesación de los botes
 * @author Martin R. Rinn Lacuesta
 * @version 1.0
 * @see maquina3_2020.ContadorDeMonedas
 * @see maquina3_2020.MaquinaDeBebidas
 * @see maquina3_2020.Maquina3_2020
 * @see maquina3_2020.Test_Maquina3
 */

public class DispensadorDeBotes {

	private int botes;        
        /**
        * usado para aplicarle valores numericos o numero de botes en la máquina.
        */
	
	public DispensadorDeBotes(int i) {		
        botes = i;           
        /**
         * @param i Permite aplicarle un valor numerico a botes, para que este no sea 0.
         */        
	
	}
	public boolean pulsarBoton(){
	if(botes == 0) {		
		return false;
	}
		
		return true;
        /**
         * @return false En caso de que no hayan botes en la maquina, se devuelve un boolean false.
         * @return true En caso de que hayan botes en la maquina, la clase devuelve un boolean true.
         */   
	}
	public int botesDisponibles(){               
		return botes;
        /**
        * @return botes Encargado de devolver el numero total de botes en la máquina.
        */ 
			
	}
}

