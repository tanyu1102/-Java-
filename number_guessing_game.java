import java.util.*;
public class Test22{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Random MyRandom=new Random();
		int A=MyRandom.nextInt(101);
		int i=1;
		int number;
		do{
			System.out.println("���һ�µ���������ɵ����Ƕ��٣���0--100��");
			number=in.nextInt();
			if(number<A){
				System.out.println("С�ˣ��ٲ�һ�ΰɡ�");
				i++;
			}else if(number>A){
				System.out.println("���ˣ����ٲ�һ�ΰɡ�");
				i++;
			}
		}while(number!=A);
		System.out.println("��ϲ�����¶��ˣ�������һ�������¾Ž�����");
		System.out.println("��һ������"+i+"�Ρ�");
	}	
}