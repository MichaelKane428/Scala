object Basics {
  def main(args: Array[String]): Unit ={
    //Creating Variables.
    val message = "I just created my first variable!"
    println(message)

    //Call the function
    println(max(1, 2))
  }

  //Creating a function.
  def max(x: Int, y: Int): Int = {
    if(x > y)
      x
    else
      y
  }
}
