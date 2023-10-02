import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            if (input.length() > 0) {
                String[] splitStringArray = input.split(",");
                nameList.add(splitStringArray[0]);
                ageList.add(Integer.valueOf(splitStringArray[1]));

            }
        }
        int oldest = ageList.get(0);
        String oldestName = (nameList.get(0));
        for (int i = 0; i < ageList.size(); i++) {
            if (ageList.get(i) > oldest) {
                oldest = ageList.get(i);
                oldestName = (nameList.get(i));
            }
        }
        System.out.println("The name of the oldest person is " + oldestName + " who is " + oldest);
    }
}