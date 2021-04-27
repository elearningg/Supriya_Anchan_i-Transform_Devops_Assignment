// 1.Sorting Strings
// Create a list of strings. Sort them alphabetically. Sort them by length. Sort them by length in descending order.
// Advanced: Sort by length, then sort equal length strings alphabetically



package assignment



def fruits = ['Apple', 'Cherry', 'Grapes', 'Oranges']
println "Original List    " +fruits

println "------------------------------------------"

println "sorted list      "+ fruits.sort(false)

println "------------------------------------------"

println fruits.sort { it.size() }

println "------------------------------------------"

println fruits.sort { -it.size() }    //descending
