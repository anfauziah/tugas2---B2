public class K2{
	int Tdetik, detikskrng, Tmenit, menitskrng, Tjam, jamskrng;

	public K2(){
		Tdetik = 1203183086;
		detikskrng = Tdetik%60;
		Tmenit = Tdetik/60;
		menitskrng = Tmenit%60;
		Tjam = Tmenit/60;
		jamskrng = Tjam%24;
	}

	public static void main(String[] args){
	
		K2 kasus1 = new K2();

		System.out.println((kasus1.jamskrng)+" : "+(kasus1.menitskrng)+" : "+(kasus1.detikskrng));
	}

}