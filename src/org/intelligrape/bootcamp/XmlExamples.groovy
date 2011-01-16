package org.intelligrape.bootcamp

def p = """<person id=" 100">Jane Doe</person>"""
def person = new XmlParser().parseText(p)
println person.getClass()
println person.text()
println person.attribute("id" )
println person.attribute("foo" )

def p2 = """
<person id="100" >
  <firstname>Jane</firstname>
  <lastname>Doe</lastname>
  <address type="home" >
    <street>123 Main St</street>
    <city>Denver</city>
  </address>
</person>"""
person = new XmlSlurper().parseText(p2)
println person.getClass()
println person.firstname               // Jane
println person.address.city          //Denver
println person.address.@type      //home
println person.address.dasd.@typsdddd      //null safe