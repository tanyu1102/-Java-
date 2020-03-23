import java.util.*;
public class Test22{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Random MyRandom=new Random();
		int A=MyRandom.nextInt(101);
		int i=1;
		int number;
		do{
			System.out.println("请猜一下电脑随机生成的数是多少？（0--100）");
			number=in.nextInt();
			if(number<A){
				System.out.println("小了，再猜一次吧。");
				i++;
			}else if(number>A){
				System.out.println("大了，请再猜一次吧。");
				i++;
			}
		}while(number!=A);
		System.out.println("恭喜您！猜对了，奖励您一本《独孤九剑》。");
		System.out.println("您一共猜了"+i+"次。");
	}	
}