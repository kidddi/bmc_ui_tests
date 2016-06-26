package com.bmc.tests;

import com.bmc.fw.GroupData;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by Александр on 26.06.2016.
 */
public class GroupGenerator {

    static Random rnd = new Random();

    @DataProvider(name = "randomGroup")
    public static Iterator<Object[]> randomGroupGenerator(){

        List<Object[]> list = new ArrayList<Object[]>();
        for (int i = 0; i < 5; i++){
            GroupData group = new GroupData(null, "name" + rnd.nextInt(),
                    "header" + rnd.nextInt(),
                    "footer" + rnd.nextInt());
            list.add(new Object[]{group});
        }

        return list.iterator();
    }
}
