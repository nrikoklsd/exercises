public final class ImmutableClass {


        private final int id;
        private final String name;

        public ImmutableClass(int id, String name) {
            this.name = name;
            this.id = id;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }

    @Override
    public String toString() {
        return "ImmutableClass{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
