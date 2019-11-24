package inheritance;

interface p1{
	default void show() {
		System.out.println("Defaults p1");
	}
}
interface p2{
	default void show() {
		System.out.println("Defaults p2");
	}
}
public class MulInteJava8Sup implements p1,p2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		p1.super.show();
		p2.super.show();
	}
	public static void main(String[] args) {
		MulInteJava8Sup t = new MulInteJava8Sup();
		t.show();
	}

}
