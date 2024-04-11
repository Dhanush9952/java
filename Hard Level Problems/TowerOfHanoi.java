import java.util.ArrayList;

public class TowerOfHanoi 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int src = 1, aux = 2, dest = 3;
        solverRec(n, ans, src, aux, dest);
        return ans;
    }
    private static void solverRec(int n, ArrayList<ArrayList<Integer>>ans, int src, int aux, int dest){
        if(n == 0){
            return;
        }
        solverRec(n-1, ans, src, dest, aux);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(src);
        temp.add(aux);
        ans.add(temp);
        solverRec(n-1, ans , dest, aux, src);
    }}
	

// (OR)
	
import java.util.ArrayList;
public class TowerOfHanoi 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int src = 1, aux = 2, dest = 3;
        solverRec(n, ans, src, aux, dest);
        return ans;
    }

    private static void solverRec(int n, ArrayList<ArrayList<Integer>> ans, int src, int aux, int dest) {
        if (n == 0) {
            return;
        }
        solverRec(n - 1, ans, src, dest, aux); // Move n-1 disks from src to aux
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(src);
        temp.add(dest);
        ans.add(temp); // Move disk from src to dest
        solverRec(n - 1, ans, aux, src, dest); // Move n-1 disks from aux to dest
    }
}