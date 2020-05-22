# restAPIEndPointsOne
restAPIEndPointsOne - To Do
---------------------------
1)Download the zip format of restAPIEndPointsOne 
2)unzip it and find the target directory of restAPIEndPointsOne 
3)Go to Eclipse and go to Import ---> Existing Maven Projects ---> target folder ---> Finish 
4)Go to SpringBootDemoApplication.java ---> run as Java Application 
5)Go to Postman and give Domain {Telecom} 
a)http://localhost:8080/loginDetails/Telecom/api/getproductdetails 
gives 200 Ok Message,comparing with standard constant results from populateDummyUsers() of UserImpl.java
, Similarly for Payments and Manufacturing 
b)http://localhost:8080/loginDetails/Payments/api/getproductdetails c)http://localhost:8080/loginDetails/Manufacturing/api/getproductdetails 
for Mutual Funds since the status type is Processing, it will not show any message 
d)http://localhost:8080/Mutual Funds/Manufacturing/api/getproductdetails
e)http://localhost:8080/Finance/Manufacturing/api/getproductdetails

6)Go to Postman and give Domain {12} 
a)http://localhost:8080/loginDetails/12/api/getconfigdetails gives 200 Ok Message, comparing with populateConfigDetails() of UserImpl.java, similarly for Domain {18} and {24}
b)http://localhost:8080/loginDetails/18/api/getconfigdetails gives NO_CONTENT
c)http://localhost:8080/loginDetails/24/api/getconfigdetails gives 509Bandwidth Limit Exceeded (Apache bw/limited extension)
or else 200 for other Domains 
7)Go to your browser, http://localhost:8080/login 
a)Enter UserName as user and pwd as password you will be redirected to another page though a whitelabel 
or else if you give a wrong username or password you will get a message like Your login attempt was not 
successful, try again.Reason: Bad credentials 
b)Similarly for UserName as admin and pwd as password

