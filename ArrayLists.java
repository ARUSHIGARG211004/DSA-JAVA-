import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<Integer>();
        ArrayList<String>list2=new ArrayList<String>();
        ArrayList<Boolean>list3=new ArrayList<Boolean>();
        
        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list2.add("Arushi Garg");
        list2.add("Anjali Gupta");
        list2.add("Aryan Garg");

        list3.add(true);
        list.add(234);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        
        //to get an element
        int element=list.get(0);
        int elemen=list.get(2);
        String li=list2.get(2);
        System.out.println(element);
        System.out.println(elemen);
        System.out.println(li);
        
        //add element in between
        list.add(1,2);//1 is the index and 2 is the element to be added
        list2.add(1,"ASHI");
        list3.add(0,false);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        //set element
        list.set(0,0);
        System.out.println(list);
        //delete elements
        list2.remove(1);
        System.out.println(list2);
        //size of a list
        int size= list2.size();
        System.out.println(size);
        // loops in ArrayLists
        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i)+" ");
        }
        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
        


    }
}