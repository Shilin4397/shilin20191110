import java.util.*;
public class Test {
	// ��ɲ�������Ϸ 
		public static void main(String [] args) {
			Random random=new Random();
			int a=random.nextInt(100)+1;
			Scanner sc=new Scanner(System.in);
			int n=0;
			while(true) {
			System.out.print("������1~100����µ���:");
			n = sc.nextInt();
			if(n  > a ) {
				System.out.println("�´��ˣ��������");
			}else if(n == a ){
				System.out.println("�¶��ˣ�");
				break;
			}else {
				System.out.println("��С�ˣ��������");
			}
		}
		}
	//���һ��������ÿһλ. 
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
			
	//��ȡһ�������������������е�ż��λ������λ�� �ֱ�������������С� 
		public static void main14(String [] args) {
			int i = 0;
			int j=0;
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			System.out.print("ż��λ��");
			for (i = 31; i >= 1; i -= 2)
			{
				j=n>>i;
				System.out.printf("%d ", (j & 1));
			}
			System.out.printf("\n");
			System.out.print("����λ��");
			for (i = 30; i >= 0; i -= 2)
			{
				j=n>>i;
				System.out.printf("%d ", (j & 1));
			}
			System.out.printf("\n");
		}

	//дһ���������ز����������� 1 �ĸ��� ���磺 15 0000 1111 4 �� 1
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
			
		/*��д����ģ��������������ĳ����� ����������������룬������ȷ����ʾ����¼�ɹ���,������� ���������� 
		�룬����������Ρ����ξ�������ʾ�˳����� 
		*/
		public static void main12(String [] args) {
		String a="123456";
		int count=3;		
		while(count>0) {	
			Scanner scan = new Scanner(System.in);
			String password=scan.nextLine();
			if(a.equals(password)){
				System.out.println("������ȷ����¼�ɹ�");
				break;
			}else {
				count--;
			System.out.println("�������,�㻹��"+count+"�λ���");
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
				System.out.println("������ȷ����¼�ɹ�");
			}else  {
				System.out.println("��������㻹��"+count2+"�λ���");
			}
		}
		*/
	}
		
		
		/*���0��999֮������С�ˮ�ɻ������������(��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ����� ��
		�磻153��1��5��3?����153��һ����ˮ�ɻ�������) 
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
	
	//1~100��9�ĸ���
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
			
	
	//����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ�� 
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
		
	//�����������������Լ�� 
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
				System.out.println("���Լ��Ϊ��"+a);
				break;
			}
		}
	}
	
	//����˷��ھ��� 
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
	
	//��� 1000 - 2000 ֮�����е�����
		public static void main6(String[] args){
			int year=0;
			for(year=1000;year<=2000;year++) {
				if(year%4==0 && year%100!=0 || year%400==0) {
					System.out.println(year+"�����꣡");
				}
			}
		}
			
	//��ӡ 1 - 100 ֮�����е����� 
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
	
	// �ж�һ�������Ƿ������� 
	public static void main4(String[] args){
			int a=40;
			int i=2;
			if(a<2) {
				System.out.println("��������");
			}
				while(a%i!=0) i++; 
					if(a==i) {
						 System.out.println("������");						
					}
					else {
						System.out.println("��������");					
					}
		}
	
	//��������, ����ӡ����ǰ�������������(����18), ����(19-28), ����(29-55), ����(56����) 
	public static void main3(String[] args){
			int age=22;
			if(age<=18) {
				System.out.println("�����꣡");
			}
			else if(age<=28) {
				System.out.println("�����꣡");
			}
			else if(age<=55) {
				System.out.println("�����꣡");
			}
			else {
				System.out.println("�����꣡");
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
			System.out.println("��СֵΪ��"+min);
			System.out.println("���ֵΪ��"+max);
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