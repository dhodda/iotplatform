package org.iotp.infomgt.data.relation;

public class EntityRelationInfo extends EntityRelation {


  /**
   * 
   */
  private static final long serialVersionUID = 5675480895734047289L;
  private String fromName;
  private String toName;

  public EntityRelationInfo() {
    super();
  }

  public EntityRelationInfo(EntityRelation entityRelation) {
    super(entityRelation);
  }

  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false;

    EntityRelationInfo that = (EntityRelationInfo) o;

    return toName != null ? toName.equals(that.toName) : that.toName == null;

  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (toName != null ? toName.hashCode() : 0);
    return result;
  }
}
