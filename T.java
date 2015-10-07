import java.util.*; import java.math.*; import java.awt.Point;
import static java.util.Arrays.*; import static java.util.Collections.*;
import static java.lang.Math.*; import static java.lang.System.*;
class Main extends Lib {
  void solve() {
  }
  public static void main(String[] args) { new Main().solve(); }
}
class Lib {
  void println(Object o) { out.println(o); }
  void ln() { out.println(); }
  void print(Object o) { out.print(o); }
  void printf(String f, Object...o) { out.printf(f, o); }
  Scanner sc = new Scanner(in);
  int _Int() { return sc.nextInt(); }
  String _Next() { return sc.next(); }
  String _Line() { return sc.nextLine(); }
  boolean _HasInt() { return sc.hasNextInt(); }
  boolean _HasNext() { return sc.hasNext(); }
  boolean _HasLine() { return sc.hasNextLine(); }
  int[] until(int n) { int[] t = new int[n]; for (int i=0; i<n; i++) t[i] = i; return t; }
  int[] until(int fr, int to) { int[] t = new int[to-fr]; for (int i=fr; i<to; i++) t[i-fr] = i; return t; }
  int[] to(int fr, int to) { return until(fr, to+1); } int[] to(int n) { return until(0, n); }
  <T> String mkString(T[] t, String a, String d, String b) {
    StringBuilder sb = new StringBuilder();
    sb.append(a);
    for (int i=0; i<t.length-1; i++) { sb.append(t[i]); sb.append(d); }
    sb.append(t[t.length-1]);
    sb.append(b);
    return sb.toString();
  }
}
