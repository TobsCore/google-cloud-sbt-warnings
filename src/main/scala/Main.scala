import com.google.cloud.speech.v1.{
  SpeechClient,
}
object Main extends App {
  val speechClient: SpeechClient = SpeechClient.create()
  println("Hello, World!")
}
