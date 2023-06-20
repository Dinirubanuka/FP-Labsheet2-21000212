
package dd

object banu {
  import scala.io.StdIn.readInt
//  -----------question 1----------
  def main(args: Array[String]): Unit = {

    var k:Double =2;
    var i:Double= 2
    var j:Double = 2;
    var m:Double = 5;
    var n:Double = 5;
    var f:Double = 12.0f;
    var g:Double = 4.0f;
    var c = 'X';

    printf("a : %.2f \n" , k + 12 * m);
    printf("b : %.2f \n" ,  (m / j));
    printf("c : %.2f \n" , m / j * j);
    printf("e : %.2f \n", f+ 10 * 5 + g);
    printf("f : %.2f", {i+=1; i * n});
  }

  //  -----------question 2----------

  /*def main(args: Array[String]): Unit ={
    var a:Int=2;
    var b:Int=3;
    var c:Int=4;
    var d:Int=5;
    var l:Float=4.6f;

    printf("--b * a + c * d-- : %d \n",{b-=1; b * a + {d-=1; d * c}});
    printf("a++ : %d \n",{a+=1;a});
    printf("c = c++ : %d \n", {c+=1;c});
    printf("c=++c * a++ : %d \n",{c+=1;c * {a+=1;a}})
  }*/

  //  -----------question 3----------

  /*def wage(hours: Int): Int = {
    hours * 250
  }

  def ot(hours: Int): Int = {
    hours * 85
  }

  def income(h1: Int, h2: Int): Int = {
    wage(h1) + ot(h2)
  }

  def tax(h1: Int, h2: Int): Double = {
    income(h1, h2) * 0.12
  }

  def salary(h1: Int, h2: Int) = {
    income(h1, h2) - tax(h1, h2)
  }
 def main(args: Array[String]): Unit ={
   print("h1 : ")
   var h1 =readInt()
   print("h2 : ")
   var h2 =readInt()
   printf("income : %f",salary(h1,h2));
 }*/

  //  -----------question 4----------
//  def attendees(price:Int):Int={120 + (15-price)/5 * 20}
//  def income(price:Int):Int={attendees(price) * price}
//  def cost(price:Int):Int={500 + 3 * attendees(price)}
//  def profit(price:Int):Int ={income(price)-cost(price)}
//
//  def main(args: Array[String]): Unit ={
//    printf("profit : %d",profit(35))
//
//  }


}
