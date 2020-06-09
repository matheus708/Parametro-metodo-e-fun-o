import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		
		
		int x, y;
		char operacao;
		char resposta = 0;
		int repeticoes = 0;
		Scanner leitor = new Scanner(System.in);
		
		do{
			System.out.println("Digite o 1° número");
			x = leitor.nextInt();
			System.out.println("Digite o 2° número");
			y = leitor.nextInt();
			System.out.println("Qual a operação  +, -, / , * ");
			operacao = leitor.next().charAt(0);
			
			
		do {
			System.out.println("Deseja continuar (s/n)");
			resposta = leitor.next().charAt(0);
			}while(resposta != 's'&& resposta != 'n');
		
			
		
		
		}while(resposta == 's');
			do {
				if(operacao == '+');
				int soma = x + y;
				System.out.println("Soma = " +soma);
			
				if(operacao == '-');
				int sub = x - y;
				System.out.println("Subtracao = " +sub);
			
				if(operacao == '/');
				int div = x/y;
				System.out.println("Divisao = " +div);
			
				if(operacao == '*');
				int multi = x * y;
				System.out.println("Multiplicacao = " +multi);
			
		
			
		}while(resposta == 'n');
			System.out.println("A operação  operação digitada está incorreta ");
		}
			
			
		
				
	}	

