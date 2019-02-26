import java.util.*;

public class Main{
	public static void main(String[] args){
		System.out.print("1) Сложить" + "\n" +
						 "2) Вычесть" + "\n" +
						 "3) Умножить" + "\n" +
						 "4) Делить" + "\n"); // == System.out.println("");
		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();
		int a;
		int b;
		
			switch(operation){
			case 1: {
				System.out.println("Введите 1 число");
				a = scanner.nextInt();
				System.out.println("Введите 2 число");
				b = scanner.nextInt();
				System.out.println("Сумма:" + (a + b));
				break;
			}
			
			case 2: {
				System.out.println("Введите 1 число");
				a = scanner.nextInt();
				System.out.println("Введите 2 число");
				b = scanner.nextInt();
				System.out.println("Разность:" + (a - b));
				break;
			}
			
			case 3: {
				System.out.println("Введите 1 число");
				a = scanner.nextInt();
				System.out.println("Введите 2 число");
				b = scanner.nextInt();
				System.out.println("Произведение:" + (a * b));
				break;
			}
			
			case 4: {
				System.out.println("Введите 1 число");
				a = scanner.nextInt();
				System.out.println("Введите 2 число");
				b = scanner.nextInt();
				System.out.println("Частное:" + (a / b));
				break;
			}
	
		}
	}
}