import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<String> output = new ArrayList<>();
        String input = scanner.next();

        for (int i = 0; i < parts.length; i++) {
            output.add(parts[i]);
        }

        while (!input.equals("end")) {
            String[] command = scanner.nextLine().split(" ");
            if (input.equals("Add")) {
                output.add(command[1]);
            }

            if (input.equals("Remove")) {
                output.remove(command[1]);
            }

            if (input.equals("RemoveAt")) {
                output.remove(Integer.parseInt(command[1]));
            }

            if (input.equals("Insert")) {
                output.add(Integer.parseInt(command[2]), command[1]);
            }

            input = scanner.next();

        }

        for (String s : output) {
            System.out.print(s + " ");
        }


    }
}
