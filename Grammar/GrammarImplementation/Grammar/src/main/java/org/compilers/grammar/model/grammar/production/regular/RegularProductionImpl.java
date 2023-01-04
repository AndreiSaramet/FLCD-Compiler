package org.compilers.grammar.model.grammar.production.regular;

import org.compilers.grammar.model.grammar.production.AbstractProduction;
import org.compilers.grammar.model.vocabulary.Symbol;

import java.util.List;

public class RegularProductionImpl extends AbstractProduction implements RegularProduction {
    public RegularProductionImpl(final List<Symbol> leftSide, final List<Symbol> rightSide) {
        super(leftSide, rightSide);
        RegularProduction.validateLeftSide(leftSide);
        RegularProduction.validateRightSide(rightSide);
    }
}
