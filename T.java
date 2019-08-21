import java.util.*; import java.math.*; import java.awt.Point;
import static java.util.Arrays.*; import static java.util.Collections.*;
import static java.lang.Math.*; import static java.lang.System.*;
class T implements Lib {
  void solve() {
  }
}
interface Lib {
  default void println(Object o) { out.println(o); }
  default void ln() { out.println(); }
  default void print(Object o) { out.print(o); }
  default void printf(String f, Object... o) { out.printf(f, o); }
  Scanner sc = new Scanner(in);
  default int _Int() { return sc.nextInt(); }
  default long _Long() { return sc.nextLong(); }
  default String _Next() { return sc.next(); }
  default char _Char() { return sc.next().charAt(0); }
  default String _Line() { return sc.nextLine(); }
  default boolean _HasNext() { return sc.hasNext(); }
  default boolean _HasLine() { return sc.hasNextLine(); }
  default int[] until(int a, int n) { return java.util.stream.IntStream.range(a,n).toArray(); }
  default int[] until(int n) { return until(0,n); }
  default int[] to(int a, int n) { return until(a,n+1); }
  default int[] to(int n) { return until(0,n+1); }
}
class Main { public static void main(String[] args) { new T().solve(); } }
