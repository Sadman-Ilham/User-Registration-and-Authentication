# User Registration and Authentication
A starter project using Spring MVC and Hibenate

#### Features

	- User can register with First Name, Last Name, Email and Password
	- User can login with the registered email and password
	- User can view all the existing users in the system and their login history

#### Implementation

	- Validation added on the registration fields
	- Implemented one to many relation (one user can have many login history)

#### Run
	- Create a schema on MySql database
	- Go to the database.properties file under src>main>resources>properties
	- Change the url (jdbc:mysql://localhost:[port_number]/[scheme_name])
	- Change the username and password

	- Open the project using the user-registration.iml file in IntelliJ IDEA
	- Edit configuration using a Tomcat Local Server (I've used Tomcat 8.0.24)
		- Press ctrl+shift+a
		- Type run/debug configurations
		- Select Edit configurations from the drop down list
		- On the configuratoin panel press the green '+' button on the top-left corner
		- Select Tomcat Server > Local
		- Configure the Application Server in the Server tab
		- Give a name of that configuration and press OK
	- Now select the configuration from the drop down list on the top-right corner and press run button
