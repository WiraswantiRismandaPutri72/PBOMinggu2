//NAMA      : WIRASWANTI RISMANDA PUTRI
//KELAS     : SIB-2E
//NIM       : 2141762021
//ABSEN     : 22 (GENAP)

public class Soal2 {
    public static void main(String[] args) {
        int nim[] = {2, 1, 4, 1, 7, 6, 2, 0, 2, 1};
        int sum = 0;
        
        for(int i=0; i<nim.length; i++){
            sum += nim[i];
        }
        System.out.println("Jumlah value seluruh array = " + sum);
    }   
}