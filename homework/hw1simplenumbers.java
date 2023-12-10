package homework;

class Answer {
    public void printPrimeNums(){
        int[] diapazon = new int [1001];
        int [] exeption = new int [10];
        for (int i = 0; i < exeption.length; i++) {
            if ((i != 1 && i != 0) && (i % 4 != 0 & i % 6 != 0 & i % 8 != 0 & i % 9 != 0)){
                System.out.println(i);
            }
            else {continue;}
        }
        for (int i = 0; i < diapazon.length; i++) {
            if ((i != 1 && i != 0) && (i % 1 == 0 & i % i == 0) && (i % 2 !=0 & i % 3 != 0 & i % 4 != 0 & i % 5 != 0 & i % 6 != 0 & i % 7 != 0 & i % 8 != 0 & i % 9 != 0 & i % 10 != 0 )){
                System.out.println(i);
            }
            else {continue;}
        }
    }
    
}
public class hw1simplenumbers {

    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printPrimeNums();
        
    }
    
}
