import java.util.*; import static java.lang.System.*;
class T implements Lib {
  void solve() {
  }
}
interface Lib {
  default void println(Object o) { out.println(o); }
  Scanner sc = new Scanner(in);
  default int _Int() { return sc.nextInt(); }
  default String _Next() { return sc.next(); }
  default int[] until(int a, int n) { return java.util.stream.IntStream.range(a,n).toArray(); }
  default int[] until(int n) { return until(0,n); }
  default int[] to(int a, int n) { return until(a,n+1); }
}
class Main { public static void main(String[] args) { new T().solve(); } }
