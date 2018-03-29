package ru.javabegin.design.pattern.state;

import ru.javabegin.design.pattern.state.context.TransformerContext;
import ru.javabegin.design.pattern.state.state.FireState;
import ru.javabegin.design.pattern.state.state.MoveState;
import ru.javabegin.design.pattern.state.state.TransformerState;

public class StateMain {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateMove);
        context.action();

        context.setState(stateFire);
        context.action();
    }
}
