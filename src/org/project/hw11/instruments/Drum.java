package org.project.hw11.instruments;

public class Drum implements Instrument{
    double sizeOfDrum;

    public Drum (double sizeOfDrum){
        this.sizeOfDrum = sizeOfDrum;
    }

    @Override
    public void play() {
        System.out.println("The drum is playing. Size of " + sizeOfDrum);
    }
}
