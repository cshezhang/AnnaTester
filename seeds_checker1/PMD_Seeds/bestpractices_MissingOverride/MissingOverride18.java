import java.util.Comparator;

class AmbiguousOverload implements Comparator<StringBuilder> {

  // only one of those overloads is an override, and so there's only one bridge,
  // so we can't choose the inherited overload

  // missing
  public int compare(StringBuilder o1, StringBuilder o2) {
    return 0;
  }

  public int compare(String s, String s2) {
    return 0;
  }
}
