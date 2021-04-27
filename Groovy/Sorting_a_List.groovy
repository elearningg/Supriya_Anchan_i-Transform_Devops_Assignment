package assignment

class Course{
	String name
	int days
	
	def getvalues(String n, int d) {
		def name = n
		def days = d
		def l = [name : n, days : d]
		
	}
	
	static void main (args) {
		Course first = new Course()
		Course second = new Course()
		Course third = new Course()
		Course fourth = new Course()
		
		def f =[first.getvalues("prachi",1),second.getvalues("Supriya", 1),
			    third.getvalues("priya", 15),fourth.getvalues("Neha", 16),]
		
		def sorted = f.sort({a,b -> b["days"] <=> a["days"] ?: a["name"] <=> b["name"]})
		sorted.each {println it}
	}
}
