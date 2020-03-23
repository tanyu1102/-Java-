import java.util.*;
public class Test35{
	public static void main(String[] args){
		System.out.println("请问您想查看哪年的日历表呢？");
		Scanner input=new Scanner(System.in);
		int years=input.nextInt();
		System.out.println("请问您想看"+years+"年的几月的日历表？");
		int months=input.nextInt();

		int sum=0;
		for(int year=1900;year<years;year++){
			if(year%4==0 && year%100!=0 || year%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}

		for(int month=1;month<months;month++){
			if(month==2){
				if(years%4==0 && years%100!=0 || years%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				if(month==4 || month==6 || month==9 || month==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}

		sum+=1;
		int Day=0;
		if(months==2){
			if(years%4==0 && years%100!=0 || years%400==0){
					Day=29;
			}else{
					Day=28;
			}
			}else{
				if(months==4 || months==6 || months==9 || months==11){
					Day=30;
			}else{
					Day=31;
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\t一\t二\t三\t四\t五\t六\t七\t");
		System.out.println("-----------------------------------------------------------------------");
		if(sum%7==0){
			System.out.print("\t\t\t\t\t\t\t");
		}else{
			for(int i=1;i<=sum%7;i++){
				System.out.print("\t");
			}
		}
		for(int i=1;i<=Day;i++){
			if(sum%7==0){
				System.out.print(i+"\n\t");
			}else{
				System.out.print(i+"\t");
			}
			sum++;  
		}
	}
}