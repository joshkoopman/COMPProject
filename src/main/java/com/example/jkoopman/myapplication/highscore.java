package com.example.jkoopman.myapplication;

/**
 * Created by jkoopman on 03/04/2017.
 */

public class highscore {
    private static int highscore=0;
    public static int gethighscore() {
        return highscore;
    }
    public static void sethighscore(int hs){
        highscore=hs;
    }
}
