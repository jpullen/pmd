/* Generated By:JJTree: Do not edit this line. ASTType.java */

package com.infoether.pmd.ast;

public class ASTType extends SimpleNode {
  public ASTType(int id) {
    super(id);
  }

  public ASTType(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
