/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina3_2020;
import java.io.*;

/**
 * El main que funciona bien.
 * @author Adrián Miralles Gómez
 * @version 1.0
 * @see maquina3_2020.ContadorDeMonedas
 * @see maquina3_2020.MaquinaDeBebidas
 * @see maquina3_2020.Maquina3_2020
 * @see maquina3_2020.DispensadorDeBotes
 * Te hago este main, distinto al que ya está en el repositorio, porque ese tenia algunas cosas mal, pero no quería modificartelo directamente sin decírtelo.
 * Por ejemplo:
 * - En la linea 23 creas un objeto de la clase MaquinaBebida, y la clase realmente se llama MaquinaDeBebidas.
 * - En la linea 30 llamas al metodo de MaquinaBebida "iniciarMaquinaDeBebidas", que no existe en la clase MaquinaDeBebidas, porque esa función la hace el
 * propio constructor de la clase MaquinaDeBebidas.
 */
public class Test_Maquina3 {
    public static void main(String[] args) throws IOException {
        //Scanner tec = new Scanner(System.in);
    	
        MaquinaDeBebidas mi_maquina;
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //inicializo la maquina con:
        //  50 euros para cambio
        //  25 botes en cada dispensador
        //  Precio de 0.75 euros por bote
        mi_maquina = new MaquinaDeBebidas(50F, 25, 0.75F);

        do {
		mi_maquina.visualizarMaquina ();
		System.out.println("\nRealice su seleccion (f = apagar maquina) ... ");
		System.out.println("   ('A'=5 cent, 'B'=10 cent, 'C'=20 cent, 'D'=50 cent, 'E'=1 euro, 'R'=devolver monedas)");
		System.out.println("   ('1'=cola, '2'=limon, '3'=naranja, '4'=tonica, '5'=agua)");
		System.out.print("Seleccion ->");
		c = (char) br.read();
		mi_maquina.darOrden (c);
        }
		while ( ( c != 'f' ) && ( c != 'F' ) );
    }
}
