public class Student
{
private String name;
private int phonenumber;
private int rollnumber;
private int clss;
public String getname()
{return name;}
public int getphonenumber()
{return phonenumber;}
public int getrollnumber()
{return rollnumber;}
public int getclss()
{return clss;}
public void setname(String newValue)
{ name = newValue;}
public void setphonenumber(int newValue)
{ phonenumber = newValue;}
public void setrollnumber(int newValue)
{ rollnumber = newValue ;}
public void setclss(int newValue)
{ clss = newValue;}
public static void main(String[] args)
{
Student St = new Student();
St.setname("Amutha");
St.setphonenumber(253468);
St.setrollnumber(23);
St.setclss(3);
System.out.println("Name:"+ St.getname());
System.out.println("Phone number:"+ St.getphonenumber());
System.out.println("Roll number:"+ St.getrollnumber());
System.out.println("Class:"+ St.getclss());
}}
