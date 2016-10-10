package dao

import model.Department

/**
  * Created by mehulshah on 02/10/16.
  */
trait DepartmentRepository {
  def getAllDepartments():List[Department]
}
