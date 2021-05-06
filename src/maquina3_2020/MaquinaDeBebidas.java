/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina3_2020;

/**
 * Veremos la información de la máquina de bebidas, el sistema para meter monedas y el sistema para elegir el tipo de bebida
 * @author Adrián Miralles Gómez
 * Equipo: máquina 3.
 * @see maquina3_2020.DispensadorDeBotes
 * @see maquina3_2020.ContadorDeMonedas
 * @see maquina3_2020.Maquina3_2020
 * @see maquina3_2020.Test_Maquina3
 * @version 1.0
 */
public class MaquinaDeBebidas {
        private ContadorDeMonedas contador; 
        /**
        * Contador de monedas de la maquina
        */
        private DispensadorDeBotes cola,limon,naranja,tonica,	agua;
        /**
        *Cantidad de botes en el dispensador
        */
	private float precio;	/**
        *Precio de las bebidas(común para todas)
	*/
	public MaquinaDeBebidas (float m, int b, float pvp) {
		contador = new ContadorDeMonedas (m);
		
		cola = new DispensadorDeBotes(b);
		limon = new DispensadorDeBotes(b);
		naranja =new DispensadorDeBotes(b);
		tonica = new DispensadorDeBotes(b);
		agua = new DispensadorDeBotes(b);
		
		precio = pvp;
        /** Constructor MaquinaDeBebidas   
        *Inicializa la maquina y todos los elementos asociados
        *Entradas:
        *@param m cantidad inicial de monedas para el cambio
        *@param b cantidad inicial de botes en los dispensadores
        *@param pvp precio de las bebidas 
        *Salidas: Ninguna 
        */ 
	}
        
	public void darOrden (char o){
		if (o=='A' ||o=='B'||o=='C'||o=='D'||o=='E'||o=='R') {
			ordenMonedas(o);
		}else if(o=='1' ||o=='2'||o=='3'||o=='4'||o=='5'  ) {
			ordenSeleccion(o);
		}	
        /** Dar orden
	*Responder a una acción del usuario. Discrimina el tipo de accion y utiliza las operaciones privadas
	*@param o la orden del usuario
        *Salidas: Ninguna 
	*/
	}
     
	public void visualizarMaquina () {
		System.out.println("VISUALIZANDO MÁQUINA");
		System.out.println();
		System.out.println("Cola: STOCK -> "+ cola.botesDisponibles()+" PRECIO -> "+precio);
		System.out.println("Limon: STOCK -> "+ limon.botesDisponibles()+" PRECIO -> "+precio);
		System.out.println("Naranja: STOCK -> "+ naranja.botesDisponibles()+" PRECIO -> "+precio);
		System.out.println("Tonica: STOCK -> "+ tonica.botesDisponibles()+" PRECIO -> "+precio);
		System.out.println("Agua: STOCK -> "+ agua.botesDisponibles()+" PRECIO -> "+precio);
		System.out.println("\nSALDO DISPONIBLE DEL CLIENTE: " + contador.saldo());
        /** Visualizar maquina
	*Visualiza la informacion de interes sobre la maquina botes en cada dispensador, precio de las bebidas, saldo del cliente.
        *Entradas: Ninguna
        *Salidas: Ninguna 
	*/
	}

	private void ordenMonedas (char o) {
		switch (o) {
		case 'A': 
			contador.insertarMoneda(0.05F);
			break;
		case 'B':
			contador.insertarMoneda(0.10F);
			break;
		case 'C':
			contador.insertarMoneda(0.20F);

			break;
		case 'D':
			contador.insertarMoneda(0.50F);

			break;
		case 'E':
			contador.insertarMoneda(1F);
			break;
		case 'R':
			contador.retornar();
			break;		
		}
        /** Orden monedas
        *Realiza las acciones relacionadas con la introducción de monedas
        *@param o la orden del usuario
        *Salidas: Ninguna 
        */ 
	}
	

	private void ordenSeleccion (char o) {
		switch (o) {
		case '1': 
			if (cola.pulsarBoton()==true) {
				if (contador.saldo()>=precio) {
					cola = new DispensadorDeBotes(cola.botesDisponibles()-1);
				}
				System.out.println("CAMBIO -> " +contador.darCambioDe(precio));
			}else {
				System.out.println("NO QUEDA STOCK DE COCACOLA");
			}
			break;
			
		case '2':
			if (limon.pulsarBoton()==true) {
				if (contador.saldo()>=precio) {
					limon = new DispensadorDeBotes(limon.botesDisponibles()-1);
				}
				System.out.println("CAMBIO -> " +contador.darCambioDe(precio));
			}else {
				System.out.println("NO QUEDA STOCK DE LIMÓN");
			}
			break;

		case '3':
			if (naranja.pulsarBoton()==true) {
				if (contador.saldo()>=precio) {
					naranja = new DispensadorDeBotes(naranja.botesDisponibles()-1);
				}
				System.out.println("CAMBIO -> " +contador.darCambioDe(precio));
			}else {
				System.out.println("NO QUEDA STOCK DE NARANJA");
			}
			break;
			
		case '4':
			if (tonica.pulsarBoton()==true) {
				if (contador.saldo()>=precio) {
					tonica = new DispensadorDeBotes(tonica.botesDisponibles()-1);
				}
				System.out.println("CAMBIO -> " +contador.darCambioDe(precio));

			}else {
				System.out.println("NO QUEDA STOCK DE TÓNICA");
			}
			break;
			
		case '5':
			agua.pulsarBoton();
			if (agua.pulsarBoton()==true) {
				if (contador.saldo()>=precio) {
					agua = new DispensadorDeBotes(agua.botesDisponibles()-1);
				}
				System.out.println("CAMBIO -> " +contador.darCambioDe(precio));

			}else {
				System.out.println("NO QUEDA STOCK DE AGUA");
			}
		}
         /** Orden seleccion
	*Realiza las acciones relacionadas con la selección de una bebida 
	*@param o la orden del usuario
	*Salidas: Ninguna 
	*/
	}
       
}
