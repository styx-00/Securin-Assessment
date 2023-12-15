// 3. Finding probability of all possible sums of two dices.
public class probableSums {
    public static void main(String[] args){
        int[] dieA = new int[]{1,2,3,4,5,6};
        int[] dieB = new int[]{1,2,3,4,5,6};
        int[] map = new int[dieA[dieA.length-1]*2+1];
        int max=0;
        //Enumerating possibilities
        for(int i : dieA){
            for(int j :  dieB){
                map[i+j]++;
                max++;
            }
        }
        System.out.println("The possibility of all possible sum of two dice are");
        for(int i=0;i<map.length;i++){
            if(map[i]!=0){
                System.out.printf("%d is %d/%d",i,map[i],max);
                System.out.println();
            }
        }
    }
}