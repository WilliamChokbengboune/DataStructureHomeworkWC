package Split;

/**
 * Author: William Chokbengboune
 * Date: 12/02/2023
 * Description: SplitStack takes a group of integers and splits them up by negative and non-negative
 * This program will organize and sort the numbers.
 */

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class SplitStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer (Enter a letter to end it): ");
        while (sc.hasNextInt()){
            st.push(sc.nextInt());
        }
        // this will take integers until a character is entered
        System.out.println(split(st));
    }

    public static Stack<Integer> split(Stack<Integer> st){
        SplitStack sp = new SplitStack();
        ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < st.size(); i++) {
                list.add(st.elementAt(i));
            }
            sp.bubbleSort(list);
            // this will call on the sort to reorder the list and make
        // sure the negative is on bottom
        Stack<Integer> newList = new Stack<>();
            for (int i = 0; i < st.size(); i++) {
                newList.add(list.get(i));
            }
        return newList;
    }

    public void bubbleSort(ArrayList<Integer> list){
        boolean needNextPass = true;
        // this is the condition to end the loop
        for(int k = 1; k < list.size() && needNextPass; k++){
            needNextPass = false;
            for(int i = 0; i < list.size() - k; i++){
                if(list.get(i) > list.get(i + 1)){
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    // the loop should not be true until it is out of the loop

                    needNextPass  = true;
                }
            }
        }
    }
}
