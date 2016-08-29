import model.Category

case class Product(id: Int,name: String,description: String,price: Int,category: Category)
case class Category(id: Int, name :String, subCategory : List[Category])

val c1a = Category(1,"Home Appliance",null)
val c1b = Category(2,"Mobiles",null)
val c1c = Category(3,"Saloon Kit",null)

val sub1 = List(c1a,c1b,c1c)

val c1 = Category(1,"Electronics",sub1)

val p1 = Product(1,"Computer","Computing Device",10000,c1)

val c2a = Category(1,"Cotton",null)
val c2b = Category(2,"Imported",null)
val c2c = Category(3,"Synthetic",null)

val sub2 = List(c2a,c2b,c2c)

val c2 = Category(2,"Apperal",sub2)

val p2 = Product(2,"Pent cut-piece","Clothing",500,c2)

List(1,2,3)