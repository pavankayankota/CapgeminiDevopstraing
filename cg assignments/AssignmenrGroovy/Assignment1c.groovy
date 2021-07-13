package AssignmenrGroovy
//c. What do you get when you divide 5 by 2? What is the resulting data type? If you wanted to do integer division (no remainder), what method would you call?
def x=5/2
println x
println x.getClass().getName()
def num=5
println num.div(2)
println num.getClass().getName()
def z=0
println z.divideUnsigned(5, 2)
println z.getClass().getName()