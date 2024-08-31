import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import basics.Learn_01_Types;
import org.junit.jupiter.api.Test;

class TypesTest {
  void mark_used(Object... objects) {
    // No operation
  }

  @Test
  void checkTypes() {
    assertDoesNotThrow(
        () -> {
          int some_int = Learn_01_Types.some_int();
          mark_used(some_int);
        });
    assertDoesNotThrow(
        () -> {
          boolean some_boolean = Learn_01_Types.some_boolean();
          mark_used(some_boolean);
        });
    assertDoesNotThrow(
        () -> {
          char some_char = Learn_01_Types.some_char();
          mark_used(some_char);
        });
    assertDoesNotThrow(
        () -> {
          double some_double = Learn_01_Types.some_double();
          mark_used(some_double);
        });
    assertDoesNotThrow(
        () -> {
          float some_float = Learn_01_Types.some_float();
          mark_used(some_float);
        });
    assertDoesNotThrow(
        () -> {
          long some_long = Learn_01_Types.some_long();
          mark_used(some_long);
        });
  }
}
