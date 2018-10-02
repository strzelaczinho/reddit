/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_37_DIFFICULT_CORNACHIA_ALGORITHM;

import java.lang.*;
import java.math.*;
public class Cornacchia
{
public static void main(String args[])
{

BigInteger d=new BigInteger(args[0]);
BigInteger m=new BigInteger(args[1]);

BigInteger r0=Sqrt(m.subtract(d),m);

if(((r0.multiply(r0)).mod(m)).compareTo(m.subtract(d))==0)
{

BigInteger r1=m;
BigInteger r2=r0;

while((r2.multiply(r2)).compareTo(m)>=0)
{
BigInteger temp=r1;
r1=r2;
r2=temp.mod(r1);
}

BigInteger z=(m.subtract(r2.multiply(r2))).divide(d);
BigInteger s=Sqrt(z);

if((s.multiply(s)).compareTo(z)==0)
System.out.println(r2+"^2+"+d+"*"+s+"^2");

/* BigInteger y=(m.subtract(r1.multiply(r1))).divide(d);
BigInteger t=Sqrt(y);

if((t.multiply(t)).compareTo(y)==0)
System.out.println(r1+"^2+"+d+"*"+t+"^2"); */

}

}

static java.math.BigInteger Sqrt(BigInteger X)
{
BigInteger P=BigInteger.ONE;
BigInteger mul=BigInteger.valueOf(2);
while((mul.multiply(mul)).compareTo(X)<=0)
{
mul=mul.multiply(BigInteger.valueOf(2));
}
mul=mul.divide(BigInteger.valueOf(2));
P=mul;
while(mul.compareTo(BigInteger.ONE)>=0)
{
mul=mul.divide(BigInteger.valueOf(2));
if(((P.add(mul)).multiply(P.add(mul))).compareTo(X)<=0)
P=P.add(mul);
}
return P;
}

static java.math.BigInteger Sqrt(BigInteger a,BigInteger p)
{
BigInteger x;
a=a.remainder(p);
if((a.modPow(p.subtract(BigInteger.ONE),p)).compareTo(BigInteger.ONE)!=0)
{
return BigInteger.ZERO;
}
if((a.modPow(p.subtract(BigInteger.ONE),p)).compareTo(BigInteger.ONE)==0)
{
if((a.modPow((p.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2)),p)).compareTo(p.subtract(BigInteger.ONE))==0)
{
return BigInteger.ZERO;
}
if((a.modPow((p.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2)),p)).compareTo(BigInteger.ONE)==0)
{
if((p.remainder(BigInteger.valueOf(4))).compareTo(BigInteger.valueOf(3))==0)
{
x=a.modPow((p.add(BigInteger.ONE)).divide(BigInteger.valueOf(4)),p);
return x;
}
if((p.remainder(BigInteger.valueOf(8))).compareTo(BigInteger.valueOf(5))==0)
{
x=a.modPow((p.add(BigInteger.valueOf(3))).divide(BigInteger.valueOf(8)),p);
BigInteger c=(x.multiply(x)).remainder(p);
if(((c.remainder(p)).compareTo(p.subtract(a)))==0)
{
x=(x.multiply((BigInteger.valueOf(2)).modPow((p.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(4)),p))).remainder(p);
}
return x;
}
if((p.remainder(BigInteger.valueOf(8))).compareTo(BigInteger.valueOf(1))==0)
{
BigInteger d=BigInteger.valueOf(2);
while((d.modPow((p.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2)),p)).compareTo(p.subtract(BigInteger.ONE))!=0)
{
d=d.add(BigInteger.ONE);
}
BigInteger t=p.subtract(BigInteger.ONE);
int s=0;
int i;
BigInteger m;
while((t.remainder(BigInteger.valueOf(2))).compareTo(BigInteger.ZERO)==0)
{
s++;
t=t.divide(BigInteger.valueOf(2));
}
BigInteger k=a.modPow(t,p);
BigInteger n=d.modPow(t,p);
m=BigInteger.ZERO;
for(i=0;i<s;i++)
{
if(((k.multiply(n.modPow(m,p))).modPow((BigInteger.valueOf(2)).pow(s-1-i),p)).compareTo(p.subtract(BigInteger.ONE))==0)
{
m=m.add((BigInteger.valueOf(2)).pow(i));
}
}
x=((a.modPow((t.add(BigInteger.ONE)).divide(BigInteger.valueOf(2)),p)).multiply(n.modPow(m.divide(BigInteger.valueOf(2)),p))).remainder(p);
return x;
}
}
}
return BigInteger.ZERO;
}

}