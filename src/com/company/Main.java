package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

       //Reading
        try {
            BufferedReader br = new BufferedReader(new FileReader("VF_2015.dat"));
            for (int i = 0; i < 10; i++) {
                String bruh = br.readLine();
                System.out.println(bruh);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Unable to read file...");
        }


        //Writing
        /*
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < 3; i++) {
                bw.write("Hello world!");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Unable to write to file...");
        }
        */
    }
}
