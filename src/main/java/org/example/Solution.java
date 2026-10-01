package org.example;

import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        int yazdir;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            ArrayList<Integer> array = new ArrayList<>();


            array.clear();


            int sonuc = (int) ((Math.pow(2, 0))*b);
            array.add(0,sonuc + a);
            for(int j=0;j<n-1;j++) {




               sonuc = (int) (sonuc + Math.pow(2, j+1) * b);


                array.add(sonuc + a);




            }
            for (int sayi : array) {
                System.out.print(sayi + " ");
            }
            System.out.println();



        }



        in.close();
    }
}