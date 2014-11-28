/**
 * Created by shanxS on 11/27/2014.
 */

class Complex(real: Double, imaginary: Double ){
  // method without arg
  def re = real
  def im = imaginary

  override def toString() = "real: " + re + " imag " + im
}

object ScalaApp {

  def timer(callback: ()=>Unit){
    callback(); Thread sleep 1000
  }

  def main(args: Array[String]){
    // annonymous function
    timer(() => println("Annon"))

    val c = new Complex(2.3, 5.0)
    println("Imaginary part " + c.im)
  }

}
