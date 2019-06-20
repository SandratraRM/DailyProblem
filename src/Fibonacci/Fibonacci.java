package Fibonacci;

import java.util.List;

class Fibonacci {

    /**
     * @param n Le nombre de marches sur l'escalier
     * @param m Le nombre de marches max qu'on peut sauter par saut
     * @return Le nombre de moyen de monter un escalier de n marches en pouvant sauter jusqu'à m marches par saut
     */
    static long withAmaxRange(int n, int m) {
        int[] res = new int[n + 1];
        res[0] = 1;
        for (int i = 1; i <= n; i++) {
            res[i] = 0;
            for (int j = 0; j <= i && j <= m; j++) {
                res[i] += res[i - j];
            }
        }
        return res[n];
    }

    /**
     * @param n Le nombre de marches sur l'escalier
     * @param s Liste du nombre de marche que l'on peut sauter par saut
     * @return Le nombre de moyen de monter un escalier de n marches en pouvant sauter jusqu'à un élement de s marches par saut
     */
    static long withCustomSteps(int n, int[] s) {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 1; i <= n; i++) {
            res[i] = 0;
            for (int j = 0; j < s.length && i - s[j] >= 0; j++) {
                res[i] += res[i - s[j]];
            }
        }
        return res[n];
    }

    /**
     * @param currentValue Initialiser par 0, utilisée par la fonction récursive pour completer  1 moyen
     * @param n Le nombre de marches sur l'escalier
     * @param s Liste du nombre de marche que l'on peut sauter par saut
     * @param pathSoFar Initialiser par new ArrayList<>(), utilisée par la fonction récursive pour mémoriser le nombre de saut effectuer en un moyen
     */
    static void print(int currentValue, int n, int[] s, List<Integer> pathSoFar) {
        if (currentValue == n) {
            System.out.println(pathSoFar);
            return;
        } else if (currentValue > n) {
            return;
        }
        for (int value : s) {
            // add step
            pathSoFar.add(value);

            // recurse
            if (currentValue + value <= n)
                print(currentValue + value, n, s, pathSoFar);

            // remove step
            pathSoFar.remove(pathSoFar.size() - 1);
        }
    }

    /**
     *
     * @param n position - 1 dans la suite de fibonacci
     * @return Un nombre de fibonnaci à n + 1 position
     */
    static int normal(int n) {
        int prev = 0, next = 1, result = 0;
        for (int i = 0; i < n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }
}
