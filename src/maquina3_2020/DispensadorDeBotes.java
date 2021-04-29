package maquina3_2020;


class DispensadorDeBotes {

	private int botes; 
	
	public DispensadorDeBotes(int i) {
		
		botes = i;
	
	}
	public boolean pulsarBoton(){
		
		if(botes == 0) {
			
			return false;
		}
		
		return true;
		
	}
	public int botesDisponibles(){
		
		return botes;
			
	}
	 
}
