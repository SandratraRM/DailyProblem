package Addup;

class Addup {
    /**
     * @param k Le nombre à tester
     * @param list La liste des entiers pour verifier si la somme de 2 d'entre eux donne k
     * @return true si la somme de 2 entier de list est égale à k
     */
    static boolean is_a_result(int k, int[] list) {
        int listCount = list.length;
        for (int i = 0; i < listCount - 1; i++) {
            for (int j = i + 1; j < listCount; j++) {
                if (list[i] + list[j] == k)
                    return true;
            }
        }
        return false;
    }
}
