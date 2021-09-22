package org.launchcode.studio7;

public interface OpticalDisc {

    public static boolean loadDisc() {
        return true;
    }

    void spinDisc();

    void readDiscData();

    void writeDiscData(String name, String contents);

    void getDiscInfo();

}