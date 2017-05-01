
public class Conta {
	
	public double saldo=0;
	public double saque=50;
	public double saldoTotal=0;
	public double deposito=250;
	
	
	  public void depositar(){
		  
		  saldo = saldo + deposito;
		  System.out.println("Depositado : " + deposito);
	  	}
	  
	  public void sacar(double valor){
		  if(saldo <= 0 && deposito==0){
			  
			  System.out.println("Saldo insufuciente . faca um deposito");
			
		  }
		  else{
			  valor = saldo - saque;
				System.out.println("Valor sacado: " +saque);
		  }
		  
		  System.out.println(">>>>SALDO ATUAL<<<<: " + valor);
 }//conta
}
