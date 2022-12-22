    class Shape {
        public void area(){
            System.out.println("Displays area");
        }
    }

    class Triangle extends Shape{
        public void area(int l, int h){
            System.out.println((l*h)/2);
        }
    } 

    class My_info extends Triangle{
        public void area(String name ,String last, int age){
            System.out.println("My name is "+ name +" " + last + " and my age is " + age);
        }
    }   

public class inheritance {
    public static void main(String[] args) {
        My_info realme = new My_info();
        realme.area();
        realme.area(22,22);
        realme.area("Sandesh","khedkar",24);
    }
}
