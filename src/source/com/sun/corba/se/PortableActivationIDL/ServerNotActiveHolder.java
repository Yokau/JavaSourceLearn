package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerNotActiveHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u311/1894/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, September 27, 2021 1:08:24 PM BST
*/

public final class ServerNotActiveHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ServerNotActive value = null;

  public ServerNotActiveHolder ()
  {
  }

  public ServerNotActiveHolder (com.sun.corba.se.PortableActivationIDL.ServerNotActive initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ServerNotActiveHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ServerNotActiveHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ServerNotActiveHelper.type ();
  }

}