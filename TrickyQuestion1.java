class TrickyQuestion1 {
    public static class Person {
        private int age;

        // Constructor
        public Person() {
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person p = new Person(); // Corrected object creation
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }

    static void change(Person p) { // Corrected method signature
        p.setAge(10);
    }
}
