import javax.swing.JOptionPane;

public class DataTypes{
   public static void main(String args[]) {
	String namaDepan = "Syahri";
    String namaBelakang = "Ramadhan";
    int usia =20;
    int targetTahunKuliah = 4;
    double ipk = 3.89764512;
    char nilaiAbjad = 'A';
    boolean tampan = true;

    System.out.println("Nama depan : " + namaDepan);
    System.out.println("Nama belakang : " + namaBelakang);
    System.out.println("Usia : " + usia + " Tahun ");
    System.out.println("Target Kuliah : " + targetTahunKuliah + " Tahun ");
    System.out.println("IPK : " + ipk);
    System.out.println("Nilai PBO : " + nilaiAbjad);
    System.err.println("Tampan : " + tampan);

    JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + namaBelakang);
    
   }
}