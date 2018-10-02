function Sieve(MAX) { // ok, not really just a sieve
        var s = new Array(MAX);
        for (var i = 0; i < MAX; i++) {
            s[i] = true;
        }
        for (i = 2; i < Math.ceil(Math.sqrt(MAX)); i++) {
            if (s[i]) {
                var cur = i, cur_sq = cur * cur;
                for (var k = cur_sq; k < MAX; k += cur) {
                    s[k] = false;
                }
            }
        }

        // find primes of the form 4k + 1
        var k4p1 = {};
        for (i = 0; i < MAX; i++) {
            if (s[i] && (i - 1) % 4 == 0) {
                k4p1[i] = true;
            }
        }

        // remove accumulated primes of the form 4k + 1 if they are the sum of 2 squares
        for (var a = 1; a * a < MAX - 1; a++) {
            var a_sq = a*a;
            for (var b = a + 1; a_sq + b * b < MAX; b++) {
                var b_sq = b*b;
                var foo = a_sq + b_sq;
                if (k4p1[foo]) {
                    k4p1[foo] = false;
                }
            }
        }

        // print out any primes of the form 4k + 1 that aren't the sum of 2 squares
        for (var k in k4p1) {
            if (k4p1[k]) {
                console.log(k + ' ' + k4p1[k]);
            }
        }
    }

    new Sieve(1001);