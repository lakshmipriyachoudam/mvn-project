package usingconstructors;

public class usingco {
	public int i;

	public static void main(String[] args) {
		usingco obj=new usingco(25);
		usingco obj=new usingco();//default constructor
		System.out.println(obj.i);
	}
	//Explicit constructor
public usingco() {
	
}
public usingco(int a) {
i=a;
	}

}
