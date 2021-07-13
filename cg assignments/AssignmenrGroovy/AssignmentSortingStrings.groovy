package AssignmenrGroovy
//1.Sorting Strings Create a list of strings. Sort them alphabetically. Sort them by length. Sort them by length in descending order.Advanced: Sort by length, then sort equal length strings alphabetically
List courses=['Shellscript','Java','Python','Groovy','Cloud','AWS','Command']
println courses.sort()
List sort=courses.sort{it.size()}
println sort
println sort.reverse()
