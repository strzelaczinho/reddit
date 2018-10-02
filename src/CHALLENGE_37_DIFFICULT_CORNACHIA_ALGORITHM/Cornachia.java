package CHALLENGE_37_DIFFICULT_CORNACHIA_ALGORITHM;
public class Cornachia {
    public static void Sieve(int MAX) { // ok, not really just a sieve
        boolean[] s = new boolean[MAX];
        for (int i = 0; i < MAX; i++) {
            s[i] = true;
        }
        for (int i = 2; i < Math.ceil(Math.sqrt(MAX)); i++) {
            if (s[i]) 
            {
                int cur = i, cur_sq = cur * cur;
                for (int  k = cur_sq; k < MAX; k += cur) {
                    s[k] = false;
                }
            }
        }
        // find primes of the form 4k + 1
        boolean[] k4p1 = {};
        for (int i = 0; i < MAX; i++)
        {
            if (s[i] && (i - 1) % 4 == 0) {
                k4p1[i] = true;
            }
        }
        // remove accumulated primes of the form 4k + 1 if they are the sum of 2 squares
        for (int  a = 1; a * a < MAX - 1; a++) {
            int  a_sq = a*a;
            for (int  b = a + 1; a_sq + b * b < MAX; b++) {
               int b_sq = b*b;
               int  foo = a_sq + b_sq;
                if (k4p1[foo]) {
                    k4p1[foo] = false;
                }
            }
        }
        // print out any primes of the form 4k + 1 that aren't the sum of 2 squares
        for (int k=0;k<k4p1.length;k++) {
            if (k4p1[k]) {
                System.out.println(k + " " + k4p1[k]);
            }
        }
    }
    public static void main(String[]args)
    {
        Sieve(1000);
    }
}
