public class App {
    public static void main(String[] args) throws Exception {
        printNGNumbers(10);
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
}

