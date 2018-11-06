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
 * Matrix type.
 */
public class MatrixType extends StructType {

	/**
	 *
	 */
	private static final long serialVersionUID = -2053459590024751252L;

	private final Expression xDimExpr;

	// Constant expression
	private Integer xDim = null;

	private final Expression yDimExpr;

	private Integer yDim = null;

	/**
	 * Constructor.
	 *
	 * @param elementType The type of the elements in the matrix type.
	 * @param xDimension  The constant expression for the number of rows in the matrix type.
	 * @param yDimension  The constant expression for the number of columns in the matrix type.
	 */
	public MatrixType(ScalarType elementType, Expression xDimension, Expression yDimension) {
		super(elementType);
		xDimExpr = xDimension;
		yDimExpr = yDimension;
	}

	/**
	 * Get the constant expression representing the number of rows of this matrix type.
	 *
	 * @return Constant expression indicating number of rows.
	 */
	public Expression getxDimensionExpr() {
		return xDimExpr;
	}

	/**
	 * Get the constant expression representing the number of columns of this matrix type.
	 *
	 * @return Constant expression indicating number of columns.
	 */
	public Expression getyDimensionExpr() {
		return yDimExpr;
	}

	/**
	 * Get the number of rows of this matrix type.
	 *
	 * @return Number of rows.
	 * @throws NullPointerException if the value of the expression has not been set yet.
	 */
	public int getxDimension() {
		return xDim;
	}

	/**
	 * Set the result of evaluating the constant expression that indicates the number of rows.
	 *
	 * @param xDim The number of rows.
	 */
	public void setxDimension(int xDim) {
		this.xDim = xDim;
	}

	/**
	 * Get the number of columns in this matrix type.
	 *
	 * @return Number of columns.
	 * @throws NullPointerException if the value of the expression has not been set yet.
	 */
	public int getyDimension() {
		return yDim;
	}

	/**
	 * Set the result of evaluating the constant expression that indicates the number of columns.
	 *
	 * @param yDim The number of columns.
	 */
	public void setyDimension(int yDim) {
		this.yDim = yDim;
	}

	/**
	 * A pseudo-constructor for creating a Matrix which is not written out in the source code and whose dimensions
	 * were computed by the compiler. When a source expression is available, use the regular constructor and (in
	 * contextual analysis) use setxDimension() and setyDimension() to supply the results of evaluating those
	 * expressions.
	 *
	 * @param elemType The element type.
	 * @param xDim     The compiler-evaluated number of rows.
	 * @param yDim     The compiler-evaluated number of columns.
	 * @return A matrix type with the given element type and dimensions.
	 */
	public static MatrixType synthesize(ScalarType elemType, int xDim, int yDim) {
		MatrixType type = new MatrixType(elemType, new IntValue(0, 0, xDim), new IntValue(0, 0, yDim));
		type.setxDimension(xDim);
		type.setyDimension(yDim);
		return type;
	}

	@Override
	public String toString() {
		return "MATRIX<" + elemType.toString() + "> [" + xDimExpr.dump() + "][" + yDimExpr.dump() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatrixType that = (MatrixType) o;
		return Objects.equals(elemType, that.elemType) &&
				xDim.intValue() == that.xDim.intValue() &&
				yDim.intValue() == that.yDim.intValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(elemType, xDim, yDim);
	}

	@Override
	public int wordSize() {
		return xDim * yDim;
	}


}
