class Person{
    String name;
    int age;
    String address;
    public Person(String name) {
        this(name,0,"Unknown");
    }
    public Person(String name,int age) {
        this(name,age,"Unknown");
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Address: "+this.address);
    }
}


class Q2 {
    public static void main(String[] args) {
        Person p1 = new Person("Gogul");
        Person p2 = new Person("Ruby", 10);
        Person p3 = new Person("Krishnan", 25, "Cuddalore");

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
    }
}
