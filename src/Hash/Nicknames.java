package Hash;
import java.util.HashMap;
    public class Nicknames {
        public static void main(String[] args) {
            HashMap<String, String> names = new HashMap<>();
            names.put("Matthew", "Matt");
            names.put("Michael", "Mix");
            names.put("Arthur", "Artie");

            String matthewName = names.get("Matthew");
            System.out.println(matthewName);

        }

    }

