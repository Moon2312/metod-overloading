
package methodovrlodng;


public class TestingPoint {
    public static void main(String[] args) {
        Overloading math1=new Overloading();
        math1.add(10, 5);
        //heres int a and int b .So its going for (int a,int b)method
        math1.add(2, 3.4);
         //heres int a and double b .So its going for (int a,double b) method
         
        math1.add(4.5, 9.2);
         //heres double a and double b .So its going for (double a,double b)
        math1.add("Sun","Moon");
         //heres String a and String b .So its going for(String  a,String b) method
        math1.add("Group", 'B');
         //heres string a and char b .So its going for (string a,char b)method
        math1.add();
        
    }
    
}
