package org.project.hw11.instruments;

public class Test {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[20];
        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0) {
                instruments[i] = new Guitar(i);
            } else if (i % 4 == 0) {
                instruments[i] = new Drum(i);
            } else {
                instruments[i] = new Trumpet(i);
            }
        }

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
