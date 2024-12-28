package com.mycompany.Info;

public class Info
{

    private final String message = "Hello WWorld!!!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
