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
			
			System.out.println("Digite o 1° número");
			a = leitor.nextInt();
			System.out.println("Digite o 2° número");
			b = leitor.nextInt();
			System.out.println("Digite o 3° número");
			c = leitor.nextInt();
			System.out.println("Digite o 4° número");
			d = leitor.nextInt();
			
			
			
		if((a+b+c+d) / 4 >= 7) {
			return true;
			
		
		}
		
			
			
		
		else 
			return false;
		
		
		
		
				
					
				
		}

}		

