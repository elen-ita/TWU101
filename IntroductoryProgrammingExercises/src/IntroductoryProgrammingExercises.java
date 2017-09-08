import java.util.ArrayList;
import java.util.List;

public class IntroductoryProgrammingExercises {

    public static void main (String[] args){

        System.out.println("Testing easiestExercise:");
        System.out.println("----------------------------------------------------");

        easiestExercise();

        printSpace();

        System.out.println("Testing horizontalLine:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 8");

        horizontalLine(8);

        printSpace();

        System.out.println("Size: 1");

        horizontalLine(1);

        printSpace();

        System.out.println("There should be nothing within the following lines:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 0");

        horizontalLine(0);

        printSpace();

        System.out.println("Size: negative");

        horizontalLine(-5);

        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Testing verticalLine:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 4");

        verticalLine(4);

        printSpace();

        System.out.println("Size: 1");

        verticalLine(1);

        printSpace();

        System.out.println("There should be nothing within the following lines:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 0");

        verticalLine(0);

        printSpace();

        System.out.println("Size: negative");

        verticalLine(-5);

        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Testing rightTriangle:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 3");

        rightTriangle(3);

        printSpace();

        System.out.println("Size: 1");

        rightTriangle(1);

        printSpace();

        System.out.println("There should be nothing within the following lines:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 0");

        rightTriangle(0);

        printSpace();

        System.out.println("Size: negative");

        rightTriangle(-4);

        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Testing isoscelesTriangle:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 3");

        isoscelesTriangle(3);

        printSpace();

        System.out.println("Size: 1");

        isoscelesTriangle(1);

        printSpace();

        System.out.println("There should be nothing within the following lines:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 0");

        isoscelesTriangle(0);

        printSpace();

        System.out.println("Size: negative");

        isoscelesTriangle(-9);

        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Testing diamond:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 3");

        diamond(3);

        printSpace();

        System.out.println("Size: 1");

        diamond(1);

        printSpace();

        System.out.println("There should be nothing within the following lines:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 0");

        diamond(0);

        printSpace();

        System.out.println("Size: negative");

        diamond(-3);

        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Testing diamondName:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 4");

        diamondName(4);

        printSpace();

        System.out.println("Size: 1");

        diamondName(1);

        printSpace();

        System.out.println("There should be nothing within the following lines:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Size: 0");

        diamondName(0);

        printSpace();

        System.out.println("Size: negative");

        diamondName(-4);

        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Testing fizzBuzz:");
        System.out.println("----------------------------------------------------");

        fizzBuzz();

        printSpace();

        System.out.println("Testing generate:");
        System.out.println("----------------------------------------------------");

        printSpace();

        System.out.println("Value: 30");

        for (Integer factor : generate(30)){
            System.out.print(factor + " ");
        }

        printSpace();

        System.out.println("Value: 67 (prime)");

        for (Integer factor : generate(67)){
            System.out.print(factor + " ");
        }

        printSpace();

        System.out.println("Value: 45");

        for (Integer factor : generate(45)){
            System.out.print(factor + " ");
        }

        printSpace();

        System.out.println("Value: 2");

        for (Integer factor : generate(2)){
            System.out.print(factor + " ");
        }

        printSpace();

        System.out.println("Value: 1");

        for (Integer factor : generate(1)){
            System.out.print(factor + " ");
        }

        printSpace();

        System.out.println("Value: 0");

        for (Integer factor : generate(0)){
            System.out.print(factor + " ");
        }

        printSpace();

        System.out.println("Value: negative");

        for (Integer factor : generate(-8)){
            System.out.print(factor + " ");
        }
    }



    private static void easiestExercise(){
        System.out.print("*");
    }

    private static void printSpace(){
        System.out.println();
        System.out.println();
    }

    private static void horizontalLine(int size){
        if(size > 0) {
            do {
                System.out.print("*");
                size--;
            } while (size > 0);
        }
    }

    private static void verticalLine(int size) {
        if(size > 0) {
            do {
                System.out.println("*");
                size--;
            } while (size > 0);
        }
    }

    private static void rightTriangle(int size) {
        for (int i = 0; i <= size; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void isoscelesTriangle(int size) {
        for (int height = 0; height < size; height++){
            for (int space = 1; space < size - height; space++){
                System.out.print(" ");
            }
            for (int stars = 0; stars < (height*2+1); stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedIsoscelesTriangle(int size, boolean name) {
        for (int height = size - 1; height > 0; height--){
            int indent = 0;
            if (name) indent = 1;
            for (int space = size - height; space > indent; space--){
                System.out.print(" ");
            }
            for (int stars = (height*2+1); stars > 2; stars--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void diamond(int size) {
        isoscelesTriangle(size);
        invertedIsoscelesTriangle(size, false);
    }

    private static void diamondName(int size) {
        if (size > 0){
            isoscelesTriangle(size);
            System.out.println("Elena");
            invertedIsoscelesTriangle(size + 1, true);
        }
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++){
            if(i%3 == 0 && i%5 != 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0 && i%3 != 0){
                System.out.println("Buzz");
            }
            else if(i%5 == 0 && i%3 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }

        }
    }

    private static List<Integer> generate(int value) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= value; i++){
            while( value%i == 0){
                factors.add(i);
                value /= i;
            }
        }
        return factors;
    }
}
