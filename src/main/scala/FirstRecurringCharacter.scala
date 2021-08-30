import scala.collection.immutable.HashSet

class FirstRecurringCharacter {
  def firstRecurringCharacter(seq: Seq[Int]): Int ={
    var h = new HashSet[Int]()
    for (i <- 0 to seq.length) {
      //Doing a blank check on the Hash table to start with.
      //Contains is a boolean evaluation so will return true or false
      //NOTE - MOST CASES START WITH THE REVERSE SCENARIO - REVERSE ENGINEER
      if (h.contains(seq(i)))
      {
        //return the recurring value if true
        return seq(i)
      }
      //Add value to Hashtable
      h += seq(i)
    }
    //If no recurring value then just return 0
    0
  }
}

object FirstRecurringCharacter{
  def main(args: Array[String]): Unit ={
    val char = new FirstRecurringCharacter

    //Initialising Sequence
    val numbers:Seq[Int] = Seq(1,5,8,5,1,8,8,7,4,4,10)
    print(char.firstRecurringCharacter(numbers))
  }
}


