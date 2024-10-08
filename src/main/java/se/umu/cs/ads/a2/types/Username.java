package se.umu.cs.ads.a2.types;

import se.umu.cs.ads.a2.adts.AbstractStringType;
import se.umu.cs.ads.a2.util.Util;

public class Username extends AbstractStringType
{
  //----------------------------------------------------------
  public Username (String value)
  {
    super(value);

    if (!Util.validateUsername(value))
      throw new IllegalArgumentException(value);
  }
}
