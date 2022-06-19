import java.util.ArrayList;
import java.util.Stack;

class LeadersInAnArray{
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int max = arr[n-1];
        st.push(max);
        
        for(int i = n-2; i >= 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                st.push(max);
            }
        }
        while(!st.isEmpty()){
            al.add(st.pop());
        }
        return al;
    }
} 