//自动类型转换细节
public class AutoConvertDetail{
//编写一个main方法
public static void main(String[] args){
//细节1：有多种类型的数据混合运算时，
//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
int n1=10;//ok
//float d1=n1+1.1;//错误n1+1.1=>结果类型是double
//double d1=n1+1.1;//对n1+1.1=>结果类型是double
float d1=n1+1.1F;//对n1+1.1=>结果类型是float
//细节2:当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，
//就会报错，反之就会进行自动类型转换。//
//int n2=1.1;//错误double->int
//细节3:(byte,short)和char之间不会相互自动转换
//当把具体数赋给byte时，(1)先判断该数是否在byte范围内，如果是就可以
byte b1=10;//对,-128-127
//int n2=1;//n2是int
//byte b2=n2;//错误，原因：如果是变量赋值，判断类型
////char c1=b1;//错误，原因byte不能自动转成char
   }
}