package CS221Course.src.DS_assignment5.Question_1;

public class Main {

    public static void main(String[] args) {

        //List<String> list = new LinkedList();
        KWLinkedList<String> list = new KWLinkedList<String>();

        list.add("Sami");
        list.add("Robeil");
        list.add("Merhawi");
        list.add("Yonas");
        list.add("Sami");

        System.out.println(list);

        list.removeAllOf("Sami");
       // list.removeAll(Collections.singleton("Sami"));


        System.out.println(list);
    }
}
