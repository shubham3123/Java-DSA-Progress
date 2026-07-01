import java.util.LinkedList;

public class linkedlist {
 public static void main(String[] args) 
 {
    LinkedList<String> list = new LinkedList<>();
    list.add("Java");
    list.add("Python");
    list.add("C++");

    list.addFirst("HTML"); // beginning of LinkedList
   
    list.addLast("CSS"); // end of LinkedList
    
    System.out.println("LinkedList: " + list);

    list.set(1, "JavaScript"); // change element at index 1

    // Removal

    list.remove(2); // remove element at index 2
    list.removeFirst(); //remove first element

  
    // iteration
    System.out.println("Final iteration of LinkedList:");
    for(String language : list){
        System.out.println(language + "  -> ");
    }

    System.out.println("null");
 }   

}
