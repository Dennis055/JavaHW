import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

//PRINT STEP
public class Haonu{
    /**non recursive Tower of Hanoi*/
    public static void main(String args[])throws EmptyStackException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks : ");
        int n = sc.nextInt();
        if(n%2 == 1)                //just judgement
            odd(n);
        else if(n%2 == 0)
            even(n);
    }
    /**odd section*/
    public static void odd (int n) {
        //new three stack A,B,C
        Stack<Integer> oA = new Stack<Integer>();
        Stack<Integer> oB = new Stack<Integer>();
        Stack<Integer> oC = new Stack<Integer>();
        int disk = 0;                    //catch the pop
        int count = 0;                //count the step
        for(int i = n+1; i > 0; i--)
            oA.push(i);
        while(true)
        {    //A<->C section
            if(oC.empty() || oA.peek() < oC.peek())
            {
                disk = oA.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from A to C" );
                oC.push(disk);
                count++;
            }
            else if(oA.empty() || oA.peek() > oC.peek())
            {
                disk = oC.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from C to A");
                oA.push(disk);
                count++;
            }
            if(count == (int)Math.pow(2, n)-1)            //full step,break
                break;
            //A<->B section
            if(oB.empty() || oA.peek() < oB.peek())
            {
                disk = oA.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from A to B" );
                oB.push(disk);
                count++;
            }
            else if(oA.empty() || oA.peek() > oB.peek())
            {
                disk = oB.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from B to A");
                oA.push(disk);
                count++;
            }
            if(count == (int)Math.pow(2, n)-1)            //full step,break
                break;
            //B<->C section
            if(oB.empty() || oB.peek() > oC.peek())
            {
                disk = oC.pop();
                System.out.println("Step "+(count+1)+": move disk " +disk+" from C to B");
                oB.push(disk);
                count++;
            }
            else if(oC.empty() || oB.peek() < oC.peek())
            {
                disk = oB.pop();
                System.out.println("Step "+(count+1)+": move disk " +disk+" from B to C");
                oC.push(disk);
                count++;
            }
            if(count == (int)Math.pow(2, n)-1)            //full step,break
                break;
        }
    }
    /**even section*/
    public static void even(int n){
        //new three stacks A,B,C
        Stack<Integer> eA = new Stack<Integer>();
        Stack<Integer> eB = new Stack<Integer>();
        Stack<Integer> eC = new Stack<Integer>();
        int disk = 0;            //catch the pop
        int count = 0;        //count the step
        for(int i = n+1; i > 0; i--)
            eA.push(i);
        while(true)
        {    //A<->B section
            if(eB.empty() || eA.peek() < eB.peek())
            {
                disk = eA.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from A to B" );
                eB.push(disk);
                count++;
            }
            else if(eA.empty() || eA.peek() > eB.peek())
            {
                disk = eB.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from B to A");
                eA.push(disk);
                count++;
            }
            if(count == (int)Math.pow(2, n)-1)            //full step,break
                break;
            // A<->C section
            if(eC.empty() || eA.peek() < eC.peek())
            {
                disk=eA.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from A to C" );
                eC.push(disk);
                count++;
            }
            else if(eA.empty() || eA.peek() > eC.peek())
            {
                disk = eC.pop();
                System.out.println("Step "+(count+1)+": move disk "+disk+" from C to A");
                eA.push(disk);
                count++;
            }
            if(count == (int)Math.pow(2, n)-1)            //full step,break
                break;
            //B<->C section
            if(eB.empty() || eC.peek() > eB.peek())
            {
                disk = eB.pop();
                System.out.println("Step "+(count+1)+": move disk " +disk+" from B to C");
                eC.push(disk);
                count++;
            }
            else if(eC.empty() || eB.peek() > eC.peek())
            {
                disk = eC.pop();
                System.out.println("Step "+(count+1)+": move disk " +disk+" from C to B");
                eB.push(disk);
                count++;
            }
            if(count == (int)Math.pow(2, n)-1)            //full step,break
                break;
        }
    }
}