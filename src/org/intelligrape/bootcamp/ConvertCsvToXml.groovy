package org.intelligrape.bootcamp
def fileIn = new File("sampleFiles/addresses.csv")
def fileOut = new FileWriter("sampleFiles/addresses.xml")
def xml = new groovy.xml.MarkupBuilder(fileOut)
xml.addressBook {
	fileIn.splitEachLine(",") { tokens ->
		entry(id: tokens[0]) {
			name(tokens[1])
			addresss(tokens[2])
			city(tokens[3])
			state(tokens[4])
			zipcode(tokens[5])
		}
	}
}