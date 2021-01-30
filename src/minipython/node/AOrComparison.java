/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AOrComparison extends PComparison
{
    private PComparison _comp1_;
    private PComparison _comp2_;

    public AOrComparison()
    {
    }

    public AOrComparison(
        PComparison _comp1_,
        PComparison _comp2_)
    {
        setComp1(_comp1_);

        setComp2(_comp2_);

    }
    public Object clone()
    {
        return new AOrComparison(
            (PComparison) cloneNode(_comp1_),
            (PComparison) cloneNode(_comp2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrComparison(this);
    }

    public PComparison getComp1()
    {
        return _comp1_;
    }

    public void setComp1(PComparison node)
    {
        if(_comp1_ != null)
        {
            _comp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comp1_ = node;
    }

    public PComparison getComp2()
    {
        return _comp2_;
    }

    public void setComp2(PComparison node)
    {
        if(_comp2_ != null)
        {
            _comp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comp2_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comp1_)
            + toString(_comp2_);
    }

    void removeChild(Node child)
    {
        if(_comp1_ == child)
        {
            _comp1_ = null;
            return;
        }

        if(_comp2_ == child)
        {
            _comp2_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comp1_ == oldChild)
        {
            setComp1((PComparison) newChild);
            return;
        }

        if(_comp2_ == oldChild)
        {
            setComp2((PComparison) newChild);
            return;
        }

    }
}
