- Download the project zip and open it (assignment) using eclipse.
- Make sure that JDK 17 is installed because the project is built using.
- As we are using H2 which is an embedded in-memory database, the values 
  needed to be populated every time we start the application/server. 
  There is no default populating of values so please add them using postman.

1. POST /user    ( Creates a new user) 
example :
	{
	 "firstName" :"sachin",
 	"lastName" : "sharma",
 	"emailAddress":"abc@gmail.com",
	 "phoneNo": "9888563021"
	 }

2. GET  /users   ( Returns list of users)
example :  
               /users

3. GET  /user/{id} (Return user by id)
example :
                 user/12

4. POST /email    (Create an email in DB)
example : 
	{
	"fromUser":"sachin",
	"toUser":"abc",
	"subject":"abc",
	"body":"xyz"
	}

5. GET  /emails/count?user={userID} (Returns the number of emails sent by a user)
example : 
	emails/count?user=12
