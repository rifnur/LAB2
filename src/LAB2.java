import org.w3c.dom.ls.LSOutput;

public class LAB2 {
    public static void main(String[] args) {
        int [] nums1 ={1,1,0,0,1,0,1,1,0,0};
        int [] nums2={0,3,6,9,12,15,18,21};
        int [] nums3={1,5,3,2,11,4,5,2,4,8,9,1};
        int [][] nums4 = new int [2][2];
        int [] nums5={10,43,53,74,101,41,35,92,40,18};
        int [] nums6={2, 2, 2, 1, 2, 2, 10, 1};
        zadanie1 (nums1);
        zadanie2 (nums2);
        zadanie3 (nums3);
        zadanie4 (nums4);
        zadanie5 (nums5);
        System.out.println( zadanie6 (nums6));

    }

    static void zadanie1 (int [] nums) {
        System.out.print("Задание 1: ");
        for (int i=0; i<nums.length;i++)  {
            if (nums[i]==0) {nums[i]=1;}
            else if (nums[i]==1) { nums[i]=0;}
            System.out.print(nums[i]+" " );
        }
        System.out.println("");
    }

    static  void zadanie2 (int [] massiv){
        int[] array = new int[8];
        System.out.print("Задание 2: ");
        for (int i = 0; i < massiv.length; i++) {
            array[i]=massiv[i];

        System.out.print(array[i]+" ");
        }
        System.out.println("");
    }

    static void zadanie3 (int [] nums) {
        System.out.print("Задание 3: ");
        for (int i=0; i<nums.length;i++)  {
            if (nums[i]<6) {nums[i]*=2;}
            System.out.print(nums[i]+" " );
        }
        System.out.println("");
    }

    static void zadanie4 (int [][] nums){
        System.out.println("Задание 4: ");
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                if (i==j || nums.length-i-1==j) {nums[i][j]=1;}
                System.out.print(nums[i][j]);
                System.out.print(" ");
            }System.out.println(" ");
        }
    }

    static  void zadanie5 (int [] massiv) {
        int MAX =massiv[0], MIN=massiv[0] ;
        System.out.println("Задание 5: ");
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > MAX) {
              if (massiv[i]<MIN){ MIN=MAX;};
              MAX = massiv[i];
            }
        }
        System.out.println("Максимальное значение: " + MAX);
        System.out.println("Минимальное значение: " + MIN);
    }

    static  boolean zadanie6 (int [] massiv6) {
       System.out.println("Задание 6: ");
        int sum1 = 0;
        int sum2=0;
        //do {
        for (int z=0;z<massiv6.length;z++) {

           // sum1 = sum1 + massiv[z];

            for (int i = 0; i < massiv6.length - (massiv6.length-z-1); i++) {
                sum1 = sum1 + massiv6[i];
                //System.out.println("sum1= "+sum1);
                }
            for (int j = massiv6.length-1;j>=massiv6.length-( massiv6.length-z-1); j--) {

                sum2 = sum2 + massiv6[j];

            }

         if (sum1!=sum2) {  sum1=0;
            sum2=0;} else break;
        }//} while (sum1!=sum2 && sum1!=0 && sum2!=0);
        if (sum1 == sum2 && sum1!=0 && sum2!=0) {
                return true;//System.out.print(true);
            }return false;




    }
}
