package org.project.hw11.instruments;

public class Trumpet implements Instrument{
    double sizeOfTrumpet;

    public Trumpet (double sizeOfTrumpet){
        this.sizeOfTrumpet = sizeOfTrumpet;
    }

    @Override
    public void play() {
        System.out.println("The trumpet is playing. Size of " + sizeOfTrumpet);
    }
}
