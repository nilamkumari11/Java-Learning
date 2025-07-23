import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {

//        // output
//        OutputStream os = System.out;
//        os.write(1);
//        System.out.println();

//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//            osw.write("Hello world!");
//            osw.write(97); // a
//            osw.write(10); // new line
//            osw.write('A');
//            char[] arr = "Hello World".toCharArray();
//            osw.write(arr);
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        // output stream writer has file writer, and fw in itself does not over write any public methods
        // it inherits all its methods from super class osw
//
//        // this overwrites
//        try(FileWriter fw = new FileWriter("note.txt")){
//            fw.write("Hello World ");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        // appended
//        try(FileWriter fw = new FileWriter("note.txt", true)){
//            fw.write( "my name is Nilam!");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
//            bw.write("Hare krishna");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        // create file
//        try{
//            File fo = new File("new-file.txt");
//            fo.createNewFile();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // write in file
//        try{
//            FileWriter fw = new FileWriter("new-file.txt");
//            fw.write("sanskrit");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // reading from file
        try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))){
            while(br.ready()) {
                System.out.println(br.readLine());
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

