#Spring Day 1 (Master)
 -Please create controllers that mapping URI host/hello?message=HELLO, with GET request method
  hint: @RequestMapping GET, @RequestParam

 -mapping URI host/hello, with POST request method and request body
  hint: @RequestMapping POST, @RequestBody

 -mapping URI host/hello/{message}
  hint: @RequestMapping PUT, @PathVariable
  
  Can be seen in HelloController.java
  
	To call the get method just use localhost/hello
    
	To call the post method just use localhost/hello 
	
	To call the put method just use localhost/hello/{TypeYourMessage}