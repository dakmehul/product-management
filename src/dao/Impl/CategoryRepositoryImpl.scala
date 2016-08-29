package dao.Impl

import dao.CategoryRepository
import model.Category

/**
  * Created by mehulshah on 27/08/16.
  */
case class CategoryRepositoryImpl() extends CategoryRepository{
  override def getAllCategory(): List[Category] = {
    CategoryRepository.categories
  }
}
object CategoryRepository{

  val c1a = Category(1,"Home Appliance",null)
  val c1b = Category(2,"Mobiles",null)
  val c1c = Category(3,"Saloon Kit",null)

  val c2a = Category(1,"Cotton",null)
  val c2b = Category(2,"Imported",null)
  val c2c = Category(3,"Synthetic",null)

  val sub1 = List(c1a,c1b,c1c)
  val sub2 = List(c2a,c2b,c2c)

  val c1 = Category(1,"Electronics",sub1)
  val c2 = Category(2,"Apparel",sub2)

  val categories = List(c1,c2)

}