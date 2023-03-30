import java.util.Scanner;
import classes.Quartos;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);	        		
    int pousada;
	Quartos p;
    int numero;

	Quartos[] vetQ = new Quartos[10];
    
    do {

        System.out.println("-------------------------- BEM-VINDO À POUSADA! ---------------------------------");
        System.out.println("\nTemos esses atendimentos no momento:");
        System.out.println("");
        System.out.println("1 - Fazer uma reserva");
        System.out.println("2 - Saber a quantidade de quartos");
        System.out.println("0 - Sair");
		System.out.println("");
		System.out.print("Digite qual atendimento deseja realizar: ");

        pousada = sc.nextInt();

        if (pousada == 0) {
            System.out.println("\nMuito Obrigado e volte sempre!");
            sc.close();
        }

        switch(pousada){
    
    case 1:
		System.out.println("-----------------------------------------------------------");
        System.out.print("Informe quantos alunos vão alugar os quartos: ");
        int qtdAlunos = sc.nextInt();
        
        if (qtdAlunos > 10 || qtdAlunos <= 0 ) {
            System.out.println("\nInfelizmente a quantidade de quartos não está disponível, por favor, escolha outra opção no menu =D");
            System.out.println("");
	
        }
        
        else {

        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Estudante número " + i);
          
            System.out.print("\nAgora seu nome, por favor: ");
            String nome = sc.next();
            System.out.print("Agora para finalizarmos o seu cadastro, informe o e-mail: ");
            String email = sc.next();

			System.out.print("A numeraçao dos quartos vai de 0 a 9, agora diga qual o número do quarto: ");
            numero = sc.nextInt();
			
            
        if (numero > 9 || numero < 0) {
			System.out.println("");
            System.out.print("Me desculpe, mas não temos esse número de quarto, informe um número entre 0 e 9: ");
			numero = sc.nextInt();
            
        }
			vetQ[numero] = new Quartos(nome, email);

            }

            System.out.println();
            System.out.println("-----------------------------------------------------------");
            System.out.println("Quartos ocupados: ");
			System.out.println("-----------------------------------------------------------");
			
		for (int i = 0; i < vetQ.length; i++) {
			if (vetQ[i] != null) {
				System.out.println("Ocupação " + i + ": " + vetQ[i]);
				System.out.println();
			}
				
		}


		}		
		break;
		
		case 2:
			System.out.println("\nAtualmente, estamos disponibilizando 10 quartos. Agora você pode escolher um de nossos atendimentos.");
            System.out.println("");
		break;
    }
	
    
    } while (pousada != 0);
		sc.close();
    }
}
