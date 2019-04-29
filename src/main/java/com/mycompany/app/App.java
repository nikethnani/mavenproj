package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    private final String message = "Hello World!";
    String name = "AAAA";
    String age = "33";
     String address = "AAAAAAA";

    public App() {}

    public static void main(String[] args) {
        System.out.println("SSSSSSSSSSSS");
      System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
