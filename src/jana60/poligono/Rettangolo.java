package jana60.poligono;


public class Rettangolo implements Poligono {
	
	
	private int base,altezza;

  public Rettangolo(int base, int altezza) throws Exception {
			boolean datiValidi = true; 
			String mexErrore = "";

			this.altezza = altezza;
			this.base = base;
			try 
			{
				validaDato(base);
				validaDato(altezza);
			}	
			catch (IllegalArgumentException iae) 
			{
				datiValidi = false;
				mexErrore += " " + iae.getMessage();
			}

			if (datiValidi) 
			{	
				this.altezza = altezza;
				this.base = base;
			} 
			else 
			{
				throw new Exception(mexErrore);
			}
		}

		//METODI
//METODI
	private void validaDato(int dato) throws IllegalArgumentException
	{
		if (dato <= 0)
			throw new IllegalArgumentException("Impossibile calcolare se il dato è minore o uguale a 0!");	
	}

	@Override
	public int calcolaPerimetro() 
	{
		return this.base *2 + this.altezza * 2;
	}
	
	
	@Override
	public int calcolaArea() 
	{
		return this.base * this.altezza;
	}
	
	@Override
	public String toString()
	{		
		return 	"\n"	+ "Base: "		+ this.base						+
				"\n"	+ "Altezza:"	+ this.altezza					+
				"\n"	+ "Perimetro: "	+ (calcolaPerimetro())	+
				"\n"	+ "Area: "		+ (calcolaArea())		;	
	}

}