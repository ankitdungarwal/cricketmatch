package com.ankit.cricket.util;

import java.util.Arrays;

/*
* random number generator class;
*
*/
public class RunsGenerator {

    public static int[] identifyBatsman(Batsman batsmanType)
    {
        int[] batsman0 = new int[]{0,1,2,3,4,5,6};
        int[] batsman1 = new int[]{4,5,6};
        int[] batsman2 = new int[]{0,1,2,3};
        int batsmanNumber = batsmanType.getNumber();

        if(batsmanNumber == 0)
        {
            return batsman0;
        }
        else if(batsmanNumber == 1)
        {
            return batsman1;
        }
        else if(batsmanNumber == 2)
        {
            return batsman2;
        }
        return new int[0];
    }

    public static int[] generateRun(int[] array, int ballsfaced)
    {
        int[] randomNumber = new int[6];
        for(int i=0; i<ballsfaced; i++) {
          randomNumber[i] =   array[0] + ((int) Math.random() * array[array.length-1]);
        }
                return randomNumber;
    }

    public static String evaluateResult(int[] runsScored, int targetScore)
    {
        int totalRuns = Arrays.stream(runsScored).sum();
        if(totalRuns>= targetScore)
        {
            return "Winner is batsman";
        }
        else
        {
            return "Winner is other team";
        }
    }

}
