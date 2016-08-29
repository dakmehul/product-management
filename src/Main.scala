import dao.Impl.{CategoryRepositoryImpl, ProductRepositoryImpl}
import services.{CategoryService, ProductService}

/**
  * Created by mehulshah on 27/08/16.
  */
object Main {
  def main(args: Array[String]) = {
    val productService = new ProductService(ProductRepositoryImpl())
    val products = productService.getAllProduct()
    println("Total Products :" +products.length+"\n")
    products.foreach(println)

    println("\n"+"Searched Product : ")
    println(productService.getProductById(2)+"\n")

    println("\n"+"Product Searched by category : "+"\n")
    println(productService.getProduct("Apparel").foreach(println))

    val categoryService = new CategoryService(CategoryRepositoryImpl())
    val categories = categoryService.getAllProductCategory()
    println("\n"+"Total Categories :" +categories.length+"\n")
    categories.foreach(println)
  }
}
