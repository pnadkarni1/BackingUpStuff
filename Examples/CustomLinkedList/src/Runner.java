public class Runner {

    public static void main(String[] args) {

        Person m = new Person("Frank", 31);
        Person m2 = new Person("Bill", 28);
        Person m3 = new Person("Lisa", 45);
        Person m4 = new Person("Terry", 22);
        Person m5 = new Person("Kerry", 33);

        LinkedListCustom linkedListCustom = new LinkedListCustom();

        linkedListCustom.addToFront(m);
        linkedListCustom.addToFront(m2);
        linkedListCustom.addToFront(m3);
        linkedListCustom.addToFront(m4);
        linkedListCustom.addToFront(m5);
        System.out.println(linkedListCustom);
        System.out.println("============");
        Person removed = (Person) linkedListCustom.removeFromTail();

    }

}
