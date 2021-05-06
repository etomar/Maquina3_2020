//autor: Martin R. Rinn Lacuesta
//fecha: 06/05/2021
//descripcio: clases encargadas de proporcionar un valor a 
//los botes y determinar si la maquina esta vacia o llena.


package maquina3_2020;


class DispensadorDeBotes {

	private int botes; //Valor numerico indicando la cantidad de botes que hay.
	
	public DispensadorDeBotes(int i) {
		
		botes = i; //Le da un valor numerico a los botes.
	
	}
	public boolean pulsarBoton(){
		
            //Clase encargada de verificar si hay botes suficientes en la maquina
           //Si la misma sale true, es que hay suficientes y false en caso contrario.
            
		if(botes == 0) {
			
			return false;
		}
		
		return true;
		
	}
	public int botesDisponibles(){
		
            //Devuelve el total de botes restantes en la maquina.
            
		return botes;
			
	}
	 
}
