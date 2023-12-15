//PART-B
//DOOMDICE

//Package used for displaying array
import java.util.Arrays;

class doomDice {
    static int[] calcMap(int[] dieA,int[] dieB){
        int[] map = new int[13];
        for(int i : dieA){
            for(int j :  dieB)
                map[i+j]++;
        }
        return map;
    }
    static boolean check(int[] newA){
        int[] map = calcMap(new int[]{1,2,3,4,5,6},new int[]{1,2,3,4,5,6});
        int[] dieB = new int[6];
        int pos=0;
        for(int i=2;i<=12 && pos<6 ;i++){
            if(map[i]>0){
                dieB[pos]=i-1;
                pos++;
                for(int ele:newA){
                    if(ele+i-1>12){
                        return false;
                    }
                    map[ele+i-1]--;
                }
            }
        }
        for(int ele:map){
            if(ele!=0)
                return false;
        }
        System.out.println("DIE B ");
        System.out.println(Arrays.toString(dieB));
        return true;
    }
    static boolean generate(int []gen,int[] possibleValues,int i){
        if(i<0)
            return false;
        else{
            for(int k=0;k<possibleValues.length;k++){
                gen[i]=possibleValues[k];
                if(generate(gen,possibleValues,i-1))
                    return true;
                int temp[] = new int[6];
                temp[0]=1;temp[1]=gen[0];temp[2]=gen[1];temp[3]=gen[2];temp[4]=gen[3];temp[5]=4;
                if(check(temp)){
                    System.out.println("DIE A");
                    System.out.println(Arrays.toString(temp));
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        generate(new int[4],new int[]{2,3,4},3);
    }
}