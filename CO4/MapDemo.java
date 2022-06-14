import java.util.*;

class MapDemo {

  public static void main(String args[]) {
    Map<String, Integer> hm = new HashMap<String, Integer>();
    hm.put("Anu", 1);
    hm.put("sinu", 2);
    hm.put("Jinu", 3);
    System.out.println(hm);
    hm.remove("Anu");
    // Traversing through the map
    for (Map.Entry<String, Integer> me : hm.entrySet()) {
      System.out.print(me.getKey() + ":");
      System.out.println(me.getValue());
    }
  }
}