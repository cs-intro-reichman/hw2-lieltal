// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int cheeringRepeatCount = Integer.parseInt(args[1]);

                String anLetters = "AEFHILMNORSX";

                name = name.toUpperCase();
                for(int i = 0 ; i < name.length(); i++) {
                        char currentChar = name.charAt(i);
                        if(anLetters.indexOf(currentChar) != -1) {
                                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");

                        }
                        else { 
                                System.out.println("Give me a  " + currentChar + ": " + currentChar + "!");
                        }
                }
                System.out.println("What does that spell?");

                for(int i = 0; i < cheeringRepeatCount; i++) {
                        System.out.println(name + "!!!");
                }
        }
}
