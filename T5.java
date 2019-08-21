import java.util.*; import java.math.*; import java.awt.Point;
import static java.util.Arrays.*; import static java.util.Collections.*;
import static java.lang.Math.*; import static java.lang.System.*;
class Main extends Lib {
  void solve() {
  }
}
class Lib {
  public static void main(String[] args) { new Main().solve(); }
  void println(Object o) { out.println(o); }
  void ln() { out.println(); }
  void print(Object o) { out.print(o); }
  void printf(String f, Object... o) { out.printf(f, o); }
  Scanner sc = new Scanner(in);
  int _Int() { return sc.nextInt(); }
  long _Long() { return sc.nextLong(); }
  String _Next() { return sc.next(); }
  char _Char() { return sc.next().charAt(0); }
  String _Line() { return sc.nextLine(); }
  boolean _HasNext() { return sc.hasNext(); }
  boolean _HasLine() { return sc.hasNextLine(); }
  int[] until(int a, int n) { int[] t = new int[n-a]; for (int i=a; i<n; i++) t[i-a] = i; return t; }
  int[] until(int n) { return until(0,n); }
  int[] to(int a, int n) { return until(a,n+1); }
  int[] to(int n) { return until(0,n+1); }
}
