public class Main {
    /*
    Create a functional interface called ConcatStringFunction
    that has a method called apply that takes in a variable amount of String
    arguments and returns a String values.

    Here’s an example of how your method would be called:
     */
    public static void main(String[] args) {
        ConcatStringFunction func = str -> String.join("", str).toUpperCase();
        String res = func.apply("banana", "grape", "smoothie");
        System.out.println(res); // BANANAGRAPESMOOTHIE

        String res2 = func.apply("apple", "orange", "pineapple", "smoothie");
        System.out.println(res2); // APPLEORANGEPINEAPPLESMOOTHIE
    }
}

    @FunctionalInterface
    interface ConcatStringFunction {
        String apply(String ... string);
    }