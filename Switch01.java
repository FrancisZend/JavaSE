import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("������һ���ַ�");
	char c =	scanner.next().charAt(0);
	switch(c){
		case 'a':
		System.out.println("����a");
		break;
		case 'b':
		System.out.println("����b");
		break;
		case 'c':
		System.out.println("����c�����Һ���û��break���");
		default:
		System.out.println("���������ַ�");
		break;
	}
	}
}