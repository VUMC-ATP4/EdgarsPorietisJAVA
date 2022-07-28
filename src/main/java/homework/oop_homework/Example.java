package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Customer customerOne = new Customer("Edgars");
        customerOne.setMember(true);
        customerOne.setMemberType("Premium");

        Customer customerTwo = new Customer("Jānis");
        customerTwo.setMember(true);
        customerTwo.setMemberType("Gold");

        Customer customerThree = new Customer("Jana");
        customerThree.setMember(true);
        customerThree.setMemberType("Silver");

        Customer customerFour = new Customer("Anna");
        customerFour.setMember(false);

        Visit v1 = new Visit(customerOne, new Date());
        Visit v2 = new Visit(customerTwo, new Date());
        Visit v3 = new Visit(customerThree, new Date());
        Visit v4 = new Visit(customerFour, new Date());

        v1.setProductExpense(5.0);
        v1.setServiceExpense(20.00);
        System.out.println(v1);
        System.out.println("Total expense made by " + v1.getName()+ " = " + v1.getTotalExpense());

        v2.setProductExpense(8.0);
        v2.setServiceExpense(15.00);
        System.out.println(v2);
        System.out.println("Total expense made by " + v2.getName()+ " = " + v2.getTotalExpense());

        v3.setProductExpense(20.0);
        v3.setServiceExpense(15.00);
        System.out.println(v3);
        System.out.println("Total expense made by " + v3.getName()+ " = " + v3.getTotalExpense());

        v4.setProductExpense(25.0);
        v4.setServiceExpense(24.00);
        System.out.println(v4);
        System.out.println("Total expense made by " + v4.getName()+ " = " + v4.getTotalExpense());



    }
}
