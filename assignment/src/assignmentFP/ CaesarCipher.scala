package assignmentFP

object  CaesarCipher {
   def main(args:Array[String]){
       val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       println("Shift : ")//user input to get shift
       val k = scala.io.StdIn.readInt()
       println("Enter the string : ")//user input to get string
       var s = scala.io.StdIn.readLine()
    
       
       
       
       val ct=cipher(E,s,k,alphabet)
       val pt=cipher(D,ct,k,alphabet)
       
       print("encrypted string : ")
       println(ct)                   //display encrypted string
       print("Decrypted string : ")
       println(pt)                   //display decrypted string
       
       
     }
     
     
     val E = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)//encryption
     val D = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)//decryption
     
     val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
}