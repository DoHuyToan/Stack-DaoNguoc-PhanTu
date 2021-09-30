import java.util.Stack;

public class NumStack {
    public static void main(String[] args) {
        Stack<Integer> stackNum = new Stack<>();
        int[] arrayNum = {1,2,3,5,7};
        for (int j : arrayNum) {
            stackNum.push(j);
        }
        System.out.println(stackNum);
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = stackNum.pop();
        }
        for (int j : arrayNum) {
            System.out.print(j);
        }

        Stack<String> stackString = new Stack<>();
        String str = "CodeGym nhom1";
        String[] arrayStr = str.split("");
        for (int i=0; i<arrayStr.length; i++){
            stackString.push(arrayStr[i]);
        }
        for (int i=0; i< arrayStr.length; i++){
            arrayStr[i] = stackString.pop();
        }
        for (int i=0; i< arrayStr.length; i++){
            System.out.print("\t" + arrayStr[i]);
        }
    }
}
