import java.util.LinkedList;

  class EndInsertion {
  public static void main(String[] args) {
  
     LinkedList<String> l_list = new LinkedList<String>();
  
          l_list.add("AA");
          l_list.add("BB");
          l_list.add("CC");

     System.out.println("Original linked list:" + l_list);   
 
     l_list.offerLast("DD");
     System.out.println("Final linked list:" + l_list); 
}
}