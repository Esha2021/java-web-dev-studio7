package org.launchcode.studio7;

public class CD  extends BaseDisc implements OpticalDisc{



    public CD(String name, double storageSize, String content, String discType) {
        super(name, storageSize, content, discType);
    }

public  void spinDisc()
{
    System.out.println("The Cd  spins at rate of 200-500 rpm ");
}

    public void read() {
        System.out.println("It is readable");
    }


    public void write() {
        System.out.println("it is writable");
    }

    public double freeSpace(double storageSize){
        double cdsize= 700 ;
        double freesize=700-storageSize;
        return freesize;

}
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
