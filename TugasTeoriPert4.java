import java.util.Scanner;
public class TugasTeoriPert4{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String nama,grade;
		int nt1,nt2,nt3,mid,akhir;
		double rata2, nilaiAkhir;
		
		System.out.print("Masukkan Nama Mahasiswa = ");
		nama = input.nextLine();
		
		System.out.print("Masukkan Nilai Tugas1 = ");
		nt1 = input.nextInt();
		
		System.out.print("Masukkan Nilai tugas2 = ");
		nt2 = input.nextInt();
		
		System.out.print("Masukkan Nilai Tugas3 = ");
		nt3 = input.nextInt();
		
		System.out.print("Masukkan Nilai Mid = ");
		mid = input.nextInt();
		
		System.out.print("Masukkan Nilai Final = ");
		akhir = input.nextInt();
		
		rata2 = (nt1+nt2+nt3)/3;
		nilaiAkhir = (rata2 * 0.3) + (mid * 0.3) + (akhir * 0.4);
		
		if ((nilaiAkhir <=100)&&(nilaiAkhir>=80)){
			grade = "A";
		}
		else if((nilaiAkhir <=79)&&(nilaiAkhir >=60)){
			grade = "B";
		}
		else if((nilaiAkhir <=59)&&(nilaiAkhir>=50)){
			grade = "C";
		}
		else if((nilaiAkhir <=49)&&(nilaiAkhir >=40)){
			grade = "D";
		}
		else{
			grade = "E";
		}
		System.out.println();
		System.out.println("Nilai Yang Diperoleh Oleh Mahasiswa");
		System.out.println("Nama Mahasiswa				= "+nama);
		System.out.println("Nilai AKhir Mahasiswa			= "+nilaiAkhir);
		System.out.println("Grade Yang di Capai			= "+grade);
	}
}