import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		
		
		boolean resultado = cal(0, 0, 0, 0);
		System.out.println(resultado);
			
		
			if(resultado == true) {
				System.out.println("Aluno Aprovado");
			}
			else if( resultado == false) {
				System.out.println("Aluno Reprovado");
			}
}	
	
		public static boolean cal(int a, int b, int c, int d) {
			
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite o 1� n�mero");
			a = leitor.nextInt();
			System.out.println("Digite o 2� n�mero");
			b = leitor.nextInt();
			System.out.println("Digite o 3� n�mero");
			c = leitor.nextInt();
			System.out.println("Digite o 4� n�mero");
			d = leitor.nextInt();
			
			
			
		if((a+b+c+d) / 4 >= 7) {
			return true;
			
		
		}
		
			
			
		
		else 
			return false;
		
		
		
		
				
					
				
		}

}		

