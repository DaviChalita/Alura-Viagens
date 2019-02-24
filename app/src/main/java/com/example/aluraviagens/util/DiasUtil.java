package com.example.aluraviagens.util;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formataEmTexto(int qtdDias) {
        if(qtdDias > 1){
            return qtdDias + PLURAL;
        }
            return qtdDias + SINGULAR;
        }
    }
