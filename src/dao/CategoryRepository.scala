package dao
import model.Category
/**
  * Created by mehulshah on 27/08/16.
  */
trait CategoryRepository {
  def getAllCategory():List[Category]
}
