import java.util.Scanner;


public class yuoxi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a1= (int) (Math.random()*100)+1;
while(true){
	Scanner sc=new Scanner(System.in);
	System.out.println("游戏开始，请输入：");
	int  guess= sc.nextInt( );
	if(guess>a1){
		System.out.println("你猜大了，继续加油");
	}else if(guess==a1){
		System.out.println("恭喜你猜对了，游戏结束");
		break;
	}else{
		System.out.println("你猜小了，继续加油");
	}
}
	}

}
