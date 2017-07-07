/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package central.library;

import java.io.IOException;

/**
 *
 * @author Shubham Prakash
 */
public class Clear {
    public void clear() throws IOException, InterruptedException{
        String os=System.getProperty("os.name");
        if(os.contains("Windows"))
        {ProcessBuilder pb=new ProcessBuilder("cmd","/c","cls");
        pb.inheritIO().start().waitFor();
        }
        else
        {Runtime.getRuntime().exec("clear");
    }
    
}}
