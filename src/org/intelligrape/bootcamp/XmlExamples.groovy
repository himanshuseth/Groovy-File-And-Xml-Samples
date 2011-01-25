package org.intelligrape.bootcamp

/*
def p = """<person id=" 100">Jane Doe</person>"""
def p2 = """
<person id="100" >
  <firstName>Jane</firstName>
  <last-name>Doe</last-name>
  <address type="home" >
    <street>
		<streetNumber>123</streetNumber>
		<streetName> Main St</streetName>
    </street>
    <city>Denver</city>
  </address>
  <address type="office" >
    <street>
		<streetNumber>1234</streetNumber>
		<streetName> Main St</streetName>
    </street>
    <city>Denver</city>
  </address>
  <address type="temp" >
    <street>
		<streetNumber>12345</streetNumber>
		<streetName> Main St</streetName>
    </street>
    <city>Denver</city>
  </address>
</person>"""
def person = new XmlParser().parseText(p2)
println person.getClass()
println person.text()
println person.attribute("id" )
println person.firstName.text()
println person.dasdadas.text()
println person.attribute("foo" )

person = new XmlSlurper().parseText(p2)
println person.getClass()
println person.firstName      // Jane
println person."last-name"      // Jane
println person.@id
//println person.address.street.streetNumber          //Denver
person.address.each {
	println it.street.streetNumber
	println it.@type      //home
}
//println person.address.city          //Denver
println "something here : " + person.address.dasd.@typsdddd      //null safe
*/


def fileIn = new File("sampleFiles/addresses.csv")
fileIn.splitEachLine(",") { tokens ->
	println tokens
	println tokens.getClass()
	println tokens[0]
	println tokens[1]
	println tokens[2]
	println tokens[3]
	println tokens[4]
	println tokens[5]
}