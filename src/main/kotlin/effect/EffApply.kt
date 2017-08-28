
package effect



/**
 *  Apply
 */

fun <E,R:Monoid<R>,A,T> effApply(f: (A) -> T, a: Eff<E,R,A>) : Eff<E,R,T>
{
    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, a.env)
    }

    return Val(f(aValue), a.env)
}


fun <E,R:Monoid<R>,A,T> apply(f: (A) -> T, a: Eff<E,R,A>) : Eff<E,R,T> = effApply(f, a)


fun <E,R:Monoid<R>,A,B,T> effApply(f: (A,B) -> T,
                                   a: Eff<E,R,A>,
                                   b: Eff<E,R,B>) : Eff<E,R,T>
{
    var env : R = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    return Val(f(aValue, bValue), env)
}


fun <E,R:Monoid<R>,A,B,C,T> effApply(f: (A,B,C) -> T,
                                     a: Eff<E,R,A>,
                                     b: Eff<E,R,B>,
                                     c: Eff<E,R,C>) : Eff<E,R,T>
{
    var env : R = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    return Val(f(aValue, bValue, cValue), env)
}

// 4
fun <E,R:Monoid<R>,A,B,C,D,T> effApply(f: (A,B,C,D) -> T,
                                       a: Eff<E,R,A>,
                                       b: Eff<E,R,B>,
                                       c: Eff<E,R,C>,
                                       d: Eff<E,R,D>) : Eff<E,R,T>
{
    var env : R = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    return Val(f(aValue, bValue, cValue, dValue), env)
}


// 5
fun <X,W:Monoid<W>,A,B,C,D,E,Z> effApply(f: (A,B,C,D,E) -> Z,
                                         a: Eff<X,W,A>,
                                         b: Eff<X,W,B>,
                                         c: Eff<X,W,C>,
                                         d: Eff<X,W,D>,
                                         e: Eff<X,W,E>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    return Val(f(aValue, bValue, cValue, dValue, eValue), env)
}


// 6
fun <X,W:Monoid<W>,A,B,C,D,E,F,Z> effApply(z: (A,B,C,D,E,F) -> Z,
                                           a: Eff<X,W,A>,
                                           b: Eff<X,W,B>,
                                           c: Eff<X,W,C>,
                                           d: Eff<X,W,D>,
                                           e: Eff<X,W,E>,
                                           f: Eff<X,W,F>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue), env)
}


// 7
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,Z> effApply(z: (A,B,C,D,E,F,G) -> Z,
                                             a: Eff<X,W,A>,
                                             b: Eff<X,W,B>,
                                             c: Eff<X,W,C>,
                                             d: Eff<X,W,D>,
                                             e: Eff<X,W,E>,
                                             f: Eff<X,W,F>,
                                             g: Eff<X,W,G>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue, gValue), env)
}


// 8
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,Z> effApply(z: (A,B,C,D,E,F,G,H) -> Z,
                                               a: Eff<X,W,A>,
                                               b: Eff<X,W,B>,
                                               c: Eff<X,W,C>,
                                               d: Eff<X,W,D>,
                                               e: Eff<X,W,E>,
                                               f: Eff<X,W,F>,
                                               g: Eff<X,W,G>,
                                               h: Eff<X,W,H>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue, gValue, hValue), env)
}


// 9
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,I,Z> effApply(z: (A,B,C,D,E,F,G,H,I) -> Z,
                                                 a: Eff<X,W,A>,
                                                 b: Eff<X,W,B>,
                                                 c: Eff<X,W,C>,
                                                 d: Eff<X,W,D>,
                                                 e: Eff<X,W,E>,
                                                 f: Eff<X,W,F>,
                                                 g: Eff<X,W,G>,
                                                 h: Eff<X,W,H>,
                                                 i: Eff<X,W,I>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    env = env mappend i.env
    val iValue = when (i) {
        is Val -> i.value
        is Err -> return Err(i.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue,
                 gValue, hValue, iValue), env)
}


