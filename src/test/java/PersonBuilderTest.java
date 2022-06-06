import org.junit.jupiter.api.*;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonBuilderTest {

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running 'PersonBuilderTest' for methods of class \"PersonBuilder\"");
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("Stop 'PersonBuilderTest' for methods of class \"PersonBuilder\"");
    }

    @Test
    @DisplayName("build() + incorrect Age = IllegalStateException, testing...")
    public void itShouldAgeThrowIllegalStateException() {
        assertThrows(IllegalStateException.class,
                () -> new PersonBuilder()
                        .setName("Olya")
                        .setAge(-101)
                        .build(), "...some is WRONG !");
        System.out.println("'IllegalStateException' with incorrect age in 'build()' method working OK!");
    }
}