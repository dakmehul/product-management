package model

/**
  * Created by mehulshah on 27/08/16.
  */
case class Category(var id: Int, var name :String,var subCategory : List[Category]) {

}
