public class MyLinkedListDemo {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        System.out.println("Add Edward");
        myLinkedList.add("Edward");
        System.out.println(myLinkedList);
        System.out.println("");

        System.out.println("Add First Nancy");
        myLinkedList.addFirst("Nancy");
        System.out.println(myLinkedList);
        System.out.println("");

        System.out.println("Add by index:1 Tom");
        myLinkedList.addByIndex(1, "Tom");
        System.out.println(myLinkedList);
        System.out.println("");

        System.out.println("Get by index:0");
        System.out.println(myLinkedList.get(0));
        System.out.println("");

        System.out.println("Add by index:3 Maggy");
        myLinkedList.addByIndex(3, "Maggy");
        System.out.println(myLinkedList);
        System.out.println("");

        System.out.println("Set by index:1 Jason");
        myLinkedList.setByIndex(1, "Jason");
        System.out.println(myLinkedList);
        System.out.println("");

        System.out.println("Remove by index: 2");
        myLinkedList.removeByIndex(2);
        System.out.println(myLinkedList);
        System.out.println("");

        System.out.println("Remove by value: Jason");
        myLinkedList.removeByValue("Jason");
        System.out.println(myLinkedList);
        System.out.println("");

    }
}
