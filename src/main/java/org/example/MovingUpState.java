package org.example;

public class MovingUpState implements ElevatorState {
    @Override
    public void pushButton() {
        System.out.println("Move elevator to lower floors");
    }
}
