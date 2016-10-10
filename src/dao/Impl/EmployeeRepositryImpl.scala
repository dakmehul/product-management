package dao.Impl

import dao.EmployeeRepository
import model.Employee

/**
  * Created by mehulshah on 02/10/16.
  */
case class EmployeeRepositoryImpl() extends EmployeeRepository{
  override def getAllEmployees(): List[Employee] ={
    EmployeeRepository.employees
  }
}

object EmployeeRepository{

  val d1 = DepartmentRepositoryImpl.d1
  val d2 = DepartmentRepositoryImpl.d2
  val d3 = DepartmentRepositoryImpl.d3
  val d4 = DepartmentRepositoryImpl.d4
  val d5 = DepartmentRepositoryImpl.d5

  val e1 = new Employee(1,"Mehul",d1,15000)
  val e2 = new Employee(2,"Bhavesh",d1,150000)
  val e3 = new Employee(3,"Vishal",d1,150000)
  val e4 = new Employee(4,"Pranav",d1,250000)
  val e5 = new Employee(5,"Arpit",d1,30000)
  val e6 = new Employee(6,"Kiran",d1,20000)
  val e7 = new Employee(7,"Tarang",d1,18000)
  val e8 = new Employee(8,"Sweta",d1,50000)
  val e9 = new Employee(9,"Krishna",d1,15000)
  val e10 = new Employee(10,"Vinit",d1,150000)

  val e11 = new Employee(11,"Khushboo",d2,50000)
  val e12 = new Employee(12,"Zeel",d2,60000)
  val e13 = new Employee(13,"Nihir",d2,660000)
  val e14 = new Employee(14,"Ram",d2,540000)
  val e15 = new Employee(15,"Fenil",d2,40000)

  val e16 = new Employee(16,"Reema",d3,40000)
  val e17 = new Employee(17,"Payal",d3,35000)
  val e18 = new Employee(18,"Shalin",d3,38000)
  val e19 = new Employee(19,"Rahul",d3,56000)
  val e20 = new Employee(20,"Ketan",d3,700000)

  val e21 = new Employee(21,"Prakash",d4,30000)
  val e22 = new Employee(22,"Ronak",d4,25000)
  val e23 = new Employee(23,"Ramsey",d4,20000)
  val e24 = new Employee(24,"Kewin",d4,45000)
  val e25 = new Employee(25,"Stuart",d4,28000)

  val employees = List(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25)
}