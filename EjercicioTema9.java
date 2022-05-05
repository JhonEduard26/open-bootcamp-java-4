class Main {
    public static void main(String[ ] args) {

        Client client = new Client(22, "Juan", 312121231);
        System.out.println(client);

        System.out.println();
        
        Worker worker = new Worker(35, "John", 1000);
        System.out.println(worker);

    }
}

class Person {

    int age;
    String name;
    long phone;

}

class Client extends Person {
    int credit;

    public Client (int age, String name, long phone) {
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return "Age: " + age + "\nName: " + name + "\nPhone: " + phone;
    }
}

class Worker extends Person {
    int salary;

    public Worker (int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Age: " + age + "\nName: " + name + "\nSalary: " + salary;
    }
}