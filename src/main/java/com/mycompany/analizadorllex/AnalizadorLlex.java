/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analizadorllex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//import java.util.Scanner;

public class AnalizadorLlex {

    static boolean existenErrores = false;

    public static void main(String[] args) throws IOException {
        String archivoPath = "prueba.txt"; //Archivo donde se hara cada prueba
        if(args.length > 1) {
            System.out.println("Uso correcto: interprete [prueba.txt]");//solo se va cambiando als pruebas propuestas por el profesor
            System.exit(64);
        } else if(args.length == 1){
            archivoPath = args[0]; // Dentro del archivo que declaramos se establece como argumento 
        }
        ejecutarArchivo(archivoPath);
    }
//Permite leer el contenido del archivo
    private static void ejecutarArchivo(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        ejecutar(new String(bytes, Charset.defaultCharset()));
        if(existenErrores) System.exit(65);
    }

    private static void ejecutarPrompt() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        for(;;){
            System.out.print(">>> ");
            String linea = reader.readLine();
            if(linea == null) break; // Presionar Ctrl + D
            ejecutar(linea);
            existenErrores = false;
        }
    }
//Se va encontrando cada token y descompone en pocas porciones el codigo fuente para que se tienda mejor
    private static void ejecutar(String source) {
        try{
            Scanner scanner = new Scanner(source);
            List<Token> tokens = scanner.scan();

            for(Token token : tokens){
                System.out.println(token);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    static void error(int linea, String mensaje){
        reportar(linea, "", mensaje);
    }

    private static void reportar(int linea, String posicion, String mensaje){
        System.err.println(
                "[linea " + linea + "] Error " + posicion + ": " + mensaje
        );
        existenErrores = true;
    }
}