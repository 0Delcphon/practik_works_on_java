package praktika_eight;

    public class Karakal extends Pet {
        public Karakal(String name, String type) {
            super(name, type);
        }

        @Override
        public String toString() {
            return "Karakal{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
