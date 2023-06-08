public class hw_g_lastsearchelement {
    public static void main(String[] args) {
        int [] arr = {20,90,1,90,6};
        System.out.println(search(arr, 0, 90)); 

    }
    
    public static int search (int [] array, int index, int num){
         if(array.length - 1 == index){
            return -1;
         }
         int neighbour_element = search(array,index+1, num);
         if (neighbour_element == -1){
            if (num == array[index]){
            return index;
            }
         }
          return neighbour_element;
    }
}
