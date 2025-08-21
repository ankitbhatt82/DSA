import java.util.LinkedList;
class First {

  public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<String>();

     list.add("1");
     list.add("2");
     list.add("3");
     list.add("4");
 
     System.out.println("LinkedList Elements:"+list);

     list.offerFirst("5");
 
     System.out.println("LinkedList After Addition:"+list);
  }
}