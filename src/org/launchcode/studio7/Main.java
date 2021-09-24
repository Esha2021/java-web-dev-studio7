package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
//      Disc disc=new Disc();
//
//      ArrayList<CD> cdarray= disc.getCdarray();
//      ArrayList<DVD> dvdarray=disc.getDvdarray();
//        System.out.println(cdarray.toString();
         ArrayList<CD> cdarray=new  ArrayList<>();
         ArrayList<DVD> dvdarray=new ArrayList<>();
        CD cd1=new CD("sony",0.6,"movie","CD-ROM");
        CD cd2=new CD("Denon",0.7,"movie","Gold CD");
        CD cd3=new CD("Creek Audio",0.7,"song","CD-DA");

        cdarray.add(cd1);
        cdarray.add(cd2);
        cdarray.add(cd3);

        DVD dvd1=new DVD("cisco",400,"document","DVD-R");
        DVD dvd2=new DVD("Acme",300,"movie","DVD-RW");
        DVD dvd3=new DVD("Akai",400,"songs","DVD_RW");
        dvdarray.add(dvd1);
        dvdarray.add(dvd2);
        dvdarray.add(dvd3);
        cd1.spinDisc();
        cd1.read();
        cd1.write();


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
