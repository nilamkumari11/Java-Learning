import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("note.txt")){
            int letters = fr.read(); // read return int
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


            // br takes character stream, so we convert byte (system.in) to char using Input stream buffer
            // then it reads char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed : " + br.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
