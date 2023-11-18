http://localhost:8080/registration 

Registration form to create a users.
Includes client and server side validation.

http://localhost:8080/registration/users

Table displaying all users.

http://localhost:8080/registration/users/addUser  -- ONLY ACCESSABLE THROUGH REGISTRATION

Routed page from the form submit.
Welcomes the most recently registered person - would have been better to save id state through cookies.

http://localhost:8080/registration/users/getSingle?id=X

added a search for single person via id.
