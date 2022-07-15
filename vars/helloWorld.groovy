/*def call() {
  sh "echo hello world"
} */


/* def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
} */

def call(String name, String dayOfWeek) {
  sh "echo Hello ${name}. Today is ${dayOfWeek}"
  // you will need to modify the pipleline script to show the value for name annd dayOfWeek
  // the script will look like this below
  // helloWorld("Veronica", "Thursday")
}
