/**
 * ***************************************************************************** Copyright (C)
 * 2016-2018 Embedded Systems and Applications Group Department of Computer Science, Technische
 * Universitaet Darmstadt, Hochschulstr. 10, 64289 Darmstadt, Germany.
 *
 * <p>All rights reserved.
 *
 * <p>This software is provided free for educational use only. It may not be used for commercial
 * purposes without the prior written permission of the authors.
 * ****************************************************************************
 */
package mavlc.ast.nodes.statement;

import mavlc.ast.nodes.ASTNode;
import mavlc.ast.visitor.ASTNodeVisitor;

/** Abstract super-class of all MAVL program-statements. */
public abstract class Statement extends ASTNode {

  /** */
  private static final long serialVersionUID = -9106339472188291297L;

  /**
   * Constructor.
   *
   * @param sourceLine The source line in which the node was specified.
   * @param sourceColumn The source column in which the node was specified.
   */
  public Statement(int sourceLine, int sourceColumn) {
    super(sourceLine, sourceColumn);
  }

  @Override
  public <RetTy, ArgTy> RetTy accept(ASTNodeVisitor<? extends RetTy, ArgTy> visitor, ArgTy obj) {
    return visitor.visitStatement(this, obj);
  }
}
