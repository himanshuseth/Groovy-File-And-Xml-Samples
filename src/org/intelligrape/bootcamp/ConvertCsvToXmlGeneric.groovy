package org.intelligrape.bootcamp
def fileIn = new File("sampleFiles/generic2.csv")
def fileOut = new FileWriter("sampleFiles/addresses.xml")
def xml = new groovy.xml.MarkupBuilder(fileOut)
int i = 0
List<String> headers = []
xml.addressBook {
	fileIn.splitEachLine(",") { tokens ->
		if (i == 0) {
			headers = tokens
		} else {
			entry {
				tokens.eachWithIndex {token, index->
					"${headers[index]}"(token)
				}
			}
		}
		i++
	}
}