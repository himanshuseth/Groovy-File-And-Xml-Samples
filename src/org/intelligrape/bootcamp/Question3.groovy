package org.intelligrape.bootcamp

File xmlFile = new File("sampleFiles/books.xml")
def booksParser = new XmlParser().parseText(xmlFile.text)

booksParser.book.each {
	println it
}
def bookSlurper = new XmlSlurper().parseText(xmlFile.text)

bookSlurper.book.each {
	println it
}
