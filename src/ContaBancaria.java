/*2) Crie uma classe que representa uma Conta Bancária, esta conta bancária deve permitir saques e depósitos.
 *  Os saques só podem ser efetuados se houver saldo suficiente. 
 *  Crie também uma classe que representa um Cliente do banco, ao qual a conta bancária deve ser associada.*/

import com.senac.SimpleJava.Console;

public class ContaBancaria {
	
	public void run(){
		
		Conta c = new Conta();
		
		
	c.depositar();
	c.sacar(0);	
		

		
		
	}//run
}//contaBancaria