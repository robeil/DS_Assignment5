package CS221Course.src.DS_assignment5.Question_1;

import java.util.Iterator;

public class Main  {

    public static void main(String[] args) {

        //List<String> list = new LinkedList();
        KWLinkedList<String> list = new KWLinkedList<String>();
        //List<String> list = new ArrayList<>();

        list.add("Sami");
        list.add("Robeil");
        list.add("Merhawi");
        list.add("Yonas");
        list.add("Sami");

        Iterator<String> it = list.iterator();

        System.out.println(list);

        list.removeAllOf("Sami");

        System.out.println(list);

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
