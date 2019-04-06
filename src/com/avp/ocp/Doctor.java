package com.avp.ocp;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }
}
