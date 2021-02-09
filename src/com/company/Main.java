package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String[]> data2015 = new ArrayList<>();
        ArrayList<String[]> data2016 = new ArrayList<>();
        ArrayList<String[]> data2017 = new ArrayList<>();
        ArrayList<String[]> data2018 = new ArrayList<>();
        ArrayList<String[]> data2019 = new ArrayList<>();
        ArrayList<String[]> data2020 = new ArrayList<>();

        //region :read
        try {
            BufferedReader br2015 = new BufferedReader(new FileReader("VF/VF_2015.dat"));
            BufferedReader br2016 = new BufferedReader(new FileReader("VF/VF_2016.dat"));
            BufferedReader br2017 = new BufferedReader(new FileReader("VF/VF_2017.dat"));
            BufferedReader br2018 = new BufferedReader(new FileReader("VF/VF_2018.dat"));
            BufferedReader br2019 = new BufferedReader(new FileReader("VF/VF_2019.dat"));
            BufferedReader br2020 = new BufferedReader(new FileReader("VF/VF_2020.dat"));
            BufferedReader brseznam = new BufferedReader(new FileReader("VF/seznam-spolecnosti.dat"));

            String nextLine2015 = br2015.readLine();
            String nextLine2016 = br2016.readLine();
            String nextLine2017 = br2017.readLine();
            String nextLine2018 = br2018.readLine();
            String nextLine2019 = br2019.readLine();
            String nextLine2020 = br2020.readLine();

            String nextlineSeznam = brseznam.readLine();

            while ((nextLine2015 != null)) {
                String[] row = nextLine2015.split(",");
                data2015.add(row);
                nextLine2015 = br2015.readLine();
            }

            while ((nextLine2016 != null)) {
                String[] row = nextLine2016.split(",");
                data2016.add(row);
                nextLine2016 = br2016.readLine();
            }

            while ((nextLine2017 != null)) {
                String[] row = nextLine2017.split(",");
                data2017.add(row);
                nextLine2017 = br2017.readLine();
            }

            while ((nextLine2018 != null)) {
                String[] row = nextLine2018.split(",");
                data2018.add(row);
                nextLine2018 = br2018.readLine();
            }

            while ((nextLine2019 != null)) {
                String[] row = nextLine2019.split(",");
                data2019.add(row);
                nextLine2019 = br2019.readLine();
            }

            while ((nextLine2020 != null)) {
                String[] row = nextLine2020.split(",");
                data2020.add(row);
                nextLine2020 = br2020.readLine();
            }


            for (int i = 0; i < data2015.size(); i++) {
                if (data2015.get(i)[1].equals("05159822")) {
                    data2015.get(i)[1] = "BlueNet, s.r.o.";
                } else if (data2015.get(i)[1].equals("06230932")) {
                    data2015.get(i)[1] = "Epic Internet a.s.";
                } else if (data2015.get(i)[1].equals("18539217")) {
                    data2015.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2015.get(i)[1].equals("02838109")) {
                    data2015.get(i)[1] = "Martin Nový";
                } else if (data2015.get(i)[1].equals("01846359")) {
                    data2015.get(i)[1] = "GreenStyles, a.s.";
                } else if (data2015.get(i)[1].equals("9831829")) {
                    data2015.get(i)[1] = "Valza, a.s.";
                } else if (data2015.get(i)[1].equals("33828139")) {
                    data2015.get(i)[1] = "ZCZ, s.r.o.";
                }
            }

            for (int i = 0; i < data2016.size(); i++) {
                if (data2016.get(i)[1].equals("05159822")) {
                    data2016.get(i)[1] = "BlueNet, s.r.o.";
                } else if (data2016.get(i)[1].equals("06230932")) {
                    data2016.get(i)[1] = "Epic Internet a.s.";
                } else if (data2016.get(i)[1].equals("18539217")) {
                    data2016.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2016.get(i)[1].equals("02838109")) {
                    data2016.get(i)[1] = "Martin Nový";
                } else if (data2016.get(i)[1].equals("01846359")) {
                    data2016.get(i)[1] = "GreenStyles, a.s.";
                } else if (data2016.get(i)[1].equals("9831829")) {
                    data2016.get(i)[1] = "Valza, a.s.";
                } else if (data2016.get(i)[1].equals("33828139")) {
                    data2016.get(i)[1] = "ZCZ, s.r.o.";
                }
            }

            for (int i = 0; i < data2017.size(); i++) {
                if (data2017.get(i)[1].equals("05159822")) {
                    data2017.get(i)[1] = "BlueNet, s.r.o.";
                } else if (data2017.get(i)[1].equals("06230932")) {
                    data2017.get(i)[1] = "Epic Internet a.s.";
                } else if (data2017.get(i)[1].equals("18539217")) {
                    data2017.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2017.get(i)[1].equals("02838109")) {
                    data2017.get(i)[1] = "Martin Nový";
                } else if (data2017.get(i)[1].equals("01846359")) {
                    data2017.get(i)[1] = "GreenStyles, a.s.";
                } else if (data2017.get(i)[1].equals("9831829")) {
                    data2017.get(i)[1] = "Valza, a.s.";
                } else if (data2017.get(i)[1].equals("33828139")) {
                    data2017.get(i)[1] = "ZCZ, s.r.o.";
                }
            }

            for (int i = 0; i < data2018.size(); i++) {
                if (data2018.get(i)[1].equals("05159822")) {
                    data2018.get(i)[1] = "BlueNet, s.r.o.";
                } else if (data2018.get(i)[1].equals("06230932")) {
                    data2018.get(i)[1] = "Epic Internet a.s.";
                } else if (data2018.get(i)[1].equals("18539217")) {
                    data2018.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2018.get(i)[1].equals("02838109")) {
                    data2018.get(i)[1] = "Martin Nový";
                } else if (data2018.get(i)[1].equals("01846359")) {
                    data2018.get(i)[1] = "GreenStyles, a.s.";
                } else if (data2018.get(i)[1].equals("9831829")) {
                    data2018.get(i)[1] = "Valza, a.s.";
                } else if (data2018.get(i)[1].equals("33828139")) {
                    data2018.get(i)[1] = "ZCZ, s.r.o.";
                }
            }

            for (int i = 0; i < data2019.size(); i++) {
                if (data2019.get(i)[1].equals("05159822")) {
                    data2019.get(i)[1] = "BlueNet, s.r.o.";
                } else if (data2019.get(i)[1].equals("06230932")) {
                    data2019.get(i)[1] = "Epic Internet a.s.";
                } else if (data2019.get(i)[1].equals("18539217")) {
                    data2019.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2019.get(i)[1].equals("02838109")) {
                    data2019.get(i)[1] = "Martin Nový";
                } else if (data2019.get(i)[1].equals("01846359")) {
                    data2019.get(i)[1] = "GreenStyles, a.s.";
                } else if (data2019.get(i)[1].equals("9831829")) {
                    data2019.get(i)[1] = "Valza, a.s.";
                } else if (data2019.get(i)[1].equals("33828139")) {
                    data2019.get(i)[1] = "ZCZ, s.r.o.";
                }
            }

            for (int i = 0; i < data2020.size(); i++) {
                if (data2020.get(i)[1].equals("05159822")) {
                    data2020.get(i)[1] = "BlueNet, s.r.o.";
                } else if (data2020.get(i)[1].equals("06230932")) {
                    data2020.get(i)[1] = "Epic Internet a.s.";
                } else if (data2020.get(i)[1].equals("18539217")) {
                    data2020.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2020.get(i)[1].equals("02838109")) {
                    data2020.get(i)[1] = "Martin Nový";
                } else if (data2020.get(i)[1].equals("01846359")) {
                    data2020.get(i)[1] = "GreenStyles, a.s.";
                } else if (data2020.get(i)[1].equals("9831829")) {
                    data2020.get(i)[1] = "Valza, a.s.";
                } else if (data2020.get(i)[1].equals("33828139")) {
                    data2020.get(i)[1] = "ZCZ, s.r.o.";
                }
            }

            br2015.close();
            br2016.close();
            br2017.close();
            br2018.close();
            br2019.close();
            br2020.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //endregion

        //region: write
        try {
            BufferedWriter bw2015 = new BufferedWriter(new FileWriter("VF/CSV/VF_2015.csv"));
            BufferedWriter bw2016 = new BufferedWriter(new FileWriter("VF/CSV/VF_2016.csv"));
            BufferedWriter bw2017 = new BufferedWriter(new FileWriter("VF/CSV/VF_2017.csv"));
            BufferedWriter bw2018 = new BufferedWriter(new FileWriter("VF/CSV/VF_2018.csv"));
            BufferedWriter bw2019 = new BufferedWriter(new FileWriter("VF/CSV/VF_2019.csv"));
            BufferedWriter bw2020 = new BufferedWriter(new FileWriter("VF/CSV/VF_2020.csv"));
            BufferedWriter bwCELKEM = new BufferedWriter(new FileWriter("VF/CSV/VF_Celkem.csv"));

            for (int i = 0; i < data2015.size(); i++) {
                bw2015.write(data2015.get(i)[0] + ";");
                bw2015.write(data2015.get(i)[1] + ";");
                bw2015.write(data2015.get(i)[2]);
                bw2015.newLine();
            }

            for (int i = 0; i < data2016.size(); i++) {
                bw2016.write(data2016.get(i)[0] + ";");
                bw2016.write(data2016.get(i)[1] + ";");
                bw2016.write(data2016.get(i)[2]);
                bw2016.newLine();
            }

            for (int i = 0; i < data2017.size(); i++) {
                bw2017.write(data2017.get(i)[0] + ";");
                bw2017.write(data2017.get(i)[1] + ";");
                bw2017.write(data2017.get(i)[2]);
                bw2017.newLine();
            }

            for (int i = 0; i < data2018.size(); i++) {
                bw2018.write(data2018.get(i)[0] + ";");
                bw2018.write(data2018.get(i)[1] + ";");
                bw2018.write(data2018.get(i)[2]);
                bw2018.newLine();
            }

            for (int i = 0; i < data2019.size(); i++) {
                bw2019.write(data2019.get(i)[0] + ";");
                bw2019.write(data2019.get(i)[1] + ";");
                bw2019.write(data2019.get(i)[2]);
                bw2019.newLine();
            }

            for (int i = 0; i < data2020.size(); i++) {
                bw2020.write(data2020.get(i)[0] + ";");
                bw2020.write(data2020.get(i)[1] + ";");
                bw2020.write(data2020.get(i)[2]);
                bw2020.newLine();
            }

            bw2015.close();
            bw2016.close();
            bw2017.close();
            bw2018.close();
            bw2019.close();
            bw2020.close();
            bwCELKEM.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //endregion

    }
}
