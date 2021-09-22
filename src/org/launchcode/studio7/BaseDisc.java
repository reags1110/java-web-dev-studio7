package org.launchcode.studio7;

public class BaseDisc {

    protected boolean isBlank;
    protected boolean isRewritable;
    protected int capacity;

    // Basic constructor
    public BaseDisc(boolean isBlank, boolean isRewritable, int capacity) {
        this.isBlank = isBlank;
        this.isRewritable = isRewritable;
        this.capacity = capacity;
    }

    // Unwritable disc constructor
    public BaseDisc() {
        this.isBlank = false;
        this.isRewritable = false;
    }

    public void printCapacity() {
        System.out.println("This disc has a capacity of " + this.capacity + " GB.");
    }
}