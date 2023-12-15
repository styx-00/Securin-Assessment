// 1. Counting total possible Combinations
public class totalCombo {
    public static void main(String[] args){
        int[] dieA = new int[]{1,2,3,4,5,6};
        int[] dieB = new int[]{1,2,3,4,5,6};
        int count=0;
        //Enumerating possibilities
        for(int i=0;i<dieA.length;i++){
            for(int j=0;j<dieB.length;j++)
                count++;
        }
        //Mathematically 
        //Using combinations, nCr 
        // count = (factorial(6)/(factorial(5)*factorial(1)))^2
        System.out.println("Total combinations possible : "+count);
    }
}
