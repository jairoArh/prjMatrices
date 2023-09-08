package test;

import logic.HandlingArrays;
import logic.HandlingMatriz;
import logic.TypeSort;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        HandlingArrays handlingArrays = new HandlingArrays(new String[]{"100","45","12","56","06","725","627"});

        handlingArrays.deleteElement("12");

        HandlingMatriz hm = new HandlingMatriz(6,2);
        hm.loadValues();
        System.out.println( hm.showMatriz());

        System.out.println(Arrays.toString( handlingArrays.sort( TypeSort.BURBLE)));
    }
}
