package Addup;


public class Main {
    //Solved!
    public static void main(String[] args) {

        int[] list = {10, 7, 3};
        int k = 17;

        System.out.println("La somme de 2 éléments de  {10,7,3} donne " + k + "?");
        System.out.println(Addup.is_a_result(k, list));
        k = 12;
        System.out.println("La somme de 2 éléments de  {10,7,3} donne " + k + "?");
        System.out.println(Addup.is_a_result(k, list));


    }
}
