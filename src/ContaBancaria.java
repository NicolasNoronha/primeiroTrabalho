/*2) Crie uma classe que representa uma Conta Banc�ria, esta conta banc�ria deve permitir saques e dep�sitos.
 *  Os saques s� podem ser efetuados se houver saldo suficiente. 
 *  Crie tamb�m uma classe que representa um Cliente do banco, ao qual a conta banc�ria deve ser associada.*/

import com.senac.SimpleJava.Console;

public class ContaBancaria {
	
	public void run(){
		
		Conta c = new Conta();
		
		
	c.depositar();
	c.sacar(0);	
		

		
		
	}//run
}//contaBancaria