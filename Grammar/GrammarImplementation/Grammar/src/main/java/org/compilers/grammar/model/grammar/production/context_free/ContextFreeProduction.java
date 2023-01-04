package org.compilers.grammar.model.grammar.production.context_free;

import org.compilers.grammar.model.grammar.production.Production;
import org.compilers.grammar.model.grammar.production.context_dependent.ContextDependentProduction;
import org.compilers.grammar.model.vocabulary.Symbol;
import org.compilers.grammar.model.vocabulary.nonterminal.NonTerminal;

import java.util.List;

public interface ContextFreeProduction extends ContextDependentProduction {

    NonTerminal leftSideNonTerminal();

    static void validateLeftSide(final List<Symbol> side) {
        ContextDependentProduction.validateLeftSide(side);
        if (side.size() != 1) {
            throw new IllegalArgumentException("Left side of context free production must contain exactly one non-terminal symbol");
        }
    }

    static void validateRightSide(final List<Symbol> side) {
        ContextDependentProduction.validateRightSide(side);
    }

    static boolean isContextFreeProduction(final Production production) {
        return production instanceof ContextFreeProduction;
    }
}
