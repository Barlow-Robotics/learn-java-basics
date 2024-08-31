package basics;

public class Learn_01_Types {
  // Here is an example function that returns an integer
  public static int some_int() {
    return 42;
  }

  // The following three functions have the wrong types.
  // Change the return type to fix the problems.
  public static int some_boolean() {
    return true;
  }

  public static int some_char() {
    return 'b';
  }

  public static int some_double() {
    return 42;
  }

  // Floating point numbers in java default to
  // `double` precision. Add an `f` to the end of
  // the return type to fix the compile error.
  public static float some_float() {
    return 17.3;
  }

  // The maximum value of an `int` is 2147483647
  // Change this type to a long and add an `l`
  // to the end of the integer to fix the compile
  // error.
  public static int some_long() {
    return 2147483648;
  }

  public static void main(String[] args) {
    System.out.format("This is an int: %d%n", some_int());
    System.out.format("This is a boolean: %b%n", some_boolean());
    System.out.format("This is a char: %c%n", some_char());
    System.out.format("This is a double: %f%n", some_double());
    System.out.format("This is a float: %f%n", some_float());
    System.out.format("This is a long: %d%n", some_long());
  }
}
