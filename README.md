# restAPIEndPointsOne
restAPIEndPointsOne

1)Download the zip format of restAPIEndPoints 
2)unzip it and find the target directory of restAPIEndPoints 
3)Go to Eclipse and go to Import ---> Existing Maven Projects ---> target folder ---> Finish 
4)Go to SpringBootDemoApplication.java ---> run as Java Application 
5)Go to Postman and give Domain {Telecom} 
a)http://localhost:8080/loginDetails/Telecom/api/getproductdetails 
gives 200 Ok Message, Similarly for Payments and Manufacturing 
b)http://localhost:8080/loginDetails/Payments/api/getproductdetails c)http://localhost:8080/loginDetails/Manufacturing/api/getproductdetails 
6)Go to Postman and give Domain {18} 
a)http://localhost:8080/loginDetails/18/api/getconfigdetails gives 200 Ok Message, Similarly for 24 and 30 b)http://localhost:8080/loginDetails/24/api/getconfigdetails 
c)http://localhost:8080/loginDetails/30/api/getconfigdetails 
or else 200 for other Domains 
7)Go to your browser, http://localhost:8080/login 
a)Enter UserName as user and pwd as password you will be redirected to another page though a whitelabel 
or else if you give a wrong username or password you will get a message like Your login attempt was not 
successful, try again.Reason: Bad credentials 
b)Similarly for UserName as admin and pwd as password

