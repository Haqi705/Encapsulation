import java.util.Scanner;
public static void main(String[] args){
    Scanner Yerin = new Scanner(System.in);
    Kapsul umji = new Kapsul();

    System.out.println("Masukkan nama");
    String jeneng = Yerin.nextLine();
    umji.setjeneng(jeneng);

    System.out.println("Masukkan umur");
    int sinb = Yerin.nextInt();
    umji.setumur(sinb);

    System.out.println("Masukkan nilai");
    double Sowon = Yerin.nextDouble();
    umji.setbiji(Sowon);

    System.out.println("Data Siswa");
    System.out.println("Nama " + umji.getjeneng());
    System.out.println("Umur " + umji.getumur());
    System.out.println("Nilai " + umji.getbiji());

    Yerin.close();
    
    
}