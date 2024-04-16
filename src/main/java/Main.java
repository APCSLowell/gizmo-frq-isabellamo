public class Main {
  public static void main(String[] args) {
    OnlinePurchaseManager opm = new OnlinePurchaseManager();
    opm.add(new Gizmo("ABC",true));
    opm.add(new Gizmo("ABC",false));
    opm.add(new Gizmo("XYZ",true));
    opm.add(new Gizmo("lmnop",false));
    opm.add(new Gizmo("ABC",true));
    opm.add(new Gizmo("ABC",false));
    System.out.println(opm.countElectronicsByMaker("ABC"));
    System.out.println(opm.countElectronicsByMaker("lmnop"));
    System.out.println(opm.countElectronicsByMaker("XYZ"));
    System.out.println(opm.countElectronicsByMaker("QRP"));
    System.out.println(opm.hasAdjacentEqualPair());
    opm.add(new Gizmo("ABC",false));
    System.out.println(opm.hasAdjacentEqualPair());
  }
}
