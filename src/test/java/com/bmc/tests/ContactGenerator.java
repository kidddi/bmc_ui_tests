package com.bmc.tests;

import com.bmc.fw.ContactData;
import com.bmc.fw.GroupData;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by energetic on 27.07.2016.
 */
public class ContactGenerator {

    static Random rnd = new Random();

    @DataProvider(name = "randomContact")
    public static Iterator<Object[]> randomContactGenerator(){

        List<Object[]> list = new ArrayList<Object[]>();
        for (int i = 0; i < 5; i++) {
            ContactData cont = generateRandomGroup();
            list.add(new Object[]{cont});
        }
        return list.iterator();
    }

    private static ContactData generateRandomGroup() {
        return new ContactData()
                .setFirstname(generateRandomString(20))
                .setLastname(generateRandomString(20))
                .setAdress(generateRandomString(200))
                .setHome(generateRandomString(50))
                .setMobile(generateRandomString(10))
                .setWork(generateRandomString(50))
                .setEmail1(generateRandomString(20))
                .setEmail2(generateRandomString(20));
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
}
