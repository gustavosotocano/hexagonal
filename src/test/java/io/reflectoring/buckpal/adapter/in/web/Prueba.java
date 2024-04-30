package io.reflectoring.buckpal.adapter.in.web;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prueba {

@Test
    public void test(){
    String texto = "Esta oración contiene (un paréntesis) y otro (paréntesis más).";
    Pattern patron = Pattern.compile("\\(([^(]*)\\)");
    Matcher matcher = patron.matcher(texto);
    while (matcher.find()) {
        System.out.println("Coincidencia encontrada: " + matcher.group(1));
    }

 
}
}
