package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        int num = 5;
        int x = 0;

        // Outer loop for rows
        for (int i = 1; i <= num; i++) {
            x = i - 1;

      
            for (int j = i; j <= num - 1; j++) {

      
                System.out.print(" ");

        
                System.out.print("  ");
            }

      
            for (int j = 0; j <= x; j++)
                System.out.print((i + j) < 10
                        ? (i + j) + "  "
                        : (i + j) + " ");

            for (int j = 1; j <= x; j++)
                System.out.print((i + x - j) < 10
                        ? (i + x - j) + "  "
                        : (i + x - j) + " ");

    
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
