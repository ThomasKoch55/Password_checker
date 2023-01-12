package password_checker

object Password {
  def isValid(password : String) : Boolean = 
  {
    var count: Int = 0
    for char <- password do
        count+=1 

    if (count < 6) then
        return false
    
    return true 
  }
}
