package org.intelligrape.bootcamp                                            \

import java.io.File as MyFile;

String filePath = "sampleFiles/x.txt"

/*//EachFIleRecurse
File file = new File("sampleFiles")
file.eachFileRecurse {
	println it.getClass()
	println it.absolutePath
}*/

//Read a simple file
//new File(filePath ).eachLine{line->
//  println "line:  " + line
//}

//Read file data to variable
//String body = new File(filePath).text
//println body

//Write data to a file
MyFile file = new MyFile("sampleFiles/hello.txt" )
file.write("Hello World\n" )
println file.text

/*
//Append data to a file
file.append ("Hello Again !!!")
println file.text
*/

//Working with Streams
File copiedFile = new File(filePath+".copiedFile")
File oldFile = new File(filePath)
copiedFile.createNewFile()
copiedFile.withOutputStream {out ->
	oldFile.withInputStream {is->
		out << is
	}
//same as out.write(new File(filePath).readBytes())
}
println copiedFile.text
