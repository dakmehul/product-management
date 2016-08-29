package services

import dao.Impl.ProductRepositoryImpl
import model.{Category, Product}

/**
  * Created by mehulshah on 27/08/16.
  */
class ProductService(productRepositoryImpl: ProductRepositoryImpl) {
  def getAllProduct():List[Product] = {
    productRepositoryImpl.getAllProduct()
  }
  def getProduct(category: String):List[Product] = {
    val productsFromRepo = productRepositoryImpl.getAllProduct()
     productsFromRepo.filter((p)=> p.category.name == category)
  }
  def getProductById(id:Int): Option[Product] = {
    val products = productRepositoryImpl.getAllProduct()
    products.find((p) => p.id == id)
  }


}
