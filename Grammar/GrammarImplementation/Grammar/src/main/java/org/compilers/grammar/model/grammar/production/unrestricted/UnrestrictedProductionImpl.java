package org.compilers.grammar.model.grammar.production.unrestricted;

import org.compilers.grammar.model.grammar.production.AbstractProduction;
import org.compilers.grammar.model.vocabulary.Symbol;

import java.util.List;

public class UnrestrictedProductionImpl extends AbstractProduction implements UnrestrictedProduction {
    public UnrestrictedProductionImpl(final List<? extends Symbol> leftSide, final List<? extends Symbol> rightSide) {
        super(leftSide, rightSide);
        UnrestrictedProduction.validateLeftSide(leftSide);
        UnrestrictedProduction.validateRightSide(rightSide);
    }
}