# Hystrix DashBoard

Change the Spring Boot version to 2.1 since there are some issues with jquery  spring boot 2.3 is not 
supporting dashboard use http://localhost:6868/hystrix and in text field use
http://localhost:6868/actuator/hystrix.stream  

# livetraining

OAuth Example Updated 

Check the presentation 2 - Which has the screen shots 


Open Post Man and follow the steps given below

Make a post call to the url http://localhost:4040/oauth/token

Select Authorization , and basic authentication
Add the UserName  : my-trusted-client  ( Refer Slide No :57)
Add the password : secret  ( Refer Slide No :57)

Select Body form-url-endcoded  and key and values , the following keys with respective values
grant_type : password
Username : india
Password : india

Will get the JWT Token as response 

To Access resource using uri 

Create a New Tab in Post Man
In that New tab Select params tab and add access_token as a parameter

http://localhost:4040/api/customers/customer/1?access_token= <put your access token Here>

Should get the response from the Controller

