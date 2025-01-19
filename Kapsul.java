public class Kapsul{
    private String nama_siswa;
    private int umur_siswa;
    private double nilai_siswa;

    public String getjeneng(){
        return nama_siswa;
    }

   public void setjeneng(String jeneng){
    nama_siswa = jeneng;
   }

   public int getumur(){
    return umur_siswa;
   }
   public void setumur(int bday){
    if (bday >= 0){
        umur_siswa = bday;
    }else{
        System.out.println("Gbs yura klo mines");
    }
   }

   public double getbiji(){
    return nilai_siswa;
   }
   public void setbiji(double biji){
    if(biji >= 0 && biji <= 100){
        nilai_siswa=biji;
    }else{
        System.out.println("Gbs lebih krn yg sempurna adalah tuhan :)");
    }
   }

}