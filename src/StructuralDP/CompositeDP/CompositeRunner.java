package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeRunner {
    public static void main(String[] args) {
        /*
        Department sales = new Sales();
        Department finance = new Finance();
        Department hr = new HR();


        Department headDepartment = new HeadDepartment(Arrays.asList(sales, finance, hr));  // List<Department> ...

        System.out.println(headDepartment.getName());

        System.out.println(headDepartment.getEmployee());
        */

        /*
        CompositeRunner compositeRunner = new CompositeRunner();
        compositeRunner.composite();
        */

        CompositeRunner.composite();

    }

    public static void composite(){
        Department sales = new Sales();
        Department finance = new Finance();
        Department hr = new HR();


        Department headDepartment = new HeadDepartment(Arrays.asList(sales, finance, hr));  // List<Department> ...

        System.out.println(headDepartment.getName());

        System.out.println(headDepartment.getEmployee());
    }

}