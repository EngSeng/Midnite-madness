import java.util.{Date, Locale}
import java.text.DateFormat._
import org.apache.commons.compress.utils._
import org.apache.commons.compress.archivers.zip.ZipFile

object Extractor {
   def main(args: Array[String]){
   
       val zf = new ZipFile("4D.zip");
       zf.getEntries
       
       
     
   }
}

object Timer{
  
  def oncePerSecond(callback: () => Unit){
    while (true) { callback();  Thread sleep 1000  }
  }
  
  def timeFlies() {
    println("time files like an arrow")
  }
}

class Complex(real: Double,imaginary: Double) {
  def re() = real
  def im() = imaginary
}