package dayThree;

public class Assignment {
    static void main(String[] args) {
        printNumber();
        System.out.println("----------------------------------------------------");
        hello();
        System.out.println("----------------------------------------------------");
        onlyEven();
        System.out.println("----------------------------------------------------");
        evenAndOdd();
        System.out.println("----------------------------------------------------");
        reverseNumbers();
    }

    public static void printNumber(){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }
    }

    public static void hello(){
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println("Hello world " + i);
        }
    }

    public static void onlyEven(){
        for (int i = 0 ; i <= 10 ; i++){
            if(i % 2 == 0){
                System.out.println("Print even number " + i);
            }
        }
    }

    public static void evenAndOdd(){
        for (int i = 0 ; i <= 10 ; i++){
            if(i % 2 == 0){
                System.out.println("Even number " + i);
            }else {
                System.out.println("Odd number " + i);
            }
        }
    }

    public static void reverseNumbers(){
        for (int i = 10 ; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}
