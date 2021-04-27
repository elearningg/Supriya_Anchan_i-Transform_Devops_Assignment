package assignment

String username = "Supriya"
String password = "*****"

String str = "$username "+"$password"
println username
println password

//Concatenated string
println str

//Byte array of String
println str.getBytes()

//encode to base64
def str1 = str.bytes.encodeBase64().toString()
println str1

//decode
byte[] str2 = str1.decodeBase64()
println new String(str2)
def str3 = new String(str2)

println str3.split()