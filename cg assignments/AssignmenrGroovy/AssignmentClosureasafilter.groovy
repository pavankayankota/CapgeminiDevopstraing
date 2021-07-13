package AssignmenrGroovy
//4.Closures as a filter Create a list of numbers. Print all elements greater than zero.
def myList=[3,-1,-0,37,89,45,42,19,-9999]
println myList.findAll {
	item -> item > 0
}