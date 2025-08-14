// zigzag conversion problem
// https://leetcode.com/problems/zigzag-conversion/
import java.util.Arrays;

class zigzagConversion {
    public String convert(String s, int numRows) {

        if(s.length()<3 || numRows<2){
            return s;
        }
        int currRow = 0;
        boolean dir = false; // true:up,false:down
        String[] arr =new String[numRows];
        Arrays.fill(arr,"");



        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(dir == false && currRow == numRows ){
                currRow-=2;
                dir=true;
                
            }
            else if(dir == true && currRow == -1 ){
                currRow+=2;
                dir=false;
                
            }
            
            if(dir==false){
                arr[currRow]+=ch;
                currRow++;
            }else if(dir==true){
                arr[currRow]+=ch;
                currRow--;
            }

            
        }

        StringBuilder sb = new StringBuilder();
        for(String ss: arr){
            sb.append(ss);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        zigzagConversion zc = new zigzagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(zc.convert(s, numRows)); // Output: "PAHNAPLSIIGYIR"
        
        s = "A";
        numRows = 1;
        System.out.println(zc.convert(s, numRows)); // Output: "A"
    }
}
