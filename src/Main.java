
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

         Stack stack= new StackLinkedList();
        try{
            stack.pop();
        }catch(Exception e){
            System.out.println(e);
        }



        /*

            ArrayList<Object> stringArrayList =new ArrayList();
            stringArrayList.add("String");
            HashMap<String,Double> grades= new HashMap<>();
            grades.put("Ali",35.0);
            System.out.println(grades);
            grades.put("Pelin",90.0);
            System.out.println(grades);
            grades.put("Enes",10.0);
            System.out.println(grades);
            grades.put("Ali",60.0);
            System.out.println(grades);
            System.out.println(grades.keySet() instanceof Set);




*/

    }
}