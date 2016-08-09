import javax.swing.JOptionPane;
import java.util.Scanner;
class Retangulo {
  
  public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);

     int base;
     int altura; 
     double areaRetangulo;
     
     //base   = Interger.parseInt(JOptionPane.showInputDialog("Digite a base: "));
     //altura = Interger.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
          
     System.out.print("Digite a base: ");
        //base = Integer.parseInt(entrada.nextLine());
         base = entrada.nextInt();
     System.out.print("Digite a Altura: ");
        //altura = Integer.parseInt(entrada.nextLine());
        altura = entrada.nextInt();
     

     areaRetangulo = (base * altura);

    System.out.println("A area do Retangulo é: " + areaRetangulo);
 }
}