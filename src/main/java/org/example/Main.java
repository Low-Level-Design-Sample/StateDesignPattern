package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ElevatorContext context = new ElevatorContext();

        context.setState(new MovingUpState());
        context.request();

        context.setState(new MovingDownState());
        context.request();

        context.setState(new StoppedState());
        context.request();
    }
}