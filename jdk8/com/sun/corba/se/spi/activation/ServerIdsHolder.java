package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerIdsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/

public final class ServerIdsHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public ServerIdsHolder ()
  {
  }

  public ServerIdsHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerIdsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerIdsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerIdsHelper.type ();
  }

}
