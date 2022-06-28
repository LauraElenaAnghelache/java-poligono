package jana60.poligono;

public class MainTest {
	
	public static void main(String[] args) {
			//Test Rettangolo
        try 
            {	
			System.out.println("\n Rettangolo!");
			Rettangolo p1 = new Rettangolo(7, 3);
		    System.out.println(p1);
			
		
			//Test Quadrato
			System.out.println("\n Quadrato!");
			Quadrato p2 = new Quadrato(7);
			System.out.println(p2.toString());
			
			//Test Eccezione Quadrato
			System.out.println("\n Non Valido");
			Quadrato p3 = new Quadrato(0);
			System.out.println(p3.toString());	
		} 
		catch (Exception e) 
		{
			System.out.println("\n Errore ");
			System.out.println(	e.getMessage());
		}
		
	}
}