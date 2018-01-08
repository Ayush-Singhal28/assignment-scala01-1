package edu.knoldus

class Sorting {

  def insertionSort(myList: Array[Int]): Array[Int] = {
    for (index1 <- 0 to (myList.length - 1)) {
    val key = myList(index1)
    var index2 = index1 - 1
    while (index2 >= 0 && myList(index2) > key) {
      myList(index2 + 1) = myList(index2);
      index2 = index2 - 1;
    }
    myList(index2 + 1) = key;
  }
  myList
    
  }

  def selectionSort(myList: Array[Int]): Array[Int] = {
    for (index1 <- 0 to (myList.length - 1) ) {
    var min_idx = index1

    for(index2 <- (index1+1) to (myList.length - 1)) {
      if (myList(index2) < myList(min_idx))
        min_idx = index2;
    }
    val temp: Int = myList(min_idx)
    myList(min_idx) = myList(index1)
  }

    myList
  }

  def bubbleSort(myList: Array[Int]): Array[Int] = {
    for(index1 <- 0 to (myList.length - 1) ) {
     for(index2 <- 0 to (myList.length - index1 - 1)) {

    if (myList(index2) > myList(index2 + 1)) {
      val temp = myList(index2)
      myList(index2) = myList(index2 + 1)
      myList(index2 + 1) = temp
    }
  }
 myList
  }

 
    myList
  }

}
