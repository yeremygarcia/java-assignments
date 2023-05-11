package arraysandlists;
public class indexofinteger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> listOfNumbers = new ArrayList<>();

            while (true) {
                int inputNumber = Integer.valueOf(scanner.nextLine());
                if (inputNumber == 0) {
                    System.out.println("Done entering integers into the list");
                    break;
                }
                listOfNumbers.add(inputNumber);
            }
            System.out.println("What number are you looking for in the list?");
            int yourNumber = Integer.valueOf(scanner.nextLine());

            for (int i = 0; i < listOfNumbers.size(); i++) {
                if (listOfNumbers.get(i) == yourNumber) {
                    System.out.println(yourNumber + " is at index " + i);
                }
            }

        }
    }
