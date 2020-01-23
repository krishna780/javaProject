package logic;

public class FibinasericeEx {
public static void main(String[] args) {
int	f0=0,f1=1,f=0; int sum=0;
for (int i = 0; i < 10; i++) {
	//---> 0,1,1,2,3,5,
	f0=f; //--->0
	f=f1; //--->1
	f1=f0+f;
	sum=sum+f0;
	System.out.println(f0);
}
System.out.println("----------");
System.out.println(sum);
}	

}
