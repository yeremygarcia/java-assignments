package ObjectsInLists;
    public class Animal {
        private String name;
        private boolean isPuppy;

        public Animal(String name, boolean isPuppy) {
            this.name = name;
            this.isPuppy = isPuppy;
        }

        public String getName() {
            return name;
        }

        public boolean getBoolean() {
            return isPuppy;
        }

        @Override
        public String toString() {
            return name + "is a dog = " + isPuppy;
        }

    }
