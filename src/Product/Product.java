package Product;


class Product {

    static long[] ofAllExceptSelf(long[] subject,boolean withTiming) {
        long start = System.nanoTime();
        long[] newArray = new long[subject.length];
        for (int i = 0; i < subject.length; i++) {
            newArray[i] = 1;
            for (int j = 0; j < subject.length; j++) {
                if (j != i) {
                    newArray[i] *= subject[j];
                }
            }
        }
        long end = System.nanoTime();
        if (withTiming)
        System.out.println("ofAllExceptSelf a pris " + (end - start) + " nanosecondes.");
        return newArray;
    }

    static long[] optimized(long[] subject,boolean withTiming) {
        long start = System.nanoTime();

        long[] res = new long[subject.length];

        long prodi = 1;
        long prodj = 1;

        for (int i = 0, j = subject.length - 1; i < subject.length && j >= 0; i++, j--) {
            if (i < j){
                res[j] = prodj;
                res[i] = prodi;
            }else if (i == j){
                res[i] = prodi;
                res[j] *= prodj;
            }
            else {
                res[j] *= prodj;
                res[i] *= prodi;
            }
            prodj *= subject[j];
            prodi *= subject[i];

        }

        long end = System.nanoTime();
        if (withTiming)
        System.out.println("optimized a pris " + (end - start) + " nanosecondes.");
        return res;
    }
}
