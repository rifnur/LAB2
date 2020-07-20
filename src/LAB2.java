import org.w3c.dom.ls.LSOutput;

public class LAB2 {
    public static void main(String[] args) {
        int [] nums1 ={1,1,0,0,1,0,1,1,0,0};
        int [] nums2={0,3,6,9,12,15,18,21};
        int [] nums3={1,5,3,2,11,4,5,2,4,8,9,1};
        int [][] nums4 = new int [2][2];
        int [] nums5={10,43,53,74,101,41,35,92,40,18};
        int [] nums6={2, 2, 2, 1, 2, 2, 10, 1};
        int [] nums7={1,2,3,4,5,6,7,8,9};//{2, 2, 2, 1, 2, 2, 10, 1};

        zadanie1 (nums1);
        zadanie2 (nums2);
        zadanie3 (nums3);
        zadanie4 (nums4);
        zadanie5 (nums5);
        System.out.println("Задание 6: "+ zadanie6 (nums6));
        //System.out.println("Задание 7: "+ zadanie7 (nums7,2));
        zadanie7 (nums7,-4);
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
        int sum1 = 0;
        int sum2=0;
        for (int z=0;z<massiv6.length;z++) {
            for (int i = 0; i < massiv6.length - (massiv6.length-z-1); i++) {
                sum1 = sum1 + massiv6[i];
                }
            for (int j = massiv6.length-1;j>=massiv6.length-( massiv6.length-z-1); j--) {
                sum2 = sum2 + massiv6[j];
            }
         if (sum1!=sum2) {  sum1=0;
            sum2=0;} else break;
        }
        if (sum1 == sum2 && sum1!=0 && sum2!=0) {
                return true;//System.out.print(true);
            }return false;
    }

    static void zadanie7 (int [] massiv7, int number){
        if (number>0) {
            for (int i = 0; i < number; i++) {
              int  chislo1=massiv7[0];
              massiv7[0]=massiv7[massiv7.length-1];
               for (int j=1; j<massiv7.length-1;j++){
                   massiv7[massiv7.length-j]=massiv7[massiv7.length-j-1];
               }
               massiv7[1]=chislo1;


            }

        } /*for (int z=0;z<massiv7.length;z++){
            System.out.print( massiv7[z]+" ");}*/
        if (number<0) {
            for (int i = 0; i > number; i--) {
                int  chislo1=massiv7[massiv7.length-1];
                massiv7[massiv7.length-1]=massiv7[0];
                for (int j=1; j<massiv7.length-1;j++){
                    massiv7[j-1]=massiv7[j];
                }
                massiv7[massiv7.length-1-1]=chislo1;


            }

        } for (int z=0;z<massiv7.length;z++){
            System.out.print( massiv7[z]+" ");}
    }
}
