//5. Multi-line strings

package assignment

def string = """Hello everyone, 
			this is a multiline string,
			example for assignment """.trim()

def vowels = ['a','e','i','o','u']
s = string.tokenize('\n')
def f = s[0]
def first = f.findAll { it -> it in vowels }
println "First line has " + first.size() + " vowels"

def sec = s[1]
def second = sec.findAll { it -> it in vowels }
println "Second line has " + second.size() + " vowels"

def th = s[2]
def third = th.findAll { it -> it in vowels }
println "Third line has " + third.size() + " vowels"

