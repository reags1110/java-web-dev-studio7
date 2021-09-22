package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    private static final String spinRate = "570 - 1600";

    private String name;
    private String contents;

    // Basic constructor
    public DVD(boolean aIsBlank, boolean aRewritable, int aCapacity, String aName, String aContents) {
        super(aIsBlank, aRewritable, aCapacity);
        name = aName;
        contents = aContents;
    }

    // Blank DVD constructor
    public DVD(boolean isBlank, boolean isRewritable, int capacity) {
        super(isBlank, isRewritable, capacity);
    }

    // Movie DVD constructor
    public DVD(String aName, String aContents) {
        super();
        name = aName;
        contents = aContents;
    }

    // New CD-RW constructor
    public static DVD DVDRW(int capacity) {
        return new DVD(true, true, capacity);
    }

    // New CD-R constructor
    public static DVD DVDR(int capacity) {
        return new DVD(true, false, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + spinRate + " rpm.");
    }

    @Override
    public void getDiscInfo() {
        if (this.isBlank && this.isRewritable) {
            System.out.println("This is a blank, rewritable DVD.");
            this.printCapacity();
        } else if (this.isBlank && !this.isRewritable) {
            System.out.println("This is a blank, non-rewritable DVD.");
            this.printCapacity();
        } else if (!this.isBlank && this.isRewritable) {
            System.out.println(this.name + " is a rewritable DVD.");
            this.printCapacity();
            System.out.println(this.name + " contains: " + this.contents);
        } else if (!this.isBlank && !this.isRewritable) {
            System.out.println("This is a DVD named " + this.name + ".");
            System.out.println("It contains: " + this.contents);
        }
    }

    @Override
    public void writeDiscData(String name, String contents) {
        if (this.isBlank) {
            System.out.println("Naming DVD '" + name + "'");
            System.out.println("Writing '" + contents + "' to '" + name + "'");
            this.name = name;
            this.contents = contents;
            this.isBlank = false;
        } else if (this.isRewritable) {
            System.out.println("Erasing rewritable DVD.");
            System.out.println("Renaming DVD '" + name + "'");
            System.out.println("Writing '" + contents + "' to '" + name + "'");
            this.name = name;
            this.contents = contents;
            this.isBlank = false;
        } else {
            System.out.println("Error! DVD not writable!");
        }

    }

    @Override
    public void readDiscData() {
        if (name != null || name != "") {
            System.out.println(this.name);
        } else {
            System.out.println("Error! Disc not named.");
        }
        if (contents != null || contents != "") {
            System.out.println(this.contents);
        } else {
            System.out.println("Error! Disc has no contents.");
        }
    }
}
