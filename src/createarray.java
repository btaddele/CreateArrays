import java.lang.reflect.Array;
import java.util.Arrays;

public class createarray {
    public static void main(String [] args){
        int numbers[] = {1,21,63,4,51};
        String strings[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        char characters[]={'a', 'e', 'i', 'o', 'u'};
        boolean booleans[]={true,false};


        System.out.println("numbers: "+Arrays.toString(numbers));
        System.out.println("strings: "+Arrays.toString(strings));
        System.out.println("characters: "+Arrays.toString(characters));
        System.out.println("booleans: "+Arrays.toString(booleans));



    }
}
