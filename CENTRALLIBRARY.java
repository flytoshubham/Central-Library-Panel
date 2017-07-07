/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package central.library;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Shubham Prakash
 */
public class CENTRALLIBRARY {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, InterruptedException {
        Login l=new Login();
        Clear c=new Clear();
        Register reg=new Register();
        System.out.println("WELCOME TO COLLEGE LIBRARY PANEL");
        Scanner sc=new Scanner(System.in);
        int t;
        
        do
        {
            
        
        System.out.println("SELECT THE GIVEN OPTIONS");
        System.out.println("1. for login");
        System.out.println("2.for registration");
        System.out.println("3. for exit");
        int ch=Integer.parseInt(sc.nextLine());
        switch(ch)
        {
            case 1:
                l.login();
                break;
         case 2:
               reg.register();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        System.out.println("DO YOU WANT TO CONTINUE");
                System.out.println("SELECT OPTIONS ");
                System.out.println("1. YES");
                System.out.println("2. NO");
                String e=sc.nextLine();
                int d=Integer.parseInt(e);
                
                switch(d) {
                    case 1:
                        t=1;
                       c.clear();
                        break;
                    case 2:
                        t=0;
                        break;
                    default :
                        System.out.println("invalid option");
                        t=0;
                        break;
                }
               
        // TODO code application logic here
    }
        while(t==1);
                
        
        
                
    

        }}
