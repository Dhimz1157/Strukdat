package Latihan2;
import java.util.ArrayList;
import java.util.Arrays;
public class Latihan2 {

    public static void main(String[] args) {
    ArrayList<String> hewan = new ArrayList<String>(Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));
    System.out.println("Sebelum Hapus Index :");
    System.out.println(hewan);

    hewan.remove(1);
    hewan.remove(1);
    hewan.remove(1);
    System.out.println("\n");
    System.out.println("Setelah Hapus Index :");
    System.out.println(hewan);
    }



}