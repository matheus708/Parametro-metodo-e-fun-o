import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		
		int x, y;
	

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero");
		x = leitor.nextInt();
		System.out.println("Digite o 2� n�mero");
		y = leitor.nextInt();
		
		
		System.out.println("multiplica��o = " +(multi(x, y)));
}
		
		public static int multi(int x, int y) {
			
			int multi = x * y;
			return multi;
		}
			
			
		
		 	

	}


