package edu.knoldus

class Searching {

  def binarySearch(myList: Array[Int], first: Int, last: Int, search: Int): String = {

  if(last >= first){

    val middle = first + (last - first) / 2
    if (myList(middle) == search)
      return "Element present in array"



    if (myList(middle) > search)
      binarySearch(myList, first, middle - 1, search);


    binarySearch(myList, middle+1, last, search);
  }

  "Element is not present in array"
}
  }

  def linearSearch(myList: Array[Int], search: Int):Boolean = {
  
  for (index <- 0 to (myList.length - 1) ) {
    if (myList(index) == search) {
     return true

    }
  }
    false

}



}
