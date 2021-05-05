**Pet Store**

_Exercise Overview_

Use BDD approach to test "petstore" https://petstore.swagger.io/ RESTful Web Service.

The task is to test POST (/store/order), GET (/store/order/{orderId}) and DELETE (/store/order/{orderId})  methods of "/store" endpoint. 
For each endpoint at least one positive and negative test case should be implemented.

• Use any BDD framework of your choice
• Identify and model Steps required to test the feature.
• Implement the Steps in Java
• Implement the test scenarios using the Steps 
 
Expected deliveries:
• Complete project that includes all necessary sources/resources and build files.

Notes: 
1 - The Endpoint may not return standard response codes for certain actions.
2 - Please clearly state any assumptions made when implementing the tests.

**How to submit the exercise**
1. Clone the repo locally.
2. Complete the exercise.
3. Upload your completed project to your GitHub, and then paste a link to the repository below in the form along with any comments you have about your solution.

The API test is written in Maven using Rest Assured framework using BDD

**Steps to execute the test:**

1. Clone the repository into your local git clone https://github.com/mallikamca04/petstore.git
2. Open the terminal and navigate to the root folder of the petstore project
3. run _mvn test verify_

One the build is success the report will be generated into the the following path, open the report in browser to view it.

/target/cucumber-html-reports/overview-features.html
