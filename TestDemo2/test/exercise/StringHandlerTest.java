package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringHandlerTest {

    @Test
    public void helloLowerCase() {
        //Arrange
        StringHandler stringHandler = new StringHandler();

        // Act
        String actual = stringHandler.hello("hello");
        String expected = "hello";

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void helloUpperCase() {
        //Arrange
        StringHandler stringHandler = new StringHandler();

        // Act
        String actual = stringHandler.hello("HELLO");
        String expected = "HELLO";

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void helloMixedCase() {
        //Arrange
        StringHandler stringHandler = new StringHandler();

        // Act
        String actual = stringHandler.hello("heLLO");
        String expected = "heLLO";

        //Assert
        assertEquals(expected, actual);
    }

    //Invalid test case
    @Test
    public void helloNumbers() {
        //Arrange
        StringHandler stringHandler = new StringHandler();

        //Act + Assert
        assertThrows(IllegalArgumentException.class, () -> stringHandler.hello("1234"));
    }

    //Invalid test case
    @Test
    public void helloMoreNumbers() {
        //Arrange
        StringHandler stringHandler = new StringHandler();

        //Act + Assert
        assertThrows(IllegalArgumentException.class, () -> stringHandler.hello("007"));
    }

    @Test
    public void helloEmptyString() {

        //Arrange
        StringHandler stringHandler = new StringHandler();
        String expected = "";

        // Act
        String actual = stringHandler.hello("");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void helloNull() {

        //Arrange
        StringHandler stringHandler = new StringHandler();

        // Act
        String actual = stringHandler.hello(null);

        //Assert
        assertNull(actual);
    }

    @Test
    public void toLowerCase() {

        //Arrange
        StringHandler stringHandler = new StringHandler();

        // Act
        String actual = stringHandler.toLowerCase("HELLO");

        //Assert
        assertEquals("hello", actual);
    }


    @ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "JAVA:java"}, delimiter = ':')
    public void toLowerCase_ShouldGenerateLowercaseValue(String input, String expected) {
        StringHandler stringHandler = new StringHandler();
        String actual = stringHandler.toLowerCase(input);
        //String actualValue = input.toLowerCase();
        assertEquals(expected, actual);
    }
}