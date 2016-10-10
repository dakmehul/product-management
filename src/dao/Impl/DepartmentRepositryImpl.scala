package dao.Impl

import dao.DepartmentRepository
import model.Department

/**
  * Created by mehulshah on 02/10/16.
  */
case class DepartmentRepositoryImpl() extends DepartmentRepository {
  override def getAllDepartments(): List[Department] ={
    DepartmentRepositoryImpl.departments
  }
}

object DepartmentRepositoryImpl{

  val d1 = new Department(1,"Information Technology")
  val d2 = new Department(2,"Chartered Accountant")
  val d3 = new Department(3,"Pharmacy")
  val d4 = new Department(4,"Agriculture")
  val d5 = new Department(5,"Banking")

  val departments = List(d1,d2,d3,d4,d5)
}