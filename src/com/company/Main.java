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
            BufferedReader br2015 = new BufferedReader(new FileReader("VF/VF_2015.dat"));
            BufferedReader br2016 = new BufferedReader(new FileReader("VF/VF_2016.dat"));
            BufferedReader br2017 = new BufferedReader(new FileReader("VF/VF_2017.dat"));
            BufferedReader br2018 = new BufferedReader(new FileReader("VF/VF_2018.dat"));
            BufferedReader br2019 = new BufferedReader(new FileReader("VF/VF_2019.dat"));
            BufferedReader br2020 = new BufferedReader(new FileReader("VF/VF_2020.dat"));

            String content2015 = "";
            String nextLine2015 = br2015.readLine();

            String content2016 = "";
            String nextLine2016 = br2016.readLine();

            String content2017 = "";
            String nextLine2017 = br2017.readLine();

            String content2018 = "";
            String nextLine2018 = br2018.readLine();

            String content2019 = "";
            String nextLine2019 = br2019.readLine();

            String content2020 = "";
            String nextLine2020 = br2020.readLine();

            while ((nextLine2015 != null) && (nextLine2016 != null) && (nextLine2017 != null) && (nextLine2018 != null) && (nextLine2019 != null) && (nextLine2020 != null)) {
                content2015 += (nextLine2015 + "\n");
                content2016 += (nextLine2016 + "\n");
                content2017 += (nextLine2017 + "\n");
                content2018 += (nextLine2018 + "\n");
                content2019 += (nextLine2019 + "\n");
                content2020 += (nextLine2020 + "\n");
                nextLine2015 = br2015.readLine();
                nextLine2016 = br2016.readLine();
                nextLine2017 = br2017.readLine();
                nextLine2018 = br2018.readLine();
                nextLine2019 = br2019.readLine();
                nextLine2020 = br2020.readLine();
            }

            br2015.close(); br2016.close(); br2017.close(); br2018.close(); br2019.close(); br2020.close();
        } catch (IOException e) {
            System.out.println("Unable to read file... :(");
        }


        //Writing
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("VF/nezname-spolecnosti.dat"));

            bw.write("");

            bw.close();
        } catch (IOException e) {
            System.out.println("Unable to write to file...");
        }

    }
}
