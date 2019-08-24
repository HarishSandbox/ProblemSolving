public class ThirdLargest {

 public void getThirdLargest(int[] a){
   int m1= Integer.MIN_VALUE;
   int m2 = Integer.MIN_VALUE;
   int m3 = Integer.MIN_VALUE;

   for(int i=0;i<a.length;i++){
     if(a[i] > m1){
       m3 = m2;
       m2 = m1;
       m1 = a[i];
     } else if(a[i] > m2){
       m3 = m2;
       m2 = a[i];
     } else if(a[i] > m3){
       m3 = a[i];
     }
   }
   System.out.printf("Max1 %d ", m1);
   System.out.printf("Max2 %d ", m2);
   System.out.printf("Max3 %d ", m3);
 }

}