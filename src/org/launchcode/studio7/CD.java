package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private static final String spinRate = "200 - 500";

    private String name;
    private String contents;

    // Basic constructor
    public CD(boolean aIsBlank, boolean aIsRewritable, int aCapacity, String aName, String aContents) {
        super(aIsBlank, aIsRewritable, aCapacity);
        name = aName;
        contents = aContents;
    }

    // Blank CD constructor
    public CD(boolean isBlank, boolean isRewritable, int capacity) {
        super(isBlank, isRewritable, capacity);
    }

    // Music CD constructor
    public CD(String aName, String aContents) {
        super();
        name = aName;
        contents = aContents;
    }

    // New CD-RW constructor
    public CD CDRW(int capacity) {
        return new CD(true, true, capacity);
    }

    // New CD-R constructor
    public CD CDR(int capacity) {
        return new CD(true, false, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + spinRate + " rpm.");
    }

    @Override
    public void getDiscInfo() {
        if (this.isBlank && this.isRewritable) {
            System.out.println("This is a blank, rewritable CD.");
            this.printCapacity();
        } else if (this.isBlank && !this.isRewritable) {
            System.out.println("This is a blank, non-rewritable CD.");
            this.printCapacity();
        } else if (!this.isBlank && this.isRewritable) {
            System.out.println(this.name + " is a rewritable CD.");
            this.printCapacity();
            System.out.println(this.name + " contains: " + this.contents);
        } else if (!this.isBlank && !this.isRewritable) {
            System.out.println("This is a CD named " + this.name + ".");
            System.out.println("It contains: " + this.contents);
        }
    }

    @Override
    public void writeDiscData(String name, String contents) {
        if (this.isBlank) {
            System.out.println("Naming CD '" + name + "'");
            System.out.println("Writing '" + contents + "' to '" + name + "'");
            this.name = name;
            this.contents = contents;
            this.isBlank = false;
        } else if (this.isRewritable) {
            System.out.println("Erasing rewritable CD.");
            System.out.println("Renaming CD '" + name + "'");
            System.out.println("Writing '" + contents + "' to '" + name + "'");
            this.name = name;
            this.contents = contents;
            this.isBlank = false;
        } else {
            System.out.println("Error! Disc not writable!");
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
