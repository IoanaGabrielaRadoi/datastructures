 package recursive;

public class FibonaciRecursive {

    public int fib(int i){
        return i<2 ? i : fib(i-1) + fib (i-2);
    }
}
