import java.util.Scanner;


public class yuoxi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a1= (int) (Math.random()*100)+1;
while(true){
	Scanner sc=new Scanner(System.in);
	System.out.println("��Ϸ��ʼ�������룺");
	int  guess= sc.nextInt( );
	if(guess>a1){
		System.out.println("��´��ˣ���������");
	}else if(guess==a1){
		System.out.println("��ϲ��¶��ˣ���Ϸ����");
		break;
	}else{
		System.out.println("���С�ˣ���������");
	}
}
	}

}
