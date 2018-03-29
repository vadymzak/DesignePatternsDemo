package ru.javabegin.design.pattern.observer;

import java.util.ArrayList;

public interface PublisherInterface {

    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);

    void removeListener(PublisherActionListener listener);

    void removeAllListeners();

    void notifySubscribers(String message);
}