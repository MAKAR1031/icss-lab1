package ru.makar.icss.lab1;

import ru.makar.icss.lab1.demo.impl.GsonDemo;
import ru.makar.icss.lab1.demo.impl.JacksonDemo;

public class Launcher {
    public static void main(String[] args) {
        new GsonDemo().run();
        new JacksonDemo().run();
    }
}
