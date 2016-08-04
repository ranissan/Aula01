import javax.swing.JOptionPane;
import java.util.Scanner;
class Saudacao {
	
	public static void main (String args[]){
        
        //System.out.print("Digite o nome do Aluno: ");
        
        // Declarando e instanciando o objeto entrada do tipo Scanner 
        Scanner entrada = new Scanner(System.in);

		/*
         Aqui criamos o objeto que receberá o nome do aluno
		
		String nome = entrada.nextLine();
         */
        String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");

		System.out.println(nome + " Benvindo ao curso de Java");
     
     // declara variaveis 
        int idade;
	 // Atribuicao da variavel
	    idade = 33;
	 // Exibição 
        System.out.println("A idade de "+ nome + " é "+idade);
	}
}