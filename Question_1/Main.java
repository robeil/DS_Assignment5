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

       // System.out.println(list);

        list.removeAllOf("Sami");

        Iterator iter =  list.iterator(); //todo Iterator to fix

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        //System.out.println(list);
    }
}
