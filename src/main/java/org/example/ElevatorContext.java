package org.example;

public class ElevatorContext {
    private ElevatorState state;

    public void setState(ElevatorState state) {
        this.state = state;
    }
    public void request() {
        state.pushButton();
    }
}
