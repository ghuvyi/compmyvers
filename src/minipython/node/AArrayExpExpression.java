/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AArrayExpExpression extends PExpression
{
    private PExpression _expression_;
    private final LinkedList _nextExpression_ = new TypedLinkedList(new NextExpression_Cast());

    public AArrayExpExpression()
    {
    }

    public AArrayExpExpression(
        PExpression _expression_,
        List _nextExpression_)
    {
        setExpression(_expression_);

        {
            this._nextExpression_.clear();
            this._nextExpression_.addAll(_nextExpression_);
        }

    }
    public Object clone()
    {
        return new AArrayExpExpression(
            (PExpression) cloneNode(_expression_),
            cloneList(_nextExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayExpExpression(this);
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public LinkedList getNextExpression()
    {
        return _nextExpression_;
    }

    public void setNextExpression(List list)
    {
        _nextExpression_.clear();
        _nextExpression_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_expression_)
            + toString(_nextExpression_);
    }

    void removeChild(Node child)
    {
        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

        if(_nextExpression_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        for(ListIterator i = _nextExpression_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class NextExpression_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PNextExpression node = (PNextExpression) o;

            if((node.parent() != null) &&
                (node.parent() != AArrayExpExpression.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AArrayExpExpression.this))
            {
                node.parent(AArrayExpExpression.this);
            }

            return node;
        }
    }
}
