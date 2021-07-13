package AssignmenrGroovy
//1.Encode and decode
//i.Create two strings, one for a username and one for a password. Concatenate them together, separated by a colon. Use a method from the Groovy JDK to convert the resulting String to a byte array. Then use the encodeBase64 method on byte array to create an encoded string.
String uname = "pavan"
String pass = "pavan@19"
List end=[]
String str = "${uname} : ${pass}"
byte[] byt = str.getBytes()
def enc = byt.encodeBase64().toString()
byte[] dec = enc.decodeBase64()
def res =  new String(dec)
end = res.split(':')
println end

