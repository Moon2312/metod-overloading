
package methodovrlodng;


public class Overloading {
    void add(double a,double b){
        System.out.println(a+b);
    }
     void add(int a,int b){
        System.out.println(a+b);
    }
    
     void add(int a,double b){
        System.out.println(a+b);
    }
      void add(String a,String b){
        System.out.println(a+b);
    }
       void add(String a,char b){
        System.out.println(a+b);
    }
    
       void add(){
           System.out.println("Null");
       }
}
