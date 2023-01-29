package S2nos;

public class S2nos {
	private int x,y,s;
	public S2nos() {
		x=10;
		y=7;
	}
	public S2nos(int a) {
		x=a;
		y=7;
	}
	public S2nos(int a,int b) {
		x=a;
		y=b;
	}
	public S2nos(S2nos a) {
		x=a.x;
		y=a.y;
	}
	public void find() {
		s=x+y;
	}
	public void display() {
		System.out.println(s);
	}

}
