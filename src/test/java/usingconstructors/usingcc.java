package usingconstructors;

public class usingcc {
public int i;
	public static void main(String[] args) {
	usingcc obj=new usingcc(25);
	System.out.println(obj.i);
	}

	public usingcc() {
		
	}

	public usingcc(int a) {
		i=a;
	}
	
}
