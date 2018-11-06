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
package mavlc.ast.nodes.statement;

import mavlc.ast.nodes.expression.Expression;
import mavlc.ast.visitor.ASTNodeVisitor;

import java.util.Objects;

/**
 * AST-node representing a case.
 */
public class Case extends SingleCase {

	private final Expression conditionExpr;

	private Integer condition;

	/**
	 * Constructor.
	 *
	 * @param sourceLine    The source line in which the node was specified.
	 * @param sourceColumn  The source column in which the node was specified.
	 * @param conditionExpr The constant expression whose value is compared against the
	 *                      surrounding switch statement's test expression.
	 * @param statement     The statement that is executed if the condition is equal to the test expression's value.
	 */
	public Case(int sourceLine, int sourceColumn, Expression conditionExpr, Statement statement) {
		super(sourceLine, sourceColumn, statement);
		this.conditionExpr = conditionExpr;
	}

	/**
	 * Supply the value of the condition expression after constant evaluation.
	 *
	 * @param condition The value of the condition.
	 */
	public void setCondition(int condition) {
		this.condition = condition;
	}

	/**
	 * Get the condition.
	 *
	 * @return The integer constant associated with this case.
	 * @throws NullPointerException if the condition expression has not been evaluated yet
	 */
	public int getCondition() {
		return condition;
	}

	@Override
	public boolean isDefault() {
		return false;
	}

	@Override
	public String dump() {
		return ("case " + conditionExpr.dump() + ":\n") + " " + statement.dump();
	}

	public <RetTy, ArgTy> RetTy accept(ASTNodeVisitor<? extends RetTy, ArgTy> visitor, ArgTy obj) {
		return visitor.visitCase(this, obj);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Case aCase = (Case) o;
		return condition.intValue() == aCase.condition.intValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), condition.intValue());
	}

	/**
	 * @return The constant expression describing which value this case handles.
	 */
	public Expression getConditionExpression() {
		return conditionExpr;
	}
}
