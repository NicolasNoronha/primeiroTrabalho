package exe03;

import java.time.LocalDate;

import exe04.java;

public class Pessoa {
	
	public void run(){
		
		data c = new data();
		double idade = 1992;
		double anoAtual = 2017;
		double idadeAtual=0;
		String nome= "pedro";
		
		idadeAtual = anoAtual- idade  ;
		System.out.println("Seu nome eh: " + nome);
		System.out.println("Sua idade eh: " +idadeAtual);
		
		c.Data();
		
		

	}

}
