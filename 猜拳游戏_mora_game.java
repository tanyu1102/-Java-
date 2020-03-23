import java.util.*;
public class Mora_game{
	public static void main(String[] args){
		int X=(int)(Math.random()*3)+1;
		Scanner in=new Scanner(System.in);
		System.out.println("-----猜拳游戏-----（1.石头  2.剪刀  3.布）");
		do{
		System.out.println("请问您出什么？");
		int Y=in.nextInt();
		switch(Y){
			case 1:
			if(X==3){
				System.out.println("您出的是石头，电脑出的是布；-_- 真遗憾，您输了！");
			}else if(X==2){
				System.out.println("您出的是石头，电脑出的是剪刀；=_= 恭喜，您赢了！");
			}else{
				System.out.println("您出的是石头，电脑出的也是石头；-_-! 平局！");
			}
			break;

			case 2:
			if(X==3){
				System.out.println("您出的是剪刀，电脑出的是布；=_= 恭喜，您赢了！");
			}else if(X==2){
				System.out.println("您出的是剪刀，电脑出的也是剪刀；-_-! 平局！");
			}else{
				System.out.println("您出的是剪刀，电脑出的是石头；-_- 真遗憾，您输了！");
			}
			break;

			default:
			if(X==3){
				System.out.println("您出的是布，电脑出的也是布；-_-! 平局！");
			}else if(X==2){
				System.out.println("您出的是布，电脑出的是剪刀；-_- 真遗憾，您输了！");
			}else{
				System.out.println("您出的是布，电脑出的是石头；=_= 恭喜，您赢了！");
			}
		}
		}while(1==1);
	}
}
