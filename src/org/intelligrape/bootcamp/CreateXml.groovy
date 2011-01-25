def xml = new groovy.xml.MarkupBuilder()
String tagName = "himanshu"
Map params = [id:99, type:'home']
xml.person(params){
  firstname(id:10 ){
	  "${tagName}"("Test")
  }
  lastname("Smith" )
}

xml = new groovy.xml.StreamingMarkupBuilder().bind{
     person(id:100){
         firstname("Jane" )
         lastname("Doe" )
     }
}
println xml
