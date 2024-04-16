

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
    OnlinePurchaseManager opm = new OnlinePurchaseManager();
    opm.add(new Gizmo("ABC",true));
    opm.add(new Gizmo("ABC",false));
    opm.add(new Gizmo("XYZ",true));
    opm.add(new Gizmo("lmnop",false));
    opm.add(new Gizmo("ABC",true));
    opm.add(new Gizmo("ABC",false));
    int abc = opm.countElectronicsByMaker("ABC");
    assertEquals(2,abc,partAFail(2,abc,"ABC"));
      
    int lmnop = opm.countElectronicsByMaker("lmnop");
    assertEquals(0,lmnop,partAFail(0,lmnop,"lmnop"));

    int xyz = opm.countElectronicsByMaker("XYZ");
    assertEquals(1,xyz,partAFail(1,xyz,"XYZ"));

   int qrp = opm.countElectronicsByMaker("QRP");
    assertEquals(0,qrp,partAFail(0,qrp,"QRP"));
   }

   @Test
   public void partB(){
       OnlinePurchaseManager opm = new OnlinePurchaseManager();
       opm.add(new Gizmo("ABC",true));
       opm.add(new Gizmo("ABC",false));
       opm.add(new Gizmo("XYZ",true));
       opm.add(new Gizmo("lmnop",false));
       opm.add(new Gizmo("ABC",true));
       opm.add(new Gizmo("ABC",false));
       assertEquals(false,opm.hasAdjacentEqualPair());
       opm.add(new Gizmo("ABC",false));
       assertEquals(true,opm.hasAdjacentEqualPair());
   }

   private String partAFail(int expected, int real, String maker){
      return "Expected " + expected + " with countElectronicsByMaker(\"" + maker + "\"), but output was " + real;
   }


}
