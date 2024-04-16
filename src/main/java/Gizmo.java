public class Gizmo
{
  private String maker;
  private boolean isElec;
  
  /** Returns the name of the manufacturer of this Gizmo. */
  public String getMaker()
  {
    return maker;
  }
  /** Returns true if this Gizmo is electronic, and false
  * otherwise.
  */
  public boolean isElectronic()
  {
    return isElec;
  }
  /** Returns true if this Gizmo is equivalent to the Gizmo
  * object represented by the
  * parameter, and false otherwise.
  */
  public boolean equals(Object other)
  {
    boolean sameMaker = maker.equals(((Gizmo)other).getMaker());
    boolean bothElec = isElec == ((Gizmo)other).isElectronic();
    return sameMaker && bothElec;
  }
  public Gizmo(String s, boolean e)
  {
    maker = s;
    isElec = e;
  }
}
