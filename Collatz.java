public class Collatz {
    public static void main(String args[]) {
        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= maxSeed; seed++) {
            int current = seed;
            int count = 1;

            if (verbose) {
                System.out.print(current + " ");
            }

            do {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = current * 3 + 1;
                }

                if (verbose) {
                    System.out.print(current + " ");
                }

                count++;
            } while (current != 1);

            if (verbose) {
                System.out.println("(" + count + ")");
            }
        }

        System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
    }
}