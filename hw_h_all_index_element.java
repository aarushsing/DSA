
public class hw_h_all_index_element {
    public static void main(String[] args) {
        int [] array = {20,5,6,0,5,9,5,8};
        int element = 5;
        int output[] = all_index_element(array, 0,element, 0);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }


    public static int [] all_index_element (int [] array, int index, int num , int count ){
        if (array.length -1 == index){
            int  value [] = new int [count];
            return value;
        }
        int  array_2[] = null;

        if (array[index] == num){
           array_2 = all_index_element(array, index+1, num, count+1);
        } else {
            array_2 = all_index_element(array, index+1, num, count);
        }
        if (array[index]== num){
            array_2[count] = index;
        }

        return array_2;
    }
}
