# Spring Day 1 (Master)
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
	
#Spring Day 1 Session 2

Is about :
- mapping URI 'host/employees?gender=male'
   give response with all existing employees whose gender is male
- mapping URI 'host/employees', with request method POST and request body
   give response with created employee
   
- Can be seen in Employee.Java (For a class details)
- Can be Seen in EmployeeDay1Controller.java for mapping
- WebprojectsApplicationTest.java for testing the controller

	
# Spring Day 2 Session 1
- Can be seen in EmployeeId.Java (For a class details)
- EmployeeController.java for mapping based on Id
- EmployeeIdTest for testing the controller
