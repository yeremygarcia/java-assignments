package Lamdas;
import java.util.function.*;
    public class Main {
        public static void main(String[] args) {

            BinaryOperator<Integer> addition = (a, b) -> a + b;
            System.out.println("Addition " + addition.apply(5, 3));

            BinaryOperator<Integer> subtraction = (a, b) -> a - b;
            System.out.println("Subtraction: " + subtraction.apply(12, 7));
            BinaryOperator<Integer> multiplication = (a, b) -> a * b;
            System.out.println("Multiplication: " + multiplication.apply(3, 2));
            BinaryOperator<Integer> division = (a, b) -> a / b;
            System.out.println("Division: " + division.apply(8, 2));

            //
            MyFunctionalInterface hello = (name) -> "Hello, " + name;
            System.out.println(hello.sayHello("Ricky"));


            Greeting helloTwo = (name) -> System.out.println("Hello, " + name);
            helloTwo.sayHello("Ricky");System.out.println(" ");


            //
            Predicate<String> isLong = (str) -> str.length() > 10;
            System.out.println("Predicate: Is my string length greater than 10?: " + isLong.test("This is obviously shorter than 100!!!!"));

            Predicate<Integer> lesserthan = i -> (i < 18);
            System.out.println("Predicate: Is 50 < 18?: " + lesserthan.test(50));System.out.println(" ");



            Function<String, Integer> stringLength = (str) -> str.length();
            System.out.println("Function: Take my string and give me the length: " + stringLength.apply("Hello, world!dfagdsfgdfgdsfgdsfgsdfgsdfg"));

            Function<String, String> toUpperCase = str -> str.toUpperCase();
            String greeting = "Function: Take my string and uppercase it ";
            System.out.println(toUpperCase.apply(greeting));
            System.out.println(" ");


            Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
            printUpperCase.accept("Consumer: Void method that outputs what I put in here but let's uppercase");
            System.out.println(" ");

            Supplier<String> helloSupplier = () -> "Supplier: No arguments are passed, only giving me a result.";
            System.out.println(helloSupplier.get());
        }


        @FunctionalInterface
        public interface MyFunctionalInterface {
            String sayHello(String name);
        }

        @FunctionalInterface
        public interface Greeting {
            void sayHello(String name);
        }
    }
