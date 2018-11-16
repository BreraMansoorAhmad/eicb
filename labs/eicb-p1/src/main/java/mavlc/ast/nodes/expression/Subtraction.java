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
package mavlc.ast.nodes.expression;

import mavlc.ast.visitor.ASTNodeVisitor;

/**
 * AST-node representing a subtraction, including element-wise subtraction of matrices or vectors.
 */
public class Subtraction extends BinaryExpression {

  /** */
  private static final long serialVersionUID = -9220929537702974828L;

  /**
   * Constructor.
   *
   * @param sourceLine The source line in which the node was specified.
   * @param sourceColumn The source column in which the node was specified.
   * @param leftOperand The left operand of this subtraction.
   * @param rightOperand The right operand of this subtraction.
   */
  public Subtraction(
      int sourceLine, int sourceColumn, Expression leftOperand, Expression rightOperand) {
    super(sourceLine, sourceColumn, leftOperand, rightOperand);
  }

  @Override
  public String dump() {
    return leftOp.dump() + " - " + rightOp.dump();
  }

  @Override
  public <RetTy, ArgTy> RetTy accept(ASTNodeVisitor<? extends RetTy, ArgTy> visitor, ArgTy obj) {
    return visitor.visitSubtraction(this, obj);
  }
}
