/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AArrayEqualStatement extends PStatement
{
    private TId _id_;
    private PExpression _firstExpression_;
    private PExpression _secondExpression_;

    public AArrayEqualStatement()
    {
    }

    public AArrayEqualStatement(
        TId _id_,
        PExpression _firstExpression_,
        PExpression _secondExpression_)
    {
        setId(_id_);

        setFirstExpression(_firstExpression_);

        setSecondExpression(_secondExpression_);

    }
    public Object clone()
    {
        return new AArrayEqualStatement(
            (TId) cloneNode(_id_),
            (PExpression) cloneNode(_firstExpression_),
            (PExpression) cloneNode(_secondExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayEqualStatement(this);
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public PExpression getFirstExpression()
    {
        return _firstExpression_;
    }

    public void setFirstExpression(PExpression node)
    {
        if(_firstExpression_ != null)
        {
            _firstExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _firstExpression_ = node;
    }

    public PExpression getSecondExpression()
    {
        return _secondExpression_;
    }

    public void setSecondExpression(PExpression node)
    {
        if(_secondExpression_ != null)
        {
            _secondExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _secondExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_firstExpression_)
            + toString(_secondExpression_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_firstExpression_ == child)
        {
            _firstExpression_ = null;
            return;
        }

        if(_secondExpression_ == child)
        {
            _secondExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_firstExpression_ == oldChild)
        {
            setFirstExpression((PExpression) newChild);
            return;
        }

        if(_secondExpression_ == oldChild)
        {
            setSecondExpression((PExpression) newChild);
            return;
        }

    }
}
