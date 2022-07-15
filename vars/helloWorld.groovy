/*def call() {
  sh "echo hello world"
} */


 def call(Map config = [:]) {  // [:] means empty map
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
} 
// this is a better option than the one below


//            OR

/*def call(String name, String dayOfWeek) {
  sh "echo Hello ${name}. Today is ${dayOfWeek}"
  // you will need to modify the pipleline script to show the value for name annd dayOfWeek
  // the script will look like this below
  // helloWorld("Veronica", "Thursday")
  // this is not the best option because the value of the string variable could be easily mistakenly reversed. e.g hello Thursday. Today is Veronica
} */
