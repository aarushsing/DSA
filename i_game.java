package Day_05;
import java.util.ArrayList;

public class i_game {

    static ArrayList<String> game(int currentvalue , int target){
        ArrayList<String> result = new ArrayList<>();
        if (currentvalue== target){
       // ArrayList<String> list = new ArrayList<>();
        // list.add("");
        return result;
       }

       if (currentvalue>target){
        ArrayList<String> list = new ArrayList<>();
        return list;
       }

       
       
        for(int dice =1; dice <=6; dice++){
            int newvalue = currentvalue + dice;
            ArrayList<String> temp = game(newvalue,target);
            for (String s : temp){  //  using for each loop directly picking up an element from an array or datastructure w/o keeping the track of its index position. 
                result.add(dice + s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> output = game(0, 10);
        System.out.println(output);
        System.out.println(output.size());
    }
    
}
