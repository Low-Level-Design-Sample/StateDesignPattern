package org.example;

public class MovingDownState implements ElevatorState {
    public void pushButton() {
        System.out.println("Move elevator to upper floors");
    }
}
