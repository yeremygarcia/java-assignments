/* package arraysAndLists;
    public class lastitem {
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
            String theLastItem = listOfStrings.get(listOfStrings.size() - 1);
            System.out.println("The last item in the list is: " + theLastItem);

        }
    }
}
*/