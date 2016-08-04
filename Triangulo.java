import javax.swing.JOptionPane;
import java.util.Scanner;
class Triangulo1 {
  
  public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);
    
     int base;
     int altura; 
     double areaTriangulo;

     System.out.print("Digite a base: ");
		//base = Integer.parseInt(entrada.nextLine());
         base = entrada.nextInt();
     System.out.print("Digite a Altura: ");
		//altura = Integer.parseInt(entrada.nextLine());
        altura = entrada.nextInt();

     areaTriangulo = (base * altura)/2.0;

    System.out.println("A area do Triangulo é: " + areaTriangulo);
 }
}