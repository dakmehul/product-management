package services

import dao.Impl.EmployeeRepositoryImpl
import model.{Department, Employee}
/**
  * Created by mehulshah on 02/10/16.
  */
class EmployeeService (employeeRepositoryImpl: EmployeeRepositoryImpl) {

  def getAllEmployee(): List[Employee] = {
    employeeRepositoryImpl.getAllEmployees()
  }
  val employees:List[Employee] = employeeRepositoryImpl.getAllEmployees()
  val departments:List[String] = employees.foldLeft(List[String]())((acc:List[String], e:Employee) => List(e.department.name) ::: acc).toSet.toList

  val employeeCountPerDepartment: Map[Int,List[String]] = getEmployeeCountPerDepartment(employees,departments)

  val topSalariedEmployeePerDept:Map[List[Employee],List[String]] = getTopSalariedEmployeePerDept(employees,departments)

  val averageSalaryPerDept = getAverageSalaryPerDept(employees,departments)
  println(averageSalaryPerDept)

  def getEmployeeCountPerDepartment(employeeList: List[Employee], departments: List[String]):Map[Int,List[String]] = {
    departments.groupBy(d => employeeList.count(e => {e.department.name == d}) )
  }

  def getTopSalariedEmployeePerDept(employeeList: List[Employee], departments: List[String]):Map[List[Employee],List[String]] = {
    departments.groupBy(d => employeeList.filter(e => e.salary >=50000 && e.department.name == d))
  }

  def getAverageSalaryPerDept(employeeList: List[Employee], departments: List[String]):List[Map[String,Long]] = {

    departments.map(d => {
      val employeePerDepartment: List[Employee] = employeeList.filter(_.department.name == d)
      val avgSalary: Long = employeePerDepartment.map(_.salary).sum / employeePerDepartment.size.toLong
      Map(d -> avgSalary)
    })
  }
}
