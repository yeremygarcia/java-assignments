package arraysandlists;
    public class FifthItem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listOfStrings = new ArrayList<>();

//        String input = scanner.nextLine();
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                listOfStrings.add(input);
            }
            System.out.println("The fifth item in the list is: " + listOfStrings.get(4));
        }
    }