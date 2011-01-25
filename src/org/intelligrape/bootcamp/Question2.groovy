package org.intelligrape.bootcamp

File destinationFolder = new File("sampleFiles/b")
destinationFolder.mkdir()
File parent = new File("sampleFiles/a")
parent.eachFileRecurse {
	if (it.isFile()) {
		File file = new File(destinationFolder.absolutePath + (it.absolutePath -parent.absolutePath))
		file.parentFile.mkdirs()
		file.createNewFile()
		String fileText = it.text
		file.text = fileText.replaceAll("java", "groovy")
	}
}

