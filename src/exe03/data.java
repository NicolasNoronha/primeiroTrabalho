package exe03;

import java.time.LocalDate;

public class data {
	

	private static final boolean Touro = false;
	public String signo;
	

		public void Data (){
			
			LocalDate hoje = LocalDate.now();
			System.out.println("DIA: "+hoje.getDayOfMonth() );
			System.out.println("MÊS: "+hoje.getMonthValue() );
			System.out.println("ANO: "+hoje.getYear() );
		
			
		}

		
		  


}

			


