
 class A {  
  
 String msg="Try to access the default variable outside the class within the package";  
       
}  
  
public class DefaultKeyword {  
public static void main(String[] args) {  
    A a=new A();  
   System.out.println(a.msg);  
      
}  
}  