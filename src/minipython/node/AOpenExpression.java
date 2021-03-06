/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AOpenExpression extends PExpression
{
    private PExpression _expr1_;
    private PExpression _expr2_;

    public AOpenExpression()
    {
    }

    public AOpenExpression(
        PExpression _expr1_,
        PExpression _expr2_)
    {
        setExpr1(_expr1_);

        setExpr2(_expr2_);

    }
    public Object clone()
    {
        return new AOpenExpression(
            (PExpression) cloneNode(_expr1_),
            (PExpression) cloneNode(_expr2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpenExpression(this);
    }

    public PExpression getExpr1()
    {
        return _expr1_;
    }

    public void setExpr1(PExpression node)
    {
        if(_expr1_ != null)
        {
            _expr1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr1_ = node;
    }

    public PExpression getExpr2()
    {
        return _expr2_;
    }

    public void setExpr2(PExpression node)
    {
        if(_expr2_ != null)
        {
            _expr2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr2_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr1_)
            + toString(_expr2_);
    }

    void removeChild(Node child)
    {
        if(_expr1_ == child)
        {
            _expr1_ = null;
            return;
        }

        if(_expr2_ == child)
        {
            _expr2_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr1_ == oldChild)
        {
            setExpr1((PExpression) newChild);
            return;
        }

        if(_expr2_ == oldChild)
        {
            setExpr2((PExpression) newChild);
            return;
        }

    }
}
