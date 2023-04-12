class MyException extends Exception{
String str1;
MyException(String str2)
{
str1= str2;
}
public String toString(){
return("MyException Occurred:"+str1);
}
}


class ExExcep{
public static void main(String[] args){
try{
System.out.println("start of try block");
throw new MyException("error message");
}
catch(MyException exp) {
System.out.println("catch block");
System.out.println(exp);
}
}
}
