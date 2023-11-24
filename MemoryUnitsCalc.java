import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
 
class GFG
{
static BigInteger Bits(int kilobytes)
{
    BigInteger  Bits = new BigInteger("0");
    BigInteger kilo = BigInteger.valueOf(kilobytes);
    Bits = kilo.multiply(BigInteger.valueOf(8192));
  
    return Bits;
}
  
static BigInteger Bytes(int kilobytes)
{
    BigInteger Bytes = new BigInteger("0");
   BigInteger kilo = BigInteger.valueOf(kilobytes);
   Bytes = kilo.multiply(BigInteger.valueOf(1024));
    return Bytes;
}
  
public static void main(String args[])
{
    int kilobytes = 1;
    System.out.print(kilobytes + " kilobytes = "
         + Bytes(kilobytes) + " bytes and "
         + Bits(kilobytes) + " bits");
}
}
