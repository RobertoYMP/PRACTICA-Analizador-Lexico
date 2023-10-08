/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorllex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class Scanner {
    //Declaramos las palabras claves
     private static final Map<String, TipoToken> palabrasReservadas;
    static {
        palabrasReservadas = new HashMap<>();
        palabrasReservadas.put("and",    TipoToken.AND);
        palabrasReservadas.put("else",   TipoToken.ELSE);
        palabrasReservadas.put("false",  TipoToken.FALSE);
        palabrasReservadas.put("for",    TipoToken.FOR);
        palabrasReservadas.put("fun",    TipoToken.FUN);
        palabrasReservadas.put("if",     TipoToken.IF);
        palabrasReservadas.put("null",   TipoToken.NULL);
        palabrasReservadas.put("or",     TipoToken.OR);
        palabrasReservadas.put("print",  TipoToken.PRINT);
        palabrasReservadas.put("return", TipoToken.RETURN);
        palabrasReservadas.put("true",   TipoToken.TRUE);
        palabrasReservadas.put("var",    TipoToken.VAR);
        palabrasReservadas.put("while",  TipoToken.WHILE);
    }
    private final String source;
    
    private final List<Token> tokens = new ArrayList<>();
    
    //Se analizara la cadena de entrada por medio del archivo
    public Scanner(String source){
        this.source = source + " ";
    }
    
    public List<Token> scan() throws Exception {
        int estado = 0;
        String lexema = "";
        char c;
 
}

// estado 0 de operand
                case 1:
                        if(c == '='){
        Token t = new Token(TipoToken.GREATER_EQUAL, lexema);
        tokens.add(t);
    }else{
        Token t = new Token(TipoToken.GREATER, lexema);
        tokens.add(t);
        i--;
    }

    estado = 0;
    lexema = "";

                    break;
//-----

