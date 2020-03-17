public class K1{
	String nama, nim, jurusan, fakultas;
	
	public K1()
	{	
		nama ="Azmi Fauziah Nur";
		nim ="13020180131";
		jurusan ="Teknik Informatika";
		fakultas ="Ilmu komputer";
	}
	
	public static void main(String[] args)
	{
		K1 biodata = new K1();
		
		System.out.println("Nim      : " +(biodata.nim));
		System.out.println("Nama     : " +(biodata.nama));
		System.out.println("Jurusan  : " +(biodata.jurusan));
		System.out.println("Fakultas : " +(biodata.fakultas));
	}

}