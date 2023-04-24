// THREADS EXAMPLE
fun executeTask(view:View){
  thread(start = true){
    executionLongRunningTask()
  }
}

// COROUTINES EXAMPLE
fun executeTask(view:View){
  CoroutineScope(Dispatchers.IO).launch {
    executionLongRunningTask()
  }
}
