package AssignmenrGroovy
//4d. Define a string variable containing the sentence, "Hello, World. How are you?". Split the sentence into an array using the split method. Count the number of words. Do the same using the tokenize method.
String sen="Hello, World. How are you?"
List li=[]
List si=[]
li=sen.split()
println li
println li.size()
si=sen.tokenize()
println si
println si.size()