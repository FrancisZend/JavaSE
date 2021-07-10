import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入一个字符");
	char c =	scanner.next().charAt(0);
	switch(c){
		case 'a':
		System.out.println("这是a");
		break;
		case 'b':
		System.out.println("这是b");
		break;
		case 'c':
		System.out.println("这是c，但我后面没有break语句");
		default:
		System.out.println("这是其他字符");
		break;
	}
	}
}