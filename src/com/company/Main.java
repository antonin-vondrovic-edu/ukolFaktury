package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String editedContent2015 = "";
        String editedContent2016 = "";
        String editedContent2017 = "";
        String editedContent2018 = "";
        String editedContent2019 = "";
        String editedContent2020 = "";
        String madafakinCelkem = "";

        //Reading
        try {
            BufferedReader br2015 = new BufferedReader(new FileReader("VF/VF_2015.dat"));
            BufferedReader br2016 = new BufferedReader(new FileReader("VF/VF_2016.dat"));
            BufferedReader br2017 = new BufferedReader(new FileReader("VF/VF_2017.dat"));
            BufferedReader br2018 = new BufferedReader(new FileReader("VF/VF_2018.dat"));
            BufferedReader br2019 = new BufferedReader(new FileReader("VF/VF_2019.dat"));
            BufferedReader br2020 = new BufferedReader(new FileReader("VF/VF_2020.dat"));
            BufferedReader brseznam = new BufferedReader(new FileReader("VF/seznam-spolecnosti.dat"));

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

            String madafakinSeznam = "";
            String nextlineSeznam = brseznam.readLine();

            while ((nextLine2015 != null) && (nextLine2016 != null) && (nextLine2017 != null) && (nextLine2018 != null) && (nextLine2019 != null) && (nextLine2020 != null) && (nextlineSeznam !=null)) {
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

            editedContent2015 = content2015.replaceAll(",", ";");
            editedContent2016 = content2016.replaceAll(",", ";");
            editedContent2017 = content2017.replaceAll(",", ";");
            editedContent2018 = content2018.replaceAll(",", ";");
            editedContent2019 = content2019.replaceAll(",", ";");
            editedContent2020 = content2020.replaceAll(",", ";");

            madafakinCelkem = (editedContent2015 + "\n" + editedContent2016 + "\n" + editedContent2017 + "\n" + editedContent2018 + "\n" + editedContent2019 + "\n" + editedContent2020);
        } catch (IOException e) {
            System.out.println("Unable to read file... :(");
        }


        //Writing

        try {
            BufferedWriter bw2015 = new BufferedWriter(new FileWriter("VF/CSV/VF_2015.csv"));
            BufferedWriter bw2016 = new BufferedWriter(new FileWriter("VF/CSV/VF_2016.csv"));
            BufferedWriter bw2017 = new BufferedWriter(new FileWriter("VF/CSV/VF_2017.csv"));
            BufferedWriter bw2018 = new BufferedWriter(new FileWriter("VF/CSV/VF_2018.csv"));
            BufferedWriter bw2019 = new BufferedWriter(new FileWriter("VF/CSV/VF_2019.csv"));
            BufferedWriter bw2020 = new BufferedWriter(new FileWriter("VF/CSV/VF_2020.csv"));
            BufferedWriter bwCELKEM = new BufferedWriter(new FileWriter("VF/CSV/VF_Celkem.csv"));

            bw2015.write(editedContent2015);
            bw2016.write(editedContent2016);
            bw2017.write(editedContent2017);
            bw2018.write(editedContent2018);
            bw2019.write(editedContent2019);
            bw2020.write(editedContent2020);
            bwCELKEM.write(madafakinCelkem);

            bw2015.close(); bw2016.close(); bw2017.close(); bw2018.close(); bw2019.close(); bw2020.close();
            bwCELKEM.close();
        } catch (IOException e) {
            System.out.println("Unable to write to file...");
        }

    }
}
