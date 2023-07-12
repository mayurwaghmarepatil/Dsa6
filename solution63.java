public class solution63 {
    public boolean validMountArray(int[] Arr) {
        int i = 0;
        int j = Arr.length - 1;
        int n = Arr.length - 1;
        while (i + 1 < n && Arr[i] < Arr[i+1]) {
            i++;
        }

        while (j > 0 && Arr[j] < Arr[j-1]) {
            j--;
        }

        return (i > 0 && i == j && j < n);
    }

    public static void main(String[] args) {
        solution63 s63=new solution63();
        System.out.println( s63.validMountArray(new int[]{2,1}));
    }
}
