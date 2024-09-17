package se.umu.cs.ads.a2.types;

import se.umu.cs.ads.a2.adts.AbstractStringType;
import se.umu.cs.ads.a2.util.Util;

public class Content extends AbstractStringType
{
  public static final Content EMPTY = new Content("");


  //----------------------------------------------------------
  public Content (String value)
  {
    super(value);

    if (!Util.validateContent(value))
      throw new IllegalArgumentException(value);
  }
}
