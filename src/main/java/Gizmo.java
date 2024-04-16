public class Gizmo {
  private String maker;
  private boolean isElec;
  
  public String getMaker() {
    return maker;
  }
  
  public boolean isElectronic() {
    return isElec;
  }
  
  public boolean equals(Object other) {
    if (!(other instanceof Gizmo)) {
      return false;
    }
    Gizmo otherGizmo = (Gizmo) other;
    boolean sameMaker = this.maker.equals(otherGizmo.getMaker());
    boolean bothElec = this.isElec == otherGizmo.isElectronic();
    return sameMaker && bothElec;
  }
  
  public Gizmo(String s, boolean e) {
    maker = s;
    isElec = e;
  }
}

import java.util.ArrayList;

public class OnlinePurchaseManager {
  private ArrayList<Gizmo> purchases;

  public OnlinePurchaseManager(ArrayList<Gizmo> purchases) {
    this.purchases = purchases;
  }
  
  public int countElectronicsByMaker(String maker) {
    int count = 0;
    for (Gizmo gizmo : purchases) {
        if (gizmo.isElectronic() && gizmo.getMaker().equals(maker)) {
            count++;
        }
    }
    return count;
  }

  public boolean hasAdjacentEqualPair() {
    for (int i = 0; i < purchases.size() - 1; i++) {
        Gizmo current = purchases.get(i);
        Gizmo next = purchases.get(i + 1);
        if (current.equals(next)) {
            return true;
        }
    }
    return false;
  }
}
