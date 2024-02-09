**A rental agency manages properties near MTU's Bishopstown campus. which are rented to students.**

The rental agency records the following data about each property:

Address
Eircode
Capacity of property i.e. number of students it can hold
Cost of property rental per calendar month.
The rental agency stores the following information about each tenant:

Name
Email
Phone number
Several tenants can share the same name but must have unique emails and phone numbers. 

A house's address and eircode must be unique.

For each user store

email as primary key (Id) used for authentication
password (must be at least 8 characters, contain uppercase and lowercase letters along with digits -  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$"). 
locked (boolean) - true if account is locked, false if not locked
role (String which reflects if they are office staff or management staff) used for authorisation
phone number
PPSN
**a RESTful web service with appropriate status codes to**

**GET**
get a list of all properties (excluding the tenants in that property)
get a list of properties that have availability in them (excluding tenants)
get a property given its id, along with the number of tenants currently in that house (see Hint below)
get a tenant given their id 
get a list of tenants in a property give its id
get total rental income of all occupied properties.

**POST**
add a new property
add a new user 
add a new tenant to a property subject to capacity restriction

**DELETE**
delete a property and delete the associated tenants
delete a tenant

**PATCH**
move a tenant from one property to another subject to capacity restriction
change the rental rate of a property

**Unit Tests,
GraphQL,
Security,
AOP**

**Spring Boot,
Spring Data JPA,
Spring Web MVC (for the controller funcitonality),
Spring Security,
Spring GraphQL,
Spring Security,
H2 for an embedded database,
Maven**
