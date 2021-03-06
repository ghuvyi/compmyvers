/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TOpen extends Token
{
    public TOpen()
    {
        super.setText("open");
    }

    public TOpen(int line, int pos)
    {
        super.setText("open");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TOpen(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpen(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TOpen text.");
    }
}
