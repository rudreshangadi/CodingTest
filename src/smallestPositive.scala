
object smallestPositive {
  /*puts Non- positive( 0 and negative) numbers on left side of arr[]
     and returns count of such numbers*/ def segregate(arr: Array[Int], size: Int): Int = {
    var j = 0
    var i = 0
    i = 0
    while ( {
      i < size
    }) {
      if (arr(i) <= 0) {
        var temp = 0
        temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
        // increment count of non-positive
        // integers
        j += 1
      }
      {
        i += 1; i - 1
      }
    }
    j
  }
  /* Find the smallest positive missing
      number in an array that contains
      all positive integers */ def findMissingPositive(arr: Array[Int], size: Int): Int = {
    var i = 0
    // arr[arr[i] - 1] negative.
    // 1 is subtracted because index start
    // from 0 and positive numbers start from 1
    i = 0
    while ( {
      i < size
    }) {
      if (Math.abs(arr(i)) - 1 < size && arr(Math.abs(arr(i)) - 1) > 0) arr(Math.abs(arr(i)) - 1) = -arr(Math.abs(arr(i)) - 1)

      {
        i += 1; i - 1
      }
    }
    // Return the first index value at which
    // is positive
    i = 0
    while ( {i < size })
    {
      if (arr(i) > 0) return i+1

        {
          i += 1; i - 1
        }
    }
    size + 1
  }
  /* Find the smallest positive missing
      number in an array that contains
      both positive and negative integers */ def findMissing(arr: Array[Int], size: Int): Int = {
    val shift = segregate(arr, size)
    val arr2 = new Array[Int](size - shift)
    var j = 0
    var i = shift
    while ( {
      i < size
    }) {
      arr2(j) = arr(i)
      j += 1

      {
        i += 1; i - 1
      }
    }

    findMissingPositive(arr2, j)
  }

  // main function
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 3, 6, 4 , 1, 2)
    val arr_size = arr.length
    val missing = findMissing(arr, arr_size)
    System.out.println("The smallest positive missing number is " + missing)
  }
}