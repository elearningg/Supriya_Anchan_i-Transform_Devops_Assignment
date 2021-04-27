//3. Reading a web page
//Using the Groovy JDK, access your home page and display the source code. Print the length of each line of the home page.


package assignment

def urlContents = "https://www.google.com/".toURL().getText()

println urlContents.eachLine { println it }

println urlContents.eachLine { it -> println "THE LINE IS : " + it + "And IT'S SIZE IS : " + it.size() }