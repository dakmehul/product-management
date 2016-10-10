package dao

import model.Employee

/**
  * Created by mehulshah on 02/10/16.
  */
trait EmployeeRepository {
  def getAllEmployees():List[Employee]
}