// 10
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,I,J,Z> effApply(z: (A,B,C,D,E,F,G,H,I,J) -> Z,
                                                   a: Eff<X,W,A>,
                                                   b: Eff<X,W,B>,
                                                   c: Eff<X,W,C>,
                                                   d: Eff<X,W,D>,
                                                   e: Eff<X,W,E>,
                                                   f: Eff<X,W,F>,
                                                   g: Eff<X,W,G>,
                                                   h: Eff<X,W,H>,
                                                   i: Eff<X,W,I>,
                                                   j: Eff<X,W,J>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    env = env mappend i.env
    val iValue = when (i) {
        is Val -> i.value
        is Err -> return Err(i.error, env)
    }

    env = env mappend j.env
    val jValue = when (j) {
        is Val -> j.value
        is Err -> return Err(j.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue,
                 gValue, hValue, iValue, jValue), env)
}


// 11
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,I,J,K,Z> effApply(z: (A,B,C,D,E,F,G,H,I,J,K) -> Z,
                                                     a: Eff<X,W,A>,
                                                     b: Eff<X,W,B>,
                                                     c: Eff<X,W,C>,
                                                     d: Eff<X,W,D>,
                                                     e: Eff<X,W,E>,
                                                     f: Eff<X,W,F>,
                                                     g: Eff<X,W,G>,
                                                     h: Eff<X,W,H>,
                                                     i: Eff<X,W,I>,
                                                     j: Eff<X,W,J>,
                                                     k: Eff<X,W,K>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    env = env mappend i.env
    val iValue = when (i) {
        is Val -> i.value
        is Err -> return Err(i.error, env)
    }

    env = env mappend j.env
    val jValue = when (j) {
        is Val -> j.value
        is Err -> return Err(j.error, env)
    }

    env = env mappend k.env
    val kValue = when (k) {
        is Val -> k.value
        is Err -> return Err(k.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue,
                 gValue, hValue, iValue, jValue, kValue), env)
}


// 12
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,I,J,K,L,Z> effApply(z: (A,B,C,D,E,F,G,H,I,J,K,L) -> Z,
                                                       a: Eff<X,W,A>,
                                                       b: Eff<X,W,B>,
                                                       c: Eff<X,W,C>,
                                                       d: Eff<X,W,D>,
                                                       e: Eff<X,W,E>,
                                                       f: Eff<X,W,F>,
                                                       g: Eff<X,W,G>,
                                                       h: Eff<X,W,H>,
                                                       i: Eff<X,W,I>,
                                                       j: Eff<X,W,J>,
                                                       k: Eff<X,W,K>,
                                                       l: Eff<X,W,L>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    env = env mappend i.env
    val iValue = when (i) {
        is Val -> i.value
        is Err -> return Err(i.error, env)
    }

    env = env mappend j.env
    val jValue = when (j) {
        is Val -> j.value
        is Err -> return Err(j.error, env)
    }

    env = env mappend k.env
    val kValue = when (k) {
        is Val -> k.value
        is Err -> return Err(k.error, env)
    }

    env = env mappend l.env
    val lValue = when (l) {
        is Val -> l.value
        is Err -> return Err(l.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue,
                 gValue, hValue, iValue, jValue, kValue, lValue), env)
}


