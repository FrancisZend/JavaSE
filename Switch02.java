import java.util.Scanner;

public class Switch02{
	public static void main(String[] args){

//��������ָ���·ݣ�
//��ӡ���·������ļ��ڡ�
//3,4,5����6,7,8�ļ�9,10,11�＾12,1,2����
//˼·����
//1.����Scanner���󣬽����û�����
//2.ʹ��intmonth����
//3.ʹ��switch��ƥ��,ʹ�ô�͸����ɣ��Ƚϼ��

Scanner myScanner=new Scanner(System.in);
System.out.println("�����·�");
int month=myScanner.nextInt();
switch(month){
	case 3:
	case 4:
	case 5:
	System.out.println("���Ǵ���");
	break;
	case 6:
	case 7:
    case 8:
    System.out.println("�����ļ�");
    break;
    case 9:
    case 10:
    case 11:
    System.out.println("�����＾");
    break;
    case 1:
    case 2:
    case 12:System.out.println("���Ƕ���");
    break;
    default:
    System.out.println("��������·ݲ���(1-12)");
         }
     }
}