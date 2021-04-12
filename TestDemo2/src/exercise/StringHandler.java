package exercise;

public class StringHandler {

    // s must not be 0123456789
    public String hello(String s) {
        //parameter validation and error handling
        // check if non empty string matches regular expressions:
        // https://www.tutorialspoint.com/java/java_string_matches.htm
        if(s != null && s.matches("\\d{1,10}")) {
            throw new IllegalArgumentException();
        }
        //otherwise return value
        return s;
    }

    public String toLowerCase(String s) {
        return s.toLowerCase();
        //return s.toUpperCase();
    }
}
