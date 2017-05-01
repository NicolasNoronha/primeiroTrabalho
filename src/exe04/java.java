package exe04;

public class java {

	private static final boolean Touro = false;
	public double cel = 23.0;
	public double far = 45.0;
	public double totalCel=0, totalfar=0;
		
	public void celsiusParaFahrenheit ()
	   {
	      totalCel =  9.0 * cel / 5.0 + 32.0;
	      System.out.println("Graus em Celsisus: " + totalCel + "°c");
	   }
	 
	   public void fahrenheitParaCelsius ()
	   {
	      totalfar = 5.0 * (far - 32.0) / 9.0;
	      System.out.println("Graus em Farenheit: " + totalfar + "°f");
	   }
	 
	
	
	
}
