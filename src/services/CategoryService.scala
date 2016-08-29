package services

import dao.Impl.CategoryRepositoryImpl
import model.Category

/**
  * Created by mehulshah on 27/08/16.
  */
class CategoryService(categoryRepositoryImpl: CategoryRepositoryImpl) {
  def getAllProductCategory():List[Category] = {
    categoryRepositoryImpl.getAllCategory()
  }
}
