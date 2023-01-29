package S2nos;

public class Main {

	public static void main(String[] args) {
		S2nos a,a1,a2,a3;
		a=new S2nos();
		a1=new S2nos(10);
		a2=new S2nos(100,200);
		a3=new S2nos(a);
		a.find();
		a.display();
		a1.find();
		a1.display();
		a2.find();
		a2.display();
		a3.find();
		a3.display();	
	}

}
