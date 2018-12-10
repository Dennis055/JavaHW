public class Hanoi {
 private MyStack<Integer> rodA;
 private MyStack<Integer> rodB;
 private MyStack<Integer> rodC;
 private MyStack<Integer> rodD;
 private int times = 0;
 private int numOfDisks = 0;

 public Hanoi(int numOfDisks){
  this.numOfDisks = numOfDisks;
  refresh(numOfDisks);
 }

 /**
  * @TODO Initialize hanoi tower with some disks (numOfDisks). A disk is
  *       represent by an integer number. Bigger number stand for bigger
  *       disk. Also, the smallest disk will be represented by 1, not 0.
  * 
  *       In this method, you will be given a parameter "numOfDisks" which
  *       describes how many disks are there in this hanoi tower. Please put
  *       those disks into rodA in order; bigger disks should be put first.
  * 
  * @HINT: You have to reassign appropriate value/instances to the following fields:
  * @this.numOfDisks
  * @this.times
  * @this.rodA
  * @this.rodB
  * @this.rodC
  */
 public void refresh(int numOfDisks) {
  
  /*
  rodA = new MyStack<>();
  rodB = new MyStack<>();
  rodC = new MyStack<>();
  rodD = new MyStack<>();
  
  for(int i=numOfDisks; i>=1; i--){
   rodA.push(i);
  }
  */
  
  rodA = new MyStack<>();
  rodB = new MyStack<>();
  rodC = new MyStack<>();
  rodD = new MyStack<>();
  
  for(int i = numOfDisks; i >= 1; i--) {
   rodA.push(i);
  }
  
 }
 //call this function to start execute
 public void start() {
  /*
   * printHanoiTower();
   * execute(this.numOfDisks, rodA, rodB, rodC, rodD);
   */
  
  printHanoiTower();
  execute(this.numOfDisks, rodA, rodD, rodB, rodC);
 }

 /**
  * @TODO: This method should be called recursively. Move disk "n" from "src"
  *        (source rod) to "dest" (destination rod), and "spare" (temporary
  *        rod) will act as you temporary space to put disks. Call printHanoiTower() when you do a moving.
  */
 private void execute(int n, MyStack<Integer> src, MyStack<Integer> dest,
   MyStack<Integer> spare1, MyStack<Integer> spare2) {
  
  /*
   * if(n==1){
   *   move(src,dest);
   *   printHanoiTower();
   * }else{
   *   execute(n-2, src, spare1, dest, spare2);
   *   execute(1, src, spare2, dest, spare1);
   *   execute(1, src, dest, spare1, spare2);
   *   execute(1, spare2, dest, src, spare1);
   *   execute(n-2, spare1, dest, src, spare2);
   * }
   */
  
  if(n == 1) {
   move(src, dest);
   printHanoiTower();
   
  }else {
   
   execute(n-2, src, spare1, dest, spare2);
   execute(1, src, spare2, dest, spare1);
   execute(1, src, dest, spare1, spare2);
   execute(1, spare2, dest, src, spare1);
   execute(n-2, spare1, dest, src, spare2);
  }
  
 }
 /**
  * @TODO: You may use move function to help the moving between two stacks
  */ 
 private void move(MyStack<Integer> a, MyStack<Integer> b) {
  /*
   * time++;
   * b.push(a.pop());
   */
  times++;
  b.push(a.pop());
 }

 /**
  * @TODO: return an integer that represent how many steps we need to
  *        complete this hanoi tower.
  */
 public int getTimes() {
  /*
   * return times;
   */
  return times;
 }

 public void printHanoiTower() {
  System.out.println("Current state: " + this.times);
  rodA.printStack();
  rodB.printStack();
  rodC.printStack();
  rodD.printStack();
  System.out.println("--------------");
 }

 
 
 //----------------
 public MyStack<Integer> getRodA() {
  return rodA;
 }

 public void setRodA(MyStack<Integer> rodA) {
  this.rodA = rodA;
 }

 public MyStack<Integer> getRodB() {
  return rodB;
 }

 public void setRodB(MyStack<Integer> rodB) {
  this.rodB = rodB;
 }

 public MyStack<Integer> getRodC() {
  return rodC;
 }

 public void setRodC(MyStack<Integer> rodC) {
  this.rodC = rodC;
 }

 public void setTimes(int times) {
  this.times = times;
 }

 public int getNumOfDisks() {
  return numOfDisks;
 }

 public void setNumOfDisks(int numOfDisks) {
  this.numOfDisks = numOfDisks;
 }
}