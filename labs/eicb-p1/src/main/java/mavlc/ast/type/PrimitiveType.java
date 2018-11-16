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
package mavlc.ast.type;

/** Abstract super-type of all MAVL primitive types. */
public abstract class PrimitiveType extends Type {

  /** */
  private static final long serialVersionUID = 3986944031449905506L;

  @Override
  public boolean isPrimitiveType() {
    return true;
  }

  @Override
  public int wordSize() {
    return 1;
  }
}
