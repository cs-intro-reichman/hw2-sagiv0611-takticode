//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            int repeats = Integer.parseInt(args[1]);
            
            String useAn = "AEFHILMNORSX";

            for (int i = 0; i< word.length(); i++) {
                char ch = word.charAt(i);

                String article = (useAn.indexOf(ch) != -1) ? "an" : "a";

                System.out.println("Give me" + article + " " + ch + ": " + ch + "!");
                
            }
            System.out.println("What does the spell?");
            for (int i = 0; i < repeats; i++) {
                System.out.println(word + "!!!");
            }
        }
}
