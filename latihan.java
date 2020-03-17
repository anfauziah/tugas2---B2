public class latihan{
	int a; double b;

	//construktor defauld
	public latihan(){
	a = 100;
	b = 3.14;
	}

	//construktor parameter
	public latihan(int y){
	a = y;
	}

public static void main(String[] args){
	latihan latihan1 = new latihan();
	latihan latihan2 = new latihan(50);
	
	System.out.println(latihan1.a);
	System.out.println(latihan1.b);
	System.out.println(latihan2.a);
	
}
}