// WAP using class Person to display name and age

class Person {
    String name;
    int age;
}

class MyProgramPerson {
    public static void main(String[] args) {

        // create object p1
        Person p1 = new Person();
        p1.name = "modi";
        p1.age = 71;

        // create object p2
        Person p2 = new Person();
        p2.name = "bachchan";
        p2.age = 80;

        // display values
        System.out.println("p1.name = " + p1.name);
        System.out.println("p2.name = " + p2.name);
        System.out.println("p1.age = " + p1.age);
        System.out.println("p2.age = " + p2.age);
    }
}