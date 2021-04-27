//  2.Processing a list of numbers
//  Create a list of numbers. Add them together. First double each number, then add them up. Compute their average.

package assignment


def list1 = [1,2,3,4,5]
println list1

//sum of list1
println list1.sum()

//double of each number in list1
def list2 = list1.collect{it*2}
println list2

//sum of both
def list3 = ([list1,list2].transpose().collect{it[0]+it[1]})
println list3

//averge of both the list added together
def avg = list3.average()
println avg