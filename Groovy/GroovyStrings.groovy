//a.characters in the string "Hello, Groovy!"
package assignment

def name = "Hello, Groovy!"
println name
	
println name.length()

//b.string concatenation
def myname = "Supriya"
println myname

println "Hello " + myname
println "Hello ".concat(myname)


//c.Demonstrate that "racecar" is a palindrome by comparing it to its reverse
//print "Enter string :"
//def originalString = System.console().readLine()
//println "input is $originalString"
////String originalString = "racecar";
//String reverseString = "";
//
//int length = originalString.length();
//
//for(int i = length - 1; i >= 0; i --) {
//      reverseString = reverseString + originalString.charAt(i);
//        }
//		
// Case in-sensitive comparision
//if (originalString.equalsIgnoreCase(reverseString)) {
//println("The given string is Palindrome");
//   } else {
//println("The given string is NOT a Palindrome");
//   }
   
//d.Splitting the sentence into an array using the split method.  
String str = "Hello, World. How are you?"
println str

println str.split()

//Count the numbers of words

def countLines(s) { s.split(" , ").size() }
def countWords(s) { s.split(" ").size() - countLines(s) + 1 }

println countWords(str)

//Same using the tokenize method.

println str.tokenize()

//e-array notation (square brackets) to print the substring "World".

println str[7..11]

//f-array notation to print the last word, but reversed.

println str[25..22]



//
//
//def myList = ["Orange", "Banana", "Apple"]
//
//myList = myList.sort { -it.size() }
//println myList.sort()


   
   
   
   
   
   
    

