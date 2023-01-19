package password_checker

object Password {
  def isValid(password : String): Boolean = 
  {
    var count: Int = 0
    for char <- password do
        count+=1 

    if (count < 6) then
        return false
    
    return true 
  }

  def containsCap(password : String): Boolean =
  {

    var cap_detected = false

    for char <- password do
      
        if (char.isUpper) then

            cap_detected = true
          
    return cap_detected
      
  }
}
