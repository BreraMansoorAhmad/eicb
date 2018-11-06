/*******************************************************************************
 * Copyright (C) 2016-2018 Embedded Systems and Applications Group
 * Department of Computer Science, Technische Universitaet Darmstadt,
 * Hochschulstr. 10, 64289 Darmstadt, Germany.
 *
 * All rights reserved.
 *
 * This software is provided free for educational use only.
 * It may not be used for commercial purposes without the
 * prior written permission of the authors.
 ******************************************************************************/
package mavlc.ast.type;

import mavlc.ast.nodes.expression.Expression;
import mavlc.ast.nodes.expression.IntValue;

import java.util.Objects;

/**
 * Vector type.
 */
public class VectorType extends StructType {

	/**
	 *
	 */
	private static final long serialVersionUID = 2761244243130460154L;

	public Expression getDimensionExpr() {
		return dimExpr;
	}

	private final Expression dimExpr;

	private Integer dim = null;

	/**
	 * Constructor.
	 *
	 * @param elementType The type of elements in the vector type.
	 * @param dimension   The number of elements in the vector type.
	 */
	public VectorType(ScalarType elementType, Expression dimension) {
		super(elementType);
		dimExpr = dimension;
	}

	/**
	 * A pseudo-constructor for creating a VectorType which is not written out in the source code and whose dimension
	 * was computed by the compiler. When a source expression is available, use the regular constructor and (in
	 * contextual analysis) use setDimension() to supply the result of evaluating that expression.
	 *
	 * @param elemType  The element type.
	 * @param dimension The compiler-evaluated vector dimension.
	 * @return A vector type with the given element type and dimension.
	 */
	public static VectorType synthesize(ScalarType elemType, int dimension) {
		VectorType type = new VectorType(elemType, new IntValue(0, 0, dimension));
		type.setDimension(dimension);
		return type;
	}

	/**
	 * Get the number elements in the vector type.
	 *
	 * @return Number of elements.
	 * @throws NullPointerException if the dimension expression has not been evaluated yet.
	 */
	public int getDimension() {
		return dim;
	}

	/**
	 * Record the result of evaluating the constant expression that describes the vector's dimension.
	 *
	 * @param dim Evaluated dimension.
	 */
	public void setDimension(int dim) {
		this.dim = dim;
	}

	@Override
	public String toString() {
		return "VECTOR <" + elemType.toString() + "> [" + dimExpr.dump() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		VectorType that = (VectorType) o;
		return Objects.equals(elemType, that.elemType) &&
				dim.intValue() == that.dim.intValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(elemType, dim);
	}

	@Override
	public int wordSize() {
		return dim;
	}
}
