
class person(val name:String, val age:Int) extends Ordered[person]
{
def compare(that:person)=if( (this.name).equals(that.name) ) 0 else 1      //if name will be same then it will return true

}
object First
{
def main(args:Array[String])
{
var x =new person("shubham",11)
var y =new person("shubham",10)
if((x<=y))
{
if(x.age==y.age) println("name and age both are same ")   
else println("age is not same")
}
else {
if(x.name.length==y.name.length) println("length is same but name is not same") else println("length and name both not same ")

}

}
}