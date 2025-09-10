package ejersCurso;

import java.util.ArrayList;

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee[] employees = new Employee[10];// En el curso hace new Employee[10]
    private int lastAddedEmployee= -1;

    public Department(String nombre) {
        this.name = nombre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getLastAddedEmployee() {
        return lastAddedEmployee;
    }

    public void setLastAddedEmployee(int lastAddedEmployee) {
        this.lastAddedEmployee = lastAddedEmployee;
    }

    public Department(String name, Employee[] employees, int lastAddedEmployee) {
        this.name = name;
        this.employees = employees;
        this.lastAddedEmployee = lastAddedEmployee;
    }

    public void addEmp(Employee anEmployee){
        if(lastAddedEmployee<employees.length){
            lastAddedEmployee++;
            employees[lastAddedEmployee] = anEmployee;//para agregarlo al array
        }
    }


    public Employee[] getEmployee(){

        Employee[] actualEmployees = new Employee[lastAddedEmployee + 1];

        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }

        return actualEmployees;

    }

    public int cantidadEmpleados(){
        return lastAddedEmployee+1;
    }

    public Employee getEmployeeByID(int empId){
        for(Employee e: employees){

            if(empId==e.getID()){
                return e;
            }
        }
        return null;
    }


    public double getTotalSalary(){
        double salarioTotal=0.0;
        for (Employee e: employees){
            salarioTotal+=e.getSalary();
        }
        return salarioTotal;
    }

    public double getAverageSalary(){
        if(lastAddedEmployee>-1){
            return getTotalSalary()/(lastAddedEmployee -1);
        }
        return 0.0;
    }
    public String toString(){
        return name;
    }
}