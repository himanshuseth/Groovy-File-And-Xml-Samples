package org.intelligrape.bootcamp

String filePath = "sampleFiles/x.txt"
/*

//Read a simple file
println new File(filePath ).eachLine{line->
  println line
}

// Read file data to variable
String body = new File(filePath).text
println body

//Write data to a file
File file = new File("sampleFiles/hello.txt" )
file.write("Hello World\n" )
println file.text

//Append data to a file
file.append ("Hello Again !!!")
println file.text
*/

//Working with Streams
File copy = new File(filePath+".copy")
copy.createNewFile()
copy.withOutputStream {out ->
	new File(filePath).withInputStream {is->
		out << is
	}
}
println copy.text
