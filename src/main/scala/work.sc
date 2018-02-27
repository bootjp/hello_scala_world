import scala.collection.mutable

def aa (num :Int): Int = {
  return num.hashCode()
}
aa(2)

def bb (num :Int): Int = {
  return num.hashCode()
}
bb(2)

def cc (num :Int, num2 : Int): Boolean = {
  System.identityHashCode(scala.Int.box(num)) == System.identityHashCode(num2)
}
val num = 2
var num2 = 2
cc(num, num2)

//return 1.compareTo(1)
