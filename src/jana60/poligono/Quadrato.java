package jana60.poligono;


public class Quadrato implements Poligono {
	
	
	//ATTRIVUTI
	private int lato;

    //COSTRUTTORE
	public Quadrato (int lato) throws Exception {
		super();
	
		boolean datiValidi = true; 
		String Errore = "" ;

		this.lato = lato;

		try 
		{
			validaDato(lato);
		} 	
		catch (IllegalArgumentException iae) 
		{
			datiValidi = false;
			Errore += " " + iae.getMessage();
		}

		if (datiValidi) 
		{	
			this.lato = lato;
		
		} 
		else 
		{
			throw new Exception(Errore);
		}
	}

	//METODI
	private void validaDato(int dato) throws IllegalArgumentException
	{
		if (dato <= 0)
			throw new IllegalArgumentException("Impossibile calcolare se il dato è minore o uguale a 0!");	
	}
	 
	@Override
	public int calcolaPerimetro() 
	{
		return this.lato* 4;
	}
	
	@Override
	public int calcolaArea() 
	{
		return this.lato * this.lato;
	}
	
	@Override
	public String toString()
	{
		return 	"\n"	+ "Base: "		+ this.lato					+
				"\n"	+ "Altezza:"	+ this.lato					+
				"\n"	+ "Perimetro: "	+ (calcolaPerimetro())	+
				"\n"	+ "Area: "		+ (calcolaArea())		;	
	}

}

		


