
package universitas;


public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa();
        
        Mahasiswa1.setnama("Wahyu Ramadani");
        Mahasiswa1.setprodi("Teknik Informatika");
        Mahasiswa1.setnpm(2110010301);
        
        System.out.println("nama     :"+Mahasiswa1.getnama());
        System.out.println("prodi    :"+Mahasiswa1.getprodi());
        System.out.println("npm      :"+Mahasiswa1.getnpm());
        
        
    }
    
}
