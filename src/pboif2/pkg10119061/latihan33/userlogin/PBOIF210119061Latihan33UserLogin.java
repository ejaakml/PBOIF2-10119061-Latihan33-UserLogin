/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 * @author Rheiza
 * NAMA  : RHEIZA AKMAL R
 * KELAS : IF2
 * NIM   : 10119061
 * Deskripsi Program : user memasukan username dan password pada aplikasi
 */
public class PBOIF210119061Latihan33UserLogin {
    public static String usName, passWord;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);   
    
    System.out.print("Masukan Username  : ");
    usName = scanner.nextLine();
    System.out.print("Masukan Password  : ");
    passWord = scanner.nextLine();
    User user1 = new User();
    user1.pengecekkanLogin(usName,passWord);
    }
    
}
