/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.parser;

import minipython.node.*;
import minipython.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    public void caseTTab(TTab node)
    {
        index = 0;
    }

    public void caseTDef(TDef node)
    {
        index = 1;
    }

    public void caseTLeftPar(TLeftPar node)
    {
        index = 2;
    }

    public void caseTRightPar(TRightPar node)
    {
        index = 3;
    }

    public void caseTSemi(TSemi node)
    {
        index = 4;
    }

    public void caseTComma(TComma node)
    {
        index = 5;
    }

    public void caseTIf(TIf node)
    {
        index = 6;
    }

    public void caseTFullstop(TFullstop node)
    {
        index = 7;
    }

    public void caseTWhile(TWhile node)
    {
        index = 8;
    }

    public void caseTFor(TFor node)
    {
        index = 9;
    }

    public void caseTIn(TIn node)
    {
        index = 10;
    }

    public void caseTReturn(TReturn node)
    {
        index = 11;
    }

    public void caseTPrint(TPrint node)
    {
        index = 12;
    }

    public void caseTSet(TSet node)
    {
        index = 13;
    }

    public void caseTFastSub(TFastSub node)
    {
        index = 14;
    }

    public void caseTFastDiv(TFastDiv node)
    {
        index = 15;
    }

    public void caseTLeftBracket(TLeftBracket node)
    {
        index = 16;
    }

    public void caseTRightBracket(TRightBracket node)
    {
        index = 17;
    }

    public void caseTAssert(TAssert node)
    {
        index = 18;
    }

    public void caseTPlus(TPlus node)
    {
        index = 19;
    }

    public void caseTMinus(TMinus node)
    {
        index = 20;
    }

    public void caseTMult(TMult node)
    {
        index = 21;
    }

    public void caseTDmult(TDmult node)
    {
        index = 22;
    }

    public void caseTDiv(TDiv node)
    {
        index = 23;
    }

    public void caseTMod(TMod node)
    {
        index = 24;
    }

    public void caseTMax(TMax node)
    {
        index = 25;
    }

    public void caseTMin(TMin node)
    {
        index = 26;
    }

    public void caseTOpen(TOpen node)
    {
        index = 27;
    }

    public void caseTType(TType node)
    {
        index = 28;
    }

    public void caseTAnd(TAnd node)
    {
        index = 29;
    }

    public void caseTOr(TOr node)
    {
        index = 30;
    }

    public void caseTNot(TNot node)
    {
        index = 31;
    }

    public void caseTLess(TLess node)
    {
        index = 32;
    }

    public void caseTGreater(TGreater node)
    {
        index = 33;
    }

    public void caseTNotEqual(TNotEqual node)
    {
        index = 34;
    }

    public void caseTEqual(TEqual node)
    {
        index = 35;
    }

    public void caseTTrue(TTrue node)
    {
        index = 36;
    }

    public void caseTFalse(TFalse node)
    {
        index = 37;
    }

    public void caseTGreaterOrEqual(TGreaterOrEqual node)
    {
        index = 38;
    }

    public void caseTLessOrEqual(TLessOrEqual node)
    {
        index = 39;
    }

    public void caseTNull(TNull node)
    {
        index = 40;
    }

    public void caseTId(TId node)
    {
        index = 41;
    }

    public void caseTString(TString node)
    {
        index = 42;
    }

    public void caseTNumber(TNumber node)
    {
        index = 43;
    }

    public void caseEOF(EOF node)
    {
        index = 44;
    }
}
