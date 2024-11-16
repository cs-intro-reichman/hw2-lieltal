// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int cheeringRepeatCount = Integer.parseInt(args[1]);

                String anLetters = "AEFHILMNORSK";
                String article;

                for(int i = 0 ; i < name.length(); i++) {
                        char currentChar = name.charAt(i);
                        if(anLetters.indexOf(currentChar) != -1) {
                                article = "an";
                        }
                        else { 
                                article = "a";
                        }
                        System.out.println("Give me " + article + " " + currentChar + ": " + currentChar + "!");
                }
                System.out.println("What does that spell??");

                for(int i = 0; i < cheeringRepeatCount; i++) {
                        System.out.println(name + "!!!");
                }

        }
}
