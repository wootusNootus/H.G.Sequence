public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing run time for recursion:");
        testRuntime(() -> G(320));
    }

    public static int G(int n){
        if(n < 0){
            throw new IllegalArgumentException();
        }
        else if(n == 0){
            return 0;
        }
        else{
            return (n - G(G(n - 1)));
        }
    }

    public static void printNGNumbers(int n){
        for(int i = 0; i <= n; i++){
            System.out.println("Term " + (i+1) + ": " + G(i));
        }
    }

    // Used the following website for tutorial
    // https://www.tutorialspoint.com/how-to-implement-the-runnable-interface-using-lambda-expression-in-java
    public static void testRuntime(Runnable function) {
        // Testing runtime for x
        long startTime = System.nanoTime();

        // Running the function
        function.run();

        long endTime = System.nanoTime();

        double duration = (endTime - startTime)/1_000_000.0;
        System.out.println("Execution time: "+ duration + "ms");
    }
}

