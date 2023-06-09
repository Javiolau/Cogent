package Assg2;

public class Prog2 {
    public static void main(String[] args) {
        int[] list = {1,3,5,4,6};
        int target = 6;
        int position = sequentialSearch(list, target);

        if(position!=-1)System.out.println(target + " was found at position " + position + "." );
        else System.out.println(target + " was not found!");
    }

    public static int sequentialSearch(int[] list, int target) {
        
        for (int i = 0; i < list.length; i++) {
            if(list[i] == target) return i;
        }
        return -1;
    }
}
