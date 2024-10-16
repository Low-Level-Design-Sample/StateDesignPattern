package org.example;

public class StoppedState implements ElevatorState{
    @Override
    public void pushButton() {
        System.out.println("Open the doors");
    }
}
