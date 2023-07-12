import java.util.Arrays;

public class solution61 {

        public int[] diStringMatch(String s) {
            int[] res = new int[s.length()+1];
            int leftPointer = 0;
            int rightPointer = s.length();
            int idx = 0;
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(ch == 'I'){
                    res[idx] = leftPointer;
                    idx++;
                    leftPointer++;
                }else{
                    res[idx++] = rightPointer--;
                }
            }
            if(s.charAt(s.length()-1) == 'I'){
                res[idx] = leftPointer;
            }else{
                res[idx] = rightPointer;
            }

            return res;
        }

        public static void main(String[] args) {
            solution61 s60=new solution61();
            System.out.println(Arrays.toString(s60.diStringMatch("IDID")));


        }
    }
