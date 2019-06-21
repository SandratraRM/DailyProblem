package Product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // Test non optimisé du problème
        long[] input = {1,2,3,4};
        System.out.println("Résolution du problème sans optimisation");
        System.out.println(Arrays.toString(input) + " => " + Arrays.toString(Product.ofAllExceptSelf(input,false)));

        //Testons maintenant l'optimisation
        long[] test = new long[10000];
        for (int i = 0;i < 10000;i++){
            test[i] = (long) ((Math.random() * (9 - 1)) + 1);
        }
        System.out.println("\r\n============TEST DE PERFORMANCE============");
        System.out.println("Pour un array de 10000 éléments:");
        Product.ofAllExceptSelf(test,true);
        Product.optimized(test,true);

    }
}
