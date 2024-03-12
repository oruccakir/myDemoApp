[![Build Status](https://app.travis-ci.com/oruccakir/myDemoApp.svg?token=GB9ivvjuxUQ2qwDpWPMY&branch=master)](https://app.travis-ci.com/oruccakir/myDemoApp)



heroku app address
Raeal deployed site : https://dry-cove-58183-9d5a8d795a80.herokuapp.com/compute


README for MyCompany App
This README provides a comprehensive guide to setting up, testing, and running the MyCompany App, a simple Java web application that demonstrates how to perform searches within lists and strings, accompanied by a basic web interface built with Spark framework and Mustache template engine.

Prerequisites
Before you begin, ensure you have installed the following:

Java Development Kit (JDK) 1.8 or later
Maven, for dependency management and building the project
Any IDE that supports Java (optional), such as IntelliJ IDEA or Eclipse
Setting Up the Project
Clone the Repository: Start by cloning the project repository to your local machine.

bash
Copy code
git clone <repository-url>
Navigate to the Project Directory: Change into the project directory.

bash
Copy code
cd path/to/mycompany-app
Build the Project: Use Maven to compile the project and download the necessary dependencies.

Copy code
mvn clean install
Running the Application
After setting up the project, you can run the application using Maven. The application starts a web server on a specified port (default is 4567 or a port assigned by Heroku if deployed on Heroku).

bash
Copy code
mvn exec:java -Dexec.mainClass="com.mycompany.app.App"
Navigate to http://localhost:4567/ in your web browser to view the application.

Running the Tests
The project includes unit tests for testing the functionality of the search method within the application. You can run these tests using Maven:

bash
Copy code
mvn test
This will execute all tests in the project and output the results, ensuring the search functionality works as expected under various scenarios.

Using the Application
The application provides a simple web interface where users can input lists of integers and strings, and a search string. The search operation checks if all integers from the second list are contained in the first list and if all strings contain the search string. To use it:

Navigate to the /compute endpoint on the web interface.
Input your lists of integers and strings, and the search string in the provided fields.
Submit the form to see the result of the search operation.
Understanding the Code
The main components of the application are:

App class: Contains the search method that performs the search logic and the main method to start the web server and configure routes.
AppTest class: Contains unit tests for the search method, ensuring it handles various cases correctly.
The application uses Spark Framework to set up the web server and routes, and Mustache template engine for rendering HTML pages based on templates.

Deployment
To deploy the application, you can use Heroku or any other cloud platform that supports Java applications. Ensure you set the PORT environment variable if deploying to a platform that requires it.

Contributing
Contributions to the MyCompany App are welcome. Please follow the standard Git workflow - fork the repository, make your changes, and submit a pull request.

License
Specify your license here or state that the project is open source and free to use under the terms of a specified open-source license.