import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by sebastian on 13/10/15.
 */
public class B151 {
    public static void main(String... args) {
        new FriendReader(new Scanner(System.in));
    }


    private static class Person {

    }

    private static class FriendReader {
        private final Scanner scanner;

        public FriendReader(Scanner scanner) {
            this.scanner = scanner;
        }

        public Friend readNextFriend() {

        }
    }

    private static class Friend {
    }
}
