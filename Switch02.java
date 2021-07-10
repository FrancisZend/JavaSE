import java.util.Scanner;

public class Switch02{
	public static void main(String[] args){

//根据用于指定月份，
//打印该月份所属的季节。
//3,4,5春季6,7,8夏季9,10,11秋季12,1,2冬季
//思路分析
//1.创建Scanner对象，接收用户输入
//2.使用intmonth接收
//3.使用switch来匹配,使用穿透来完成，比较简洁

Scanner myScanner=new Scanner(System.in);
System.out.println("输入月份");
int month=myScanner.nextInt();
switch(month){
	case 3:
	case 4:
	case 5:
	System.out.println("这是春季");
	break;
	case 6:
	case 7:
    case 8:
    System.out.println("这是夏季");
    break;
    case 9:
    case 10:
    case 11:
    System.out.println("这是秋季");
    break;
    case 1:
    case 2:
    case 12:System.out.println("这是冬季");
    break;
    default:
    System.out.println("你输入的月份不对(1-12)");
         }
     }
}