// 13
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,I,J,K,L,M,Z> effApply(z: (A,B,C,D,E,F,G,H,I,J,K,L,M) -> Z,
                                                         a: Eff<X,W,A>,
                                                         b: Eff<X,W,B>,
                                                         c: Eff<X,W,C>,
                                                         d: Eff<X,W,D>,
                                                         e: Eff<X,W,E>,
                                                         f: Eff<X,W,F>,
                                                         g: Eff<X,W,G>,
                                                         h: Eff<X,W,H>,
                                                         i: Eff<X,W,I>,
                                                         j: Eff<X,W,J>,
                                                         k: Eff<X,W,K>,
                                                         l: Eff<X,W,L>,
                                                         m: Eff<X,W,M>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    env = env mappend i.env
    val iValue = when (i) {
        is Val -> i.value
        is Err -> return Err(i.error, env)
    }

    env = env mappend j.env
    val jValue = when (j) {
        is Val -> j.value
        is Err -> return Err(j.error, env)
    }

    env = env mappend k.env
    val kValue = when (k) {
        is Val -> k.value
        is Err -> return Err(k.error, env)
    }

    env = env mappend l.env
    val lValue = when (l) {
        is Val -> l.value
        is Err -> return Err(l.error, env)
    }

    env = env mappend m.env
    val mValue = when (m) {
        is Val -> m.value
        is Err -> return Err(m.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue,
                 gValue, hValue, iValue, jValue, kValue, lValue, mValue), env)
}




// 14
fun <X,W:Monoid<W>,A,B,C,D,E,F,G,H,I,J,K,L,M,N,Z> effApply(z: (A,B,C,D,E,F,G,H,I,J,K,L,M,N) -> Z,
                                                           a: Eff<X,W,A>,
                                                           b: Eff<X,W,B>,
                                                           c: Eff<X,W,C>,
                                                           d: Eff<X,W,D>,
                                                           e: Eff<X,W,E>,
                                                           f: Eff<X,W,F>,
                                                           g: Eff<X,W,G>,
                                                           h: Eff<X,W,H>,
                                                           i: Eff<X,W,I>,
                                                           j: Eff<X,W,J>,
                                                           k: Eff<X,W,K>,
                                                           l: Eff<X,W,L>,
                                                           m: Eff<X,W,M>,
                                                           n: Eff<X,W,N>) : Eff<X,W,Z>
{
    var env : W = a.env

    val aValue = when (a) {
        is Val -> a.value
        is Err -> return Err(a.error, env)
    }

    env = env mappend b.env
    val bValue = when (b) {
        is Val -> b.value
        is Err -> return Err(b.error, env)
    }

    env = env mappend c.env
    val cValue = when (c) {
        is Val -> c.value
        is Err -> return Err(c.error, env)
    }

    env = env mappend d.env
    val dValue = when (d) {
        is Val -> d.value
        is Err -> return Err(d.error, env)
    }

    env = env mappend e.env
    val eValue = when (e) {
        is Val -> e.value
        is Err -> return Err(e.error, env)
    }

    env = env mappend f.env
    val fValue = when (f) {
        is Val -> f.value
        is Err -> return Err(f.error, env)
    }

    env = env mappend g.env
    val gValue = when (g) {
        is Val -> g.value
        is Err -> return Err(g.error, env)
    }

    env = env mappend h.env
    val hValue = when (h) {
        is Val -> h.value
        is Err -> return Err(h.error, env)
    }

    env = env mappend i.env
    val iValue = when (i) {
        is Val -> i.value
        is Err -> return Err(i.error, env)
    }

    env = env mappend j.env
    val jValue = when (j) {
        is Val -> j.value
        is Err -> return Err(j.error, env)
    }

    env = env mappend k.env
    val kValue = when (k) {
        is Val -> k.value
        is Err -> return Err(k.error, env)
    }

    env = env mappend l.env
    val lValue = when (l) {
        is Val -> l.value
        is Err -> return Err(l.error, env)
    }

    env = env mappend m.env
    val mValue = when (m) {
        is Val -> m.value
        is Err -> return Err(m.error, env)
    }

    env = env mappend n.env
    val nValue = when (n) {
        is Val -> n.value
        is Err -> return Err(n.error, env)
    }

    return Val(z(aValue, bValue, cValue, dValue, eValue, fValue, gValue,
                 hValue, iValue, jValue, kValue, lValue, mValue, nValue), env)
}
