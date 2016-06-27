package com.bmc.tests;

import com.bmc.fw.GroupData;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class GroupGenerator {

    static Random rnd = new Random();

    @DataProvider(name = "groupsFromFile")
    public static Iterator<Object[]> groupsFromFile() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        FileReader fileReader = new FileReader(new File("groups.txt"));
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line !=null){
            String[] parts = line.split(";");
            GroupData group = new GroupData(null, parts[0], parts[1], parts[2]);
            System.out.println("name from FIle: " + parts[0]);
            list.add(new Object[]{group});
            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }

    @DataProvider(name = "randomGroup")
    public static Iterator<Object[]> randomGroupGenerator(){

        List<Object[]> list = new ArrayList<Object[]>();
        for (int i = 0; i < 5; i++) {
            GroupData group = generateRandomGroup();
            list.add(new Object[]{group});
        }
        return list.iterator();
    }

    private static GroupData generateRandomGroup() {
        return new GroupData()
                        .setName(generateRandomString(20))
                        .setHeader(generateRandomString(100))
                        .setFooter(generateRandomString(100));
    }
    public static String generateRandomString(int maxLength){
        int len = rnd.nextInt(maxLength);
        String s = "";
        for (int i = 0; i < len; i++){
            char ch = (char)(rnd.nextInt(26) + 97);
            s += ch;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        File outFile = new File(args[0]);
        FileWriter writer = new FileWriter(outFile);
        int count = Integer.parseInt(args[1]);
        for (int i = 0; i < count; i++) {
            GroupData group = generateRandomGroup();
            String line = group.getName() + ";" + group.getHeader()
                    + ";" + group.getFooter();
            writer.write(line + "\n");
            System.out.println(line);
        }
        writer.close();

    }
}
