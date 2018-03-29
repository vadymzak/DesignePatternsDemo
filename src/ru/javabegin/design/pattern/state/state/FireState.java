package ru.javabegin.design.pattern.state.state;

public class FireState implements  TransformerState {
    @Override
    public void action() {
        System.out.println("Fire");
    }
}
