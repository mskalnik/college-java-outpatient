/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mskalnik
 */
public class Main {
    public static void main(String[] args) {
        try {
            int switcher = readFromFile();
            switch(switcher) {
                case 1:
                    //com.mskalnik.console.Main.start();
                    break;
                case 2:
                    com.mskalnik.gui.Main.start();
                    break;
                
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
    }

    private static int readFromFile() {
        try (Scanner s = new Scanner(new File("main.cfg"))){
            return s.nextInt();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 2;
    }
}
