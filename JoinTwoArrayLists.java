import java.util.*;
  
public class JoinTwoArrayLists {
    public static void main(String args[])
    {
        ArrayList<String> list1 = new ArrayList<String>();
           
        list1.add("Hi);
        list1.add("Harman");
        list1.add("Harmanhere");
        System.out.println("ArrayList 1: " + list1);
        ArrayList<String> list2 = new ArrayList<String>();
  
        list2.add("HiHarmanhere");
        list2.add("A computer portal");
        System.out.println("ArrayList 2: "
                           + list2);
  
        list1.addAll(list2);
        System.out.println("Joined ArrayLists: " + list1);
                          
    }
}
 
