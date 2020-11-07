/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan33.userlogin;

/**
 *
 * @author Rheiza
 */
class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun (String parUserName, String parPassword){
        if ((parUserName.equals(username)) && (parPassword.equals(password))){
            return statusAkun=true;
        }
        else {
            return statusAkun = false;
        }
    } 
    private void hasilLogin (boolean status, String parUserName){
        status = statusAkun;
        if (status){
             System.out.printf("%n******HALO %s******%n",parUserName.toUpperCase());
              System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
             System.out.println("oopss, Username atau Password anda salah");
        }
    } 
        public void pengecekkanLogin (String parUserName, String parPassword){
           cekAkun(parUserName, parPassword);
           hasilLogin(statusAkun,parUserName);
        }
    }

