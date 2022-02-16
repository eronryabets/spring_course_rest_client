package com.eronryabets.spring.rest;

import com.eronryabets.spring.rest.configuration.MyConfig;
import com.eronryabets.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        //getAllEmployees
//        List<Employee> allEmployees = communication.getAllEmployees();
//        allEmployees.forEach(System.out::println);
//        //getEmployee
//        Employee empById = communication.getEmployee(6);
//        System.out.println(empById);
//        //add employee - saveEmployee - update
//        Employee emp = new Employee("Sveta","Krihovnikova","IT",1200);
//        emp.setId(19);
//        communication.saveEmployee(emp);
//        //delete
//        communication.deleteEmployee(19);



    }
}
