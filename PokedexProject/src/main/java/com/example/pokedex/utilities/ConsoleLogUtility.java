package com.example.pokedex.utilities;

public class ConsoleLogUtility {
    public static void logTextToConsole(OutPutGeneratorInterfaceText generator) {
        System.out.println(generator.generateText());
    }
}
