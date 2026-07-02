package ArrayAndArrayList;
import java.util.ArrayList;
public class Arraylist {
    static void main(String[] args) {
        // Array list is fix ;
        // Array list is dynamic array which can grow if i have array  which is initially full if i have to add something
        // arr.add(5);
        ArrayList<Integer> arr = new ArrayList<>(12); // here 12 is the capacity it is not size
        // System.out.println(arr.size()+" ");
        arr.add(10);
        arr.add(15);
        arr.add(40);
        arr.add(70);
        System.out.println(arr.size());

        System.out.println(arr);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
        }
        arr.add(90); // for adding new element in the arraylist 
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        arr.set(0,100); // for changing in the array list
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}
