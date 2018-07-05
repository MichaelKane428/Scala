object Basics {
  def main(args: Array[String]): Unit ={
    //Creating Variables.
    val message = "I just created my first variable!"
    println(message)

    //Call the function
    println(max(1, 2) + " is the largest number")

    //Create an array where you dont know whats in it.
    val fiveInts = new Array[Int](5)

    //Create an array where you know the contents.
    val fiveToone = Array(5,4,3,2,1)

    //While Loop fill
    var i=0
    while(i < fiveInts.length){
      fiveInts(i) = i
      i+=1
    }

    i=0
    //While Loop to print
    while(i < fiveInts.length){
      println(fiveInts(i) + " " + fiveToone(i))
      i+=1
    }

    //Use of the foreach command
    fiveInts.foreach((fiveInts: Int) => println(fiveInts))
  }

  //Creating a function.
  def max(x: Int, y: Int): Int = {
    if(x > y)
      x
    else
      y
  }
}
