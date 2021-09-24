package org.launchcode.studio7;

public class DVD  extends BaseDisc implements OpticalDisc{

    public DVD(String name, double storageSize, String content, String discType) {
        super(name, storageSize, content, discType);
    }

    public void spinDisc()
    {
        System.out.println("The DvD  spins at rate of 570-1600 rpm");
    }
    public double freeSpace(double storageSize ){
        double dvdSize= 4.7;
        double freesize= 4.7-storageSize;
        return freesize;
    }


    public void read() {
        System.out.println("It is readable");
    }


    public void write() {
        System.out.println("it is writable");
    }
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


