import java.util.Scanner;//importar

public class Codigo5 {

	public static void main(String[] args) { //se encapsula
	    Scanner s = new Scanner(System.in); //system.in hacia falta
	    System.out.print("Introduzca un número: "); 
	    String ni = s.nextLine();
	    String c = ni;//cambiar a string
	    
	    int afo = 0;
	    int noAfo = 0;
	    long num = Long.parseLong(ni);
	    
	    while (num > 0) { //cambiar a num
		  int digito = (int)(num % 10);//colocar num
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }//colocar un cierre
		  num /= 10; //igualar a num
	    }
	    if (afo > noAfo) {
	      System.out.print("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    s.close();//cerrar el escaner
	    
	  }
	  
	}