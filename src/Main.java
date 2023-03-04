public class Main {
    public static void main(String[] args) {
        fibonacci(20);
        fibonacci(-3);
    }

    public static void fibonacci(int input){
        if(input==0){
            System.out.println(input);
            System.exit(0);
        } else if (input<0) {
            System.out.println("Вы ввели отрицательное число");
            System.exit(0);
        }
        long[] fibArray = new long[input+1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        System.out.print(fibArray[0]+" "+fibArray[1]+" ");

        for (int i = 2; i <=input ; i++) {
            fibArray[i] = fibArray[i-1]+fibArray[i-2];
            System.out.print(fibArray[i]+" ");
        }
    }
}