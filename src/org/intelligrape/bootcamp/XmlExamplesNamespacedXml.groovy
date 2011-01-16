def p_xml = """ <p:person     xmlns:p="http://somewhere.org/person"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://somewhere.org/person
                         http://somewhere.org/person.xsd"     id="99" >
  <p:firstname>John</p:firstname>
 <p:last-name>Smith</p:last-name>
</p:person> """
def person = new XmlParser().parseText(p_xml)
//the firstname element cannot be found without its namespace
println person.firstname.text()
//===> []
def p = new groovy.xml.Namespace("http://somewhere.org/person" )
println person[p.firstname].text()
//===> John
println person[p.'last-name' ].text()
//===> Smith

def p2 = new XmlSlurper().parseText(p_xml)
println p2.firstname
def ns = [:]
ns.p = "http://somewhere.org/person"
p2.declareNamespace(ns)
println p2."p:last-name"
//===> Smith