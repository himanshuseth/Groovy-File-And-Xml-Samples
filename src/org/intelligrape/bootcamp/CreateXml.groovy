def xml = new groovy.xml.MarkupBuilder()
xml.person(id:99){
  firstname("John" )
  lastname("Smith" )
}

xml = new groovy.xml.StreamingMarkupBuilder().bind{
     person(id:100){
         firstname("Jane" )
         lastname("Doe" )
     }
}
println xml