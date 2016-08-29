package dao.Impl

import dao.ProductRepository
import model.{Category, Product}

/**
  * Created by mehulshah on 27/08/16.
  */
case class ProductRepositoryImpl() extends ProductRepository{

  override def getAllProduct(): List[Product] = {
    ProductRepository.products
  }
}
object ProductRepository {
  val c1 = CategoryRepository.c1
  val c2 = CategoryRepository.c2

  val p1 = Product(1,"Computer","Computing Device",10000,c1)
  val p2 = Product(2,"Pent cut-piece","Clothing",500,c2)
  val p3 = Product(3,"Mobile","iPhone",5000,c1)
  val p4 = Product(4,"Jeans","Clothing",500,c2)

  val products:List[Product] = List(p1, p2, p3, p4)
}