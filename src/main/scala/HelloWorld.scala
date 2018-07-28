import java.util

import scala.collection.{JavaConverters, mutable}
import scala.collection.mutable.ArrayBuffer

object HelloWorld {
  /* 这是一个 Scala 程序
   * 这是一行注释
   * 这里演示了多行注释
   */
  def main(args: Array[String]) {
    // 输出 Hello World
    // 这是一个单行注释
    //    println("Hello, world!")


    //
    //    val s = "scala"
    //    println(s)


    //    val name = null
    //    println(1.to(10))


    //    println(1 to 10)


    //    var x = 99
    //    var ss = if (x > 0) 123 else 321
    //    var sss = if (x > 0) 123 else ()
    //    var ssss = if (x > 0) 123
    //    var sssss = {
    //      var i = 0
    //      i += 1
    //      i += 1
    //      i
    //    }
    //    println(sssss)


    //    printf("%s %d\n", "aaa", 44)


    //    var nnn = StdIn.readLine("请输入: ")
    //    println(nnn)


    //    for (i <- 1 to 10)
    //      println(i)


    //    val sth = "Hello"
    //    for (i <- 0 until sth.length)
    //      println(i)


    //    for(i <- 1 to 3;j<-1 to 3)
    //      println(i*10+j)


    //    for (i <- 1 to 3; j <- 1 to 3 if i != j)
    //      println(i * 10 + j)


    //    println(for (i <- 1 to 10) yield i % 3)


    //    println(0+'H')


    //    def abs(x: Double) = if (x > 0) x else -x
    //    println(abs(-12))


    //    def fac(n: Int): Int = {
    //      if (n <= 0) 1
    //      else n * fac(n - 1)
    //    }
    //
    //    println(fac(5))


    //    def decorate(str: String, left: String = "[", right: String = "]") =
    //      left + str + right
    //
    //    println(decorate("hello"))
    //    println(decorate("hello", "<<", ">>"))
    //    println(decorate(left = "{{{", str = "hello", right = "}}}"))


    //    def sum(args: Int*) = {
    //      var result = 0
    //      for (arg <- args) result += arg
    //      result
    //    }
    //
    //    println(sum(1, 2, 3, 4, 5))
    //    println(sum(1 to 5: _*))


    //        def recursiveSum(args: Int*): Int = {
    //          if (args.isEmpty) 0
    //          else args.head + recursiveSum(args.tail: _*)
    //        }
    //
    //    println(recursiveSum(1 to 5: _*))


    //    val str = MessageFormat.format("{0}   ,     {1} ", "abc", 42.asInstanceOf[AnyRef])
    //    println(str)


    // 在words被定义时被取值
    //    val words = scala.io.Source.fromFile("/Users/arowana/Documents/a.txt")
    //    println(words.bufferedReader().readLine())


    // 在words首次被使用时取值
    //    lazy val words = scala.io.Source.fromFile("/Users/arowana/Documents/a.txt")
    //    println(words.bufferedReader().readLine())


    // 在words每次被使用时取值
    //    def words = scala.io.Source.fromFile("/Users/arowana/Documents/a.txt")
    //    println(words.bufferedReader().readLine())


    //
    //    var in: InputStream = null
    //    try {
    //      in = new URL("http://jal.com").openStream()
    //    } catch {
    //      case _: ClassCastException => println("123")
    //      case ex: IndexOutOfBoundsException => ex.printStackTrace()
    //    } finally in close()


    //    val nums = new Array[Int](10)
    //    nums(1) = 122
    //    println(nums(1))
    //    println(nums.length)


    //    val nums = new ArrayBuffer[Int]()
    //    nums += 1
    //    nums += (1, 3, 5)
    //    nums ++= Array(7, 8, 9)
    //    println(nums)
    //    nums.toArray


    //    var a = Array(1, 2, 3, 4, 5)
    //    val result = for (elem <- a) yield elem * 2
    //    for(i <- result) println(i)


    //    var a = Array(1, 2, 3, 4, 5)
    //    val result = for (elem <- a if elem % 2 == 0) yield elem * 2
    //    for (i <- result) println(i)


    //    var a = Array(1, 2, 3, 4, 5)
    //    val result = a.filter(_ % 2 == 0).map(2 * _)
    //    for (i <- result) println(i)


    //        val b = ArrayBuffer(1, 5, 2, 4)
    //        val result = Array("asd", "sdf", "ss").sortWith(_ > _)
    //        for (elem <- result)
    //          println(elem)


    //    val b = Array(1, 3, 5, 7)
    //    val result = b.mkString("<", "|", ">")
    //    println(result)


    //   val matrix=  Array.ofDim[Double](3,4)
    //    matrix(1)(3)=88
    //    println( matrix(1)(3))
    //
    //    new Array[Array[Int]](9)


//    val cc =  ArrayBuffer("ls", "rm", "cp")
//    val pb = new util.ArrayList[String](){{add("132")}}
//    var b = JavaConverters.asScalaBufferConverter(pb).asScala
//    println(b.head)



  }
}