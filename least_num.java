import java.io.*;
import java.util.*;
public class least_num
{
public static void main(String[] args)
{
int i,temp=0;
Scanner in = new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();

int len=in.nextInt();
for(i=0;i<len;i++)
a.add(in.nextInt());

int del=in.nextInt();

Collections.sort(a);
for(i=a.size();i>=del;i--)
a.remove(i-1);
for(i=0;i<a.size();i++)
{
temp=temp*10+a.get(i);
}
System.out.println(temp);


	}
}