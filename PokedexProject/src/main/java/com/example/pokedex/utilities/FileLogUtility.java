package com.example.pokedex.utilities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLogUtility {
    public static void logHtmlToFile(String name, String[] description, String filePath) throws IOException {
        OutputGeneratorInterfaceHtml generator = new OutPutGeneratorHtmlImpl();
        Files.write(Paths.get(filePath), generator.generateHtml(name, description).getBytes(StandardCharsets.UTF_8));
    }
}

