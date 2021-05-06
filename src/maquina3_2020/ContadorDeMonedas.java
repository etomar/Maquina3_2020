/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina3_2020;

/**
 * Veremos el saldo de la maquina y el dinero introducido por el cliente ycomo variaran estos conforme se hagan compras
 * @author Cristina
 * @see maquina3_2020.DispensadorDeBotes
 * @see maquina3_2020.MaquinaDeBebidas
 * @see maquina3_2020.Maquina3_2020
 * @see maquina3_2020.Test_Maquina3
 * @version 1.0
 */
public class ContadorDeMonedas {
        /**
         * cantidad=Dinero introducido por el usuario actual.
         */
	private float cantidad; 
        /**
         * disponible=Dinero almacenado en la maquina, se utiliza para dar cambio.
         */
	private float disponible; 
        /**
         * Constructor de la clase con parametro 
         * Inicializa el objeto y fija el cambio inicialmente disponible.
         * @param i saldo inicialmente disponible para cambios
         */
	public ContadorDeMonedas(float i) {
		this.disponible=i;
	}
        /**
         * Informacion del saldo del cliente
         * @return float,el saldo del cliente
         */
	public float saldo () {
		return cantidad;
	}
        /**
         * Aumenta el saldo del cliente conforme introduzca más dinero
         * Insertar la moneda m 
         * @param m la cantidad de dinero introducida
         */
	public void insertarMoneda (float m) {
		cantidad+=m;
	}
        /**
         * Devuelve el cambio, si es posible
         *  Una vez entregado el cambio, el dinero introducido por el cliente
         *  pasa a engrosar el disponible de la maquina
         * @param c el precio del producto
         * @return<ul>
         *<li> mayor que 0:hay devolucion tras la compra</li>
         * <li>igual a 0:devuelve 0</li>
         * <li>menor que 0:no hay dinero suficiente para comprar el producto y devuelve -1 </li>
         * </ul>
         * 
         */
	public float darCambioDe (float c) {
		float devolver;
		disponible+=cantidad;
		if(cantidad-c>0) {
			devolver=cantidad-c;
			disponible-=devolver;
                        cantidad=devolver;
		}
		else if(cantidad-c==0) {
			devolver=0;
                        cantidad=devolver;
		}else
			devolver=-1;
			return devolver;
		
	}
        /**
         * El cliente recupera el dinero introducido si todavia
         * no se ha realizado la venta 
         * @return float la cantidad devuelta
         */
	public float retornar () {
		float devolver=cantidad;
		this.cantidad=0.0f;
		return devolver;
	}
}
