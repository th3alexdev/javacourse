package Strings;
public class StringsExercise {
    public static void main(String[] args) {

        /* Extract the extension and the name of a file. */
        String file = "myfile.pdf";
        int index = file.indexOf(".");
        
        String extension = file.substring(index);
        String filename = file.substring(0, index);

        System.out.println("filename -> " + filename);
        System.out.println("extension -> " + extension);
    }
}
