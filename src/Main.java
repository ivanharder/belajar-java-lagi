//import java.util.Scanner;
class Biodata {
    String nama;
    String hobi;
    Int umur;


    Biodata (String nama, String hobi, Int umur){
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }

    public static int  test (){
        return 100;
    }

    public static void coba(int a){
        if(a == 7){
            System.out.println("oke");
        }
    }

    void menyapa(){
        System.out.println("Halo ganteng " + nama );
    }
}

public class Main{
    public static void calc(int a,int b, String op);

public static void main(String[]args) {
    Biodata dataSaya = new Biodata(nama : "Ivan", hobi: "Olahraga", umur: 20);

dataSaya.menyapa();
System.out.println(dataSaya.hobi);
System.out.println(dataSaya.test());
}


//public class Main {
//    public static void calc(int a, int b, String op){
//        if (op.equals("+")) {
//            System.out.print(a + b);
//        } else if (op.equals("-")) {
//            System.out.print(a - b);
//        } else if (op.equals("x")) {
//            System.out.print(a * b);
//        } else if (op.equals(":")) {
//            System.out.print(a / b);
//        } else if (op.equals("%")) {
//            System.out.print(a % b);
//        } else {
//            System.out.print("Input tidak valid");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean kondisi = true;
//        String op;
//        while (kondisi) {
//            System.out.print("Masukkan a: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan b:");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan operator: ");
//            op = scanner.nextLine();
//
//            calc(a,b, op);
//
//            System.out.print("\nLanjut?");
//            String tanya = scanner.nextLine();
//            if (tanya.equals("ya")) {
//                kondisi = true;
//            } else {
//                kondisi = false;
//            }
//        }
//        scanner.close();
//    }
//}