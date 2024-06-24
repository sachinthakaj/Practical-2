@main def main() =
  println(q1())
  q2()
  println(q3())
  println(q4())


def q1() =
  var k, i, j = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'


  (k + 12 * m) + "," + (m / j) + "," + (n % j) + "," + (m / j * j)+ "," +(f + 10 * 5 + g)//+","+(++i * n)//
  //++operator is not available for Int

def q2() =
  var a=2
  var b=3
  var c=4
  var d=5
  var f=12.0f
  var k=4.3f
  var g = 4.0f

  //println(--b*a+c*d--)
  //println(a++)
  println(-2*(g-k)+c)
  //println(c=c++)
  //println(c=++c*a++)

def q3() =
  val normalhours=40
  val OThours=30
  val normalhourpay=250
  val OThourpay=85

  (normalhours * normalhourpay + OThours * OThourpay) * 0.88

def q4() =
  var ticketprice=25
  var income=(120+((15-ticketprice)*4))*ticketprice
  var cost=500+(120+((15-ticketprice)*4))*3
  income-cost




