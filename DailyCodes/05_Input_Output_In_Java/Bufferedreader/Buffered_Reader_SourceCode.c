/*
ajay@bhosle:~/SelfJava/Input_Output_In_Java/Bufferedreader$ javap java.io.BufferedReader

Compiled from "BufferedReader.java"

public class java.io.BufferedReader extends java.io.Reader {
  
  public java.io.BufferedReader(java.io.Reader, int);
  public java.io.BufferedReader(java.io.Reader);
  public int read() throws java.io.IOException;
  public int read(char[], int, int) throws java.io.IOException;
  java.lang.String readLine(boolean) throws java.io.IOException;
  public java.lang.String readLine() throws java.io.IOException;
  public long skip(long) throws java.io.IOException;
  public boolean ready() throws java.io.IOException;
  public boolean markSupported();
  public void mark(int) throws java.io.IOException;
  public void reset() throws java.io.IOException;
  public void close() throws java.io.IOException;
  public java.util.stream.Stream<java.lang.String> lines();
  static {};
}

*/
