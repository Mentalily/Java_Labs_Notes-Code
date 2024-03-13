public class TestArray {
    public static void main(String[] args) {
        //one-dimensional array
        //decalare
        int[] arr1;//more common; recommend
        int arr2[];
        //initialization
        arr1 = new int[]{1, 2, 3, 4, 5};
        //arr2 = {1, 2, 3, 4, 5};//error!
        arr2 = new int[5];
        int[] arr3 = {1, 2, 3, 4, 5};

        //two-dimensional array
        int[][] arr4 = {{1,2,3}, {4,5,6}};
        int[][] arr5 = new int[3][];
        //arr5 is ok because two-dimensional array can be initialize dynamically in Java
        int[][] arr6 = new int[3][3];
        //int[][] arr7 = new int[][3];//error
        int[][] arr8 = new int[3][4];
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
        System.out.println(arr4.length);
        System.out.println(arr5.length);
        System.out.println(arr6.length);
        System.out.println(arr8.length);
        //System.out.println(arr4.length[0]);
    }
}
