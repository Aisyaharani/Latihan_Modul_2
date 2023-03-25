/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AISYAH
 */
public class StrukDat2 {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> Hewan = new ArrayList<>();
        
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        System.out.println("Hewan :"+ Hewan);
        
        ArrayList<String> DeleteHewan = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Hewan yang dihapus : ");
        String delete = input.next();
        
        Hewan.remove(delete);
        
        System.out.println("Output Hewan"+Hewan);
    }
    
}
