package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        DVD readWrite = DVD.DVDRW(10);
        DVD writeOnly = DVD.DVDR(20);

        CD music = new CD("The Best of Simon & Garfunkel", "Sound of Silence\nBridge Over Troubled Waters\nThe Boxer");

        readWrite.spinDisc();
        readWrite.getDiscInfo();
        readWrite.writeDiscData("Best Home Movie", "0:00 - 3:00 : Wedding Reception\n3:00 - 3:30 : Our First Dance");
        readWrite.readDiscData();
        readWrite.writeDiscData("2nd Best Home Movie", "0:00 - 5:00 : Bailey playing in the snow");
        readWrite.readDiscData();

        System.out.println("\n-----\n");

        writeOnly.spinDisc();
        writeOnly.getDiscInfo();
        writeOnly.writeDiscData("Java For Beginners", "0:00 - 1:00 : Basic Syntax\n1:00 - 2:00 : Classes & Inheritance");
        writeOnly.readDiscData();
        writeOnly.writeDiscData("Testing", "lots of new video");
        writeOnly.readDiscData();

        System.out.println("\n-----\n");

        music.spinDisc();
        music.getDiscInfo();
        music.writeDiscData("More Music", "fun songs");
        music.readDiscData();
    }
}
