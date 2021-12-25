/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Muhamad Yamin
 */
public class Implementasi_Exception {

    private int maxAmount =0;
    private int currentIndex = 0;
    private String[] items = new String[1];
    
    void setMaxItemAmount(int maxAmount) {
        this.maxAmount = maxAmount;
        this.items = new
            String[this.maxAmount];
    }
    void addItem(String item)throws 
            ArrayIndexOutOfBoundsException{
        this.items[this.currentIndex] = item;
        this.currentIndex++;
    }
    String[] getItems(){
        return this.items;
    }
    public static void main(String[] args) {
        Implementasi_Exception TabunganJariyah = new TabunganJariyah();
        Scanner jumlahItemHandler = new Scanner(System.in);
        Scanner productInput = new Scanner(System.in);
        Scanner statusInput = new Scanner(System.in);
        boolean addingProduct = true;
        
        System.out.println(" Masukan jumlah uang yang akan ditabung : ");
        int jumlahMaksimalProduk = jumlahItemHandler.nextInt();
        
        TabunganJariyah.setMaxItemAmount(jumlahMaksimalProduk);
        try{
            while(addingProduct){
                System.out.println();
                System.out.println("-----------------------------");
                System.out.println("(1) Masukan jumlah tabungan  ");
                System.out.println("(2) Tabungan sudah dimasukan ");
                System.out.println("-----------------------------");
                System.out.println();
                System.out.println(" Pilihan : ");
                int decision =
                        statusInput.nextInt();
                
                if (decision == 1){
                    System.out.println("Masukan nama penabung : ");
                    String produk = productInput.nextLine();
                    TabunganJariyah.addItem(produk);
                    System.out.println("Saldo Berhasil bertambah");
               }
                if (decision == 2){
                    addingProduct = false;
                }
            }
            
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Saldo tabungan sudah penuh");
        } finally{
            System.out.println("Masukan uang ke tabungan jariyah anda : " 
                    + Arrays.deepToString(TabunganJariyah.getItems()));
        }
    }

    private static class TabunganJariyah extends Implementasi_Exception {

        public TabunganJariyah() {
        }
    }
    
}
