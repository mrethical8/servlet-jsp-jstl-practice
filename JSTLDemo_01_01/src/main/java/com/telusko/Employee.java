package com.telusko;

public class Employee {

   int empno;
   String ename;
   public Employee(int empno, String ename) {
	super();
	this.empno = empno;
	this.ename = ename;
   }
   
   public int getEmpno() {
	return empno;
   }
   public void setEmpno(int empno) {
	this.empno = empno;
   }
   public String getEname() {
	return ename;
   }
   public void setEname(String ename) {
	this.ename = ename;
   }
   
   @Override
   public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + "]";
   }
   
   
}
