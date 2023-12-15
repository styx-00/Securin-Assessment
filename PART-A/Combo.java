// 2. Enumerating all possible combinations

public class Combo {
    public static void main(String[] args){
        int[] dieA = new int[]{1,2,3,4,5,6};
        int[] dieB = new int[]{1,2,3,4,5,6};

        //Enumerating possible pairs
        for(int i : dieA){
            for(int j :  dieB)
                System.out.printf("(%d,%d) ",i,j);
            System.out.println();
        }
    }
}
