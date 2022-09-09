//NAMA      : WIRASWANTI RISMANDA PUTRI
//KELAS     : SIB-2E
//NIM       : 2141762021
//ABSEN     : 22 (GENAP)

import java.io.FileNotFoundException;
import java.util.Formatter;

public class Soal1 {    
    public static void main(String[] args){
        try (Formatter file = new Formatter("C:\\xamppp\\htdocs\\PBOMinggu2\\output.txt")) {
            System.out.println("=====================");
            System.out.println("PROGRAM JAVA SEGITIGA");
            System.out.println("=====================");
            int nim[] = {2, 1, 4, 1, 7, 6, 2, 0, 2, 1};
            int idx = 0;
            
            int i=0;
            while(i<4){
                int j=4;
                while(j>=i){
                    System.out.print(" ");
                    file.format("%s", " ");
                    j--;
                }
                int k=0;
                while(k<=i){
                    System.out.print(nim[idx] + " ");
                    file.format("%s", nim[idx] + " ");
                    k++;
                    idx++;
                }
            System.out.println();
            file.format("%s %n", " ");
            i++;
            }
        }catch(FileNotFoundException ex){
            System.out.println("File Tidak Ditemukan"); 
        }
    }    
}