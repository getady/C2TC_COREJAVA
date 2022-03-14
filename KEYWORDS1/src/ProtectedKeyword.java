
class B {  
  
 protected String msg="Try to access the protected variable outside the class within the package";  
       
}  
  
public class ProtectedKeyword {  
public static void main(String[] args) {  
    B a=new B();  
   System.out.println(a.msg);  
      
}  
}  

