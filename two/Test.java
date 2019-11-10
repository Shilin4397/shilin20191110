import java.util.*;
public class Test {
	// 完成猜数字游戏 
		public static void main(String [] args) {
			Random random=new Random();
			int a=random.nextInt(100)+1;
			Scanner sc=new Scanner(System.in);
			int n=0;
			while(true) {
			System.out.print("请输入1~100中你猜的数:");
			n = sc.nextInt();
			if(n  > a ) {
				System.out.println("猜大了，请继续：");
			}else if(n == a ){
				System.out.println("猜对了！");
				break;
			}else {
				System.out.println("猜小了，请继续：");
			}
		}
		}
	//输出一个整数的每一位. 
		public static void main15(String [] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			tra(n);			
		}
		public static void tra(int a) {
			if(a>9) {
				tra(a/10);
			}
			System.out.println(a%10);
		}
			
	//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。 
		public static void main14(String [] args) {
			int i = 0;
			int j=0;
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			System.out.print("偶数位：");
			for (i = 31; i >= 1; i -= 2)
			{
				j=n>>i;
				System.out.printf("%d ", (j & 1));
			}
			System.out.printf("\n");
			System.out.print("奇数位：");
			for (i = 30; i >= 0; i -= 2)
			{
				j=n>>i;
				System.out.printf("%d ", (j & 1));
			}
			System.out.printf("\n");
		}

	//写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
		public static void main13(String [] args) {
			int a=Binary(11);
			System.out.println(a);			
		}
		public static int Binary(int a) {
			int count=0;
			while(a!=0) {
				if((a&1)==1) {
					count++;
					a=a>>1;
				}else {
					a=a>>1;
				}
			}
			return count;
		}
			
		/*编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 
		入，最多输入三次。三次均错，则提示退出程序 
		*/
		public static void main12(String [] args) {
		String a="123456";
		int count=3;		
		while(count>0) {	
			Scanner scan = new Scanner(System.in);
			String password=scan.nextLine();
			if(a.equals(password)){
				System.out.println("密码正确，登录成功");
				break;
			}else {
				count--;
			System.out.println("密码错误,你还有"+count+"次机会");
			}
		}
					
		/*
		char [] password={0,0,0,0,0,0};
		int count=0;
		int count2=3;
		Scanner scan = new Scanner(System.in);
		password=scan.nextLine();
		count2--;
		if(count2>=0) {
			for(i=0;i<=6;i++) {
				if(arr[i]==password[i]) {
					count++;
					
				}
			}		
			if(count==6){
				System.out.println("密码正确，登录成功");
			}else  {
				System.out.println("密码错误，你还有"+count2+"次机会");
			}
		}
		*/
	}
		
		
		/*求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，
		如；153＝1＋5＋3?，则153是一个“水仙花数”。) 
		*/
	
	public static void main11(String [] args) {
		int i = 0;
		int j = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int n=0;
		for (n =0; n <= 999999; n++) {
			if (n < 10) {
				System.out.println(n);
			}else if (n >= 10 && n < 100) {
				i = n % 10;
				j = n / 10;
				if (n == (i*i+j*j)) {
					System.out.println(n);
				}
			}else if (n >= 100 && n < 1000) {
				i = n % 10;
				j = (n / 10) % 10;
				a = n / 100;
				if (n == (i*i*i+j*j*j+a*a*a))
				{
					System.out.println(n);
				}
			}else if (n >= 1000 && n < 10000) {
				i = n % 10;
				j = (n / 100)%10;
				a = (n / 10)%10;
				b = n / 1000;
				if (n == i*i*i*i+j*j*j*j+a*a*a*a+b*b*b*b)
				{
					System.out.println(n);
				}
			}else if (n >= 10000 && n < 100000) {
				i = n % 10;
				j = (n / 1000) % 10;
				a = (n/ 100)%10;
				b = (n/10)%10;
				c =n/ 10000;
				if (n == i*i*i*i*i+j*j*j*j*j+a*a*a*a*a+b*b*b*b*b+c*c*c*c*c) {
					System.out.println(n);
				}
			}else  if(n >= 100000 && n < 1000000) {
				i = n % 10;
				j = (n / 10000)%10;
				a = (n / 1000)%10;
				b = (n / 100)%10;
				c = (n / 10)%10;
				d = n / 100000;
				if (n == i*i*i*i*i*i+j*j*j*j*j*j+a*a*a*a*a*a+b*b*b*b*b*b+c*c*c*c*c*c+d*d*d*d*d*d) {
					System.out.println(n);
				}
			} else;
		}
	}
	
	//1~100中9的个数
	public static void main10(String[] args) {
		int n=0;
		int count=0;
		for(n=1;n<=100;n++) {
			if(n/10==9) {
				count++;
			}
			if(n%10==9) {
				count++;
			}
		}
		System.out.println(count);
	}
			
	
	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
	public static void main9(String[] args) {
		double i=0.0;
		double sum=0.0;
		double t=-1.0;
		for(i=1;i<=100;i++) {
			t=-t;
			sum=(t*(1/i))+sum;
		}
		System.out.println(sum);
	}
		
	//求两个正整数的最大公约数 
	public static void main8(String[] args) {
		int i=46;
		int j=123;
		int a=0;
		int max=i;
		if(i>j) {
			a=j;
		}
		for(a=max;a>=1;a--) {
			if(i%a==0 && j%a==0) {
				System.out.println("最大公约数为："+a);
				break;
			}
		}
	}
	
	//输出乘法口诀表 
	public static void main7(String[] args) {
		int i=0;
		int j=0;
		for(i=1;i<=9;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	
	//输出 1000 - 2000 之间所有的闰年
		public static void main6(String[] args){
			int year=0;
			for(year=1000;year<=2000;year++) {
				if(year%4==0 && year%100!=0 || year%400==0) {
					System.out.println(year+"是闰年！");
				}
			}
		}
			
	//打印 1 - 100 之间所有的素数 
	public static void main5(String[] args){
			int a=1;
			int i=0;
			int b=0;
			for(a=1;a<=100;a++){
				b=(int)(a/2);
				if(a<2){
					continue;
				}
				for(i=2;i<=b;i++){
					if(a%i==0){
						break;
						}
					}
					if(i>b){
							 System.out.println(a);
						}					
			}
		
	}
	
	// 判定一个数字是否是素数 
	public static void main4(String[] args){
			int a=40;
			int i=2;
			if(a<2) {
				System.out.println("不是素数");
			}
				while(a%i!=0) i++; 
					if(a==i) {
						 System.out.println("是素数");						
					}
					else {
						System.out.println("不是素数");					
					}
		}
	
	//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
	public static void main3(String[] args){
			int age=22;
			if(age<=18) {
				System.out.println("是少年！");
			}
			else if(age<=28) {
				System.out.println("是青年！");
			}
			else if(age<=55) {
				System.out.println("是中年！");
			}
			else {
				System.out.println("是老年！");
			}				
		}
	
	public static void main2(String[] args) {
			int a=2;
			int b=6;
			int c=13;
			int min=0;
			int max=0;
			min=a;
			if(min>b) {
				min=b;
			}
			else {
				max=b;
			}
			if(max<c) {
				max=c;
			}
			if(min>c) {
				min=c;
			}
			System.out.println("最小值为："+min);
			System.out.println("最大值为："+max);
		}

	public static void main1(String[] args){
			int a=2;
			int b=3;
			int c=0;
			c=a;
			a=b;
			b=c;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
}