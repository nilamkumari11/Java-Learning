import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        // Stream -> seq of data (system.in)
        // can be 2 types -> 1. byte
        // 2. character (unicode)
        // streams is abstraction that java provides
        // java implements these within class hierarchy in java.io
        // Streams in java (name ending with streams)
        // 1. byte stream (used to handle input and output of data )(img, audio, files)
        // -> 1.1 input stream
        // -> 1.2 output stream
        // they both extend object class
        // 2. character Stream (names ending with reader writer)
        // 2.1 reader
        // 2.1 writer
        // these all are abstract classes, which will have read write methods
        // and they will have their own implementations

        // Predefined Streams
        // SYtem.out -> std os -> console ( print)
        // System.out -> std is-> keyboard (i/p stream type)
        // System.err -> std err -> cosole ( print stream type)
        // they all are byte stream

        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some letters");
            int letters = isr.read(); // read return int
            while(isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}