package year2016;

public class UniqueBST {
    public int numTrees(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(n == 0)
            return 0;
        
        int[] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;
        root(n, num);
        return num[n];
    }
    
    private int root(int n, int[] num) {
        if(num[n] != 0)
            return num[n];
        
        int result = 0;
        for(int i = 0; i < n; i++){
            result += root(i, num) * root(n-1-i, num);
        }
        num[n] = result;
        return result;
    }
}
