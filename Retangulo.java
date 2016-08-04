import javax.swing.JOptionPane;
import java.util.Scanner;
class Retangulo {
  
  public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);

     double base;
     double altura; 
     double areaRetangulo;
     
     base   = Interger.parseInt(JOptionPane.showInputDialog("Digite a base: "));
     altura = Interger.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
     
     /*
     System.out.print("Digite a base: ");
		base = Interger.parseInt(entrada.nextLine());
     System.out.print("Digite a Altura: ");
		altura = Interger.parseInt(entrada.nextLine());
      */

     areaRetangulo = (base * altura);

    System.out.println("A area do Triangulo é: " + areaTriangulo);
 }
}