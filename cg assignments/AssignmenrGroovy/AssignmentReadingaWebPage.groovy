package AssignmenrGroovy
//3.Reading a web page Using the Groovy JDK, access your home page and display the source code. Print the length of each line of the home page.
def myhome = "https://www.facebook.com/".toURL().getText()
println  myhome.eachLine { line -> println  line }
println  myhome.eachLine { line -> println "Data on the page : " + line + "size of data: " + line.size() }