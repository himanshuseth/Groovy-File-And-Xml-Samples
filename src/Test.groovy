println "Running"


File file = new File("/tmp/x/y/z/t.txt")
file.parentFile.mkdirs()
file.createNewFile()

