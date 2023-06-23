package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nilimanalluri
 */
public class TestUserProfile {
    
    public static void main(String[] args){
       UserProfile u1 = new UserProfile();
       UserProfile []user = new UserProfile[4];
       Scanner input = new Scanner(System.in);
       System.out.println("Enter you name");
       String name = input.next();
       System.out.println("Enter you favourite genre fromthe list");
       for(int i=0;i<user.length;i++){
           System.out.println(u1.getGenre());
       }
       System.out.println("User profile created successfully");
    }
}
//