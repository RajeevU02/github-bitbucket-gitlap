# github-bitbucket-gitlap/springboot-crudrestful-assignment

Create a Spring boot + Hibernate rest API that meets the following conditions

 Create CRUD screens for the below entities and use the APIs as described below to interact between
front end and backend.

 Create REST APIs expose CRUD operations on following entities

 Employee [ ID, First Name, Last Name, Employment ID, Start Date, Designation, Department, End
                   date, Status, DOB, Reporting Manager, gender, blood group, address]
     o Dependants [ First Name, Last Name, Gender, DOB, Relationship]
     o Educational qualification [ Type, Start Date, End Date, Type, Institution, Address, Percentage]
     
 Secure the API’s to respond only when it contains a security header whose value is controlled by
configuration

 Log the IP address, Time and Browser details explicitly when operations that modify the repository
are called

 Define the DB schema using DDL and also include some test entries

 Write 3 Junit tests

 Make use of IOC and segregate the code with proper design patterns

 Use maven as the build tool

 Make use of Bean Validation to ensure data consistency

 Index Employees and Dependants

 Create an endpoint to search employees and dependants via Elastic Search

 Add simple front end and backend validations for the inputs.

